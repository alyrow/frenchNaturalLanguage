// This is a generated file. Not intended for manual editing.
package io.github.alyrow.naturallanguage.french.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static io.github.alyrow.naturallanguage.french.psi.NaturalTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class NaturalParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return naturalFile(b, l + 1);
  }

  /* ********************************************************** */
  // property|COMMENT|CRLF
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    r = property(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    return r;
  }

  /* ********************************************************** */
  // item_*
  static boolean naturalFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "naturalFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "naturalFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // SOUSTRACTION | ADDITION | REAL_DIVISION | MULTIPLICATION | LPAREN | RPAREN | BOOL_NO | BOOL_OR | BOOL_AND | NUMBER_INT |NUMBER_REAL
  //                        INT_MODULO | INT_DIVISION | STRING | CHARACTER | BOOLEAN
  public static boolean operation_for_lazy(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operation_for_lazy")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATION_FOR_LAZY, "<operation for lazy>");
    r = consumeToken(b, SOUSTRACTION);
    if (!r) r = consumeToken(b, ADDITION);
    if (!r) r = consumeToken(b, REAL_DIVISION);
    if (!r) r = consumeToken(b, MULTIPLICATION);
    if (!r) r = consumeToken(b, LPAREN);
    if (!r) r = consumeToken(b, RPAREN);
    if (!r) r = consumeToken(b, BOOL_NO);
    if (!r) r = consumeToken(b, BOOL_OR);
    if (!r) r = consumeToken(b, BOOL_AND);
    if (!r) r = consumeToken(b, NUMBER_INT);
    if (!r) r = parseTokens(b, 0, NUMBER_REAL, INT_MODULO);
    if (!r) r = consumeToken(b, INT_DIVISION);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, CHARACTER);
    if (!r) r = consumeToken(b, BOOLEAN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (KEY? AFFECTATION VALUE?) | KEY | NUMBER_INT | NUMBER_REAL | CHARACTER | STRING | BOOLEAN | BOOL_AND | BOOL_OR
  //                                      | BOOL_NO | LPAREN | RPAREN | TYPES | (KEY AFFECTATION (KEY | VALUE)) | KEYWORD | COMMA | SEMICOLON | operation_for_lazy | OTHER_OPERATORS
  public static boolean property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY, "<property>");
    r = property_0(b, l + 1);
    if (!r) r = consumeToken(b, KEY);
    if (!r) r = consumeToken(b, NUMBER_INT);
    if (!r) r = consumeToken(b, NUMBER_REAL);
    if (!r) r = consumeToken(b, CHARACTER);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, BOOLEAN);
    if (!r) r = consumeToken(b, BOOL_AND);
    if (!r) r = consumeToken(b, BOOL_OR);
    if (!r) r = consumeToken(b, BOOL_NO);
    if (!r) r = consumeToken(b, LPAREN);
    if (!r) r = consumeToken(b, RPAREN);
    if (!r) r = consumeToken(b, TYPES);
    if (!r) r = property_13(b, l + 1);
    if (!r) r = consumeToken(b, KEYWORD);
    if (!r) r = consumeToken(b, COMMA);
    if (!r) r = consumeToken(b, SEMICOLON);
    if (!r) r = operation_for_lazy(b, l + 1);
    if (!r) r = consumeToken(b, OTHER_OPERATORS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KEY? AFFECTATION VALUE?
  private static boolean property_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = property_0_0(b, l + 1);
    r = r && consumeToken(b, AFFECTATION);
    r = r && property_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KEY?
  private static boolean property_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_0_0")) return false;
    consumeToken(b, KEY);
    return true;
  }

  // VALUE?
  private static boolean property_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_0_2")) return false;
    consumeToken(b, VALUE);
    return true;
  }

  // KEY AFFECTATION (KEY | VALUE)
  private static boolean property_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_13")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEY, AFFECTATION);
    r = r && property_13_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KEY | VALUE
  private static boolean property_13_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_13_2")) return false;
    boolean r;
    r = consumeToken(b, KEY);
    if (!r) r = consumeToken(b, VALUE);
    return r;
  }

}
