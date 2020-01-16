package nodes

sealed trait Expr {}

sealed trait IdfAccess extends Expr {}

sealed trait Operation extends Expr {
  def priority: Int
}

case class Constant(sourcePos: SourcePos, typename: AtomTypename, value: String) extends AbstractNode
  with Locatable
  with Expr

case class FunctionCall(sourcePos: SourcePos, name: String, args: List[Expr]) extends AbstractNode
  with Locatable
  with Expr

case class VarAccess(sourcePos: SourcePos, name: String) extends AbstractNode with Locatable with IdfAccess

case class CellAccess(sourcePos: SourcePos, arrayName: String, coords: List[Expr]) extends AbstractNode
  with Locatable
  with IdfAccess

case class Pow(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
  val priority = 1
}

case class UnaryMinus(sourcePos: SourcePos, a: Expr) extends AbstractNode with Locatable with Operation {
  val priority = 2
}

case class Not(sourcePos: SourcePos, a: Expr) extends AbstractNode with Locatable with Operation {
  val priority = 2
}

case class Mul(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
  val priority = 3
}

case class Div(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
  val priority = 3
}

case class Add(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
  val priority = 4
}

case class Sub(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
  val priority = 4
}

case class TestLowerThan(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode
  with Locatable
  with Operation {
  val priority = 5
}

case class TestLowerOrEqual(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode
  with Locatable
  with Operation {
  val priority = 5
}

case class TestGreaterThan(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode
  with Locatable
  with Operation {
  val priority = 5
}

case class TestGreaterOrEqual(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode
  with Locatable
  with Operation {
  val priority = 5
}

case class TestEqual(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
  val priority = 6
}

case class TestNotEqual(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
  val priority = 6
}

case class And(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
  val priority = 7
}

case class Or(sourcePos: SourcePos, a: Expr, b: Expr) extends AbstractNode with Locatable with Operation {
  val priority = 8
}


