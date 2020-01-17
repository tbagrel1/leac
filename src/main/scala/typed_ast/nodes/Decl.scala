package typed_ast.nodes

import typed_ast.nodes.enums.AtomTypename
import typed_ast.{SemanticCheckReporter, SourcePos, ScopedSymbolTable}

sealed trait Decl extends AbstractNode  {
  def name: String
}

case class FuncDecl(
  sourcePos: SourcePos,
  name: String,
  params: List[Param],
  returnTypename: AtomTypename,
  varDecls: List[VarDecl],
  statementBlock: Block
) extends AbstractNode with Decl {

  for (param <- params) {
    param.setParent(this)
  }
  for (varDecl <- varDecls) {
    varDecl.setParent(this)
  }
  statementBlock.setParent(this)

  override def fancyContext: String = s"'${ name }' function declaration"

  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    for (param <- params) {
      param.dispatch(f, newPayload)
    }
    for (varDecl <- varDecls) {
      varDecl.dispatch(f, newPayload)
    }
    statementBlock.dispatch(f, newPayload)
  }

  override protected def _fillAndLinkSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): (ScopedSymbolTable, SemanticCheckReporter) = ???

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???
}

case class VarDecl(sourcePos: SourcePos, leacType: LeacType, name: String) extends AbstractNode with Decl {
  leacType.setParent(this)

  override def fancyContext: String = s"'${ name }' variable declaration"

  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    leacType.dispatch(f, newPayload)
  }

  override protected def _fillAndLinkSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): (ScopedSymbolTable, SemanticCheckReporter) = ???

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???
}
