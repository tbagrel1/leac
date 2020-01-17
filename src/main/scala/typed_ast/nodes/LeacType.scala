package typed_ast.nodes

import typed_ast.nodes.enums.AtomTypename
import typed_ast.{SemanticCheckReporter, SourcePos, ScopedSymbolTable}

sealed trait LeacType extends AbstractNode {
  override protected def _fillAndLinkSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): (ScopedSymbolTable, SemanticCheckReporter) = (symbolTable, reporter)
}

case class Atom(sourcePos: SourcePos, atomTypename: AtomTypename) extends AbstractNode  with LeacType {
  override def fancyContext: String = "basic type use"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
  }

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???
}

case class Array(sourcePos: SourcePos, atomTypename: AtomTypename, rangeDefs: List[RangeDef]) extends AbstractNode

  with LeacType {
  for (rangeDef <- rangeDefs) {
    rangeDef.setParent(this)
  }

  override def fancyContext: String = "array type use"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    for (rangeDef <- rangeDefs) {
      rangeDef.dispatch(f, newPayload)
    }
  }

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???
}
