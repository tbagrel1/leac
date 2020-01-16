package nodes

trait Locatable {
  def sourcePos: SourcePos
  def source: String
}
