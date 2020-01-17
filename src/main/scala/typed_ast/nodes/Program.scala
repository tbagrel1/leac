package typed_ast.nodes

import typed_ast.{SemanticCheckReporter, SourcePos, SymbolTable}

case class Program(
  sourcePos: SourcePos,
  name: String,
  varDecls: List[VarDecl],
  funcDecls: List[FuncDecl],
  statement: Statement
) extends AbstractNode {
  override def fancyContext: String = ???


  override def generateCode(): String = ???

  override def dispatch[T](f: (AbstractNode, T) => Unit, payload: T): Unit = {
    f(this, payload)
    for (varDecl <- varDecls) {
      varDecl.dispatch(f, payload)
    }
    for (funcDecl <- funcDecls) {
      funcDecl.dispatch(f, payload)
    }
    statement.dispatch(f, payload)
  }

  override protected def _fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override protected def _semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???
}
