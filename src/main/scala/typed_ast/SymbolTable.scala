package typed_ast

import scala.collection.mutable

class SymbolTable {
  val internal: mutable.Map[String, Decl] = mutable.Map.empty

  def register(decl: Decl, reporter: SemanticCheckReporter): Unit = {
    if (internal.contains(decl.name)) {
      reporter.report(Error, s"${ decl.name } already declared at ${ decl.sourcePos }")
      return
    }
    internal.addOne((decl.name, decl))
  }
}
