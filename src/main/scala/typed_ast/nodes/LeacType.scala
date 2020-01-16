package typed_ast.nodes

import typed_ast.nodes.enums.AtomTypename
import typed_ast.{Locatable, SemanticCheckReporter, SourcePos, SymbolTable}

sealed trait LeacType extends AbstractNode with Locatable

case class Atom(sourcePos: SourcePos, atomTypename: AtomTypename) extends AbstractNode with Locatable with LeacType {
  override def fancyContext: String = ???


  override def generateCode(): String = ???

  override def dispatch[T](f: (AbstractNode, T) => Unit, payload: T): Unit = ???

  override protected def _fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override protected def _semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???
}

case class Array(sourcePos: SourcePos, atomTypename: AtomTypename, rangeDefs: List[RangeDef]) extends AbstractNode
  with Locatable
  with LeacType {
  override def fancyContext: String = ???


  override def generateCode(): String = ???

  override def dispatch[T](f: (AbstractNode, T) => Unit, payload: T): Unit = ???

  override protected def _fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override protected def _semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???
}
