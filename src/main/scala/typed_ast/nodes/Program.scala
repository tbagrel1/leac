package typed_ast.nodes

import typed_ast.{ScopedSymbolTable, SemanticCheckReporter, SourcePos}

case class Program(
  sourcePos: SourcePos,
  name: String,
  varDecls: List[VarDecl],
  funcDecls: List[FuncDecl],
  statement: Statement
) extends AbstractNode {
  for (varDecl <- varDecls) {
    varDecl.setParent(this)
  }
  for (funcDecl <- funcDecls) {
    funcDecl.setParent(this)
  }
  statement.setParent(this)

  override def fancyContext: String = s"program '${ name }' definition"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    for (varDecl <- varDecls) {
      varDecl.dispatch(f, newPayload)
    }
    for (funcDecl <- funcDecls) {
      funcDecl.dispatch(f, newPayload)
    }
    statement.dispatch(f, newPayload)
  }

  override protected def _fillSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): (ScopedSymbolTable, SemanticCheckReporter) = {
    (new ScopedSymbolTable(fancyContext), reporter)
  }

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???
}
