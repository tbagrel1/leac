package typed_ast.nodes

import typed_ast.nodes.enums.AccessMode
import typed_ast.{SemanticCheckReporter, SourcePos, SymbolTable}

case class Param(sourcePos: SourcePos, leacType: LeacType, accessMode: AccessMode, name: String) extends AbstractNode {
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
