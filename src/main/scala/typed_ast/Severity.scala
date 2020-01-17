package typed_ast

sealed trait Severity

object Severity {

  case object Info extends Severity {
    override def toString: String = "INFO"
  }

  case object Warning extends Severity {
    override def toString: String = "WARNING"
  }

  case object Error extends Severity {
    override def toString: String = "ERROR"
  }

}


