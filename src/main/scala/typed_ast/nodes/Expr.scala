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
  override def fancyContext: String = ???

  override def fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def generateCode(): String = ???
}

case class FuncCall(sourcePos: SourcePos, name: String, args: List[Expr]) extends AbstractNode
  with Locatable
  with Expr {
  override def fancyContext: String = ???

  override def fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def generateCode(): String = ???
}

case class VarAccess(sourcePos: SourcePos, name: String) extends AbstractNode with Locatable with IdfAccess {
  override def fancyContext: String = ???

  override def fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def generateCode(): String = ???
}

case class CellAccess(sourcePos: SourcePos, arrayName: String, coords: List[Expr]) extends AbstractNode
  with Locatable
  with IdfAccess {
  override def fancyContext: String = ???

  override def fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def generateCode(): String = ???
}

case class Pow(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
  val priority = 1

  override def fancyContext: String = ???

  override def fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def generateCode(): String = ???
}

case class UnaryMinus(sourcePos: SourcePos, a: Expr) extends AbstractNode with Locatable with Operation {
  val priority = 2

  override def fancyContext: String = ???

  override def fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def generateCode(): String = ???
}

case class Not(sourcePos: SourcePos, a: Expr) extends AbstractNode with Locatable with Operation {
  val priority = 2

  override def fancyContext: String = ???

  override def fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def generateCode(): String = ???
}

case class Mul(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
  val priority = 3

  override def fancyContext: String = ???

  override def fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def generateCode(): String = ???
}

case class Div(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
  val priority = 3

  override def fancyContext: String = ???

  override def fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def generateCode(): String = ???
}

case class Add(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
  val priority = 4

  override def fancyContext: String = ???

  override def fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def generateCode(): String = ???
}

case class Sub(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
  val priority = 4

  override def fancyContext: String = ???

  override def fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def generateCode(): String = ???
}

case class TestLowerThan(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode
  with Locatable
  with Operation {
  val priority = 5

  override def fancyContext: String = ???

  override def fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def generateCode(): String = ???
}

case class TestLowerOrEqual(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode
  with Locatable
  with Operation {
  val priority = 5

  override def fancyContext: String = ???

  override def fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def generateCode(): String = ???
}

case class TestGreaterThan(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode
  with Locatable
  with Operation {
  val priority = 5

  override def fancyContext: String = ???

  override def fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def generateCode(): String = ???
}

case class TestGreaterOrEqual(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode
  with Locatable
  with Operation {
  val priority = 5

  override def fancyContext: String = ???

  override def fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def generateCode(): String = ???
}

case class TestEqual(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
  val priority = 6

  override def fancyContext: String = ???

  override def fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def generateCode(): String = ???
}

case class TestNotEqual(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
  val priority = 6

  override def fancyContext: String = ???

  override def fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def generateCode(): String = ???
}

case class And(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
  val priority = 7

  override def fancyContext: String = ???

  override def fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def generateCode(): String = ???
}

case class Or(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
  val priority = 8

  override def fancyContext: String = ???

  override def fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override def generateCode(): String = ???
}


