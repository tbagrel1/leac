package typed_ast

sealed trait Statement

case class Block(sourcePos: SourcePos, statements: List[Statement]) extends AbstractNode
  with Locatable
  with Statement {
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

case class Conditional(
  sourcePos: SourcePos,
  condition: Expr,
  statementIfTrue: Statement,
  statementIfFalse: Statement
) extends AbstractNode with Locatable with Statement {
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

case class Loop(sourcePos: SourcePos, condition: Expr, statementWhileTrue: Statement) extends AbstractNode
  with Locatable
  with Statement {
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

case class Returning(sourcePos: SourcePos, returnValue: Option[Expr]) extends AbstractNode
  with Locatable
  with Statement {
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

case class Affect(sourcePos: SourcePos, target: IdfAccess, value: Expr) extends AbstractNode
  with Locatable
  with Statement {
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

case class ProcedureCall(sourcePos: SourcePos, name: String, args: List[Expr]) extends AbstractNode
  with Locatable
  with Statement {
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

case class Read(sourcePos: SourcePos, target: IdfAccess) extends AbstractNode with Locatable with Statement {
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

case class Write(sourcePos: SourcePos, value: Expr) extends AbstractNode with Locatable with Statement {
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

