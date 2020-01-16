import nodes.{AtomTypename, _}
import org.antlr.runtime.tree.Tree
import LeacParser.{ADD, AFFECT, AND, ARG_LIST, ARRAY, ATOM, BLOCK, BOOL_TYPENAME, BY_COPY, BY_REF, CELL, CHAR_TYPENAME, CONDITIONAL, CONST, COORD_LIST, DIV, FLOAT_TYPENAME, FUNC_CALL, FUNC_DECL, FUNC_DECL_LIST, IDF_LIST, INT_TYPENAME, LOOP, MUL, NOT, NO_RETURN_VALUE, OR, PARAM, PARAM_LIST, POW, PROCEDURE_CALL, PROGRAM, RANGE, RANGE_LIST, READ, RETURNING, STRING_TYPENAME, SUB, TEST_EQ, TEST_GE, TEST_GT, TEST_LE, TEST_LT, TEST_NE, UNARY_MINUS, VAR, VAR_DECL, VAR_DECL_LIST, VOID_TYPENAME, WRITE}

object TreeConverter {
  def convert(antlrTree: Tree): Either[Program, Exception] = {
    if (antlrTree.getType != PROGRAM) {
      return Right(new Exception("The specified tree is not a program tree (root rule in the Leac grammar)"))
    }
    var program: Program = null
    try {
      program = cv(antlrTree).asInstanceOf[Program]
    } catch {
      case exception: Exception => return Right(exception)
    }
    Left(program)
  }

  private def n0(s: Tree): Tree = s.getChild(0)
  private def n1(s: Tree): Tree = s.getChild(1)
  private def n2(s: Tree): Tree = s.getChild(2)
  private def n3(s: Tree): Tree = s.getChild(3)
  private def n4(s: Tree): Tree = s.getChild(4)
  private def n(s: Tree, n: Int): Tree = s.getChild(n)
  private def sp(s: Tree): SourcePos = SourcePos(s.getLine, s.getCharPositionInLine)
  private def nodeToList[T](s: Tree): List[T] = (for (i <- 0 until s.getChildCount) yield cv(n(s, i)).asInstanceOf[T]).toList

  private def cv(s: Tree): Any = {
    try { // TODO: remove
      s.getType match {
        case ADD => Add(sp(s), cv(n0(s)).asInstanceOf[Expr], cv(n1(s)).asInstanceOf[Expr])
        case AFFECT => Affect(sp(s), cv(n0(s)).asInstanceOf[IdfAccess], cv(n1(s)).asInstanceOf[Expr])
        case AND => And(sp(s), cv(n0(s)).asInstanceOf[Expr], cv(n1(s)).asInstanceOf[Expr])
        case ARG_LIST => nodeToList[Expr](s)
        case ARRAY => Array(sp(s), cv(n0(s)).asInstanceOf[AtomTypename], cv(n1(s)).asInstanceOf[List[RangeDef]])
        case ATOM => Atom(sp(s), cv(n0(s)).asInstanceOf[AtomTypename])
        case BLOCK => nodeToList[Statement](s)
        case BOOL_TYPENAME => BoolTypename
        case BY_COPY => ByCopy
        case BY_REF => ByRef
        case CELL => CellAccess(sp(s), n0(s).getText, cv(n1(s)).asInstanceOf[List[Expr]])
        case CHAR_TYPENAME => CharTypename
        case CONDITIONAL => Conditional(
          sp(s), cv(n0(s)).asInstanceOf[Expr], cv(n1(s)).asInstanceOf[Statement], cv(n2(s)).asInstanceOf[Statement]
          )
        case CONST => Constant(sp(s), cv(n0(s)).asInstanceOf[AtomTypename], n1(s).getText)
        case COORD_LIST => nodeToList[Expr](s)
        case DIV => Div(sp(s), cv(n0(s)).asInstanceOf[Expr], cv(n1(s)).asInstanceOf[Expr])
        case FLOAT_TYPENAME => FloatTypename
        case FUNC_CALL => FuncCall(sp(s), n0(s).getText, cv(n1(s)).asInstanceOf[List[Expr]])
        case FUNC_DECL => FuncDecl(
          sp(s), n0(s).getText, cv(n1(s)).asInstanceOf[List[Param]], cv(n2(s)).asInstanceOf[AtomTypename],
          cv(n3(s)).asInstanceOf[List[VarDecl]], cv(n4(s)).asInstanceOf[Block]
          )
        case FUNC_DECL_LIST => nodeToList[FuncDecl](s)
        case IDF_LIST => (for (i <- 0 until s.getChildCount) yield n(s, i).getText).toList
        case INT_TYPENAME => IntTypename
        case LOOP => Loop(sp(s), cv(n0(s)).asInstanceOf[Expr], cv(n1(s)).asInstanceOf[Statement])
        case MUL => Mul(sp(s), cv(n0(s)).asInstanceOf[Expr], cv(n1(s)).asInstanceOf[Expr])
        case NOT => Not(sp(s), cv(n0(s)).asInstanceOf[Expr])
        case NO_RETURN_VALUE => null
        case OR => Or(sp(s), cv(n0(s)).asInstanceOf[Expr], cv(n1(s)).asInstanceOf[Expr])
        case PARAM => Param(sp(s), cv(n0(s)).asInstanceOf[LeacType], cv(n1(s)).asInstanceOf[AccessMode], n2(s).getText)
        case PARAM_LIST => nodeToList[Param](s)
        case POW => Pow(sp(s), cv(n0(s)).asInstanceOf[Expr], cv(n1(s)).asInstanceOf[Expr])
        case PROCEDURE_CALL => ProcedureCall(sp(s), n0(s).getText, cv(n1(s)).asInstanceOf[List[Expr]])
        case PROGRAM => Program(
          sp(s), n0(s).getText, cv(n1(s)).asInstanceOf[List[VarDecl]], cv(n2(s)).asInstanceOf[List[FuncDecl]],
          cv(n3(s)).asInstanceOf[Statement]
          )
        case RANGE => RangeDef(sp(s), n0(s).getText.toInt, n1(s).getText.toInt)
        case RANGE_LIST => nodeToList[Range](s)
        case READ => Read(sp(s), cv(n0(s)).asInstanceOf[IdfAccess])
        case RETURNING => {
          val optReturnValue = cv(n0(s)).asInstanceOf[Expr]
          Returning(sp(s), Option(optReturnValue))
        }
        case STRING_TYPENAME => StringTypename
        case SUB => Sub(sp(s), cv(n0(s)).asInstanceOf[Expr], cv(n1(s)).asInstanceOf[Expr])
        case TEST_EQ => TestEqual(sp(s), cv(n0(s)).asInstanceOf[Expr], cv(n1(s)).asInstanceOf[Expr])
        case TEST_GE => TestGreaterOrEqual(sp(s), cv(n0(s)).asInstanceOf[Expr], cv(n1(s)).asInstanceOf[Expr])
        case TEST_GT => TestGreaterThan(sp(s), cv(n0(s)).asInstanceOf[Expr], cv(n1(s)).asInstanceOf[Expr])
        case TEST_LE => TestLowerOrEqual(sp(s), cv(n0(s)).asInstanceOf[Expr], cv(n1(s)).asInstanceOf[Expr])
        case TEST_LT => TestLowerThan(sp(s), cv(n0(s)).asInstanceOf[Expr], cv(n1(s)).asInstanceOf[Expr])
        case TEST_NE => TestNotEqual(sp(s), cv(n0(s)).asInstanceOf[Expr], cv(n1(s)).asInstanceOf[Expr])
        case UNARY_MINUS => UnaryMinus(sp(s), cv(n0(s)).asInstanceOf[Expr])
        case VAR => VarAccess(sp(s), n0(s).getText)
        case VAR_DECL => {
          val leacType = cv(n0(s)).asInstanceOf[LeacType]
          val names = cv(n1(s)).asInstanceOf[List[String]]
          for (name <- names) yield VarDecl(sp(s), leacType, name)
        }
        case VAR_DECL_LIST => {
          val nestedDecls = nodeToList[List[VarDecl]](s)
          nestedDecls.flatten
        }
        case VOID_TYPENAME => VoidTypename
        case WRITE => Write(sp(s), cv(n0(s)).asInstanceOf[Expr])
      }
    } catch { case exception: Exception => { println(s.getLine, s.getCharPositionInLine); throw exception } } // TODO: remove
  }
}
