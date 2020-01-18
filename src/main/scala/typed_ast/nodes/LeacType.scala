package typed_ast.nodes

import typed_ast.nodes.enums.AtomTypename
import typed_ast.{ScopedSymbolTable, SemanticCheckReporter, SourcePos}

sealed trait LeacType extends AbstractNode {
  def accept(other: LeacType): Boolean

  def cantAccept(other: LeacType): Boolean = !accept(other)

  override protected def _fillSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): (ScopedSymbolTable, SemanticCheckReporter) = (symbolTable, reporter)
}

case class Atom(sourcePos: SourcePos, atomTypename: AtomTypename) extends AbstractNode with LeacType {
  override def fancyContext: String = "basic type use"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
  }

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???

  override def toString: String = atomTypename.toString

  override def accept(other: LeacType): Boolean = other match {
    case Atom(_, otherTypename) => atomTypename accept otherTypename
    case Array(_, _, _) => false
  }
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

  override def toString: String = s"[${ atomTypename }; ${ rangeDefs.map(_.toString).mkString(", ") }]"

  override def accept(other: LeacType): Boolean = other match {
    case Atom(_, _) => false
    case Array(_, otherTypename, otherRangeDefs) => (atomTypename accept otherTypename) && (rangeDefs == otherRangeDefs)
  }
}
