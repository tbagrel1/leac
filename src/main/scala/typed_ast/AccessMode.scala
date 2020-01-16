package typed_ast

sealed trait AccessMode

case object ByCopy extends AccessMode

case object ByRef extends AccessMode
