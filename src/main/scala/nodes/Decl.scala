package nodes

sealed trait Decl extends Locatable {
  def name: String
}

case class FuncDecl(
  sourcePos: SourcePos,
  name: String,
  params: List[Param],
  returnTypename: AtomTypename,
  varDecls: List[VarDecl],
  statementBlock: Block
) extends AbstractNode with Decl {
}

case class VarDecl(sourcePos: SourcePos, leacType: LeacType, name: String) extends AbstractNode with Decl {
}
