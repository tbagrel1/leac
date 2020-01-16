package nodes

sealed trait AccessMode

case object ByCopy extends AccessMode

case object ByRef extends AccessMode
