sealed trait Result[T, E]

case class Ok[T, E](value: T) extends Result[T, E]

case class Err[T, E](err: E) extends Result[T, E]
