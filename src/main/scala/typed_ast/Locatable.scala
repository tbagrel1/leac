package typed_ast

trait Locatable {
  def sourcePos: SourcePos
  def setSymbolTable(symbolTable: ScopedSymbolTable): Unit = {
    sourcePos.setSymbolTable(symbolTable)
  }
}
