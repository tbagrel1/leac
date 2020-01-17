package typed_ast.nodes

import typed_ast.nodes.enums.{AtomTypename, Unknown}
import typed_ast.{ScopedSymbolTable, SemanticCheckReporter, Severity, SourcePos}

sealed trait ReturnPrediction {
  import ReturnPrediction._

  def reduce(other: ReturnPrediction, reporter: SemanticCheckReporter): ReturnPrediction = {
    (this, other) match {
      case (None, _) => other
      case (_, None) => this
      case (Sure(Unknown, _), Unsure(typename, returning)) => Sure(typename, returning)
      case (Unsure(typename, returning), Sure(Unknown, _)) => Sure(typename, returning)
      case (Unsure(Unknown, _), _) | (Sure(Unknown, _), _) => other
      case (_, Sure(Unknown, _)) | (_, Unsure(Unknown, _)) => this
      case (Unsure(thisTypename, thisReturning), Unsure(otherTypename, otherReturning)) => {
        if (thisTypename != otherTypename) {
          reporter.report(Severity.Error, s"type mismatch between return statement at ${ thisReturning.sourcePos } and ${ otherReturning.sourcePos }: ${ thisTypename } != ${ otherTypename }")
        }
        this
      }
      case (Unsure(thisTypename, thisReturning), Sure(otherTypename, otherReturning)) => {
        if (thisTypename != otherTypename) {
          reporter.report(Severity.Error, s"type mismatch between return statement at ${ thisReturning.sourcePos } and ${ otherReturning.sourcePos }: ${ thisTypename } != ${ otherTypename }")
        }
        other
      }
      case (Sure(thisTypename, thisReturning), Unsure(otherTypename, otherReturning)) => {
        if (thisTypename != otherTypename) {
          reporter.report(Severity.Error, s"type mismatch between return statement at ${ thisReturning.sourcePos } and ${ otherReturning.sourcePos }: ${ thisTypename } != ${ otherTypename }")
        }
        this
      }
      case (Sure(thisTypename, thisReturning), Sure(otherTypename, otherReturning)) => {
        if (thisTypename != otherTypename) {
          reporter.report(Severity.Error, s"type mismatch between return statement at ${ thisReturning.sourcePos } and ${ otherReturning.sourcePos }: ${ thisTypename } != ${ otherTypename }")
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
  def reduce(returnPredictions: List[ReturnPrediction], reporter: SemanticCheckReporter): ReturnPrediction = {
    returnPredictions.foldLeft(None: ReturnPrediction)((r1, r2) => r1.reduce(r2, reporter))
  }
}

sealed trait Statement extends AbstractNode {
  override protected def _fillSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): (ScopedSymbolTable, SemanticCheckReporter) = (symbolTable, reporter)

  def returnPrediction(reporter: SemanticCheckReporter): ReturnPrediction
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

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???

  override def returnPrediction(reporter: SemanticCheckReporter): ReturnPrediction = {
    ReturnPrediction.reduce(statements.map(_.returnPrediction(reporter)), reporter)
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

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???

  override def returnPrediction(reporter: SemanticCheckReporter): ReturnPrediction = {
    import ReturnPrediction._

    val ifTrueReturnPrediction = statementIfTrue.returnPrediction(reporter)
    val ifFalseReturnPrediction = statementIfFalse.returnPrediction(reporter)
    val resultReturnPrediction = ifTrueReturnPrediction.reduce(ifFalseReturnPrediction, reporter)
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

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???

  override def returnPrediction(reporter: SemanticCheckReporter): ReturnPrediction = {
    statementWhileTrue.returnPrediction(reporter).unsure
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

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???

  override def returnPrediction(reporter: SemanticCheckReporter): ReturnPrediction = {
    import ReturnPrediction._
    Sure(returnValue.atomTypename(), this)
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

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???

  override def returnPrediction(reporter: SemanticCheckReporter): ReturnPrediction = {
    import ReturnPrediction._
    None
  }
}

case class ProcedureCall(sourcePos: SourcePos, name: String, args: List[Expr]) extends AbstractNode

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

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???

  override def returnPrediction(reporter: SemanticCheckReporter): ReturnPrediction = {
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

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???

  override def returnPrediction(reporter: SemanticCheckReporter): ReturnPrediction = {
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

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???

  override def returnPrediction(reporter: SemanticCheckReporter): ReturnPrediction = {
    import ReturnPrediction._
    None
  }
}

