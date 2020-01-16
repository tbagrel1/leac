package typed_ast

import scala.collection.mutable

class SemanticCheckReporter {
  var warningCount: Int = 0
  var errorCount: Int = 0
  val reports: mutable.ArrayBuffer[(Severity, String)] = mutable.ArrayBuffer.empty

  def report(severity: Severity, message: String): Unit = {
    reports.addOne((severity, message))
    severity match {
      case Error => errorCount += 1
      case Warning => warningCount += 1
      case _ => ()
    }
  }

  def conclude(strictModeEnabled: Boolean): Boolean = {
    for (report <- reports) {
      println(s"[${ report._1 }] ${ report._2 }")
    }
    if (strictModeEnabled) {
      warningCount + errorCount == 0
    } else {
      errorCount == 0
    }
  }
}
