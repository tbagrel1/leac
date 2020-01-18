import grammar.{LeacLexer, LeacParser}
import org.antlr.runtime.tree.CommonTree
import org.antlr.runtime.{ANTLRFileStream, CommonTokenStream}
import typed_ast.{Err, Ok, SemanticCheckReporter, TreeConverter}

object Main {
  def main(args: Array[String]): Unit = {
    val lexer = new LeacLexer(
      new ANTLRFileStream(
        "/home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/grammar/output" +
          "/__Test___input.txt",
        "UTF8"
        )
      )
    val tokens = new CommonTokenStream(lexer)

    val parser = new LeacParser(tokens)
    val result = parser.program
    val tree = result.getTree.asInstanceOf[CommonTree]
    val res_program = TreeConverter.convert(tree)
    res_program match {
      case Ok(program) => {
        println("### Semantic check ###\n")
        val reporter = new SemanticCheckReporter()
        program.fillAndLinkSymbolTable(reporter)
        program.semanticCheck(reporter)
        reporter.conclude(false)
      }
      case Err(exception) => println(s"Error during ANTLR to Scala AST conversion: <${ exception }>")
    }
  }
}
