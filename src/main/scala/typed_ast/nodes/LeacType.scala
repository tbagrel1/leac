package typed_ast.nodes

import typed_ast.nodes.enums.{AtomTypename, BoolTypename, CharTypename, FloatTypename, IntTypename, StringTypename, VoidTypename}
import typed_ast.{CodeUtils, ScopedSymbolTable, SemanticCheckReporter, Severity, SourcePos}

sealed trait LeacType extends AbstractNode {
  def accept(other: LeacType): Boolean

  def cantAccept(other: LeacType): Boolean = !accept(other)

  override protected def _fillSymbolTable(
    symbolTable: ScopedSymbolTable,
    reporter: SemanticCheckReporter
  ): (ScopedSymbolTable, SemanticCheckReporter) = (symbolTable, reporter)
}

case class Atom(sourcePos: SourcePos, atomTypename: AtomTypename) extends AbstractNode with LeacType {
  override def fancyContext: String = "basic type use"


  override def code: String = atomTypename.code

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
  }

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = {}

  override def toString: String = atomTypename.toString

  override def accept(other: LeacType): Boolean = other match {
    case Atom(_, otherTypename) => atomTypename accept otherTypename
    case Array(_, _, _) => false
  }
}

case class Array(sourcePos: SourcePos, atomTypename: AtomTypename, rangeDefs: List[RangeDef]) extends AbstractNode

  with LeacType {
  def codeToDisplay(name: String): String = {
    if (rangeDefs.length > 1) {
      return CodeUtils.COULD_NOT_HAPPEN
    }
    val rangeDef = rangeDefs.head

    def displayCell: String = {
      atomTypename match {
        case IntTypename | FloatTypename | CharTypename | StringTypename => {
          s"""printf("%d: ${
            atomTypename
              .formatter
          }", __i, ${ name }[__i - (${ rangeDef.inf })]);"""
        }
        case BoolTypename => s"""printf("%d: %s", __i, ${ name }[__i - (${ rangeDef.inf })] ? "true" : "false");"""
        case _ => CodeUtils.COULD_NOT_HAPPEN
      }
    }
    raw"""
         |bool __first = true;
         |printf("[");
         |for (int __i = ${ rangeDef.inf }; __i <= ${ rangeDef.sup }; ++__i) {
         |     if (__first) {
         |         __first = false;
         |     } else {
         |         printf(", ");
         |     }
         |     ${ displayCell }
         |}
         |printf("]");
         |""".stripMargin
  }

  def jumps: List[Int] = {
    var factor = 1
    rangeDefs.map(rangeDef => {
      val result = factor
      factor *= (rangeDef.sup - rangeDef.inf)
      result
    })
  }

  def infs: List[Int] = {
    rangeDefs.map(_.inf)
  }

  def totalSize: Int = {
    rangeDefs.map(rangeDef => rangeDef.sup - rangeDef.inf).product
  }

  def getCell(coords: List[Expr]): String = s"[${
    coords.zip(infs.zip(jumps)).map(ciz => s"((${ ciz._1.code } - (${ ciz._2._1 })) * (${ ciz._2._2 }))").mkString(" + ")
  }]"

  def setupDecl(name: String): String = s"${ atomTypename } ${ name }[${ totalSize }];"

  for (rangeDef <- rangeDefs) {
    rangeDef.setParent(this)
  }

  override def fancyContext: String = "array type use"


  override def code: String = CodeUtils.COULD_NOT_HAPPEN

  override def dispatch[T](f: (AbstractNode, T) => T, payload: T): Unit = {
    val newPayload = f(this, payload)
    for (rangeDef <- rangeDefs) {
      rangeDef.dispatch(f, newPayload)
    }
  }

  override protected def _semanticCheck(reporter: SemanticCheckReporter): Unit = {
    if (atomTypename == VoidTypename) {
      reporter.report(Severity.Error, this, "cannot create an array containing void elements")
    }
  }

  override def toString: String = s"[${ atomTypename }; ${ rangeDefs.map(_.toString).mkString(", ") }]"

  override def accept(other: LeacType): Boolean = other match {
    case Atom(_, _) => false
    case Array(_, otherTypename, otherRangeDefs) => (atomTypename accept otherTypename) && (rangeDefs == otherRangeDefs)
  }
}
