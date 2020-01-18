package typed_ast

object SourcePos {
  def virtual: SourcePos = new SourcePos(0, 0, "<created at compilation, do not exist in source file>")
}

class SourcePos(val line: Int, val column: Int, val source: String) {
  var symbolTable: ScopedSymbolTable = null

  override def toString: String = f"(${ line }, ${ column })"

  def setSymbolTable(_symbolTable: ScopedSymbolTable): Unit = {
    this.symbolTable = _symbolTable
  }
}
