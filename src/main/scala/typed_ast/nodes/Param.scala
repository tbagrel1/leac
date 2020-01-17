package typed_ast.nodes

import typed_ast.nodes.enums.AccessMode
import typed_ast.{SemanticCheckReporter, SourcePos, ScopedSymbolTable}

case class Param(sourcePos: SourcePos, leacType: LeacType, accessMode: AccessMode, name: String) extends AbstractNode {
  leacType.setParent(this)

  override def fancyContext: String = s"function parameter \"${ name }\""


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    leacType.dispatch(f, newPayload)
  }

  override protected def _fillAndLinkSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???
}
