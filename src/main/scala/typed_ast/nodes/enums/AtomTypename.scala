package typed_ast.nodes.enums

sealed trait AtomTypename {
  def c_name: String
}

case object IntTypename extends AtomTypename {
  val c_name: String = "int"
}

case object FloatTypename extends AtomTypename {
  val c_name: String = "float"
}

case object CharTypename extends AtomTypename {
  val c_name: String = "char"
}

case object StringTypename extends AtomTypename {
  val c_name: String = "char *"
}

case object BoolTypename extends AtomTypename {
  val c_name: String = "bool"
}

case object VoidTypename extends AtomTypename {
  val c_name: String = "void"
}

case object Unknown extends AtomTypename {
  val c_name: String = "<unknow>"
}
