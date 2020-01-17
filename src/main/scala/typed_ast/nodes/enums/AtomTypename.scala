package typed_ast.nodes.enums

sealed trait AtomTypename {
  def c_name: String
}

case object IntTypename extends AtomTypename {
  val c_name: String = "int"

  override def toString: String = "int"
}

case object FloatTypename extends AtomTypename {
  val c_name: String = "double"

  override def toString: String = "float"
}

case object CharTypename extends AtomTypename {
  val c_name: String = "unsigned char"

  override def toString: String = "char"
}

case object StringTypename extends AtomTypename {
  val c_name: String = "char *"

  override def toString: String = "literal"
}

case object BoolTypename extends AtomTypename {
  val c_name: String = "bool"

  override def toString: String = "bool"
}

case object VoidTypename extends AtomTypename {
  val c_name: String = "void"

  override def toString: String = "void"
}

case object Unknown extends AtomTypename {
  val c_name: String = "<unknow>"

  override def toString: String = "<unknow>"
}
