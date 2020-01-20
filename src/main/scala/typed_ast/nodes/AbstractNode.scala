package typed_ast.nodes

import typed_ast.{ScopedSymbolTable, SemanticCheckReporter, SourcePos}

abstract class AbstractNode {
  def sourcePos: SourcePos

  def setSymbolTable(symbolTable: ScopedSymbolTable): Unit = {
    this.sourcePos.setSymbolTable(symbolTable)
  }

  def getSymbolTable: ScopedSymbolTable = {
    sourcePos.symbolTable
  }

  def fancyContext: String

  def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit

  def fillAndLinkSymbolTable(reporter: SemanticCheckReporter): Unit = {
    dispatch(
      (node: AbstractNode, symbolTableReporter: (ScopedSymbolTable, SemanticCheckReporter)) => {
        node.setSymbolTable(symbolTableReporter._1)
        node._fillSymbolTable(symbolTableReporter._1, symbolTableReporter._2)
      },
      (null, reporter)
      )
  }

  def semanticCheck(reporter: SemanticCheckReporter): Unit = {
    dispatch(
      (node: AbstractNode, reporter: SemanticCheckReporter) => {
        node._semanticCheck(reporter)
        reporter
      },
      reporter
      )
  }

  protected def _fillSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): (ScopedSymbolTable, SemanticCheckReporter)

  protected def _semanticCheck(reporter: SemanticCheckReporter): Unit

  def code: String

  var parent: AbstractNode = this

  def setParent(_parent: AbstractNode): Unit = {
    this.parent = _parent
  }
}
