package typed_ast.nodes

import typed_ast.{ScopedSymbolTable, SemanticCheckReporter, Severity, SourcePos}

case class RangeDef(sourcePos: SourcePos, inf: Int, sup: Int) extends AbstractNode {
  override def fancyContext: String = "array dimension range definition"


  override def generateCode(): String = ""

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
  }

  override protected def _fillSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): (ScopedSymbolTable, SemanticCheckReporter) = (symbolTable, reporter)

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = {
    if (inf >= sup) {
      reporter.report(Severity.Error, this, "cannot declare the dimension range of an array with a lower bound greater or equal to the upper bound")
    }
  }

  override def toString: String = s"${ inf }..${ sup }"

  override def canEqual(that: Any): Boolean = {
    that.isInstanceOf[RangeDef]
  }

  override def equals(obj: Any): Boolean = {
    obj match {
      case RangeDef(_, otherInf, otherSup) => (inf == otherInf) && (sup == otherSup)
      case _ => false
    }
  }
}
