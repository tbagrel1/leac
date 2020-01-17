package typed_ast

class SourcePos(val line: Int, val column: Int, val source: String) {
  var symbolTable: ScopedSymbolTable = null
  override def toString: String = f"(${ line }, ${ column })"
  def setSymbolTable(_symbolTable: ScopedSymbolTable): Unit = {
    this.symbolTable = _symbolTable
  }
}
