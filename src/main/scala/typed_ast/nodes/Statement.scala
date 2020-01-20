package typed_ast.nodes

import typed_ast.nodes.enums._
import typed_ast.nodes.NoReturnValue
import typed_ast.{CodeUtils, ScopedSymbolTable, SemanticCheckReporter, Severity, SourcePos}

sealed trait ReturnPrediction {

  import ReturnPrediction._

  def reduce(other: ReturnPrediction, reporter: SemanticCheckReporter, contextNode: AbstractNode): ReturnPrediction = {
    // TODO: in case Int, Float return Float
    (this, other) match {
      case (None, _) => other
      case (_, None) => this
      case (Unsure(thisTypename, thisReturning), Unsure(otherTypename, otherReturning)) => {
        val (resTypename, resReturning) = if ((thisTypename cantAccept otherTypename) &&
          (otherTypename cantAccept thisTypename)) {
          reporter.report(
            Severity.Error, contextNode, s"type mismatch between return statement at ${ thisReturning.sourcePos } and ${
              otherReturning
                .sourcePos
            }: ${ thisTypename } != ${ otherTypename }"
            )
          (thisTypename, thisReturning)
        } else {
          if (thisTypename > otherTypename) {
            (thisTypename, thisReturning)
          } else {
            (otherTypename, otherReturning)
          }
        }
        Unsure(resTypename, resReturning)
      }
      case (Unsure(thisTypename, thisReturning), Sure(otherTypename, otherReturning)) => {
        val (resTypename, resReturning) = if ((thisTypename cantAccept otherTypename) &&
          (otherTypename cantAccept thisTypename)) {
          reporter.report(
            Severity.Error, contextNode, s"type mismatch between return statement at ${ thisReturning.sourcePos } and ${
              otherReturning
                .sourcePos
            }: ${ thisTypename } != ${ otherTypename }"
            )
          (thisTypename, thisReturning)
        } else {
          if (thisTypename > otherTypename) {
            (thisTypename, thisReturning)
          } else {
            (otherTypename, otherReturning)
          }
        }
        Sure(resTypename, resReturning)
      }
      case (Sure(thisTypename, thisReturning), Unsure(otherTypename, otherReturning)) => {
        val (resTypename, resReturning) = if ((thisTypename cantAccept otherTypename) &&
          (otherTypename cantAccept thisTypename)) {
          reporter.report(
            Severity.Error, contextNode, s"type mismatch between return statement at ${ thisReturning.sourcePos } and ${
              otherReturning
                .sourcePos
            }: ${ thisTypename } != ${ otherTypename }"
            )
          (thisTypename, thisReturning)
        } else {
          if (thisTypename > otherTypename) {
            (thisTypename, thisReturning)
          } else {
            (otherTypename, otherReturning)
          }
        }
        Sure(resTypename, resReturning)
      }
      case (Sure(thisTypename, thisReturning), Sure(otherTypename, otherReturning)) => {
        val (resTypename, resReturning) = if ((thisTypename cantAccept otherTypename) &&
          (otherTypename cantAccept thisTypename)) {
          reporter.report(
            Severity.Error, contextNode, s"type mismatch between return statement at ${ thisReturning.sourcePos } and ${
              otherReturning
                .sourcePos
            }: ${ thisTypename } != ${ otherTypename }"
            )
          (thisTypename, thisReturning)
        } else {
          if (thisTypename > otherTypename) {
            (thisTypename, thisReturning)
          } else {
            (otherTypename, otherReturning)
          }
        }
        Sure(resTypename, resReturning)
      }
    }
  }

  def unsure: ReturnPrediction = this match {
    case Sure(typename, returning) => Unsure(typename, returning)
    case _ => this
  }
}

object ReturnPrediction {

  case object None extends ReturnPrediction

  case class Unsure(typename: AtomTypename, returning: Returning) extends ReturnPrediction

  case class Sure(typename: AtomTypename, returning: Returning) extends ReturnPrediction

  def reduce(
    returnPredictions: List[ReturnPrediction],
    reporter: SemanticCheckReporter,
    contextNode: AbstractNode
  ): ReturnPrediction = {
    returnPredictions.foldLeft(None: ReturnPrediction)((r1, r2) => r1.reduce(r2, reporter, contextNode))
  }
}

sealed trait Statement extends AbstractNode {
  override protected def _fillSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): (ScopedSymbolTable, SemanticCheckReporter) = (symbolTable, reporter)

  protected var computedReturnPrediction: Option[ReturnPrediction] = None

  def _returnPrediction(reporter: SemanticCheckReporter, contextNode: AbstractNode): ReturnPrediction

  def returnPrediction(reporter: SemanticCheckReporter, contextNode: AbstractNode): ReturnPrediction = {
    computedReturnPrediction match {
      case Some(pred) => pred
      case None => {
        val pred = _returnPrediction(reporter, contextNode)
        computedReturnPrediction = Some(pred)
        pred
      }
    }
  }
}

case class Block(sourcePos: SourcePos, statements: List[Statement]) extends AbstractNode

  with Statement {
  for (statement <- statements) {
    statement.setParent(this)
  }

  override def fancyContext: String = "statement block"


  override def code: String = this.parent match {
    case _: Block => "{\n" + CodeUtils.indent(statements.map(_.code).mkString("\n")) + "\n}"
    case _ => statements.map(_.code).mkString("\n")
  }

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    for (statement <- statements) {
      statement.dispatch(f, newPayload)
    }
  }

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = {
    import ReturnPrediction._
    var foundSure = false
    var messageEmitted = false
    for (statement <- statements) {
      if (foundSure && !messageEmitted) {
        reporter.report(
          Severity.Warning, this,
          "statements after a sure return have been found in this block, leading to unreachable code"
          )
        messageEmitted = true
      } else {
        statement.returnPrediction(reporter, this) match {
          case None | Unsure(_, _) => ()
          case Sure(_, _) => foundSure = true
        }
      }
    }
  }

  override def _returnPrediction(reporter: SemanticCheckReporter, contextNode: AbstractNode): ReturnPrediction = {
    ReturnPrediction.reduce(statements.map(_.returnPrediction(reporter, contextNode)), reporter, contextNode)
  }
}

case class Conditional(
  sourcePos: SourcePos,
  condition: Expr,
  statementIfTrue: Statement,
  statementIfFalse: Statement
) extends AbstractNode with Statement {
  condition.setParent(this)
  statementIfTrue.setParent(this)
  statementIfFalse.setParent(this)

  override def fancyContext: String = "if-then-else construct"




  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    condition.dispatch(f, newPayload)
    statementIfTrue.dispatch(f, newPayload)
    statementIfFalse.dispatch(f, newPayload)
  }

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = {

    val conditionTypename = condition.atomTypename
    if (BoolTypename cantAccept conditionTypename) {
      reporter.report(
        Severity.Error, this, s"type mismatch: expecting bool for condition type, got ${ conditionTypename }"
        )
    }
  }

  override def _returnPrediction(reporter: SemanticCheckReporter, contextNode: AbstractNode): ReturnPrediction = {
    import ReturnPrediction._

    val ifTrueReturnPrediction = statementIfTrue.returnPrediction(reporter, contextNode)
    val ifFalseReturnPrediction = statementIfFalse.returnPrediction(reporter, contextNode)
    val resultReturnPrediction = ifTrueReturnPrediction.reduce(ifFalseReturnPrediction, reporter, contextNode)
    (ifTrueReturnPrediction, ifFalseReturnPrediction) match {
      case (Sure(_, _), Sure(_, _)) => resultReturnPrediction
      case _ => resultReturnPrediction.unsure
    }
  }

  override def code: String = s"if (${ condition.code }) {\n" + CodeUtils.indent(statementIfTrue.code) + "\n} else {\n" + CodeUtils.indent(statementIfFalse.code) + "\n}"
}

case class Loop(sourcePos: SourcePos, condition: Expr, statementWhileTrue: Statement) extends AbstractNode

  with Statement {
  condition.setParent(this)
  statementWhileTrue.setParent(this)

  override def fancyContext: String = "while construct"




  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    condition.dispatch(f, newPayload)
    statementWhileTrue.dispatch(f, newPayload)
  }

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = {

    val conditionTypename = condition.atomTypename
    if (BoolTypename cantAccept conditionTypename) {
      reporter.report(
        Severity.Error, this, s"type mismatch: expecting bool for condition type, got ${ conditionTypename }"
        )
    }

    condition match {
      case Constant(_, BoolTypename, "true") => {
        reporter.report(
          Severity.Warning, this, "this while loop might be infinite"
          )
      }
      case _ => ()
    }
  }

  override def _returnPrediction(reporter: SemanticCheckReporter, contextNode: AbstractNode): ReturnPrediction = {
    statementWhileTrue.returnPrediction(reporter, contextNode).unsure
  }

  override def code: String = s"while (${ condition.code }) {\n" + CodeUtils.indent(statementWhileTrue.code) + "\n}"
}

case class Returning(sourcePos: SourcePos, returnValue: Expr) extends AbstractNode

  with Statement {
  returnValue.setParent(this)

  override def fancyContext: String = "return statement"




  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    returnValue.dispatch(f, newPayload)
  }

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = {


    returnValue match {
      case NoReturnValue => ()
      case _ => {
        if (returnValue.atomTypename == VoidTypename) {
          reporter.report(Severity.Warning, this, "returning an expression of type void won't return any real value")
        }
      }
    }
  }

  override def _returnPrediction(reporter: SemanticCheckReporter, contextNode: AbstractNode): ReturnPrediction = {
    import ReturnPrediction._
    Sure(returnValue.atomTypename, this)
  }

  override def code: String = returnValue match {
    case NoReturnValue => "return;"
    case _ => s"return ${ returnValue.code };"
  }
}

case class Affect(sourcePos: SourcePos, target: IdfAccess, value: Expr) extends AbstractNode

  with Statement {
  target.setParent(this)
  value.setParent(this)

  override def fancyContext: String = "affectation"




  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    target.dispatch(f, newPayload)
    value.dispatch(f, newPayload)
  }

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = {


    if (target.atomTypename cantAccept value.atomTypename) {
      reporter.report(
        Severity.Error, this, s"type mismatch: left value has type ${ target.atomTypename }, while right value has " +
          s"type ${
            value
              .atomTypename
          }"
        )
    }
  }

  override def _returnPrediction(reporter: SemanticCheckReporter, contextNode: AbstractNode): ReturnPrediction = {
    import ReturnPrediction._
    None
  }

  override def code: String = s"${ target.code } = ${ value.code };"
}

case class ProcedureCall(sourcePos: SourcePos, name: String, args: List[Expr]) extends AbstractNode with Call

  with Statement {
  for (arg <- args) {
    arg.setParent(this)
  }

  override def fancyContext: String = s"procedure '${ name }' call"

  override def code: String = s"${ super.code };"



  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    for (arg <- args) {
      arg.dispatch(f, newPayload)
    }
  }

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = {
    super._semanticCheck(reporter)
    this.getSymbolTable.get(name) match {
      case None | Some(VarDecl(_, _, _)) | Some(ParamDecl(_, _, _, _)) => ()
      case Some(FuncDecl(_, _, _, returnTypename, _, _)) => {
        if (returnTypename != VoidTypename) {
          reporter.report(Severity.Warning, this, s"return value of function '${ name }' is dropped")
        }
      }
    }
  }

  override def _returnPrediction(reporter: SemanticCheckReporter, contextNode: AbstractNode): ReturnPrediction = {
    import ReturnPrediction._
    None
  }
}

case class Read(sourcePos: SourcePos, target: IdfAccess) extends AbstractNode with Statement {
  target.setParent(this)

  override def fancyContext: String = "read user input"


  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    target.dispatch(f, newPayload)
  }

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = {

    if (target.atomTypename == StringTypename) {
      reporter.report(Severity.Error, this, "reading a string is not possible with the leac language")
    }
  }

  override def _returnPrediction(reporter: SemanticCheckReporter, contextNode: AbstractNode): ReturnPrediction = {
    import ReturnPrediction._
    None
  }

  override def code: String = target.atomTypename match {
    case IntTypename => s"""scanf(" ${ target.atomTypename.formatter }", &(${ target.code }));"""
    case BoolTypename => s"${ target.code } = read_bool();"
    case _ => CodeUtils.COULD_NOT_HAPPEN
  }
}

case class Write(sourcePos: SourcePos, value: Expr) extends AbstractNode with Statement {
  value.setParent(this)

  override def fancyContext: String = "write to the console"




  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    value.dispatch(f, newPayload)
  }

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = {
    value.atomTypename match {
      case VoidTypename => reporter.report(Severity.Error, this, "cannot write a void value to the console")
      case _ => ()
    }
    value.getArrayOpt match {
      case Some(Array(_, _, rangeDefs)) => if (rangeDefs.length > 1) {
        reporter.report(Severity.Error, this, s"can only display 1-dimension array, but this array has dimension ${ rangeDefs.length }")
      }
      case _ => ()
    }
  }

  override def _returnPrediction(reporter: SemanticCheckReporter, contextNode: AbstractNode): ReturnPrediction = {
    import ReturnPrediction._
    None
  }

  override def code: String = value match {
    case VarOrParamAccess(_, name) if value.getArrayOpt.isDefined => value.getArrayOpt.get.codeToDisplay(name)
    case _ => value.atomTypename match {
      case IntTypename | FloatTypename | CharTypename | StringTypename => s"""printf("${ value.atomTypename.formatter  }", ${ value.code });"""
      case BoolTypename => s"""printf("%s", ${ value.code } ? "true" : "false");"""
      case _ => CodeUtils.COULD_NOT_HAPPEN
    }
  }
}

