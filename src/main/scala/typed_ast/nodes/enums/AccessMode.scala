package typed_ast.nodes.enums

sealed trait AccessMode

case object ByCopy extends AccessMode {
  override def toString: String = ""
}

case object ByRef extends AccessMode {
  override def toString: String = "&"
}
