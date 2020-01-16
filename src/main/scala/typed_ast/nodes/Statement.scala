package typed_ast.nodes

import typed_ast.{Locatable, SemanticCheckReporter, SourcePos, SymbolTable}

sealed trait Statement extends AbstractNode with Locatable

case class Block(sourcePos: SourcePos, statements: List[Statement]) extends AbstractNode
  with Locatable
  with Statement {
  override def fancyContext: String = ???


  override def generateCode(): String = ???

  override def dispatch[T](f: (AbstractNode, T) => Unit, payload: T): Unit = ???

  override protected def _fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override protected def _semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???
}

case class Conditional(
  sourcePos: SourcePos,
  condition: Expr,
  statementIfTrue: Statement,
  statementIfFalse: Statement
) extends AbstractNode with Locatable with Statement {
  override def fancyContext: String = ???


  override def generateCode(): String = ???

  override def dispatch[T](f: (AbstractNode, T) => Unit, payload: T): Unit = ???

  override protected def _fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override protected def _semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???
}

case class Loop(sourcePos: SourcePos, condition: Expr, statementWhileTrue: Statement) extends AbstractNode
  with Locatable
  with Statement {
  override def fancyContext: String = ???


  override def generateCode(): String = ???

  override def dispatch[T](f: (AbstractNode, T) => Unit, payload: T): Unit = ???

  override protected def _fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override protected def _semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???
}

case class Returning(sourcePos: SourcePos, returnValue: Option[Expr]) extends AbstractNode
  with Locatable
  with Statement {
  override def fancyContext: String = ???


  override def generateCode(): String = ???

  override def dispatch[T](f: (AbstractNode, T) => Unit, payload: T): Unit = ???

  override protected def _fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override protected def _semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???
}

case class Affect(sourcePos: SourcePos, target: IdfAccess, value: Expr) extends AbstractNode
  with Locatable
  with Statement {
  override def fancyContext: String = ???


  override def generateCode(): String = ???

  override def dispatch[T](f: (AbstractNode, T) => Unit, payload: T): Unit = ???

  override protected def _fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override protected def _semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???
}

case class ProcedureCall(sourcePos: SourcePos, name: String, args: List[Expr]) extends AbstractNode
  with Locatable
  with Statement {
  override def fancyContext: String = ???


  override def generateCode(): String = ???

  override def dispatch[T](f: (AbstractNode, T) => Unit, payload: T): Unit = ???

  override protected def _fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override protected def _semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???
}

case class Read(sourcePos: SourcePos, target: IdfAccess) extends AbstractNode with Locatable with Statement {
  override def fancyContext: String = ???


  override def generateCode(): String = ???

  override def dispatch[T](f: (AbstractNode, T) => Unit, payload: T): Unit = ???

  override protected def _fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override protected def _semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???
}

case class Write(sourcePos: SourcePos, value: Expr) extends AbstractNode with Locatable with Statement {
  override def fancyContext: String = ???


  override def generateCode(): String = ???

  override def dispatch[T](f: (AbstractNode, T) => Unit, payload: T): Unit = ???

  override protected def _fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override protected def _semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???
}

