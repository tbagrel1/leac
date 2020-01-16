package typed_ast.nodes

import typed_ast.{SemanticCheckReporter, SymbolTable}

abstract class AbstractNode {
  def fancyContext: String

  def fillSymbolTable(symbolTable: SymbolTable, reporter: SemanticCheckReporter): Unit

  def semanticCheck(symbolTable: SymbolTable, reporter: SemanticCheckReporter): Unit

  def generateCode(): String
}
