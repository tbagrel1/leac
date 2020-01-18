package typed_ast

import typed_ast.nodes.AbstractNode

import scala.collection.mutable

class SemanticCheckReporter {
  var warningCount: Int = 0
  var errorCount: Int = 0
  val reports: mutable.ArrayBuffer[(Severity, AbstractNode, String)] = mutable.ArrayBuffer.empty

  def report(severity: Severity, contextNode: AbstractNode, message: String): Unit = {
    reports.addOne((severity, contextNode, message))
    severity match {
      case Severity.Error => errorCount += 1
      case Severity.Warning => warningCount += 1
      case _ => ()
    }
  }

  def conclude(strictModeEnabled: Boolean = false): Boolean = {
    for (report <- reports) {
      println(s"[${ report._1 }] in ${ report._2.fancyContext } at ${ report._2.sourcePos }: ${ report._3 }")
    }
    if (strictModeEnabled) {
      warningCount + errorCount == 0
    } else {
      errorCount == 0
    }
  }
}
