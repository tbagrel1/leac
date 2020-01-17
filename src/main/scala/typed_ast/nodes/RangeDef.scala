package typed_ast.nodes

import typed_ast.{ScopedSymbolTable, SemanticCheckReporter, SourcePos}

case class RangeDef(sourcePos: SourcePos, inf: Int, sup: Int) extends AbstractNode {
  override def fancyContext: String = "array range definition"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
  }

  override protected def _fillSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): (ScopedSymbolTable, SemanticCheckReporter) = (symbolTable, reporter)

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???

  override def toString: String = s"${ inf }..${ sup }"
}
