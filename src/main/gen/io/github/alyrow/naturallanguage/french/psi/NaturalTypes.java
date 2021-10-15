// This is a generated file. Not intended for manual editing.
package io.github.alyrow.naturallanguage.french.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import io.github.alyrow.naturallanguage.french.psi.impl.*;

public interface NaturalTypes {

  IElementType OPERATION_FOR_LAZY = new NaturalElementType("OPERATION_FOR_LAZY");
  IElementType PROPERTY = new NaturalElementType("PROPERTY");

  IElementType ADDITION = new NaturalTokenType("ADDITION");
  IElementType AFFECTATION = new NaturalTokenType("AFFECTATION");
  IElementType BOOLEAN = new NaturalTokenType("BOOLEAN");
  IElementType BOOL_AND = new NaturalTokenType("BOOL_AND");
  IElementType BOOL_NO = new NaturalTokenType("BOOL_NO");
  IElementType BOOL_OR = new NaturalTokenType("BOOL_OR");
  IElementType CHARACTER = new NaturalTokenType("CHARACTER");
  IElementType COMMA = new NaturalTokenType("COMMA");
  IElementType COMMENT = new NaturalTokenType("COMMENT");
  IElementType CRLF = new NaturalTokenType("CRLF");
  IElementType INT_DIVISION = new NaturalTokenType("INT_DIVISION");
  IElementType INT_MODULO = new NaturalTokenType("INT_MODULO");
  IElementType KEY = new NaturalTokenType("KEY");
  IElementType KEYWORD = new NaturalTokenType("KEYWORD");
  IElementType LPAREN = new NaturalTokenType("LPAREN");
  IElementType MULTIPLICATION = new NaturalTokenType("MULTIPLICATION");
  IElementType NUMBER_INT = new NaturalTokenType("NUMBER_INT");
  IElementType NUMBER_REAL = new NaturalTokenType("NUMBER_REAL");
  IElementType OTHER_OPERATORS = new NaturalTokenType("OTHER_OPERATORS");
  IElementType REAL_DIVISION = new NaturalTokenType("REAL_DIVISION");
  IElementType RPAREN = new NaturalTokenType("RPAREN");
  IElementType SEMICOLON = new NaturalTokenType("SEMICOLON");
  IElementType SOUSTRACTION = new NaturalTokenType("SOUSTRACTION");
  IElementType STRING = new NaturalTokenType("STRING");
  IElementType TYPES = new NaturalTokenType("TYPES");
  IElementType VALUE = new NaturalTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == OPERATION_FOR_LAZY) {
        return new NaturalOperationForLazyImpl(node);
      }
      else if (type == PROPERTY) {
        return new NaturalPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
