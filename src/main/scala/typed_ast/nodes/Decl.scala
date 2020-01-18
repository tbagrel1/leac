package typed_ast.nodes

import typed_ast.nodes.enums.{AccessMode, AtomTypename, ByCopy, VoidTypename}
import typed_ast.{ScopedSymbolTable, SemanticCheckReporter, Severity, SourcePos}

sealed trait Decl extends AbstractNode {
  def name: String
}

case class FuncDecl(
  sourcePos: SourcePos,
  name: String,
  params: List[ParamDecl],
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

  override protected def _fillSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): (ScopedSymbolTable, SemanticCheckReporter) = {
    symbolTable.register(this, reporter, this.parent)
    (symbolTable.spawnChild(fancyContext), reporter)
  }

  override def toString: String = s"${ returnTypename } ${ name }(${ params.map(_.toString).mkString(", ") })"

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = {
    // Check returning presence and type
    import ReturnPrediction._
    this.statementBlock.returnPrediction(reporter, this) match {
      case None => {
        if (returnTypename != VoidTypename) {
          reporter.report(
            Severity.Error, this,
            s"function '${ name }' return type is ${ returnTypename }, but no return statement has been found in its " +
              s"body"
            )
        }
      }
      case Unsure(typename, returning) => {
        if (returnTypename == VoidTypename) {
          if (VoidTypename cantAccept typename) {
            reporter.report(
              Severity.Error, this,
              s"function '${ name }' return type is void, but an unsure return statement with type ${ typename } has " +
                s"been found in its body at ${
                  returning
                    .sourcePos
                }"
              )
          }
        } else {
          if (returnTypename cantAccept typename) {
            reporter.report(
              Severity.Error, this,
              s"function '${ name }' return type is ${ returnTypename }, but a return statement with type ${
                typename
              } has been found in its body at ${
                returning
                  .sourcePos
              }"
              )
          }
          reporter.report(
            Severity.Error, this,
            s"function '${ name }' must return a ${ returnTypename } in all cases, but only unsure return statement" +
              s"(s) with this type have been found in its body"
            )
        }
      }
      case Sure(typename, returning) => {
        if (returnTypename cantAccept typename) {
          reporter.report(
            Severity.Error, this,
            s"function '${ name }' return type is ${ returnTypename }, but a return statement with type ${ typename }" +
              s" has been found in its body at ${
                returning
                  .sourcePos
              }"
            )
        }
      }
    }
  }
}

case class VarDecl(sourcePos: SourcePos, leacType: LeacType, name: String) extends AbstractNode with Decl {
  leacType.setParent(this)

  override def fancyContext: String = s"'${ name }' variable declaration"

  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    leacType.dispatch(f, newPayload)
  }

  override protected def _fillSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): (ScopedSymbolTable, SemanticCheckReporter) = {
    symbolTable.register(this, reporter, this.parent)
    (symbolTable, reporter)
  }

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = {
    leacType match {
      case Atom(_, VoidTypename) => reporter.report(Severity.Error, this, "cannot declare a variable of type void")
      case _ => ()
    }
  }

  override def toString: String = s"${ leacType } ${ name }"
}

case class ParamDecl(
  sourcePos: SourcePos,
  leacType: LeacType,
  accessMode: AccessMode,
  name: String
) extends AbstractNode with Decl {
  leacType.setParent(this)

  override def fancyContext: String = s"function parameter '${ name }' declaration"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    leacType.dispatch(f, newPayload)
  }

  override protected def _fillSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): (ScopedSymbolTable, SemanticCheckReporter) = {
    symbolTable.register(this, reporter, this.parent)
    (symbolTable, reporter)
  }

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = {
    leacType match {
      case Array(_, _, _) => {
        if (accessMode == ByCopy) {
          reporter.report(
            Severity.Error, this, "array parameters can only be passed by reference using the 'ref' keyword"
            )
        }
      }
      case _ => ()
    }

    leacType match {
      case Atom(_, VoidTypename) => reporter.report(Severity.Error, this, "cannot declare a parameter of type void")
      case _ => ()
    }
  }

  override def toString: String = s"${ accessMode }${ leacType } ${ name }"
}
