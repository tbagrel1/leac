package typed_ast.nodes.enums

sealed trait AtomTypename {
  def >(otherTypename: AtomTypename): Boolean = otherTypename match {
    case Unknown => true
    case _ => false
  }

  def c_name: String

  def accept(other: AtomTypename): Boolean

  def cantAccept(other: AtomTypename): Boolean = !accept(other)
}

case object IntTypename extends AtomTypename {
  val c_name: String = "int"

  override def toString: String = "int"

  override def accept(other: AtomTypename): Boolean = (other == Unknown || other == IntTypename)
}

case object FloatTypename extends AtomTypename {
  val c_name: String = "double"

  override def accept(other: AtomTypename): Boolean = (other == Unknown || other == IntTypename ||
    other == FloatTypename)

  override def >(otherTypename: AtomTypename): Boolean = otherTypename match {
    case Unknown | IntTypename => true
    case _ => false
  }
}

case object CharTypename extends AtomTypename {
  val c_name: String = "unsigned char"

  override def toString: String = "char"

  override def accept(other: AtomTypename): Boolean = (other == Unknown || other == CharTypename)
}

case object StringTypename extends AtomTypename {
  val c_name: String = "char *"

  override def toString: String = "literal"

  override def accept(other: AtomTypename): Boolean = (other == Unknown || other == StringTypename)
}

case object BoolTypename extends AtomTypename {
  val c_name: String = "bool"

  override def toString: String = "bool"

  override def accept(other: AtomTypename): Boolean = (other == Unknown || other == BoolTypename)
}

case object VoidTypename extends AtomTypename {
  val c_name: String = "void"

  override def toString: String = "void"

  override def accept(other: AtomTypename): Boolean = (other == Unknown || other == VoidTypename)
}

case object Unknown extends AtomTypename {
  val c_name: String = "<unknow>"

  override def toString: String = "<unknow>"

  override def accept(other: AtomTypename): Boolean = true
}
