package typed_ast.nodes

import typed_ast.{Locatable, SemanticCheckReporter, SourcePos, ScopedSymbolTable}

sealed trait Statement extends AbstractNode with Locatable

case class Block(sourcePos: SourcePos, statements: List[Statement]) extends AbstractNode
  with Locatable
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

  override protected def _fillAndLinkSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???
}

case class Conditional(
  sourcePos: SourcePos,
  condition: Expr,
  statementIfTrue: Statement,
  statementIfFalse: Statement
) extends AbstractNode with Locatable with Statement {
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

  override protected def _fillAndLinkSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???
}

case class Loop(sourcePos: SourcePos, condition: Expr, statementWhileTrue: Statement) extends AbstractNode
  with Locatable
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

  override protected def _fillAndLinkSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???
}

case class Returning(sourcePos: SourcePos, returnValue: Option[Expr]) extends AbstractNode
  with Locatable
  with Statement {
  returnValue match {
    case Some(expr) => expr.setParent(this)
    case None => ()
  }

  override def fancyContext: String = "return statement"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    returnValue match {
      case Some(expr) => expr.dispatch(f, newPayload)
      case None => ()
    }
  }

  override protected def _fillAndLinkSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???
}

case class Affect(sourcePos: SourcePos, target: IdfAccess, value: Expr) extends AbstractNode
  with Locatable
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

  override protected def _fillAndLinkSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???
}

case class ProcedureCall(sourcePos: SourcePos, name: String, args: List[Expr]) extends AbstractNode
  with Locatable
  with Statement {
  for (arg <- args) {
    arg.setParent(this)
  }

  override def fancyContext: String = s"procedure \"${ name }\" call"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    for (arg <- args) {
      arg.dispatch(f, newPayload)
    }
  }

  override protected def _fillAndLinkSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???
}

case class Read(sourcePos: SourcePos, target: IdfAccess) extends AbstractNode with Locatable with Statement {
  target.setParent(this)

  override def fancyContext: String = "read user input"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    target.dispatch(f, newPayload)
  }

  override protected def _fillAndLinkSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???
}

case class Write(sourcePos: SourcePos, value: Expr) extends AbstractNode with Locatable with Statement {
  value.setParent(this)

  override def fancyContext: String = "write to the console"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    value.dispatch(f, newPayload)
  }

  override protected def _fillAndLinkSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = ???
}

