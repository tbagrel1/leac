package typed_ast.nodes

import typed_ast.{SemanticCheckReporter, SourcePos, SymbolTable}

case class RangeDef(sourcePos: SourcePos, inf: Int, Sup: Int) extends AbstractNode {
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
