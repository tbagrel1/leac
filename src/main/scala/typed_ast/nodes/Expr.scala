package typed_ast.nodes

import typed_ast.nodes.enums.{AtomTypename, BoolTypename, FloatTypename, IntTypename, Unknown}
import typed_ast.{SemanticCheckReporter, SourcePos, ScopedSymbolTable}

sealed trait Expr extends AbstractNode  {
  def atomTypename(symbolTable: ScopedSymbolTable): AtomTypename
}

sealed trait IdfAccess extends AbstractNode with Expr  {}

sealed trait Operation extends AbstractNode with Expr  {
  def priority: Int
}

sealed trait BinaryIntFloatOperation extends Operation {
  def a: Expr
  def b: Expr

  override def atomTypename(symbolTable: ScopedSymbolTable): AtomTypename = {
    val aTypename = a.atomTypename(symbolTable)
    val bTypename = b.atomTypename(symbolTable)
    (aTypename, bTypename) match {
      case (FloatTypename, _) | (_, FloatTypename) => FloatTypename
      case _ => IntTypename
    }
  }
}

sealed trait BinaryOrdOperation extends Operation {
  def a: Expr
  def b: Expr

  override def atomTypename(symbolTable: ScopedSymbolTable): AtomTypename = BoolTypename
}

sealed trait BinaryEqOperation extends Operation {
  def a: Expr
  def b: Expr

  override def atomTypename(symbolTable: ScopedSymbolTable): AtomTypename = BoolTypename
}

sealed trait BinaryLogicalOperation extends Operation {
  def a: Expr
  def b: Expr

  override def atomTypename(symbolTable: ScopedSymbolTable): AtomTypename = BoolTypename
}


case class Constant(sourcePos: SourcePos, typename: AtomTypename, value: String) extends AbstractNode

  with Expr {
  override def fancyContext: String = s"${ typename.c_name } constant usage"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
  }

  override def atomTypename(symbolTable: ScopedSymbolTable): AtomTypename = typename
}

case class FuncCall(sourcePos: SourcePos, name: String, args: List[Expr]) extends AbstractNode

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

  override def atomTypename(symbolTable: ScopedSymbolTable): AtomTypename = symbolTable.get(name) match {
    case None => Unknown
    case Some(VarDecl(_, _, _)) => Unknown
    case Some(FuncDecl(_, _, _, returnTypename, _, _)) => returnTypename
  }
}

case class VarAccess(sourcePos: SourcePos, name: String) extends AbstractNode  with IdfAccess {
  override def fancyContext: String = s"variable \"${ name }\" access"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
  }

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

  override def atomTypename(symbolTable: ScopedSymbolTable): AtomTypename = {
    case None => Unknown
    case Some(VarDecl(_, leacType, _)) => leacType match {
      case Atom(_, _) => Unknown
      case Array(_, typename, _) => typename
    }
    case Some(FuncDecl(_, _, _, _, _, _)) => Unknown
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

case class UnaryMinus(sourcePos: SourcePos, a: Expr) extends AbstractNode  with Operation {
  a.setParent(this)

  val priority = 2

  override def fancyContext: String = "unary minus"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    a.dispatch(f, newPayload)
  }

  override def atomTypename(symbolTable: ScopedSymbolTable): AtomTypename = {
    val aTypename = a.atomTypename(symbolTable)
    aTypename match {
      case FloatTypename => FloatTypename
      case _ => IntTypename
    }
  }
}

case class Not(sourcePos: SourcePos, a: Expr) extends AbstractNode  with Operation {
  a.setParent(this)

  val priority = 2

  override def fancyContext: String = "logical NOT"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    a.dispatch(f, newPayload)
  }

  override def atomTypename(symbolTable: ScopedSymbolTable): AtomTypename = BoolTypename
}

case class Mul(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode  with BinaryIntFloatOperation {
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

case class Div(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode  with BinaryIntFloatOperation {
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

case class Add(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode  with BinaryIntFloatOperation {
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

case class Sub(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode  with BinaryIntFloatOperation {
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

  override def fancyContext: String = "\"lower than\" test"


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

  override def fancyContext: String = "\"lower or equal\" test"


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

  override def fancyContext: String = "\"greater than\" test"


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

  override def fancyContext: String = "\"greater or equal\" test"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    a.dispatch(f, newPayload)
    b.dispatch(f, newPayload)
  }

}

case class TestEqual(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode  with BinaryEqOperation {
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

case class TestNotEqual(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode  with BinaryEqOperation {
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

}

case class And(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode  with BinaryLogicalOperation {
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

case class Or(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode  with BinaryLogicalOperation {
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


