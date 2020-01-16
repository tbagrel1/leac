import grammar.{LeacLexer, LeacParser}
import org.antlr.runtime.tree.CommonTree
import org.antlr.runtime.{ANTLRFileStream, CommonTokenStream}
import typed_ast.{Err, Ok, TreeConverter}

object Main {
  def main(args: Array[String]): Unit = {
    val lexer = new LeacLexer(
      new ANTLRFileStream(
        "/home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/output/__Test___input.txt",
        "UTF8"
        )
      )
    val tokens = new CommonTokenStream(lexer)

    val parser = new LeacParser(tokens)
    val result = parser.program
    val tree = result.getTree.asInstanceOf[CommonTree]
    println(tree.getType, tree.getChild(0), tree.getChild(1), tree.getChild(2))
    val res_program = TreeConverter.convert(tree)
    res_program match {
      case Ok(program) => println("OK!")
      case Err(exception) => println(s"Error during ANTLR to Scala AST conversion: <${ exception }>")
    }
  }
}
