package nodes

sealed trait LeacType

case class Atom(sourcePos: SourcePos, atomTypename: AtomTypename) extends AbstractNode with Locatable with LeacType

case class Array(sourcePos: SourcePos, atomTypename: AtomTypename, rangeDefs: List[RangeDef]) extends AbstractNode
  with Locatable
  with LeacType
