package typed_ast.nodes

import typed_ast.nodes.enums.{AtomTypename, BoolTypename, FloatTypename, IntTypename, Unknown}
import typed_ast.{Locatable, SemanticCheckReporter, SourcePos, ScopedSymbolTable}

sealed trait Expr extends AbstractNode with Locatable {
  def atomTypename(symbolTable: ScopedSymbolTable): AtomTypename
}

sealed trait IdfAccess extends AbstractNode with Expr with Locatable {}

sealed trait Operation extends AbstractNode with Expr with Locatable {
  def priority: Int
}

sealed trait BinaryIntFloatOperation extends Operation with Expr {
  def a: Expr
  def b: Expr

  override def atomTypename(symbolTable: ScopedSymbolTable): AtomTypename = {
    val aTypename = a.atomTypename(symbolTable)
    val bTypename = b.atomTypename(symbolTable)
    (aTypename, bTypename) match {
      case (IntTypename, IntTypename) => IntTypename
      case (IntTypename, FloatTypename) | (FloatTypename, IntTypename) | (FloatTypename, FloatTypename) => FloatTypename
      case _ => Unknown
    }
  }
}

sealed trait BinaryOrdOperation extends Operation with Expr {
  def a: Expr
  def b: Expr

  override def atomTypename(symbolTable: ScopedSymbolTable): AtomTypename = {
    val aTypename = a.atomTypename(symbolTable)
    val bTypename = b.atomTypename(symbolTable)
    (aTypename, bTypename) match {

    }
  }
}

sealed trait BinaryEqOperation extends Operation with Expr {
  def a: Expr
  def b: Expr

  override def atomTypename(symbolTable: ScopedSymbolTable): AtomTypename = {

  }
}

sealed trait BinaryLogicalOperation extends Operation with Expr {
  def a: Expr
  def b: Expr

  override def atomTypename(symbolTable: ScopedSymbolTable): AtomTypename = {

  }
}

case class Constant(sourcePos: SourcePos, typename: AtomTypename, value: String) extends AbstractNode
  with Locatable
  with Expr {
  override def fancyContext: String = s"${ typename.c_name } constant usage"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
  }

  override protected def _fillAndLinkSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???

  override def atomTypename(symbolTable: ScopedSymbolTable): AtomTypename = typename
}

case class FuncCall(sourcePos: SourcePos, name: String, args: List[Expr]) extends AbstractNode
  with Locatable
  with Expr {
  for (arg <- args) {
    arg.setParent(this)
  }

  override def fancyContext: String = s"function \"${ name }\" call"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    for (arg <- args) {
      arg.dispatch(f, newPayload)
    }
  }

  override protected def _fillAndLinkSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???

  override def atomTypename(symbolTable: ScopedSymbolTable): AtomTypename = symbolTable.get(name) match {
    case None => Unknown
    case Some(VarDecl(_, _, _)) => Unknown
    case Some(FuncDecl(_, _, _, returnTypename, _, _)) => returnTypename
  }
}

case class VarAccess(sourcePos: SourcePos, name: String) extends AbstractNode with Locatable with IdfAccess {
  override def fancyContext: String = s"variable \"${ name }\" access"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
  }

  override protected def _fillAndLinkSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???

  override def atomTypename(symbolTable: ScopedSymbolTable): AtomTypename = symbolTable.get(name) match {
    case None => Unknown
    case Some(VarDecl(_, leacType, _)) => leacType match {
      case Atom(_, typename) => typename
      case Array(_, _, _) => Unknown
    }
    case Some(FuncDecl(_, _, _, _, _, _)) => Unknown
  }
}

case class CellAccess(sourcePos: SourcePos, arrayName: String, coords: List[Expr]) extends AbstractNode
  with Locatable
  with IdfAccess {
  for (coord <- coords) {
    coord.setParent(this)
  }

  override def fancyContext: String = s"access to a cell of array \"${ arrayName }\""


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    for (coord <- coords) {
      coord.dispatch(f, newPayload)
    }
  }

  override protected def _fillAndLinkSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???

  override def atomTypename(symbolTable: ScopedSymbolTable): AtomTypename = {
    case None => Unknown
    case Some(VarDecl(_, leacType, _)) => leacType match {
      case Atom(_, _) => Unknown
      case Array(_, typename, _) => typename
    }
    case Some(FuncDecl(_, _, _, _, _, _)) => Unknown
  }
}

case class Pow(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
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

  override protected def _fillAndLinkSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???

  override def atomTypename(symbolTable: ScopedSymbolTable): AtomTypename = {
    val aTypename = a.atomTypename(symbolTable)
    val bTypename = b.atomTypename(symbolTable)
    (aTypename, bTypename) match {
      case (IntTypename, IntTypename) => IntTypename
      case (IntTypename, FloatTypename) | (FloatTypename, IntTypename) | (FloatTypename, FloatTypename) => FloatTypename
      case _ => Unknown
    }
  }
}

case class UnaryMinus(sourcePos: SourcePos, a: Expr) extends AbstractNode with Locatable with Operation {
  a.setParent(this)

  val priority = 2

  override def fancyContext: String = "unary minus"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    a.dispatch(f, newPayload)
  }

  override protected def _fillAndLinkSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???

  override def atomTypename(symbolTable: ScopedSymbolTable): AtomTypename = {
    val aTypename = a.atomTypename(symbolTable)
    aTypename match {
      case IntTypename | FloatTypename => aTypename
      case _ => Unknown
    }
  }
}

case class Not(sourcePos: SourcePos, a: Expr) extends AbstractNode with Locatable with Operation {
  a.setParent(this)

  val priority = 2

  override def fancyContext: String = "logical NOT"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    a.dispatch(f, newPayload)
  }

  override protected def _fillAndLinkSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???

  override def atomTypename(symbolTable: ScopedSymbolTable): AtomTypename = {
    val aTypename = a.atomTypename(symbolTable)
    aTypename match {
      case BoolTypename => BoolTypename
      case _ => Unknown
    }
  }
}

case class Mul(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
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

  override protected def _fillAndLinkSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???
}

case class Div(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
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

  override protected def _fillAndLinkSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???
}

case class Add(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
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

  override protected def _fillAndLinkSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???
}

case class Sub(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
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

  override protected def _fillAndLinkSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???
}

case class TestLowerThan(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode
  with Locatable
  with Operation {
  a.setParent(this)
  b.setParent(this)

  val priority = 5

  override def fancyContext: String = "\"lower than\" test"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    a.dispatch(f, newPayload)
    b.dispatch(f, newPayload)
  }

  override protected def _fillAndLinkSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???
}

case class TestLowerOrEqual(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode
  with Locatable
  with Operation {
  a.setParent(this)
  b.setParent(this)

  val priority = 5

  override def fancyContext: String = "\"lower or equal\" test"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    a.dispatch(f, newPayload)
    b.dispatch(f, newPayload)
  }

  override protected def _fillAndLinkSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???
}

case class TestGreaterThan(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode
  with Locatable
  with Operation {
  a.setParent(this)
  b.setParent(this)

  val priority = 5

  override def fancyContext: String = "\"greater than\" test"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    a.dispatch(f, newPayload)
    b.dispatch(f, newPayload)
  }

  override protected def _fillAndLinkSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???
}

case class TestGreaterOrEqual(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode
  with Locatable
  with Operation {
  a.setParent(this)
  b.setParent(this)

  val priority = 5

  override def fancyContext: String = "\"greater or equal\" test"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    a.dispatch(f, newPayload)
    b.dispatch(f, newPayload)
  }

  override protected def _fillAndLinkSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???
}

case class TestEqual(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
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

  override protected def _fillAndLinkSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???
}

case class TestNotEqual(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
  a.setParent(this)
  b.setParent(this)

  val priority = 6

  override def fancyContext: String = "\"not equal\" test"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    a.dispatch(f, newPayload)
    b.dispatch(f, newPayload)
  }

  override protected def _fillAndLinkSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???
}

case class And(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
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

  override protected def _fillAndLinkSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???
}

case class Or(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
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

  override protected def _fillAndLinkSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???
}


