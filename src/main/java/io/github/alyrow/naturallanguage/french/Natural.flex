package io.github.alyrow.naturallanguage.french;


import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import io.github.alyrow.naturallanguage.french.psi.NaturalTypes;
import com.intellij.psi.TokenType;

%%

%class NaturalLexer
%implements FlexLexer
%unicode
%ignorecase
%function advance
%type IElementType
%eof{  return;
%eof}


CRLF=\R
WHITE_SPACE=[\ \n\t\f]
FIRST_VALUE_CHARACTER=[^ \n\f\\] | "\\"{CRLF} | "\\".
VALUE_CHARACTER=[^\n\f\\] | "\\"{CRLF} | "\\".
LINE_COMMENT="/""/"[^\r\n]*
BLOCK_COMMENT   = "/*" !([^]* "*/" [^]*) ("*/")?
COMMENTARY = {LINE_COMMENT}|{BLOCK_COMMENT}
KEY_CHARACTER=[\w]+

N               = [0-9]+
NUM_INT         = [-]?{N}
EXP             = [Ee][+-]?{N}
NUM_REAL        = [-]?{N}(\.{N})?{EXP}?
CHAR_ELEMENT  = "''"|[^']?
CHAR_LITERAL  = "'"{CHAR_ELEMENT}"'"
STR_ELEMENT  = "\"\""|[^\"]?
STR_LITERAL  = "\""{STR_ELEMENT}*"\""
BOOL = "VRAI"|"FAUX"

ADDITION = "+"
SOUSTRACTION = "-"
MULTIPLICATION = "*"
REAL_DIVISION = "/"
INT_DIVISION = "DIV"
INT_MODULO = "MOD"|"%"
BOOL_OR = "OU"
BOOL_AND = "ET"
BOOL_NO = "NON"
LPAREN = "("
RPAREN = ")"
TYPES = "ENTIER"|"entier"|"REEL"|"réel"|"BOOLEEN"|"booléen"|"CARACTERE"|"caractère"|"CHAINE"|"chaine"|"TABLEAU\ DE"|"tableau\ de"|"ENTIERS"|"entiers"|"REELS"|"réels"|"BOOLEENS"|"booléens"|"CARACTERES"|"caractères"|"CHAINES"|"chaines"|"LISTE DE"|"liste de"|"T"|"V"|"FILE"|"file"|"PILE"|"pile"|"ARBRE\ DE"|"arbre\ de"
AFFECTATION = "<-"
KEYWORD = "PROGRAMME"|"programme"|"VARIABLES"|"variables"|"DEBUT"|"début"|"FIN"|"fin"|"SI"|"si"|"ALORS"|"alors"|"SINON"|"sinon"|"DE"|"de"|"POUR"|"pour"|"TANT\ QUE"|"tant\ que"|"FAIRE"|"faire"|"REPETER"|"répeter"|"FONCTION"|"fonction"|"RETOURNER"|"retourner"|"PROCEDURE"|"procédure"|"E"|"ES"|"S"|"STRUCTURE"|"structure"
COMMA = ","
SEMICOLON = ":"
OTHER_OPERATORS = "="|"<"|"<="|">"|">="|"["|"]"|"!="


%state WAITING_VALUE

%%

<YYINITIAL> {COMMENTARY}                                    { yybegin(YYINITIAL); return NaturalTypes.COMMENT; }

<YYINITIAL> {NUM_INT}                                       { yybegin(YYINITIAL); return NaturalTypes.NUMBER_INT; }

<YYINITIAL> {NUM_REAL}                                      { yybegin(YYINITIAL); return NaturalTypes.NUMBER_REAL; }

<YYINITIAL> {CHAR_LITERAL}                                  { yybegin(YYINITIAL); return NaturalTypes.CHARACTER; }

<YYINITIAL> {STR_LITERAL}                                   { yybegin(YYINITIAL); return NaturalTypes.STRING; }

<YYINITIAL> {BOOL}                                          { yybegin(YYINITIAL); return NaturalTypes.BOOLEAN; }
<YYINITIAL> {LPAREN}                                          { yybegin(YYINITIAL); return NaturalTypes.LPAREN; }
<YYINITIAL> {RPAREN}                                          { yybegin(YYINITIAL); return NaturalTypes.RPAREN; }

<YYINITIAL> {ADDITION}                                          { yybegin(YYINITIAL); return NaturalTypes.ADDITION; }
<YYINITIAL> {SOUSTRACTION}                                          { yybegin(YYINITIAL); return NaturalTypes.SOUSTRACTION; }
<YYINITIAL> {MULTIPLICATION}                                          { yybegin(YYINITIAL); return NaturalTypes.MULTIPLICATION; }
<YYINITIAL> {REAL_DIVISION}                                          { yybegin(YYINITIAL); return NaturalTypes.REAL_DIVISION; }
<YYINITIAL> {INT_DIVISION}                                          { yybegin(YYINITIAL); return NaturalTypes.INT_DIVISION; }
<YYINITIAL> {INT_MODULO}                                          { yybegin(YYINITIAL); return NaturalTypes.INT_MODULO; }
<YYINITIAL> {BOOL_OR}                                          { yybegin(YYINITIAL); return NaturalTypes.BOOL_OR; }
<YYINITIAL> {BOOL_AND}                                          { yybegin(YYINITIAL); return NaturalTypes.BOOL_AND; }
<YYINITIAL> {BOOL_NO}                                          { yybegin(YYINITIAL); return NaturalTypes.BOOL_NO; }

<YYINITIAL> {TYPES}                                          { yybegin(YYINITIAL); return NaturalTypes.TYPES; }

<YYINITIAL> {AFFECTATION}                                          { yybegin(YYINITIAL); return NaturalTypes.AFFECTATION; }

<YYINITIAL> {KEYWORD}                                          { yybegin(YYINITIAL); return NaturalTypes.KEYWORD; }
<YYINITIAL> {COMMA}                                          { yybegin(YYINITIAL); return NaturalTypes.COMMA; }
<YYINITIAL> {SEMICOLON}                                          { yybegin(YYINITIAL); return NaturalTypes.SEMICOLON; }
<YYINITIAL> {OTHER_OPERATORS}                                          { yybegin(YYINITIAL); return NaturalTypes.OTHER_OPERATORS; }




<YYINITIAL> {KEY_CHARACTER}+                                { yybegin(YYINITIAL); return NaturalTypes.KEY; }

<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {FIRST_VALUE_CHARACTER}{VALUE_CHARACTER}*   { yybegin(YYINITIAL); return NaturalTypes.VALUE; }

({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

[^]                                                         { return TokenType.BAD_CHARACTER; }