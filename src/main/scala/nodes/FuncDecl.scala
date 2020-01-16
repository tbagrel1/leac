package nodes

case class FuncDecl(
  sourcePos: SourcePos,
  name: String,
  params: List[Param],
  returnTypename: AtomTypename,
  varDecls: List[VarDecl],
  statementBlock: Block
) extends AbstractNode {
}
