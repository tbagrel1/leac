import org.antlr.runtime.{ANTLRFileStream, CommonTokenStream, RecognitionException}

object Main {
  def main(args: Array[String]): Unit = {
    val lexer = new LeacLexer(
      new ANTLRFileStream(
        "/home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/output/__Test___input.txt", "UTF8"
        )
      )
    val tokens = new CommonTokenStream(lexer)

    val parser = new LeacParser(tokens)
    parser.program()
  }
}
