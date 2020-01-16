package typed_ast

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
  override def fancyContext: String = "function declaration"

  override def fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {
    symbolTable.register(this, reporter)
    for (param <- params) {
      param.fillSymbolTable(symbolTable, reporter)
    }
    for (varDecl <- varDecls) {
      varDecl.fillSymbolTable(symbolTable, reporter)
    }
    statementBlock.fillSymbolTable(symbolTable, reporter)
  }

  override def semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override def generateCode(): String = ""
}

case class VarDecl(sourcePos: SourcePos, leacType: LeacType, name: String) extends AbstractNode with Decl {
  override def fancyContext: String = "variable declaration"

  override def fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {
    symbolTable.register(this, reporter)
    leacType.fillSymbolTable(symbolTable, reporter)
  }

  override def semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = {}

  override def generateCode(): String = ""
}
