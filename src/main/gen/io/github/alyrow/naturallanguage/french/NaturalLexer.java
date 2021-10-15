/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package io.github.alyrow.naturallanguage.french;


import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import io.github.alyrow.naturallanguage.french.psi.NaturalTypes;
import com.intellij.psi.TokenType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Natural.flex</tt>
 */
class NaturalLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int WAITING_VALUE = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [11, 6, 4]
   * Total runtime size is 15360 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>10]<<6)|((ch>>4)&0x3f)]<<4)|(ch&0xf)];
  }

  /* The ZZ_CMAP_Z table has 1088 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\6\15\1\16\23\15"+
    "\1\17\1\15\1\20\1\21\12\15\1\22\10\12\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1"+
    "\32\1\33\1\34\1\35\1\36\2\12\1\15\1\37\3\12\1\40\10\12\1\41\1\42\5\15\1\43"+
    "\1\44\11\12\1\45\2\12\1\46\4\12\1\47\1\50\1\51\1\12\1\52\1\12\1\53\1\54\1"+
    "\55\3\12\51\15\1\56\3\15\1\57\1\60\4\15\1\61\12\12\1\62\u02c1\12\1\63\277"+
    "\12");

  /* The ZZ_CMAP_Y table has 3328 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\4\1\6\1\7\1\1\1\10\1\11\1\12\1\13\1\12\1\13\3\14"+
    "\1\15\3\14\1\16\24\14\1\17\1\20\1\21\1\1\7\14\1\22\1\23\1\14\1\24\4\14\1\25"+
    "\10\14\1\24\12\14\1\26\1\14\1\27\1\26\1\14\1\30\1\26\1\14\1\31\1\32\1\14\1"+
    "\33\1\34\1\1\1\33\4\14\1\35\6\14\1\36\1\37\1\40\1\1\3\14\1\41\6\14\1\20\3"+
    "\14\1\42\2\14\1\43\1\1\1\14\1\44\4\1\1\14\1\45\1\1\1\46\1\24\7\14\1\47\1\26"+
    "\1\36\1\50\1\37\1\51\1\52\1\53\1\47\1\20\1\54\1\50\1\37\1\55\1\56\1\57\1\60"+
    "\1\61\1\62\1\24\1\37\1\63\1\64\1\65\1\47\1\66\1\67\1\50\1\37\1\63\1\70\1\71"+
    "\1\47\1\72\1\73\1\74\1\75\1\35\1\76\1\77\1\60\1\1\1\100\1\101\1\37\1\102\1"+
    "\103\1\104\1\47\1\1\1\100\1\101\1\37\1\105\1\103\1\106\1\47\1\107\1\110\1"+
    "\101\1\14\1\41\1\111\1\112\1\47\1\113\1\114\1\115\1\14\1\116\1\117\1\120\1"+
    "\60\1\121\1\26\2\14\1\33\1\122\1\123\2\1\1\124\1\125\1\126\1\127\1\130\1\131"+
    "\2\1\1\65\1\132\1\123\1\133\1\134\1\14\1\135\1\26\1\136\1\134\1\14\1\135\1"+
    "\137\3\1\4\14\1\123\4\14\1\43\2\14\1\140\2\14\1\141\24\14\1\142\1\143\2\14"+
    "\1\142\2\14\1\144\1\145\1\13\3\14\1\145\3\14\1\41\2\1\1\14\1\1\5\14\1\146"+
    "\1\26\45\14\1\40\1\14\1\26\1\33\4\14\1\147\1\150\1\151\1\152\1\14\1\152\1"+
    "\14\1\153\1\151\1\154\5\14\1\155\1\123\1\1\1\156\1\123\5\14\1\30\2\14\1\33"+
    "\4\14\1\61\1\14\1\122\2\44\1\60\1\14\1\43\1\152\2\14\1\44\1\14\2\123\2\1\1"+
    "\14\1\44\3\14\1\122\1\14\1\40\2\123\1\157\1\122\4\1\4\14\1\44\1\123\1\160"+
    "\1\153\7\14\1\153\3\14\1\30\1\102\2\14\1\43\1\150\4\1\1\161\1\14\1\162\17"+
    "\14\1\163\21\14\1\146\2\14\1\146\1\164\1\14\1\43\3\14\1\165\1\166\1\167\1"+
    "\135\1\166\2\1\1\170\1\171\1\65\1\172\1\1\1\173\1\1\1\135\3\1\2\14\1\65\1"+
    "\174\1\175\1\176\1\131\1\177\1\1\2\14\1\150\62\1\1\60\2\14\1\123\161\1\2\14"+
    "\1\122\2\14\1\122\10\14\1\200\1\153\2\14\1\140\3\14\1\201\1\171\1\14\1\202"+
    "\4\203\2\14\2\1\1\171\35\1\1\204\1\1\1\26\1\205\1\26\4\14\1\206\1\26\4\14"+
    "\1\141\1\207\1\14\1\43\1\26\4\14\1\122\1\1\1\14\1\33\3\1\1\14\40\1\133\14"+
    "\1\61\4\1\135\14\1\61\2\1\10\14\1\135\4\1\2\14\1\43\20\14\1\135\1\14\1\44"+
    "\1\1\3\14\1\210\7\14\1\20\1\1\1\211\1\212\5\14\1\213\1\14\1\122\1\30\3\1\1"+
    "\211\2\14\1\30\1\1\3\14\1\153\4\14\1\61\1\123\1\14\1\214\2\14\1\43\2\14\1"+
    "\153\1\14\1\135\4\14\1\215\1\123\1\14\1\122\3\14\1\202\1\43\1\123\1\14\1\115"+
    "\4\14\1\34\1\156\1\14\1\216\1\217\1\220\1\203\2\14\1\141\1\61\7\14\1\221\1"+
    "\123\72\14\1\153\1\14\1\222\2\14\1\44\20\1\26\14\1\43\6\14\1\123\2\1\1\202"+
    "\1\223\1\37\1\224\1\225\6\14\1\20\1\1\1\226\25\14\1\43\1\1\4\14\1\212\2\14"+
    "\1\30\2\1\1\44\1\14\1\1\1\14\1\227\1\230\2\1\1\136\7\14\1\135\1\1\1\123\1"+
    "\26\1\231\1\26\1\33\1\60\4\14\1\122\1\232\1\233\2\1\1\234\1\14\1\13\1\235"+
    "\2\43\2\1\7\14\1\33\4\1\3\14\1\152\7\1\1\236\10\1\1\14\1\135\3\14\2\65\1\1"+
    "\2\14\1\1\1\14\1\33\2\14\1\33\1\14\1\43\2\14\1\237\1\240\2\1\11\14\1\43\1"+
    "\123\2\14\1\237\1\14\1\44\2\14\1\30\3\14\1\153\11\1\23\14\1\202\1\14\1\61"+
    "\1\30\11\1\1\241\2\14\1\242\1\14\1\61\1\14\1\202\1\14\1\122\4\1\1\14\1\243"+
    "\1\14\1\61\1\14\1\123\4\1\3\14\1\244\4\1\1\245\1\246\1\14\1\247\2\1\1\14\1"+
    "\135\1\14\1\135\2\1\1\134\1\14\1\202\1\1\3\14\1\61\1\14\1\61\1\14\1\34\1\14"+
    "\1\20\6\1\4\14\1\150\3\1\3\14\1\34\3\14\1\34\60\1\4\14\1\202\1\1\1\60\1\171"+
    "\3\14\1\33\1\1\1\14\1\150\1\123\3\14\1\136\1\1\2\14\1\250\4\14\1\251\1\252"+
    "\2\1\1\14\1\24\1\14\1\253\4\1\1\254\1\31\1\150\3\14\1\33\1\123\1\36\1\50\1"+
    "\37\1\63\1\70\1\255\1\256\1\152\10\1\4\14\1\33\1\123\2\1\4\14\1\257\1\123"+
    "\12\1\3\14\1\260\1\65\1\261\2\1\4\14\1\262\1\123\2\1\3\14\1\30\1\123\3\1\1"+
    "\14\1\102\1\44\1\123\26\1\4\14\1\123\1\171\34\1\3\14\1\150\20\1\1\37\2\14"+
    "\1\13\1\65\1\123\1\1\1\212\1\14\1\212\1\134\1\202\64\1\71\14\1\123\6\1\6\14"+
    "\1\122\1\1\14\14\1\153\53\1\2\14\1\122\75\1\44\14\1\202\33\1\43\14\1\150\1"+
    "\14\1\122\1\123\6\1\1\14\1\43\1\152\3\14\1\202\1\153\1\123\1\226\1\263\1\14"+
    "\67\1\4\14\1\152\2\14\1\122\1\171\1\14\4\1\1\65\1\1\76\14\1\135\1\1\57\14"+
    "\1\34\20\1\1\20\77\1\6\14\1\33\1\135\1\150\1\264\114\1\1\265\1\266\1\267\1"+
    "\1\1\270\11\1\1\271\33\1\5\14\1\136\3\14\1\151\1\272\1\273\1\274\3\14\1\275"+
    "\1\276\1\14\1\277\1\300\1\101\24\14\1\260\1\14\1\101\1\141\1\14\1\141\1\14"+
    "\1\136\1\14\1\136\1\122\1\14\1\122\1\14\1\37\1\14\1\37\1\14\1\301\3\14\40"+
    "\1\3\14\1\222\2\14\1\135\1\302\1\172\1\160\1\26\25\1\1\13\1\213\1\303\75\1"+
    "\14\14\1\152\1\202\2\1\4\14\1\33\1\123\112\1\1\274\1\14\1\304\1\305\1\306"+
    "\1\307\1\310\1\311\1\312\1\44\1\313\1\44\47\1\1\14\1\123\1\14\1\123\1\14\1"+
    "\123\47\1\55\14\1\202\2\1\103\14\1\152\15\14\1\43\150\14\1\20\25\1\41\14\1"+
    "\43\56\1\17\14\41\1");

  /* The ZZ_CMAP_A table has 3264 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\4\1\2\1\1\1\5\1\3\22\0\1\7\1\61\1\21\2\0\1\34\1\0\1\20\1\37\1\40\1"+
    "\11\1\16\1\54\1\14\1\17\1\10\12\13\1\55\1\0\1\51\1\56\1\57\2\0\1\24\1\43\1"+
    "\44\1\31\1\15\1\26\1\52\1\46\1\25\2\12\1\41\1\32\1\36\1\33\1\50\1\53\1\23"+
    "\1\47\1\35\1\27\1\22\1\12\1\30\2\12\1\60\1\6\1\60\1\0\1\12\1\50\1\53\1\23"+
    "\1\47\1\35\1\27\1\22\1\12\1\30\2\12\12\0\1\1\24\0\1\12\12\0\1\12\4\0\1\12"+
    "\5\0\10\12\1\45\1\42\15\12\1\0\30\12\2\25\35\12\1\47\2\12\4\0\14\12\16\0\5"+
    "\12\7\0\1\12\1\0\1\12\1\0\5\12\1\0\2\12\2\0\4\12\1\0\1\12\6\0\1\12\1\0\3\12"+
    "\1\0\1\12\1\0\4\12\1\0\23\12\1\0\11\12\1\0\26\12\2\0\1\12\6\0\10\12\10\0\16"+
    "\12\1\0\1\12\1\0\2\12\1\0\2\12\1\0\1\12\10\0\13\12\5\0\3\12\15\0\12\12\4\0"+
    "\6\12\1\0\10\12\2\0\12\12\1\0\23\12\2\0\14\12\2\0\11\12\4\0\1\12\5\0\16\12"+
    "\2\0\14\12\4\0\5\12\1\0\10\12\6\0\20\12\2\0\13\12\2\0\16\12\1\0\1\12\3\0\4"+
    "\12\2\0\11\12\2\0\2\12\2\0\4\12\10\0\1\12\4\0\2\12\1\0\1\12\1\0\3\12\1\0\6"+
    "\12\4\0\2\12\1\0\2\12\1\0\2\12\1\0\2\12\2\0\1\12\1\0\5\12\4\0\2\12\2\0\3\12"+
    "\3\0\1\12\7\0\4\12\1\0\1\12\7\0\20\12\13\0\3\12\1\0\11\12\1\0\2\12\1\0\2\12"+
    "\1\0\5\12\2\0\12\12\1\0\3\12\1\0\3\12\2\0\1\12\30\0\1\12\7\0\3\12\1\0\10\12"+
    "\2\0\6\12\2\0\2\12\2\0\3\12\10\0\2\12\4\0\2\12\1\0\1\12\1\0\1\12\20\0\2\12"+
    "\1\0\6\12\3\0\3\12\1\0\4\12\3\0\2\12\1\0\1\12\1\0\2\12\3\0\2\12\3\0\3\12\3"+
    "\0\5\12\3\0\3\12\1\0\4\12\2\0\1\12\6\0\1\12\10\0\4\12\1\0\10\12\1\0\3\12\1"+
    "\0\30\12\3\0\10\12\1\0\3\12\1\0\4\12\7\0\2\12\1\0\3\12\5\0\4\12\1\0\5\12\2"+
    "\0\4\12\5\0\2\12\7\0\1\12\2\0\2\12\16\0\3\12\1\0\10\12\1\0\7\12\1\0\3\12\1"+
    "\0\5\12\5\0\4\12\7\0\1\12\12\0\6\12\2\0\2\12\1\0\22\12\3\0\10\12\1\0\11\12"+
    "\1\0\1\12\2\0\7\12\3\0\1\12\4\0\6\12\1\0\1\12\1\0\10\12\2\0\2\12\14\0\17\12"+
    "\1\0\12\12\7\0\2\12\1\0\1\12\2\0\2\12\1\0\1\12\2\0\1\12\6\0\4\12\1\0\7\12"+
    "\1\0\3\12\1\0\1\12\1\0\1\12\2\0\2\12\1\0\15\12\1\0\3\12\2\0\5\12\1\0\1\12"+
    "\1\0\6\12\2\0\12\12\2\0\4\12\10\0\2\12\13\0\1\12\1\0\1\12\1\0\1\12\4\0\12"+
    "\12\1\0\24\12\3\0\5\12\1\0\12\12\6\0\1\12\11\0\6\12\1\0\1\12\5\0\1\12\2\0"+
    "\13\12\1\0\15\12\1\0\4\12\2\0\7\12\1\0\1\12\1\0\4\12\2\0\1\12\1\0\4\12\2\0"+
    "\7\12\1\0\1\12\1\0\4\12\2\0\16\12\2\0\6\12\2\0\13\12\3\0\13\12\7\0\15\12\1"+
    "\0\7\12\13\0\4\12\14\0\1\12\1\0\2\12\14\0\4\12\3\0\1\12\4\0\2\12\15\0\3\12"+
    "\11\0\1\12\23\0\10\12\1\0\23\12\1\0\2\12\6\0\6\12\5\0\15\12\1\0\1\12\1\0\1"+
    "\12\1\0\1\12\1\0\6\12\1\0\7\12\1\0\1\12\3\0\3\12\1\0\7\12\3\0\4\12\2\0\6\12"+
    "\14\0\2\1\25\0\1\12\4\0\1\12\14\0\1\12\15\0\1\12\2\0\1\12\4\0\1\12\2\0\12"+
    "\12\1\0\1\12\3\0\5\12\6\0\1\12\1\0\1\12\1\0\1\12\1\0\4\12\1\0\1\12\5\0\5\12"+
    "\4\0\1\12\1\0\5\12\6\0\15\12\7\0\10\12\11\0\7\12\1\0\7\12\6\0\3\12\11\0\5"+
    "\12\2\0\5\12\3\0\7\12\2\0\2\12\2\0\3\12\5\0\16\12\1\0\12\12\1\0\1\12\7\0\11"+
    "\12\2\0\27\12\2\0\15\12\3\0\1\12\1\0\1\12\2\0\1\12\16\0\1\12\2\0\5\12\12\0"+
    "\6\12\2\0\6\12\2\0\6\12\11\0\13\12\1\0\2\12\2\0\7\12\4\0\5\12\3\0\5\12\5\0"+
    "\12\12\1\0\5\12\1\0\1\12\1\0\2\12\1\0\2\12\1\0\12\12\3\0\15\12\3\0\2\12\30"+
    "\0\16\12\4\0\1\12\2\0\6\12\2\0\6\12\2\0\6\12\2\0\3\12\3\0\14\12\1\0\16\12"+
    "\1\0\2\12\1\0\1\12\15\0\1\12\2\0\4\12\4\0\10\12\1\0\5\12\12\0\6\12\2\0\1\12"+
    "\1\0\14\12\1\0\2\12\3\0\1\12\2\0\4\12\1\0\2\12\12\0\10\12\6\0\6\12\1\0\2\12"+
    "\5\0\10\12\1\0\3\12\1\0\13\12\4\0\3\12\4\0\5\12\2\0\1\12\11\0\5\12\5\0\3\12"+
    "\3\0\13\12\1\0\1\12\3\0\10\12\6\0\1\12\1\0\7\12\1\0\1\12\1\0\4\12\1\0\2\12"+
    "\6\0\1\12\5\0\7\12\2\0\7\12\3\0\6\12\1\0\1\12\10\0\6\12\2\0\10\12\10\0\6\12"+
    "\2\0\1\12\3\0\1\12\13\0\10\12\5\0\15\12\3\0\2\12\6\0\5\12\3\0\6\12\10\0\10"+
    "\12\2\0\7\12\16\0\4\12\4\0\3\12\15\0\1\12\2\0\2\12\2\0\4\12\1\0\14\12\1\0"+
    "\1\12\1\0\7\12\1\0\21\12\1\0\4\12\2\0\10\12\1\0\7\12\1\0\14\12\1\0\4\12\1"+
    "\0\5\12\1\0\1\12\3\0\11\12\1\0\10\12\2\0\2\12\5\0\1\12\12\0\2\12\1\0\2\12"+
    "\1\0\5\12\6\0\2\12\1\0\1\12\2\0\1\12\1\0\12\12\1\0\4\12\1\0\1\12\1\0\1\12"+
    "\6\0\1\12\4\0\1\12\1\0\1\12\1\0\1\12\1\0\3\12\1\0\2\12\1\0\1\12\2\0\1\12\1"+
    "\0\1\12\1\0\1\12\1\0\1\12\1\0\1\12\1\0\2\12\1\0\1\12\2\0\4\12\1\0\7\12\1\0"+
    "\4\12\1\0\4\12\1\0\1\12\1\0\12\12\1\0\5\12\1\0\3\12\1\0\5\12\1\0\5\12");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\2\1\1\12\6\5\1\13\1\12\1\5"+
    "\1\14\1\15\3\5\1\10\1\5\1\16\1\17\1\20"+
    "\2\16\1\1\2\21\2\22\1\1\1\22\2\23\1\5"+
    "\1\0\1\6\1\24\1\5\1\10\1\0\1\25\1\0"+
    "\1\26\11\5\1\10\3\5\1\27\6\5\1\10\4\5"+
    "\1\30\1\0\1\2\2\21\1\23\1\31\1\0\1\31"+
    "\1\0\1\5\1\25\14\5\1\32\1\13\2\5\1\33"+
    "\10\5\1\23\1\31\1\5\1\34\1\5\1\12\5\5"+
    "\1\12\21\5\1\0\11\5\2\0\6\5\2\0\2\5"+
    "\1\12\1\10";

  private static int [] zzUnpackAction() {
    int [] result = new int[169];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\62\0\144\0\226\0\310\0\144\0\372\0\u012c"+
    "\0\u015e\0\u0190\0\144\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a"+
    "\0\u02bc\0\u02ee\0\u0320\0\u0352\0\144\0\u0384\0\u03b6\0\144"+
    "\0\144\0\u03e8\0\u041a\0\u044c\0\u047e\0\u04b0\0\u04e2\0\144"+
    "\0\144\0\144\0\u0514\0\u0514\0\u0546\0\u0578\0\226\0\u05aa"+
    "\0\u05dc\0\u060e\0\u0640\0\u0672\0\u06a4\0\u06d6\0\u0708\0\372"+
    "\0\u073a\0\372\0\u076c\0\u079e\0\u01f4\0\u07d0\0\u0802\0\u0834"+
    "\0\u0866\0\u0898\0\u08ca\0\u08fc\0\u092e\0\u0960\0\u0992\0\u09c4"+
    "\0\u09f6\0\u09c4\0\u0a28\0\372\0\u0a5a\0\u0a8c\0\u0abe\0\u0af0"+
    "\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c\0\u0c4e\0\144"+
    "\0\u05dc\0\u0578\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a"+
    "\0\u0dac\0\u0dde\0\144\0\u0e10\0\u0e42\0\u0e74\0\u0ea6\0\u0ed8"+
    "\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036\0\372"+
    "\0\372\0\u1068\0\u109a\0\372\0\u10cc\0\u10fe\0\u1130\0\u1162"+
    "\0\u1194\0\u11c6\0\u11f8\0\u122a\0\144\0\u0d48\0\u125c\0\372"+
    "\0\u128e\0\u12c0\0\u12f2\0\u1324\0\u1356\0\u1388\0\u13ba\0\372"+
    "\0\u13ec\0\u141e\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518\0\u154a"+
    "\0\u157c\0\u15ae\0\u15e0\0\u1612\0\u1644\0\u1676\0\u16a8\0\u16da"+
    "\0\u170c\0\u173e\0\u1770\0\u17a2\0\u17d4\0\u1806\0\u1838\0\u186a"+
    "\0\u189c\0\u18ce\0\u1900\0\u1932\0\u1964\0\u1996\0\u19c8\0\u19fa"+
    "\0\u1a2c\0\u1a5e\0\u1a90\0\u1ac2\0\u1af4\0\u1b26\0\u1b58\0\144"+
    "\0\144";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[169];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\5\4\1\3\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\3\1\14\1\15\1\16\1\17"+
    "\1\20\1\7\1\21\2\7\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\7\1\33\1\34"+
    "\2\7\1\35\1\36\1\37\2\7\1\40\1\41\1\42"+
    "\1\43\1\42\1\44\1\45\1\46\1\47\1\46\1\50"+
    "\1\47\1\51\1\52\52\45\63\0\5\4\1\0\1\4"+
    "\62\0\1\53\1\54\62\0\2\7\1\0\1\7\4\0"+
    "\12\7\1\0\2\7\2\0\10\7\1\0\2\7\20\0"+
    "\1\7\1\10\1\0\1\55\1\0\1\56\2\0\12\7"+
    "\1\0\2\7\2\0\10\7\1\0\2\7\21\0\1\57"+
    "\60\0\2\7\1\0\1\7\4\0\12\7\1\0\1\60"+
    "\1\61\2\0\6\7\1\62\1\7\1\0\2\7\6\0"+
    "\20\63\1\64\41\63\21\65\1\66\40\65\12\0\2\7"+
    "\1\0\1\7\4\0\1\7\1\67\1\70\7\7\1\0"+
    "\2\7\2\0\10\7\1\0\2\7\20\0\2\7\1\0"+
    "\1\71\4\0\12\7\1\0\2\7\2\0\1\7\1\72"+
    "\6\7\1\0\2\7\20\0\2\7\1\0\1\7\4\0"+
    "\1\7\1\73\10\7\1\0\2\7\2\0\1\74\7\7"+
    "\1\0\2\7\20\0\2\7\1\0\1\7\4\0\2\7"+
    "\1\75\1\76\5\7\1\77\1\0\2\7\2\0\10\7"+
    "\1\0\2\7\20\0\2\7\1\0\1\100\4\0\3\7"+
    "\1\101\6\7\1\0\2\7\2\0\1\7\1\102\6\7"+
    "\1\0\2\7\20\0\2\7\1\0\1\7\4\0\11\7"+
    "\1\103\1\0\2\7\2\0\10\7\1\0\2\7\20\0"+
    "\2\7\1\0\1\7\4\0\5\7\1\104\4\7\1\0"+
    "\2\7\2\0\10\7\1\0\2\7\20\0\2\7\1\0"+
    "\1\7\4\0\2\7\1\105\7\7\1\0\2\7\2\0"+
    "\10\7\1\0\2\7\20\0\2\7\1\0\1\7\4\0"+
    "\11\7\1\106\1\0\2\7\2\0\10\7\1\0\2\7"+
    "\20\0\2\7\1\0\1\7\4\0\3\7\1\107\6\7"+
    "\1\0\2\7\2\0\10\7\1\0\2\7\20\0\2\7"+
    "\1\0\1\7\4\0\11\7\1\110\1\0\2\7\2\0"+
    "\10\7\1\0\2\7\20\0\2\7\1\0\1\7\4\0"+
    "\2\7\1\111\7\7\1\0\2\7\2\0\5\7\1\112"+
    "\2\7\1\0\2\7\20\0\2\7\1\0\1\7\4\0"+
    "\3\7\1\113\6\7\1\0\1\114\1\7\2\0\10\7"+
    "\1\0\2\7\20\0\2\7\1\0\1\7\4\0\1\7"+
    "\1\115\1\7\1\116\5\7\1\117\1\0\2\7\2\0"+
    "\10\7\1\0\2\7\22\0\1\120\41\0\1\42\61\0"+
    "\1\42\3\0\2\45\1\0\2\45\1\0\1\121\54\45"+
    "\1\122\1\4\2\122\1\4\1\121\1\122\53\45\1\123"+
    "\1\52\1\123\1\50\1\52\1\121\1\50\55\45\1\124"+
    "\56\45\1\0\1\4\1\52\1\4\2\52\1\0\1\52"+
    "\52\0\2\53\2\0\56\53\11\54\1\125\50\54\12\0"+
    "\1\7\1\126\1\127\1\7\1\127\3\0\12\7\1\0"+
    "\2\7\2\0\10\7\1\0\2\7\21\0\1\130\61\0"+
    "\1\57\1\0\1\131\1\0\1\56\54\0\2\7\1\0"+
    "\1\7\4\0\12\7\1\0\1\132\1\7\2\0\10\7"+
    "\1\0\2\7\26\0\1\133\61\0\1\63\62\0\1\65"+
    "\52\0\2\7\1\0\1\7\4\0\2\7\1\134\7\7"+
    "\1\0\2\7\2\0\10\7\1\0\2\7\20\0\2\7"+
    "\1\0\1\7\4\0\1\7\1\135\10\7\1\0\2\7"+
    "\2\0\10\7\1\0\2\7\20\0\2\7\1\0\1\136"+
    "\4\0\12\7\1\0\1\137\1\7\2\0\7\7\1\140"+
    "\1\0\2\7\20\0\2\7\1\0\1\136\4\0\12\7"+
    "\1\0\2\7\2\0\7\7\1\140\1\0\2\7\20\0"+
    "\2\7\1\0\1\7\4\0\12\7\1\0\2\7\2\0"+
    "\2\7\1\141\5\7\1\0\2\7\20\0\2\7\1\0"+
    "\1\7\4\0\11\7\1\142\1\0\2\7\2\0\10\7"+
    "\1\0\2\7\20\0\2\7\1\0\1\7\4\0\3\7"+
    "\1\143\1\7\1\144\4\7\1\0\2\7\2\0\10\7"+
    "\1\0\2\7\20\0\2\7\1\0\1\7\4\0\12\7"+
    "\1\0\1\7\1\62\2\0\1\145\7\7\1\0\2\7"+
    "\20\0\2\7\1\0\1\7\4\0\12\7\1\0\1\7"+
    "\1\146\2\0\10\7\1\0\2\7\20\0\2\7\1\0"+
    "\1\7\4\0\12\7\1\0\2\7\2\0\2\7\1\147"+
    "\5\7\1\0\2\7\20\0\2\7\1\0\1\7\4\0"+
    "\1\150\11\7\1\0\2\7\2\0\10\7\1\0\2\7"+
    "\20\0\2\7\1\0\1\7\4\0\7\7\1\151\2\7"+
    "\1\0\2\7\2\0\10\7\1\0\2\7\20\0\2\7"+
    "\1\0\1\7\4\0\12\7\1\0\1\7\1\152\2\0"+
    "\2\7\1\153\5\7\1\0\2\7\20\0\2\7\1\0"+
    "\1\7\4\0\12\7\1\0\1\7\1\154\2\0\10\7"+
    "\1\0\2\7\20\0\2\7\1\0\1\7\4\0\12\7"+
    "\1\0\2\7\2\0\6\7\1\155\1\7\1\0\2\7"+
    "\20\0\2\7\1\0\1\7\4\0\11\7\1\156\1\0"+
    "\2\7\2\0\10\7\1\0\2\7\20\0\2\7\1\0"+
    "\1\7\4\0\1\7\1\157\10\7\1\0\2\7\2\0"+
    "\10\7\1\0\2\7\20\0\2\7\1\0\1\7\4\0"+
    "\2\7\1\160\7\7\1\0\2\7\2\0\10\7\1\0"+
    "\2\7\20\0\2\7\1\0\1\7\4\0\12\7\1\0"+
    "\1\7\1\161\2\0\10\7\1\0\2\7\20\0\2\7"+
    "\1\0\1\7\4\0\1\7\1\162\10\7\1\0\2\7"+
    "\2\0\10\7\1\0\2\7\20\0\2\7\1\0\1\7"+
    "\4\0\11\7\1\163\1\0\2\7\2\0\10\7\1\0"+
    "\2\7\20\0\2\7\1\0\1\7\4\0\12\7\1\0"+
    "\2\7\2\0\1\145\7\7\1\0\2\7\20\0\2\7"+
    "\1\0\1\7\4\0\5\7\1\164\4\7\1\0\2\7"+
    "\2\0\10\7\1\0\2\7\6\0\1\45\1\123\1\4"+
    "\2\123\1\4\1\121\1\123\57\45\1\0\1\121\53\45"+
    "\10\54\1\165\1\125\50\54\12\0\1\7\1\126\1\0"+
    "\1\7\4\0\12\7\1\0\2\7\2\0\10\7\1\0"+
    "\2\7\21\0\1\166\61\0\1\130\1\0\1\131\57\0"+
    "\1\166\1\127\1\0\1\127\55\0\2\7\1\0\1\7"+
    "\4\0\3\7\1\167\6\7\1\0\2\7\2\0\10\7"+
    "\1\0\2\7\20\0\2\7\1\0\1\7\4\0\3\7"+
    "\1\170\6\7\1\0\2\7\2\0\10\7\1\0\2\7"+
    "\20\0\2\7\1\0\1\7\4\0\3\7\1\171\6\7"+
    "\1\0\2\7\2\0\10\7\1\0\2\7\20\0\2\7"+
    "\1\0\1\7\4\0\12\7\1\0\2\7\2\0\1\172"+
    "\7\7\1\0\2\7\20\0\2\7\1\0\1\7\4\0"+
    "\11\7\1\173\1\0\2\7\2\0\10\7\1\0\2\7"+
    "\20\0\2\7\1\0\1\174\4\0\12\7\1\0\2\7"+
    "\2\0\10\7\1\0\2\7\20\0\2\7\1\0\1\7"+
    "\4\0\1\7\1\175\10\7\1\0\2\7\2\0\10\7"+
    "\1\0\2\7\20\0\2\7\1\0\1\7\4\0\1\7"+
    "\1\176\10\7\1\0\2\7\2\0\10\7\1\0\2\7"+
    "\20\0\2\7\1\0\1\7\4\0\1\7\1\177\10\7"+
    "\1\0\2\7\2\0\10\7\1\0\2\7\20\0\2\7"+
    "\1\0\1\7\4\0\6\7\1\170\3\7\1\0\2\7"+
    "\2\0\10\7\1\0\2\7\20\0\2\7\1\0\1\200"+
    "\4\0\12\7\1\0\2\7\2\0\10\7\1\0\2\7"+
    "\20\0\2\7\1\0\1\7\4\0\12\7\1\0\2\7"+
    "\2\0\3\7\1\201\4\7\1\0\2\7\20\0\2\7"+
    "\1\0\1\7\4\0\5\7\1\202\4\7\1\0\2\7"+
    "\2\0\10\7\1\0\2\7\20\0\2\7\1\0\1\7"+
    "\4\0\12\7\1\0\1\203\1\7\2\0\10\7\1\0"+
    "\2\7\20\0\2\7\1\0\1\7\4\0\12\7\1\0"+
    "\2\7\2\0\1\204\7\7\1\0\2\7\20\0\2\7"+
    "\1\0\1\7\4\0\12\7\1\0\1\175\1\7\2\0"+
    "\10\7\1\0\2\7\20\0\2\7\1\0\1\7\4\0"+
    "\12\7\1\0\2\7\2\0\1\205\7\7\1\0\2\7"+
    "\20\0\2\7\1\0\1\7\4\0\2\7\1\206\7\7"+
    "\1\0\2\7\2\0\10\7\1\0\2\7\20\0\2\7"+
    "\1\0\1\7\4\0\3\7\1\207\6\7\1\0\2\7"+
    "\2\0\10\7\1\0\2\7\20\0\2\7\1\0\1\7"+
    "\4\0\11\7\1\210\1\0\2\7\2\0\10\7\1\0"+
    "\2\7\20\0\2\7\1\0\1\7\4\0\5\7\1\211"+
    "\4\7\1\0\2\7\2\0\10\7\1\0\2\7\20\0"+
    "\2\7\1\0\1\7\4\0\12\7\1\0\2\7\2\0"+
    "\3\7\1\212\4\7\1\0\1\213\1\7\20\0\2\7"+
    "\1\0\1\7\4\0\1\7\1\62\10\7\1\0\2\7"+
    "\2\0\10\7\1\0\2\7\20\0\2\7\1\0\1\214"+
    "\4\0\12\7\1\0\2\7\2\0\10\7\1\0\2\7"+
    "\20\0\2\7\1\0\1\7\4\0\2\7\1\215\7\7"+
    "\1\0\2\7\2\0\10\7\1\0\2\7\20\0\2\7"+
    "\1\0\1\7\4\0\12\7\1\0\2\7\2\0\6\7"+
    "\1\200\1\7\1\0\2\7\20\0\2\7\1\0\1\7"+
    "\4\0\5\7\1\216\4\7\1\0\2\7\2\0\10\7"+
    "\1\0\2\7\20\0\2\7\1\0\1\7\4\0\12\7"+
    "\1\0\1\217\1\7\2\0\10\7\1\0\2\7\20\0"+
    "\2\7\1\0\1\220\4\0\12\7\1\0\2\7\2\0"+
    "\10\7\1\0\2\7\20\0\2\7\1\0\1\7\4\0"+
    "\12\7\1\0\2\7\2\0\6\7\1\62\1\7\1\0"+
    "\2\7\20\0\2\7\1\0\1\62\4\0\12\7\1\0"+
    "\2\7\2\0\10\7\1\0\2\7\20\0\2\7\1\0"+
    "\1\7\4\0\12\7\1\0\1\221\1\7\2\0\10\7"+
    "\1\0\2\7\20\0\2\7\1\0\1\7\4\0\12\7"+
    "\1\0\1\62\1\7\2\0\10\7\1\0\2\7\15\0"+
    "\1\222\2\0\2\7\1\0\1\7\4\0\12\7\1\0"+
    "\2\7\2\0\10\7\1\0\2\7\20\0\2\7\1\0"+
    "\1\223\4\0\12\7\1\0\2\7\2\0\10\7\1\0"+
    "\2\7\20\0\2\7\1\0\1\224\4\0\12\7\1\0"+
    "\2\7\2\0\1\7\1\224\6\7\1\0\2\7\20\0"+
    "\2\7\1\0\1\7\4\0\12\7\1\0\2\7\2\0"+
    "\3\7\1\225\4\7\1\0\2\7\20\0\2\7\1\0"+
    "\1\7\4\0\12\7\1\0\1\7\1\226\2\0\10\7"+
    "\1\0\2\7\20\0\2\7\1\0\1\7\4\0\12\7"+
    "\1\0\1\7\1\62\2\0\10\7\1\0\2\7\20\0"+
    "\2\7\1\0\1\7\4\0\12\7\1\0\2\7\2\0"+
    "\3\7\1\227\4\7\1\0\2\7\20\0\2\7\1\0"+
    "\1\230\4\0\12\7\1\0\2\7\2\0\1\7\1\230"+
    "\6\7\1\0\2\7\20\0\2\7\1\0\1\7\4\0"+
    "\1\7\1\231\10\7\1\0\2\7\2\0\10\7\1\0"+
    "\2\7\20\0\2\7\1\0\1\7\4\0\1\7\1\172"+
    "\10\7\1\0\2\7\2\0\10\7\1\0\2\7\20\0"+
    "\2\7\1\0\1\7\4\0\12\7\1\0\2\7\2\0"+
    "\2\7\1\232\5\7\1\0\2\7\20\0\2\7\1\0"+
    "\1\7\4\0\1\7\1\233\10\7\1\0\2\7\2\0"+
    "\10\7\1\0\2\7\20\0\2\7\1\0\1\164\4\0"+
    "\12\7\1\0\2\7\2\0\10\7\1\0\2\7\15\0"+
    "\1\234\2\0\2\7\1\0\1\7\4\0\12\7\1\0"+
    "\2\7\2\0\10\7\1\0\2\7\20\0\2\7\1\0"+
    "\1\7\4\0\3\7\1\161\6\7\1\0\2\7\2\0"+
    "\10\7\1\0\2\7\61\0\1\235\20\0\2\7\1\0"+
    "\1\7\4\0\2\7\1\236\7\7\1\0\2\7\2\0"+
    "\10\7\1\0\2\7\20\0\2\7\1\0\1\237\4\0"+
    "\12\7\1\0\2\7\2\0\10\7\1\0\2\7\20\0"+
    "\2\7\1\0\1\7\4\0\12\7\1\0\1\240\1\7"+
    "\2\0\10\7\1\0\2\7\20\0\2\7\1\0\1\172"+
    "\4\0\12\7\1\0\2\7\2\0\10\7\1\0\2\7"+
    "\20\0\2\7\1\0\1\7\4\0\12\7\1\0\1\241"+
    "\1\7\2\0\10\7\1\0\2\7\20\0\2\7\1\0"+
    "\1\7\4\0\7\7\1\241\2\7\1\0\2\7\2\0"+
    "\10\7\1\0\2\7\20\0\2\7\1\0\1\7\4\0"+
    "\2\7\1\242\7\7\1\0\2\7\2\0\10\7\1\0"+
    "\2\7\20\0\2\7\1\0\1\7\4\0\12\7\1\0"+
    "\2\7\2\0\1\243\7\7\1\0\2\7\20\0\2\7"+
    "\1\0\1\7\4\0\12\7\1\0\1\7\1\217\2\0"+
    "\10\7\1\0\2\7\37\0\1\244\57\0\1\245\44\0"+
    "\2\7\1\0\1\7\4\0\5\7\1\220\4\7\1\0"+
    "\2\7\2\0\10\7\1\0\2\7\20\0\2\7\1\0"+
    "\1\7\4\0\12\7\1\0\1\7\1\172\2\0\10\7"+
    "\1\0\2\7\20\0\2\7\1\0\1\246\4\0\12\7"+
    "\1\0\2\7\2\0\4\7\1\246\3\7\1\0\2\7"+
    "\20\0\2\7\1\0\1\7\4\0\5\7\1\143\4\7"+
    "\1\0\2\7\2\0\10\7\1\0\2\7\20\0\2\7"+
    "\1\0\1\7\4\0\10\7\1\247\1\7\1\0\2\7"+
    "\2\0\10\7\1\0\2\7\20\0\2\7\1\0\1\176"+
    "\4\0\12\7\1\0\2\7\2\0\10\7\1\0\2\7"+
    "\23\0\1\250\61\0\1\251\56\0\2\7\1\0\1\7"+
    "\4\0\1\7\1\226\10\7\1\0\2\7\2\0\10\7"+
    "\1\0\2\7\20\0\2\7\1\0\1\7\4\0\10\7"+
    "\1\177\1\7\1\0\2\7\2\0\10\7\1\0\2\7"+
    "\6\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7050];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\2\1\1\11\4\1\1\11\11\1\1\11"+
    "\2\1\2\11\6\1\3\11\13\1\1\0\4\1\1\0"+
    "\1\1\1\0\32\1\1\11\1\0\5\1\1\0\1\1"+
    "\1\0\1\1\1\11\31\1\1\11\34\1\1\0\11\1"+
    "\2\0\6\1\2\0\2\1\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[169];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  NaturalLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return TokenType.BAD_CHARACTER;
            } 
            // fall through
          case 29: break;
          case 2: 
            { yybegin(YYINITIAL); return TokenType.WHITE_SPACE;
            } 
            // fall through
          case 30: break;
          case 3: 
            { yybegin(YYINITIAL); return NaturalTypes.REAL_DIVISION;
            } 
            // fall through
          case 31: break;
          case 4: 
            { yybegin(YYINITIAL); return NaturalTypes.MULTIPLICATION;
            } 
            // fall through
          case 32: break;
          case 5: 
            { yybegin(YYINITIAL); return NaturalTypes.KEY;
            } 
            // fall through
          case 33: break;
          case 6: 
            { yybegin(YYINITIAL); return NaturalTypes.NUMBER_INT;
            } 
            // fall through
          case 34: break;
          case 7: 
            { yybegin(YYINITIAL); return NaturalTypes.SOUSTRACTION;
            } 
            // fall through
          case 35: break;
          case 8: 
            { yybegin(YYINITIAL); return NaturalTypes.KEYWORD;
            } 
            // fall through
          case 36: break;
          case 9: 
            { yybegin(YYINITIAL); return NaturalTypes.ADDITION;
            } 
            // fall through
          case 37: break;
          case 10: 
            { yybegin(YYINITIAL); return NaturalTypes.TYPES;
            } 
            // fall through
          case 38: break;
          case 11: 
            { yybegin(YYINITIAL); return NaturalTypes.INT_MODULO;
            } 
            // fall through
          case 39: break;
          case 12: 
            { yybegin(YYINITIAL); return NaturalTypes.LPAREN;
            } 
            // fall through
          case 40: break;
          case 13: 
            { yybegin(YYINITIAL); return NaturalTypes.RPAREN;
            } 
            // fall through
          case 41: break;
          case 14: 
            { yybegin(YYINITIAL); return NaturalTypes.OTHER_OPERATORS;
            } 
            // fall through
          case 42: break;
          case 15: 
            { yybegin(YYINITIAL); return NaturalTypes.COMMA;
            } 
            // fall through
          case 43: break;
          case 16: 
            { yybegin(YYINITIAL); return NaturalTypes.SEMICOLON;
            } 
            // fall through
          case 44: break;
          case 17: 
            { yybegin(YYINITIAL); return NaturalTypes.VALUE;
            } 
            // fall through
          case 45: break;
          case 18: 
            { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE;
            } 
            // fall through
          case 46: break;
          case 19: 
            { yybegin(YYINITIAL); return NaturalTypes.COMMENT;
            } 
            // fall through
          case 47: break;
          case 20: 
            { yybegin(YYINITIAL); return NaturalTypes.BOOL_AND;
            } 
            // fall through
          case 48: break;
          case 21: 
            { yybegin(YYINITIAL); return NaturalTypes.CHARACTER;
            } 
            // fall through
          case 49: break;
          case 22: 
            { yybegin(YYINITIAL); return NaturalTypes.STRING;
            } 
            // fall through
          case 50: break;
          case 23: 
            { yybegin(YYINITIAL); return NaturalTypes.BOOL_OR;
            } 
            // fall through
          case 51: break;
          case 24: 
            { yybegin(YYINITIAL); return NaturalTypes.AFFECTATION;
            } 
            // fall through
          case 52: break;
          case 25: 
            { yybegin(YYINITIAL); return NaturalTypes.NUMBER_REAL;
            } 
            // fall through
          case 53: break;
          case 26: 
            { yybegin(YYINITIAL); return NaturalTypes.INT_DIVISION;
            } 
            // fall through
          case 54: break;
          case 27: 
            { yybegin(YYINITIAL); return NaturalTypes.BOOL_NO;
            } 
            // fall through
          case 55: break;
          case 28: 
            { yybegin(YYINITIAL); return NaturalTypes.BOOLEAN;
            } 
            // fall through
          case 56: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}