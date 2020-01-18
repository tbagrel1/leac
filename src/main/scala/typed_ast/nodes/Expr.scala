package typed_ast.nodes

import typed_ast.nodes.enums._
import typed_ast.{ScopedSymbolTable, SemanticCheckReporter, Severity, SourcePos}

object Expr {
  def ensureNotArray(e: Expr, reporter: SemanticCheckReporter): Unit = {
    if (e.getArrayOpt.isDefined) {
      reporter.report(
        Severity.Error, e.parent,
        "whole arrays can only be used in function arguments. They can't be used as values and no operation can use " +
          "them directly"
        )
    }
  }
}

sealed trait Expr extends AbstractNode {
  def atomTypename: AtomTypename

  def getArrayOpt: Option[Array] = None

  def leacType: LeacType = this.getArrayOpt match {
    case Some(array) => array
    case None => Atom(SourcePos.virtual, atomTypename)
  }

  override protected def _fillSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): (ScopedSymbolTable, SemanticCheckReporter) = (symbolTable, reporter)
}

sealed trait IdfAccess extends AbstractNode with Expr {}

sealed trait Operation extends AbstractNode with Expr {
  def priority: Int
}

sealed trait BinaryIntFloatOperation extends Operation {
  def a: Expr

  def b: Expr

  override def atomTypename: AtomTypename = {
    val aTypename = a.atomTypename
    val bTypename = b.atomTypename
    (aTypename, bTypename) match {
      case (FloatTypename, _) | (_, FloatTypename) => FloatTypename
      case _ => IntTypename
    }
  }

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = {
    Expr.ensureNotArray(a, reporter)
    Expr.ensureNotArray(b, reporter)

    val aTypename = a.atomTypename
    val bTypename = b.atomTypename
    if (FloatTypename cantAccept aTypename) {
      reporter.report(Severity.Error, this, s"type mismatch: expecting float or int, got ${ aTypename }")
    }
    if (FloatTypename cantAccept bTypename) {
      reporter.report(Severity.Error, this, s"type mismatch: expecting float or int, got ${ bTypename }")
    }
  }
}

sealed trait BinaryOrdOperation extends Operation {
  def a: Expr

  def b: Expr

  override def atomTypename: AtomTypename = BoolTypename

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = {
    Expr.ensureNotArray(a, reporter)
    Expr.ensureNotArray(b, reporter)

    val aTypename = a.atomTypename
    val bTypename = b.atomTypename
    if (FloatTypename cantAccept aTypename) {
      reporter.report(Severity.Error, this, s"type mismatch: expecting float or int, got ${ aTypename }")
    }
    if (FloatTypename cantAccept bTypename) {
      reporter.report(Severity.Error, this, s"type mismatch: expecting float or int, got ${ bTypename }")
    }
  }
}

sealed trait BinaryEqOperation extends Operation {
  def a: Expr

  def b: Expr

  override def atomTypename: AtomTypename = BoolTypename

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = {
    Expr.ensureNotArray(a, reporter)
    Expr.ensureNotArray(b, reporter)

    val aTypename = a.atomTypename
    val bTypename = b.atomTypename
    if ((aTypename cantAccept bTypename) && (bTypename cantAccept aTypename)) {
      reporter.report(Severity.Error, this, s"type mismatch: cannot compare types ${ aTypename } and ${ bTypename }")
    }
  }
}

sealed trait BinaryLogicalOperation extends Operation {
  def a: Expr

  def b: Expr

  override def atomTypename: AtomTypename = BoolTypename

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = {
    Expr.ensureNotArray(a, reporter)
    Expr.ensureNotArray(b, reporter)

    val aTypename = a.atomTypename
    val bTypename = b.atomTypename
    if (BoolTypename cantAccept aTypename) {
      reporter.report(Severity.Error, this, s"type mismatch: expecting bool, got ${ aTypename }")
    }
    if (BoolTypename cantAccept bTypename) {
      reporter.report(Severity.Error, this, s"type mismatch: expecting bool, got ${ bTypename }")
    }
  }
}


case class Constant(sourcePos: SourcePos, typename: AtomTypename, value: String) extends AbstractNode

  with Expr {
  override def fancyContext: String = s"${ typename.c_name } constant usage"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
  }

  override def atomTypename: AtomTypename = typename

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = {
    // TODO: check for int and float sizes
  }
}

case class FuncCall(sourcePos: SourcePos, name: String, args: List[Expr]) extends AbstractNode with Call

  with Expr {
  for (arg <- args) {
    arg.setParent(this)
  }

  override def fancyContext: String = s"function '${ name }' call"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    for (arg <- args) {
      arg.dispatch(f, newPayload)
    }
  }

  override def atomTypename: AtomTypename = this.getSymbolTable.get(name) match {
    case None => Unknown
    case Some(VarDecl(_, _, _)) => Unknown
    case Some(ParamDecl(_, _, _, _)) => Unknown
    case Some(FuncDecl(_, _, _, returnTypename, _, _)) => returnTypename
  }
}

case class VarOrParamAccess(sourcePos: SourcePos, name: String) extends AbstractNode with IdfAccess {
  override def fancyContext: String = s"variable '${ name }' access"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
  }

  override def atomTypename: AtomTypename = this.getSymbolTable.get(name) match {
    case None => Unknown
    case Some(VarDecl(_, leacType, _)) => {
      leacType match {
        case Atom(_, typename) => typename
        case Array(_, _, _) => Unknown
      }
    }
    case Some(ParamDecl(_, leacType, _, _)) => {
      leacType match {
        case Atom(_, typename) => typename
        case Array(_, _, _) => Unknown
      }
    }
    case Some(FuncDecl(_, _, _, _, _, _)) => Unknown
  }

  override def getArrayOpt: Option[Array] = this.getSymbolTable.get(name) match {
    case None => None
    case Some(VarDecl(_, leacType, _)) => {
      leacType match {
        case Atom(_, _) => None
        case Array(sourcePos, atomTypename, rangeDefs) => Some(Array(sourcePos, atomTypename, rangeDefs))
      }
    }
    case Some(ParamDecl(_, leacType, _, _)) => {
      leacType match {
        case Atom(_, _) => None
        case Array(sourcePos, atomTypename, rangeDefs) => Some(Array(sourcePos, atomTypename, rangeDefs))
      }
    }
    case Some(FuncDecl(_, _, _, _, _, _)) => None
  }

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = this.getSymbolTable.get(name) match {
    case None => {
      reporter.report(
        Severity.Error, this, s"'${ name }' is not defined"
        )
    }
    case Some(FuncDecl(_, _, _, _, _, _)) => {
      reporter.report(
        Severity.Error, this,
        s"'${ name }' is a function, not a variable. Consider adding parentheses to make a function call"
        )
    }
    case _ => ()
  }
}

case class CellAccess(sourcePos: SourcePos, arrayName: String, coords: List[Expr]) extends AbstractNode

  with IdfAccess {
  for (coord <- coords) {
    coord.setParent(this)
  }

  override def fancyContext: String = s"access to a cell of array '${ arrayName }'"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    for (coord <- coords) {
      coord.dispatch(f, newPayload)
    }
  }

  override def atomTypename: AtomTypename = this.getSymbolTable.get(arrayName) match {
    case None => Unknown
    case Some(VarDecl(_, leacType, _)) => {
      leacType match {
        case Atom(_, _) => Unknown
        case Array(_, typename, _) => typename
      }
    }
    case Some(ParamDecl(_, leacType, _, _)) => {
      leacType match {
        case Atom(_, _) => Unknown
        case Array(_, typename, _) => typename
      }
    }
    case Some(FuncDecl(_, _, _, _, _, _)) => Unknown
  }

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = {
    for ((coord, i) <- coords.zipWithIndex) {
      Expr.ensureNotArray(coord, reporter)
      if (IntTypename cantAccept coord.atomTypename) {
        reporter.report(
          Severity.Error, this, s"type mismatch in index for the dimension ${
            i + 1
          } of array '${ arrayName }': expecting int, got ${ coord.atomTypename }"
          )
      }
    }

    this.getSymbolTable.get(arrayName) match {
      case None => {
        reporter.report(
          Severity.Error, this, s"array '${ arrayName }' is not defined"
          )
      }
      case Some(VarDecl(_, leacType, _)) => {
        leacType match {
          case Atom(_, typename) => {
            reporter.report(
              Severity.Error, this, s"'${ arrayName }' has type ${ typename }, not array"
              )
          }
          case Array(_, _, rangeDefs) => {
            if (rangeDefs.length != coords.length) {
              reporter.report(
                Severity.Error, this, s"dimension mismatch: ${
                  coords
                    .length
                } indexe(s) have been used to access an element of array '${ arrayName }', but this array has ${
                  rangeDefs
                    .length
                } dimensions"
                )
            }
          }
        }
      }
      case Some(ParamDecl(_, leacType, _, _)) => {
        leacType match {
          case Atom(_, typename) => {
            reporter.report(
              Severity.Error, this, s"'${ arrayName }' has type ${ typename }, not array"
              )
          }
          case Array(_, _, rangeDefs) => {
            if (rangeDefs.length != coords.length) {
              reporter.report(
                Severity.Error, this, s"dimension mismatch: ${
                  coords
                    .length
                } indexe(s) have been used to access an element of array '${ arrayName }', but this array has ${
                  rangeDefs
                    .length
                } dimensions"
                )
            }
          }
        }
      }
      case Some(FuncDecl(_, _, _, _, _, _)) => {
        reporter.report(
          Severity.Error, this, s"'${ arrayName }' is a function, not an array"
          )
      }
    }
  }
}

case class Pow(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with BinaryIntFloatOperation {
  a.setParent(this)
  b.setParent(this)

  val priority = 1

  override def fancyContext: String = "exponentiation"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    a.dispatch(f, newPayload)
    b.dispatch(f, newPayload)
  }
}

case class UnaryMinus(sourcePos: SourcePos, a: Expr) extends AbstractNode with Operation {
  a.setParent(this)

  val priority = 2

  override def fancyContext: String = "unary minus"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    a.dispatch(f, newPayload)
  }

  override def atomTypename: AtomTypename = {
    val aTypename = a.atomTypename
    aTypename match {
      case FloatTypename => FloatTypename
      case _ => IntTypename
    }
  }

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = {
    Expr.ensureNotArray(a, reporter)

    val aTypename = a.atomTypename
    if (FloatTypename cantAccept aTypename) {
      reporter.report(Severity.Error, this, s"type mismatch: expecting float or int, got ${ aTypename }")
    }
  }
}

case class Not(sourcePos: SourcePos, a: Expr) extends AbstractNode with Operation {
  a.setParent(this)

  val priority = 2

  override def fancyContext: String = "logical NOT"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    a.dispatch(f, newPayload)
  }

  override def atomTypename: AtomTypename = BoolTypename

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = {
    Expr.ensureNotArray(a, reporter)

    val aTypename = a.atomTypename
    if (BoolTypename cantAccept aTypename) {
      reporter.report(Severity.Error, this, s"type mismatch: expecting bool, got ${ aTypename }")
    }
  }
}

case class Mul(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with BinaryIntFloatOperation {
  a.setParent(this)
  b.setParent(this)

  val priority = 3

  override def fancyContext: String = "product"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    a.dispatch(f, newPayload)
    b.dispatch(f, newPayload)
  }

}

case class Div(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with BinaryIntFloatOperation {
  a.setParent(this)
  b.setParent(this)

  val priority = 3

  override def fancyContext: String = "division"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    a.dispatch(f, newPayload)
    b.dispatch(f, newPayload)
  }

}

case class Add(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with BinaryIntFloatOperation {
  a.setParent(this)
  b.setParent(this)

  val priority = 4

  override def fancyContext: String = "sum"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    a.dispatch(f, newPayload)
    b.dispatch(f, newPayload)
  }

}

case class Sub(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with BinaryIntFloatOperation {
  a.setParent(this)
  b.setParent(this)

  val priority = 4

  override def fancyContext: String = "subtraction"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    a.dispatch(f, newPayload)
    b.dispatch(f, newPayload)
  }

}

case class TestLowerThan(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with BinaryOrdOperation {
  a.setParent(this)
  b.setParent(this)

  val priority = 5

  override def fancyContext: String = "'lower than' test"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    a.dispatch(f, newPayload)
    b.dispatch(f, newPayload)
  }

}

case class TestLowerOrEqual(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode

  with BinaryOrdOperation {
  a.setParent(this)
  b.setParent(this)

  val priority = 5

  override def fancyContext: String = "'lower or equal' test"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    a.dispatch(f, newPayload)
    b.dispatch(f, newPayload)
  }

}

case class TestGreaterThan(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode

  with BinaryOrdOperation {
  a.setParent(this)
  b.setParent(this)

  val priority = 5

  override def fancyContext: String = "'greater than' test"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    a.dispatch(f, newPayload)
    b.dispatch(f, newPayload)
  }
}

case class TestGreaterOrEqual(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode

  with BinaryOrdOperation {
  a.setParent(this)
  b.setParent(this)

  val priority = 5

  override def fancyContext: String = "'greater or equal' test"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    a.dispatch(f, newPayload)
    b.dispatch(f, newPayload)
  }

}

case class TestEqual(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with BinaryEqOperation {
  a.setParent(this)
  b.setParent(this)

  val priority = 6

  override def fancyContext: String = "equality test"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    a.dispatch(f, newPayload)
    b.dispatch(f, newPayload)
  }

}

case class TestNotEqual(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with BinaryEqOperation {
  a.setParent(this)
  b.setParent(this)

  val priority = 6

  override def fancyContext: String = "'not equal' test"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    a.dispatch(f, newPayload)
    b.dispatch(f, newPayload)
  }

}

case class And(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with BinaryLogicalOperation {
  a.setParent(this)
  b.setParent(this)

  val priority = 7

  override def fancyContext: String = "logical AND"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    a.dispatch(f, newPayload)
    b.dispatch(f, newPayload)
  }

}

case class Or(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with BinaryLogicalOperation {
  a.setParent(this)
  b.setParent(this)

  val priority = 8

  override def fancyContext: String = "logical OR"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    a.dispatch(f, newPayload)
    b.dispatch(f, newPayload)
  }
}

case object Nothing extends AbstractNode with Expr {
  override def sourcePos: SourcePos = parent.sourcePos

  override def fancyContext: String = "expr representing an absence of return value"

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
  }

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = {}

  override def generateCode(): String = ""

  override def atomTypename: AtomTypename = VoidTypename
}
