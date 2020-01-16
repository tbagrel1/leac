package typed_ast.nodes

import typed_ast.{SemanticCheckReporter, SymbolTable}

abstract class AbstractNode {
  def fancyContext: String

  def dispatch[T](f: (AbstractNode, T) => Unit, payload: T): Unit

  def fillSymbolTable(symbolTable: SymbolTable, reporter: SemanticCheckReporter): Unit = {
    dispatch(
      (node: AbstractNode, symbolTableReporter: (SymbolTable, SemanticCheckReporter)) => node._fillSymbolTable(
        symbolTableReporter._1, symbolTableReporter._2
        ), (symbolTable, reporter)
      )
  }

  def semanticCheck(symbolTable: SymbolTable, reporter: SemanticCheckReporter): Unit = {
    dispatch(
      (node: AbstractNode, symbolTableReporter: (SymbolTable, SemanticCheckReporter)) => node._semanticCheck(
        symbolTableReporter._1, symbolTableReporter._2
        ), (symbolTable, reporter)
      )
  }

  protected def _fillSymbolTable(symbolTable: SymbolTable, reporter: SemanticCheckReporter): Unit

  protected def _semanticCheck(symbolTable: SymbolTable, reporter: SemanticCheckReporter): Unit

  def generateCode(): String
}
