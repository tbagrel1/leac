package typed_ast.nodes

import typed_ast.{SemanticCheckReporter, Severity}

trait Call extends AbstractNode {
  def name: String

  def args: List[Expr]

  def checkSlots(params: List[ParamDecl], reporter: SemanticCheckReporter): Unit = {
    if (params.length > args.length) {
      reporter.report(Severity.Error, this, s"not enough arguments specified to call function '${ name }': expecting ${
        params
          .length
      }, got ${ args.length }"
                      )
    }
    if (params.length < args.length) {
      reporter.report(Severity.Error, this, s"too many arguments specified to call function '${ name }': expecting ${
        params
          .length
      }, got ${ args.length }"
                      )
    }
    for ((param, arg) <- params.zip(args)) {
      if (param.leacType cantAccept arg.leacType) {
        reporter.report(Severity.Error, this,
                        s"type mismatch in function '${ name }' call for parameter ${ param.name }: expecting ${
                          param
                            .leacType
                        }, got ${ arg.leacType }"
                        )
      }
    }
  }

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = {
    this.getSymbolTable.get(name) match {
      case None => reporter.report(Severity.Error, this, s"function '${ name }' is not defined")
      case Some(VarDecl(_, _, _)) => {
        reporter.report(
          Severity.Error, this, s"'${ name }' is a variable, not a function, hence isn't callable"
          )
      }
      case Some(ParamDecl(_, _, _, _)) => {
        reporter.report(
          Severity.Error, this, s"'${ name }' is a parameter, not a function, hence isn't callable"
          )
      }
      case Some(FuncDecl(_, _, params, _, _, _)) => {
        checkSlots(params, reporter)
      }
    }
  }
}
