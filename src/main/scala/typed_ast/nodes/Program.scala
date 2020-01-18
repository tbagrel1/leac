package typed_ast.nodes

import typed_ast.nodes.enums.VoidTypename
import typed_ast.{ScopedSymbolTable, SemanticCheckReporter, Severity, SourcePos}

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

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = {
    import ReturnPrediction._
    this.statement.returnPrediction(reporter, this) match {
      case None => ()
      case Unsure(typename, returning) => {
        if (typename cantAccept VoidTypename) {
          reporter.report(
            Severity.Error, this,
            s"an unsure return statement of type ${ typename } has been found in the program's body at ${
              returning
                .sourcePos
            }, but only return statements with no return value can be used to make early returns"
            )
        }
      }
      case Sure(typename, returning) => {
        if (typename cantAccept VoidTypename) {
          reporter.report(
            Severity.Error, this,
            s"an unsure return statement of type ${ typename } has been found in the program's body at ${
              returning
                .sourcePos
            }, but only return statements with no return value can be used to make early returns"
            )
        }
      }
    }
  }
}
