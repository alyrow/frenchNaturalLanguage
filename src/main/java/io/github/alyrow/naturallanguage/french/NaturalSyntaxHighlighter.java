package io.github.alyrow.naturallanguage.french;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import io.github.alyrow.naturallanguage.french.psi.NaturalTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class NaturalSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey AFFECTATION =
            createTextAttributesKey("NATURAL_AFFECTATION", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey KEY =
            createTextAttributesKey("NATURAL_KEY", DefaultLanguageHighlighterColors.GLOBAL_VARIABLE);
    public static final TextAttributesKey VALUE =
            createTextAttributesKey("NATURAL_VALUE", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("NATURAL_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("NATURAL_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);
    public static final TextAttributesKey STRING =
            createTextAttributesKey("NATURAL_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey CHARACTER =
            createTextAttributesKey("NATURAL_CHARACTER", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey INTEGER =
            createTextAttributesKey("NATURAL_INTEGER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey REAL =
            createTextAttributesKey("NATURAL_REAL", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey BOOLEAN =
            createTextAttributesKey("NATURAL_BOOLEAN", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey PAREN =
            createTextAttributesKey("NATURAL_PAREN", DefaultLanguageHighlighterColors.PARENTHESES);
    public static final TextAttributesKey SIGNE =
            createTextAttributesKey("NATURAL_SIGNE", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey TYPES =
            createTextAttributesKey("NATURAL_TYPES", DefaultLanguageHighlighterColors.CLASS_REFERENCE);
    public static final TextAttributesKey KEYWORD =
            createTextAttributesKey("NATURAL_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey COMMA =
            createTextAttributesKey("NATURAL_COMMA", DefaultLanguageHighlighterColors.COMMA);
    public static final TextAttributesKey SEMICOLON =
            createTextAttributesKey("NATURAL_SEMICOLON", DefaultLanguageHighlighterColors.SEMICOLON);
    public static final TextAttributesKey OTHER_OPERATORS =
            createTextAttributesKey("NATURAL_OTHER_OPERATORS", DefaultLanguageHighlighterColors.OPERATION_SIGN);


    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] AFFECTATION_KEYS = new TextAttributesKey[]{AFFECTATION};
    private static final TextAttributesKey[] KEY_KEYS = new TextAttributesKey[]{KEY};
    private static final TextAttributesKey[] VALUE_KEYS = new TextAttributesKey[]{VALUE};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] TEXT_KEYS = new TextAttributesKey[]{STRING, CHARACTER};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{INTEGER, REAL};
    private static final TextAttributesKey[] BOOLEAN_KEYS = new TextAttributesKey[]{BOOLEAN};
    private static final TextAttributesKey[] PAREN_KEYS = new TextAttributesKey[]{PAREN};
    private static final TextAttributesKey[] SIGNE_KEYS = new TextAttributesKey[]{SIGNE};
    private static final TextAttributesKey[] TYPES_KEYS = new TextAttributesKey[]{TYPES};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] COMMA_KEYS = new TextAttributesKey[]{COMMA};
    private static final TextAttributesKey[] SEMICOLON_KEYS = new TextAttributesKey[]{SEMICOLON};
    private static final TextAttributesKey[] OTHER_OPERATORS_KEYS = new TextAttributesKey[]{OTHER_OPERATORS};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new NaturalLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(NaturalTypes.AFFECTATION)) {
            return AFFECTATION_KEYS;
        } else if (tokenType.equals(NaturalTypes.KEY)) {
            return KEY_KEYS;
        } else if (tokenType.equals(NaturalTypes.VALUE)) {
            return VALUE_KEYS;
        } else if (tokenType.equals(NaturalTypes.COMMENT)) {
            return COMMENT_KEYS;
        } else if (tokenType.equals(NaturalTypes.STRING)) {
            return TEXT_KEYS;
        }else if (tokenType.equals(NaturalTypes.CHARACTER)) {
            return TEXT_KEYS;
        }else if (tokenType.equals(NaturalTypes.NUMBER_INT)) {
            return NUMBER_KEYS;
        }else if (tokenType.equals(NaturalTypes.NUMBER_REAL)) {
            return NUMBER_KEYS;
        } else if (tokenType.equals(NaturalTypes.BOOLEAN)) {
            return BOOLEAN_KEYS;
        } else if (tokenType.equals(NaturalTypes.LPAREN)) {
            return PAREN_KEYS;
        } else if (tokenType.equals(NaturalTypes.RPAREN)) {
            return PAREN_KEYS;
        } else if (tokenType.equals(NaturalTypes.ADDITION)) {
            return SIGNE_KEYS;
        } else if (tokenType.equals(NaturalTypes.SOUSTRACTION)) {
            return SIGNE_KEYS;
        } else if (tokenType.equals(NaturalTypes.MULTIPLICATION)) {
            return SIGNE_KEYS;
        } else if (tokenType.equals(NaturalTypes.REAL_DIVISION)) {
            return SIGNE_KEYS;
        } else if (tokenType.equals(NaturalTypes.INT_DIVISION)) {
            return SIGNE_KEYS;
        } else if (tokenType.equals(NaturalTypes.INT_MODULO)) {
            return SIGNE_KEYS;
        } else if (tokenType.equals(NaturalTypes.BOOL_OR)) {
            return SIGNE_KEYS;
        }  else if (tokenType.equals(NaturalTypes.BOOL_AND)) {
            return SIGNE_KEYS;
        } else if (tokenType.equals(NaturalTypes.BOOL_NO)) {
            return SIGNE_KEYS;
        } else if (tokenType.equals(NaturalTypes.TYPES)) {
            return TYPES_KEYS;
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        } else if (tokenType.equals(NaturalTypes.KEYWORD)) {
            return KEYWORD_KEYS;
        } else if (tokenType.equals(NaturalTypes.COMMA)) {
            return COMMA_KEYS;
        } else if (tokenType.equals(NaturalTypes.SEMICOLON)) {
            return SEMICOLON_KEYS;
        } else if (tokenType.equals(NaturalTypes.OTHER_OPERATORS)) {
            return OTHER_OPERATORS_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }

}