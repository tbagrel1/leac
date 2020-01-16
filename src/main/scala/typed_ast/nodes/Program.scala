package typed_ast.nodes

import typed_ast.{SemanticCheckReporter, SourcePos, SymbolTable}

case class Program(
  sourcePos: SourcePos,
  name: String,
  varDecls: List[VarDecl],
  funcDecls: List[FuncDecl],
  statement: Statement
) extends AbstractNode {
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
