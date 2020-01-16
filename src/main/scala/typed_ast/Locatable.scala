package typed_ast

trait Locatable {
  def sourcePos: SourcePos
}
