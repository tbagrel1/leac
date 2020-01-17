package typed_ast

import typed_ast.nodes.Decl

import scala.collection.mutable

class ScopedSymbolTable(val fancyContext: String) {
  var parent: ScopedSymbolTable = null
  val data: mutable.Map[String, Decl] = mutable.Map.empty
  val children: mutable.ArrayBuffer[ScopedSymbolTable] = mutable.ArrayBuffer.empty

  def get(name: String): Option[Decl] = {
    data.get(name) match {
      case Some(decl) => Some(decl)
      case None => {
        if (!isRootSymbolTable) {
          parent.get(name)
        } else {
          None
        }
      }
    }
  }

  def register(decl: Decl, reporter: SemanticCheckReporter): Unit = {
    if (data.contains(decl.name)) {
      reporter.report(Severity.Error, s"${ decl.name } already declared at ${ decl.sourcePos }")
      return
    }
    data.addOne((decl.name, decl))
  }

  def setParent(_parent: ScopedSymbolTable): Unit = {
    this.parent = _parent
  }

  def isRootSymbolTable: Boolean = {
    parent == null
  }

  def spawnChild(fancyContext: String): ScopedSymbolTable = {
    val child = new ScopedSymbolTable(fancyContext)
    children.addOne(child)
    child.setParent(this)
    child
  }

  def _toString(indent: Int): String = {
    (List((" " * indent) + s"# Symbol table of ${fancyContext} (parent: ${ if (isRootSymbolTable) { "none" } else { parent.fancyContext } }) #") ++ (for ((_, decl) <- data) yield (" " * (indent + 4)) + decl.toString).toList).mkString("\n") + "\n\n" + (for (child <- children) yield child._toString(indent + 4)).mkString("\n")
  }

  override def toString: String = _toString(0)
}
