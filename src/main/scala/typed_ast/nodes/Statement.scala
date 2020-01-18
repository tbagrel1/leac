package typed_ast.nodes

import typed_ast.nodes.enums._
import typed_ast.{ScopedSymbolTable, SemanticCheckReporter, Severity, SourcePos}

sealed trait ReturnPrediction {

  import ReturnPrediction._

  def reduce(other: ReturnPrediction, reporter: SemanticCheckReporter, contextNode: AbstractNode): ReturnPrediction = {
    // TODO: in case Int, Float return Float
    (this, other) match {
      case (None, _) => other
      case (_, None) => this
      case (Sure(Unknown, _), Unsure(typename, returning)) => Sure(typename, returning)
      case (Unsure(typename, returning), Sure(Unknown, _)) => Sure(typename, returning)
      case (Unsure(Unknown, _), _) | (Sure(Unknown, _), _) => other
      case (_, Sure(Unknown, _)) | (_, Unsure(Unknown, _)) => this
      case (Unsure(thisTypename, thisReturning), Unsure(otherTypename, otherReturning)) => {
        if (thisTypename cantAccept otherTypename) {
          reporter.report(
            Severity.Error, contextNode, s"type mismatch between return statement at ${ thisReturning.sourcePos } and ${
              otherReturning
                .sourcePos
            }: ${ thisTypename } != ${ otherTypename }"
            )
        }
        this
      }
      case (Unsure(thisTypename, thisReturning), Sure(otherTypename, otherReturning)) => {
        if (thisTypename cantAccept otherTypename) {
          reporter.report(
            Severity.Error, contextNode, s"type mismatch between return statement at ${ thisReturning.sourcePos } and ${
              otherReturning
                .sourcePos
            }: ${ thisTypename } != ${ otherTypename }"
            )
        }
        other
      }
      case (Sure(thisTypename, thisReturning), Unsure(otherTypename, otherReturning)) => {
        if (thisTypename cantAccept otherTypename) {
          reporter.report(
            Severity.Error, contextNode, s"type mismatch between return statement at ${ thisReturning.sourcePos } and ${
              otherReturning
                .sourcePos
            }: ${ thisTypename } != ${ otherTypename }"
            )
        }
        this
      }
      case (Sure(thisTypename, thisReturning), Sure(otherTypename, otherReturning)) => {
        if (thisTypename cantAccept otherTypename) {
          reporter.report(
            Severity.Error, contextNode, s"type mismatch between return statement at ${ thisReturning.sourcePos } and ${
              otherReturning
                .sourcePos
            }: ${ thisTypename } != ${ otherTypename }"
            )
        }
        this
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


  override def generateCode(): String = ""

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


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    condition.dispatch(f, newPayload)
    statementIfTrue.dispatch(f, newPayload)
    statementIfFalse.dispatch(f, newPayload)
  }

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = {
    Expr.ensureNotArray(condition, reporter)
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
}

case class Loop(sourcePos: SourcePos, condition: Expr, statementWhileTrue: Statement) extends AbstractNode

  with Statement {
  condition.setParent(this)
  statementWhileTrue.setParent(this)

  override def fancyContext: String = "while construct"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    condition.dispatch(f, newPayload)
    statementWhileTrue.dispatch(f, newPayload)
  }

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = {
    Expr.ensureNotArray(condition, reporter)
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
}

case class Returning(sourcePos: SourcePos, returnValue: Expr) extends AbstractNode

  with Statement {
  returnValue.setParent(this)

  override def fancyContext: String = "return statement"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    returnValue.dispatch(f, newPayload)
  }

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = {
    Expr.ensureNotArray(returnValue, reporter)

    returnValue match {
      case Nothing => ()
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
}

case class Affect(sourcePos: SourcePos, target: IdfAccess, value: Expr) extends AbstractNode

  with Statement {
  target.setParent(this)
  value.setParent(this)

  override def fancyContext: String = "affectation"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    target.dispatch(f, newPayload)
    value.dispatch(f, newPayload)
  }

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = {
    Expr.ensureNotArray(value, reporter)
    Expr.ensureNotArray(target, reporter)

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
}

case class ProcedureCall(sourcePos: SourcePos, name: String, args: List[Expr]) extends AbstractNode with Call

  with Statement {
  for (arg <- args) {
    arg.setParent(this)
  }

  override def fancyContext: String = s"procedure '${ name }' call"


  override def generateCode(): String = ""

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


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    target.dispatch(f, newPayload)
  }

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = {
    Expr.ensureNotArray(target, reporter)
    if (target.atomTypename == StringTypename) {
      reporter.report(Severity.Error, this, "reading a string is not possible with the leac language")
    }
  }

  override def _returnPrediction(reporter: SemanticCheckReporter, contextNode: AbstractNode): ReturnPrediction = {
    import ReturnPrediction._
    None
  }
}

case class Write(sourcePos: SourcePos, value: Expr) extends AbstractNode with Statement {
  value.setParent(this)

  override def fancyContext: String = "write to the console"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    value.dispatch(f, newPayload)
  }

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = {}

  override def _returnPrediction(reporter: SemanticCheckReporter, contextNode: AbstractNode): ReturnPrediction = {
    import ReturnPrediction._
    None
  }
}

