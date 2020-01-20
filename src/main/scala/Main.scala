import java.nio.charset.StandardCharsets
import java.nio.file.{Files, Paths}

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
        println("### Output ###\n")
        val output = program.code
        println(output)
        Files.write(Paths.get("program.c"), output.getBytes(StandardCharsets.UTF_8))
      }
      case Err(exception) => println(s"Error during ANTLR to Scala AST conversion: <${ exception }>")
    }
  }
}
