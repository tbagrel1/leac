package typed_ast.nodes

import typed_ast.SemanticCheckReporter

trait Call extends AbstractNode {
  def name: String

  def args: List[Expr]

  def checkSlots(params: List[ParamDecl], reporter: SemanticCheckReporter): Unit = {
    // TODO
  }

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = {
    this.getSymbolTable.get(name) match {
      case None => // TODO
      case VarDecl(_, _, _) => // TODO
      case ParamDecl(_, _, _, _) => // TODO
      case FuncDecl(_, _, params, _, _, _) => {
        checkSlots(params, reporter)
      }
    }
  }
}
