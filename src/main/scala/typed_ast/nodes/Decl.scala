package typed_ast.nodes

import typed_ast.nodes.enums.AtomTypename
import typed_ast.{Locatable, SemanticCheckReporter, SourcePos, SymbolTable}

sealed trait Decl extends AbstractNode with Locatable {
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

  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => Unit, payload: T): Unit = {
    f(this, payload)
    for (param <- params) {
      param.dispatch(f, payload)
    }
    for (varDecl <- varDecls) {
      varDecl.dispatch(f, payload)
    }
    statementBlock.dispatch(f, payload)
  }

  override protected def _fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override protected def _semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???
}

case class VarDecl(sourcePos: SourcePos, leacType: LeacType, name: String) extends AbstractNode with Decl {
  override def fancyContext: String = "variable declaration"

  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => Unit, payload: T): Unit = {
    f(this, payload)
    leacType.dispatch(f, payload)
  }

  override protected def _fillSymbolTable(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???

  override protected def _semanticCheck(
    symbolTable: SymbolTable,
    reporter: SemanticCheckReporter
  ): Unit = ???
}
