package typed_ast.nodes

import typed_ast.nodes.enums.AtomTypename
import typed_ast.{Locatable, SemanticCheckReporter, SourcePos, SymbolTable}

sealed trait Expr extends AbstractNode with Locatable {}

sealed trait IdfAccess extends AbstractNode with Expr with Locatable {}

sealed trait Operation extends AbstractNode with Expr with Locatable {
  def priority: Int
}

case class Constant(sourcePos: SourcePos, typename: AtomTypename, value: String) extends AbstractNode
  with Locatable
  with Expr {
  override def fancyContext: String = s"${ typename.c_name } constant usage"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => Unit, payload: T): Unit = {
    f(this, payload)
  }

  override protected def _fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???
}

case class FuncCall(sourcePos: SourcePos, name: String, args: List[Expr]) extends AbstractNode
  with Locatable
  with Expr {
  for (arg <- args) {
    arg.setParent(this)
  }

  override def fancyContext: String = s"function \"${ name }\" call"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => Unit, payload: T): Unit = {
    f(this, payload)
    for (arg <- args) {
      arg.dispatch(f, payload)
    }
  }

  override protected def _fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???
}

case class VarAccess(sourcePos: SourcePos, name: String) extends AbstractNode with Locatable with IdfAccess {
  override def fancyContext: String = s"variable \"${ name }\" access"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => Unit, payload: T): Unit = {
    f(this, payload)
  }

  override protected def _fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???
}

case class CellAccess(sourcePos: SourcePos, arrayName: String, coords: List[Expr]) extends AbstractNode
  with Locatable
  with IdfAccess {
  for (coord <- coords) {
    coord.setParent(this)
  }

  override def fancyContext: String = s"access to a cell of array \"${ arrayName }\""


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => Unit, payload: T): Unit = {
    f(this, payload)
    for (coord <- coords) {
      coord.dispatch(f, payload)
    }
  }

  override protected def _fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???
}

case class Pow(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
  a.setParent(this)
  b.setParent(this)

  val priority = 1

  override def fancyContext: String = "exponentiation"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => Unit, payload: T): Unit = {
    f(this, payload)
    a.dispatch(f, payload)
    b.dispatch(f, payload)
  }

  override protected def _fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???
}

case class UnaryMinus(sourcePos: SourcePos, a: Expr) extends AbstractNode with Locatable with Operation {
  a.setParent(this)

  val priority = 2

  override def fancyContext: String = "unary minus"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => Unit, payload: T): Unit = {
    f(this, payload)
    a.dispatch(f, payload)
  }

  override protected def _fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???
}

case class Not(sourcePos: SourcePos, a: Expr) extends AbstractNode with Locatable with Operation {
  a.setParent(this)

  val priority = 2

  override def fancyContext: String = "logical NOT"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => Unit, payload: T): Unit = {
    f(this, payload)
    a.dispatch(f, payload)
  }

  override protected def _fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???
}

case class Mul(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
  a.setParent(this)
  b.setParent(this)

  val priority = 3

  override def fancyContext: String = "product"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => Unit, payload: T): Unit = {
    f(this, payload)
    a.dispatch(f, payload)
    b.dispatch(f, payload)
  }

  override protected def _fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???
}

case class Div(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
  a.setParent(this)
  b.setParent(this)

  val priority = 3

  override def fancyContext: String = "division"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => Unit, payload: T): Unit = {
    f(this, payload)
    a.dispatch(f, payload)
    b.dispatch(f, payload)
  }

  override protected def _fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???
}

case class Add(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
  a.setParent(this)
  b.setParent(this)

  val priority = 4

  override def fancyContext: String = "sum"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => Unit, payload: T): Unit = {
    f(this, payload)
    a.dispatch(f, payload)
    b.dispatch(f, payload)
  }

  override protected def _fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???
}

case class Sub(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
  a.setParent(this)
  b.setParent(this)

  val priority = 4

  override def fancyContext: String = "subtraction"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => Unit, payload: T): Unit = {
    f(this, payload)
    a.dispatch(f, payload)
    b.dispatch(f, payload)
  }

  override protected def _fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???
}

case class TestLowerThan(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode
  with Locatable
  with Operation {
  a.setParent(this)
  b.setParent(this)

  val priority = 5

  override def fancyContext: String = "\"lower than\" test"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => Unit, payload: T): Unit = {
    f(this, payload)
    a.dispatch(f, payload)
    b.dispatch(f, payload)
  }

  override protected def _fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???
}

case class TestLowerOrEqual(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode
  with Locatable
  with Operation {
  a.setParent(this)
  b.setParent(this)

  val priority = 5

  override def fancyContext: String = "\"lower or equal\" test"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => Unit, payload: T): Unit = {
    f(this, payload)
    a.dispatch(f, payload)
    b.dispatch(f, payload)
  }

  override protected def _fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???
}

case class TestGreaterThan(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode
  with Locatable
  with Operation {
  a.setParent(this)
  b.setParent(this)

  val priority = 5

  override def fancyContext: String = "\"greater than\" test"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => Unit, payload: T): Unit = {
    f(this, payload)
    a.dispatch(f, payload)
    b.dispatch(f, payload)
  }

  override protected def _fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???
}

case class TestGreaterOrEqual(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode
  with Locatable
  with Operation {
  a.setParent(this)
  b.setParent(this)

  val priority = 5

  override def fancyContext: String = "\"greater or equal\" test"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => Unit, payload: T): Unit = {
    f(this, payload)
    a.dispatch(f, payload)
    b.dispatch(f, payload)
  }

  override protected def _fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???
}

case class TestEqual(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
  a.setParent(this)
  b.setParent(this)

  val priority = 6

  override def fancyContext: String = "equality test"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => Unit, payload: T): Unit = {
    f(this, payload)
    a.dispatch(f, payload)
    b.dispatch(f, payload)
  }

  override protected def _fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???
}

case class TestNotEqual(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
  a.setParent(this)
  b.setParent(this)

  val priority = 6

  override def fancyContext: String = "\"not equal\" test"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => Unit, payload: T): Unit = {
    f(this, payload)
    a.dispatch(f, payload)
    b.dispatch(f, payload)
  }

  override protected def _fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???
}

case class And(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
  a.setParent(this)
  b.setParent(this)

  val priority = 7

  override def fancyContext: String = "logical AND"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => Unit, payload: T): Unit = {
    f(this, payload)
    a.dispatch(f, payload)
    b.dispatch(f, payload)
  }

  override protected def _fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???
}

case class Or(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
  a.setParent(this)
  b.setParent(this)

  val priority = 8

  override def fancyContext: String = "logical OR"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => Unit, payload: T): Unit = {
    f(this, payload)
    a.dispatch(f, payload)
    b.dispatch(f, payload)
  }

  override protected def _fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???
}


