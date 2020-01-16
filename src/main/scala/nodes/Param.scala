package nodes

case class Param(sourcePos: SourcePos, leacType: LeacType, accessMode: AccessMode, name: String) extends AbstractNode {
}
