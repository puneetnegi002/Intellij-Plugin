package com.thoughtworks.gauge.lexer;/* The following code was generated by JFlex 1.4.3 on 5/23/14 2:40 PM */

import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static com.thoughtworks.gauge.language.token.SpecTokenTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 5/29/14 12:23 PM from the specification file
 * <tt>/Users/karthikl/Projects/newTwist/Gauge-Java-Intellij/src/com/thoughtworks/gauge/lexer/_SpecLexer.flex</tt>
 */
public class _SpecLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int INSTEP = 2;
  public static final int INDYNAMICTABLEITEM = 14;
  public static final int INDYNAMIC = 6;
  public static final int INARG = 4;
  public static final int YYINITIAL = 0;
  public static final int INTABLEBODY = 10;
  public static final int INTABLEBODYROW = 12;
  public static final int INTABLEHEADER = 8;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7, 7
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\2\1\0\1\3\1\1\22\0\1\3\1\0\1\12"+
    "\1\5\6\0\1\10\2\0\1\6\16\0\1\11\1\7\1\14\35\0"+
    "\1\13\37\0\1\4\uff83\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\0\1\5\1\3"+
    "\4\6\1\7\1\10\1\11\1\1\2\12\1\13\1\14"+
    "\1\2\1\15\1\2\2\3\1\16\1\4\2\17\1\20"+
    "\1\4\1\21\1\22\1\23\2\24\1\5\1\22\1\25"+
    "\1\23\1\26\3\0\1\27\1\10\1\0\3\10\1\27"+
    "\1\0\2\27\2\10\2\27";

  private static int [] zzUnpackAction() {
    int [] result = new int[58];
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
    "\0\0\0\15\0\32\0\47\0\64\0\101\0\116\0\133"+
    "\0\150\0\165\0\202\0\217\0\150\0\234\0\251\0\266"+
    "\0\303\0\320\0\320\0\320\0\335\0\320\0\352\0\367"+
    "\0\u0104\0\320\0\u0111\0\u011e\0\u012b\0\320\0\u0138\0\320"+
    "\0\320\0\u0145\0\u0152\0\u015f\0\u016c\0\u0179\0\320\0\u0186"+
    "\0\320\0\150\0\165\0\202\0\u0193\0\u01a0\0\217\0\u01ad"+
    "\0\u01ba\0\202\0\u01c7\0\251\0\u01d4\0\320\0\u01e1\0\320"+
    "\0\u01ee\0\202";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[58];
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
    "\1\11\1\12\1\13\1\14\1\15\1\16\2\11\1\17"+
    "\4\11\1\20\1\21\1\22\5\20\1\0\1\23\1\24"+
    "\2\20\12\25\1\26\1\27\1\25\13\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\33\1\36\6\33\1\37\1\33"+
    "\4\40\1\41\10\40\1\42\1\43\1\44\1\45\1\41"+
    "\1\42\1\46\2\42\1\47\1\42\1\50\1\42\13\30"+
    "\1\31\1\51\1\52\1\53\1\54\12\52\2\0\1\54"+
    "\3\0\1\55\1\56\13\0\1\55\1\56\5\0\1\52"+
    "\1\53\1\54\1\57\1\52\1\16\7\52\1\60\1\61"+
    "\1\62\2\60\1\63\7\60\1\52\1\53\1\54\1\64"+
    "\4\52\1\11\4\52\1\20\2\0\5\20\3\0\2\20"+
    "\2\0\1\22\27\0\12\25\1\0\1\27\14\25\1\27"+
    "\1\25\13\30\1\31\1\0\13\30\1\31\1\30\1\33"+
    "\2\0\1\33\1\0\6\33\1\37\1\33\2\0\2\35"+
    "\14\0\1\35\11\0\1\33\2\0\10\33\1\37\1\33"+
    "\1\42\2\0\1\42\1\0\1\42\1\0\2\42\1\0"+
    "\1\42\1\50\1\42\2\0\2\44\14\0\1\44\11\0"+
    "\1\42\2\0\1\45\1\0\1\42\1\0\2\42\1\0"+
    "\1\42\1\50\1\42\6\0\1\46\6\0\1\42\2\0"+
    "\3\42\1\0\2\42\1\0\1\42\1\50\1\42\1\0"+
    "\1\65\1\66\3\0\1\55\7\0\1\67\1\70\4\0"+
    "\1\56\5\0\1\60\1\61\1\62\12\60\2\0\1\62"+
    "\3\0\1\55\1\56\5\0\1\63\1\71\1\72\12\63"+
    "\2\0\1\66\14\0\1\70\14\0\1\72\3\0\1\55"+
    "\1\56\5\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[507];
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
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\4\1\1\0\13\1\3\11\1\1\1\11\3\1"+
    "\1\11\3\1\1\11\1\1\2\11\5\1\1\11\1\1"+
    "\1\11\3\0\2\1\1\0\4\1\1\0\1\1\1\11"+
    "\1\1\1\11\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[58];
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

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

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

  /* user code: */
  public _SpecLexer() {
    this((java.io.Reader)null);
  }


  public _SpecLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public _SpecLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 48) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
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
   * Returns the character at position <tt>pos</tt> from the
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
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
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
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
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
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 4: 
          { yybegin(INTABLEHEADER); return TABLE_HEADER;
          }
        case 24: break;
        case 6: 
          { return COMMENT;
          }
        case 25: break;
        case 10: 
          { yybegin(YYINITIAL); return STEP;
          }
        case 26: break;
        case 14: 
          { yybegin(INSTEP); return DYNAMIC_ARG_END;
          }
        case 27: break;
        case 23: 
          { return SCENARIO_HEADING;
          }
        case 28: break;
        case 21: 
          { yybegin(INDYNAMICTABLEITEM); return DYNAMIC_ARG_START;
          }
        case 29: break;
        case 19: 
          { yybegin(INTABLEBODYROW); return TABLE_ROW_VALUE;
          }
        case 30: break;
        case 5: 
          { yybegin(INTABLEBODYROW); return WHITESPACE;
          }
        case 31: break;
        case 17: 
          { yypushback(1); yybegin(YYINITIAL);
          }
        case 32: break;
        case 3: 
          { return DYNAMIC_ARG;
          }
        case 33: break;
        case 20: 
          { yybegin(INTABLEBODY); return NEW_LINE;
          }
        case 34: break;
        case 7: 
          { yybegin(INTABLEHEADER);return TABLE_BORDER;
          }
        case 35: break;
        case 12: 
          { yybegin(INARG); return ARG_START;
          }
        case 36: break;
        case 2: 
          { return ARG;
          }
        case 37: break;
        case 13: 
          { yybegin(INSTEP); return ARG_END;
          }
        case 38: break;
        case 16: 
          { yybegin(INTABLEHEADER); return TABLE_BORDER;
          }
        case 39: break;
        case 15: 
          { yybegin(INTABLEBODY);return NEW_LINE;
          }
        case 40: break;
        case 8: 
          { return SPEC_HEADING;
          }
        case 41: break;
        case 18: 
          { yybegin(INTABLEBODYROW); return TABLE_BORDER;
          }
        case 42: break;
        case 9: 
          { yybegin(INSTEP);return STEP_IDENTIFIER;
          }
        case 43: break;
        case 1: 
          { yybegin(INSTEP); return STEP;
          }
        case 44: break;
        case 11: 
          { yybegin(INDYNAMIC); return DYNAMIC_ARG_START;
          }
        case 45: break;
        case 22: 
          { yybegin(INTABLEBODYROW); return DYNAMIC_ARG_END;
          }
        case 46: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
