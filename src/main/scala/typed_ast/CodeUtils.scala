package typed_ast

object CodeUtils {
  val COULD_NOT_HAPPEN: String = "<error>"

  val IDENT: String = "    "

  def indent(code: String): String = {
    code.split("\n")
      .map(line => if (!line.isEmpty) { CodeUtils.IDENT + line } else { line })
      .mkString("\n")
  }

  def preamble: String =
    raw"""
         |#include <stdio.h>
         |#include <stdlib.h>
         |#include <stdbool.h>
         |#include <math.h>
         |
         |void fail() {
         |    int *p = NULL;
         |    *p = 0;
         |}
         |
         |bool read_bool() {
         |    int i = 0;
         |    int c = 0;
         |    bool value = true;
         |    while (c != '\n' && c != EOF) {
         |        c = getchar();
         |        if (c == '\n' || c == EOF) {
         |            break;
         |        }
         |        if (i == 0) { if (c == 't') { value = true; } else if (c == 'f') { value = false; } else { fail(); } }
         |        else if (i == 1) { if (value == true && c == 'r') {} else if (value == false && c == 'a') {} else {
         |         fail(); } }
         |        else if (i == 2) { if (value == true && c == 'u') {} else if (value == false && c == 'l') {} else {
         |         fail(); } }
         |        else if (i == 3) { if (value == true && c == 'e') {} else if (value == false && c == 's') {} else {
         |         fail(); } }
         |        else if (i == 4) { if (value == true) { fail(); } else if (value == false && c == 'e') {} else {
         |        fail(); } }
         |        else { fail(); }
         |        i++;
         |    }
         |    if (value == true && i == 4) {} else if (value == false && i == 5) {} else { fail(); }
         |    return value;
         |}
         |""".stripMargin
}
