import java.nio.charset.StandardCharsets
import java.nio.file.{Files, Paths}

import grammar.{LeacLexer, LeacParser}
import org.antlr.runtime.tree.CommonTree
import org.antlr.runtime.{ANTLRFileStream, CommonTokenStream}
import typed_ast.{Err, Ok, SemanticCheckReporter, TreeConverter}

import scala.io.StdIn

object Main {
  def main(args: Array[String]): Unit = {
    val leacFilePath = if (args.length > 0) {
      args(0)
    } else {
      StdIn.readLine("Input Leac file: ")
    }
    val lexer = new LeacLexer(
      new ANTLRFileStream(
        leacFilePath,
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
        println("\n### Output ###\n")
        val output = program.code
        println(output)
        Files.write(Paths.get("/tmp/program.c"), output.getBytes(StandardCharsets.UTF_8))

        {
          import sys.process._
          import scala.language.postfixOps

          println("\n\n### Generated C code compilation ###\n")

          "gcc /tmp/program.c -o /tmp/program" !

          println("\n\nIf compilation succeeded, launch /tmp/program")
        }
      }
      case Err(exception) => println(s"Error during ANTLR to Scala AST conversion: <${ exception }>")
    }
  }
}
