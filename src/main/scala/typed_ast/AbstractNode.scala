package typed_ast

abstract class AbstractNode {
  def fancyContext: String

  def fillSymbolTable(symbolTable: SymbolTable, reporter: SemanticCheckReporter): Unit

  def semanticCheck(symbolTable: SymbolTable, reporter: SemanticCheckReporter): Unit

  def generateCode(): String
}
