package typed_ast

case class SourcePos(line: Int, column: Int, source: String) {
  override def toString: String = f"(${ line }, ${ column })"
}
