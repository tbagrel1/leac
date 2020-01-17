package typed_ast.nodes

import typed_ast.{ScopedSymbolTable, SemanticCheckReporter, SourcePos}

abstract class AbstractNode {
  def sourcePos: SourcePos

  def setSymbolTable(_symbolTable: ScopedSymbolTable): Unit = {
    this.symbolTable = _symbolTable
  }

  def fancyContext: String

  def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit

  def fillAndLinkSymbolTable(symbolTable: ScopedSymbolTable, reporter: SemanticCheckReporter): Unit = {
    dispatch(
      (node: AbstractNode, symbolTableReporter: (ScopedSymbolTable, SemanticCheckReporter)) => {
        node._fillAndLinkSymbolTable(symbolTableReporter._1, symbolTableReporter._2)
      },
      (symbolTable, reporter)
    )
  }

  def semanticCheck(symbolTable: ScopedSymbolTable, reporter: SemanticCheckReporter): Unit = {
    dispatch(
      (node: AbstractNode, symbolTableReporter: (ScopedSymbolTable, SemanticCheckReporter)) => {
        node._semanticCheck(symbolTableReporter._2)
        symbolTableReporter
      },
      (symbolTable, reporter)
    )
  }

  protected def _fillAndLinkSymbolTable(symbolTable: ScopedSymbolTable, reporter: SemanticCheckReporter): (ScopedSymbolTable, SemanticCheckReporter)

  protected def _semanticCheck(reporter: SemanticCheckReporter): Unit

  def generateCode(): String

  var parent: AbstractNode = this
  var symbolTable: ScopedSymbolTable

  def setParent(_parent: AbstractNode): Unit = {
    this.parent = _parent
  }
}
