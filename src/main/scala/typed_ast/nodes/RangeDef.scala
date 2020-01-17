package typed_ast.nodes

import typed_ast.{SemanticCheckReporter, SourcePos, ScopedSymbolTable}

case class RangeDef(sourcePos: SourcePos, inf: Int, Sup: Int) extends AbstractNode {
  override def fancyContext: String = "array range definition"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
  }
}
