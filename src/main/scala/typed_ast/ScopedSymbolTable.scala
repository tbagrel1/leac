package typed_ast

import typed_ast.nodes.Decl

import scala.collection.mutable

class ScopedSymbolTable(val fancyContext: String) {
  var parent: ScopedSymbolTable = null

  val internal: mutable.Map[String, Decl] = mutable.Map.empty

  def get(name: String): Option[Decl] = {
    internal.get(name) match {
      case Some(decl) => Some(decl)
      case None => if (!isRootSymbolTable) {
        parent.get(name)
      } else {
        None
      }
    }
  }

  def register(decl: Decl, reporter: SemanticCheckReporter): Unit = {
    if (internal.contains(decl.name)) {
      reporter.report(Error, s"${ decl.name } already declared at ${ decl.sourcePos }")
      return
    }
    internal.addOne((decl.name, decl))
  }

  def setParent(_parent: ScopedSymbolTable): Unit = {
    this.parent = _parent
  }

  def isRootSymbolTable: Boolean = {
    parent == null
  }

  def spawnChild(fancyContext: String): ScopedSymbolTable = {
    val child = new ScopedSymbolTable(fancyContext)
    child.setParent(this)
    child
  }
}
