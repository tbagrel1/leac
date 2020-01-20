package typed_ast.nodes.enums

import typed_ast.CodeUtils

sealed trait AtomTypename {
  def >(otherTypename: AtomTypename): Boolean = otherTypename match {
    case Unknown => true
    case _ => false
  }

  def code: String

  def formatter: String

  def accept(other: AtomTypename): Boolean

  def cantAccept(other: AtomTypename): Boolean = !accept(other)
}

case object IntTypename extends AtomTypename {
  val code: String = "int"

  override def toString: String = "int"

  override def accept(other: AtomTypename): Boolean = (other == Unknown || other == IntTypename)

  override def formatter: String = "%d"
}

case object FloatTypename extends AtomTypename {
  val code: String = "double"

  override def accept(other: AtomTypename): Boolean = (other == Unknown || other == IntTypename ||
    other == FloatTypename)

  override def >(otherTypename: AtomTypename): Boolean = otherTypename match {
    case Unknown | IntTypename => true
    case _ => false
  }

  override def formatter: String = "%f"
}

case object CharTypename extends AtomTypename {
  val code: String = "unsigned char"

  override def toString: String = "char"

  override def accept(other: AtomTypename): Boolean = (other == Unknown || other == CharTypename)

  override def formatter: String = "%c"
}

case object StringTypename extends AtomTypename {
  val code: String = "char *"

  override def toString: String = "literal"

  override def accept(other: AtomTypename): Boolean = (other == Unknown || other == StringTypename)

  override def formatter: String = "%s"
}

case object BoolTypename extends AtomTypename {
  val code: String = "bool"

  override def toString: String = "bool"

  override def accept(other: AtomTypename): Boolean = (other == Unknown || other == BoolTypename)

  override def formatter: String = CodeUtils.COULD_NOT_HAPPEN
}

case object VoidTypename extends AtomTypename {
  val code: String = "void"

  override def toString: String = "void"

  override def accept(other: AtomTypename): Boolean = (other == Unknown || other == VoidTypename)

  override def formatter: String = CodeUtils.COULD_NOT_HAPPEN
}

case object Unknown extends AtomTypename {
  val code: String = "<unknow>"

  override def toString: String = "<unknow>"

  override def accept(other: AtomTypename): Boolean = true

  override def formatter: String = CodeUtils.COULD_NOT_HAPPEN
}
