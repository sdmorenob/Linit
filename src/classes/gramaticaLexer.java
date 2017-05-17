// Generated from Gramatica.g4 by ANTLR 4.6
package classes;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LINE_COMMENT=1, WS=2, PROCEDIMIENTO=3, IMPORTA=4, EXPORTA=5, VARIABLE=6, 
		CONSTANTE=7, ENTERA=8, REAL=9, LOGICA=10, CARACTERES=11, Y=12, SIGNOY=13, 
		O=14, SIGNOO=15, MENOR=16, SIGNOMENOR=17, MENORIGUAL=18, SIGNOMENORIGUAL=19, 
		MAYOR=20, SIGNOMAYOR=21, MAYORIGUAL=22, SIGNOMAYORIGUAL=23, IGUAL=24, 
		SIGNOIGUAL=25, DIFERENTE=26, SIGNODIFERENTE=27, SUMA=28, RESTA=29, MULTIPLICACION=30, 
		DIVISION=31, MODULO=32, POTENCIA=33, NO=34, IZQUIERDO=35, DERECHO=36, 
		ENTERO=37, NREAL=38, VERDADERO=39, FALSO=40, FRASE=41, PUNTO=42, AREGLO=43, 
		CUADRADOI=44, CUADRADOD=45, PYC=46, SI=47, ES=48, DP=49, SINO=50, OTROCASO=51, 
		REPETIR=52, MIENTRAS=53, SEA=54, VECES=55, FIN=56, IMPRIMIR=57, CAPTURAR=58, 
		IDENTIFICADOR=59;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LINE_COMMENT", "WS", "PROCEDIMIENTO", "IMPORTA", "EXPORTA", "VARIABLE", 
		"CONSTANTE", "ENTERA", "REAL", "LOGICA", "CARACTERES", "Y", "SIGNOY", 
		"O", "SIGNOO", "MENOR", "SIGNOMENOR", "MENORIGUAL", "SIGNOMENORIGUAL", 
		"MAYOR", "SIGNOMAYOR", "MAYORIGUAL", "SIGNOMAYORIGUAL", "IGUAL", "SIGNOIGUAL", 
		"DIFERENTE", "SIGNODIFERENTE", "SUMA", "RESTA", "MULTIPLICACION", "DIVISION", 
		"MODULO", "POTENCIA", "NO", "IZQUIERDO", "DERECHO", "ENTERO", "NREAL", 
		"VERDADERO", "FALSO", "FRASE", "PUNTO", "AREGLO", "CUADRADOI", "CUADRADOD", 
		"PYC", "SI", "ES", "DP", "SINO", "OTROCASO", "REPETIR", "MIENTRAS", "SEA", 
		"VECES", "FIN", "IMPRIMIR", "CAPTURAR", "IDENTIFICADOR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "'/\\'", null, "'\\/'", null, "'<'", null, "'<='", null, "'>'", 
		null, "'>='", null, "'='", null, "'/='", "'+'", "'-'", "'*'", "'/'", null, 
		"'**'", null, "'('", "')'", null, null, null, null, null, "'.'", null, 
		"'['", "']'", "';'", null, null, "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LINE_COMMENT", "WS", "PROCEDIMIENTO", "IMPORTA", "EXPORTA", "VARIABLE", 
		"CONSTANTE", "ENTERA", "REAL", "LOGICA", "CARACTERES", "Y", "SIGNOY", 
		"O", "SIGNOO", "MENOR", "SIGNOMENOR", "MENORIGUAL", "SIGNOMENORIGUAL", 
		"MAYOR", "SIGNOMAYOR", "MAYORIGUAL", "SIGNOMAYORIGUAL", "IGUAL", "SIGNOIGUAL", 
		"DIFERENTE", "SIGNODIFERENTE", "SUMA", "RESTA", "MULTIPLICACION", "DIVISION", 
		"MODULO", "POTENCIA", "NO", "IZQUIERDO", "DERECHO", "ENTERO", "NREAL", 
		"VERDADERO", "FALSO", "FRASE", "PUNTO", "AREGLO", "CUADRADOI", "CUADRADOD", 
		"PYC", "SI", "ES", "DP", "SINO", "OTROCASO", "REPETIR", "MIENTRAS", "SEA", 
		"VECES", "FIN", "IMPRIMIR", "CAPTURAR", "IDENTIFICADOR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2=\u020c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\2\3\2\7\2~\n\2\f\2\16\2\u0081\13\2\3\2\3\2\3\3\6\3\u0086\n\3\r\3"+
		"\16\3\u0087\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3"+
		"$\3%\3%\3&\5&\u0167\n&\3&\6&\u016a\n&\r&\16&\u016b\3\'\5\'\u016f\n\'\3"+
		"\'\6\'\u0172\n\'\r\'\16\'\u0173\3\'\3\'\6\'\u0178\n\'\r\'\16\'\u0179\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\7*\u018e\n*\f*\16"+
		"*\u0191\13*\3*\3*\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3.\3.\3/\3/\3\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\67\3\67\3\67\3\67\38\38\38\38\38\38\39\39\39\39\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\7<\u0208\n<\f<\16<\u020b\13<\3\u018f"+
		"\2=\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=\3\2*\4\2\f\f\17\17\5\2\13\f\17\17\"\"\3\2RR\4\2TTtt\4\2Q"+
		"Qqq\4\2EEee\4\2GGgg\4\2FFff\4\2KKkk\4\2OOoo\4\2PPpp\4\2VVvv\3\2KK\4\2"+
		"RRrr\4\2CCcc\3\2GG\4\2ZZzz\3\2XX\4\2DDdd\4\2NNnn\3\2EE\4\2UUuu\3\2TT\3"+
		"\2NN\4\2IIii\3\2FF\3\2\"\"\3\2[[\3\2QQ\3\2OO\4\2WWww\4\2[[{{\3\2CC\4\2"+
		"HHhh\3\2PP\3\2UU\3\2\62;\3\2HH\3\2c|\5\2\62;C\\c|\u0214\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2"+
		"q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3y\3\2\2\2\5\u0085\3\2\2\2"+
		"\7\u008b\3\2\2\2\t\u0099\3\2\2\2\13\u00a1\3\2\2\2\r\u00a9\3\2\2\2\17\u00b2"+
		"\3\2\2\2\21\u00bc\3\2\2\2\23\u00c3\3\2\2\2\25\u00c8\3\2\2\2\27\u00cf\3"+
		"\2\2\2\31\u00dd\3\2\2\2\33\u00df\3\2\2\2\35\u00e2\3\2\2\2\37\u00e4\3\2"+
		"\2\2!\u00e7\3\2\2\2#\u00f0\3\2\2\2%\u00f2\3\2\2\2\'\u0103\3\2\2\2)\u0106"+
		"\3\2\2\2+\u010f\3\2\2\2-\u0111\3\2\2\2/\u0122\3\2\2\2\61\u0125\3\2\2\2"+
		"\63\u0130\3\2\2\2\65\u0132\3\2\2\2\67\u0142\3\2\2\29\u0145\3\2\2\2;\u0147"+
		"\3\2\2\2=\u0149\3\2\2\2?\u014b\3\2\2\2A\u014d\3\2\2\2C\u0154\3\2\2\2E"+
		"\u0157\3\2\2\2G\u0161\3\2\2\2I\u0163\3\2\2\2K\u0166\3\2\2\2M\u016e\3\2"+
		"\2\2O\u017b\3\2\2\2Q\u0185\3\2\2\2S\u018b\3\2\2\2U\u0194\3\2\2\2W\u0196"+
		"\3\2\2\2Y\u019e\3\2\2\2[\u01a0\3\2\2\2]\u01a2\3\2\2\2_\u01a4\3\2\2\2a"+
		"\u01a7\3\2\2\2c\u01aa\3\2\2\2e\u01ac\3\2\2\2g\u01b1\3\2\2\2i\u01be\3\2"+
		"\2\2k\u01c6\3\2\2\2m\u01cf\3\2\2\2o\u01d3\3\2\2\2q\u01d9\3\2\2\2s\u01dd"+
		"\3\2\2\2u\u01f1\3\2\2\2w\u0205\3\2\2\2yz\7@\2\2z{\7@\2\2{\177\3\2\2\2"+
		"|~\n\2\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\b\2\2\2\u0083\4\3\2\2\2\u0084"+
		"\u0086\t\3\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\b\3\2\2\u008a"+
		"\6\3\2\2\2\u008b\u008c\t\4\2\2\u008c\u008d\t\5\2\2\u008d\u008e\t\6\2\2"+
		"\u008e\u008f\t\7\2\2\u008f\u0090\t\b\2\2\u0090\u0091\t\t\2\2\u0091\u0092"+
		"\t\n\2\2\u0092\u0093\t\13\2\2\u0093\u0094\t\n\2\2\u0094\u0095\t\b\2\2"+
		"\u0095\u0096\t\f\2\2\u0096\u0097\t\r\2\2\u0097\u0098\t\6\2\2\u0098\b\3"+
		"\2\2\2\u0099\u009a\t\16\2\2\u009a\u009b\t\13\2\2\u009b\u009c\t\17\2\2"+
		"\u009c\u009d\t\6\2\2\u009d\u009e\t\5\2\2\u009e\u009f\t\r\2\2\u009f\u00a0"+
		"\t\20\2\2\u00a0\n\3\2\2\2\u00a1\u00a2\t\21\2\2\u00a2\u00a3\t\22\2\2\u00a3"+
		"\u00a4\t\17\2\2\u00a4\u00a5\t\6\2\2\u00a5\u00a6\t\5\2\2\u00a6\u00a7\t"+
		"\r\2\2\u00a7\u00a8\t\20\2\2\u00a8\f\3\2\2\2\u00a9\u00aa\t\23\2\2\u00aa"+
		"\u00ab\t\20\2\2\u00ab\u00ac\t\5\2\2\u00ac\u00ad\t\n\2\2\u00ad\u00ae\t"+
		"\20\2\2\u00ae\u00af\t\24\2\2\u00af\u00b0\t\25\2\2\u00b0\u00b1\t\b\2\2"+
		"\u00b1\16\3\2\2\2\u00b2\u00b3\t\26\2\2\u00b3\u00b4\t\6\2\2\u00b4\u00b5"+
		"\t\f\2\2\u00b5\u00b6\t\27\2\2\u00b6\u00b7\t\r\2\2\u00b7\u00b8\t\20\2\2"+
		"\u00b8\u00b9\t\f\2\2\u00b9\u00ba\t\r\2\2\u00ba\u00bb\t\b\2\2\u00bb\20"+
		"\3\2\2\2\u00bc\u00bd\t\21\2\2\u00bd\u00be\t\f\2\2\u00be\u00bf\t\r\2\2"+
		"\u00bf\u00c0\t\b\2\2\u00c0\u00c1\t\5\2\2\u00c1\u00c2\t\20\2\2\u00c2\22"+
		"\3\2\2\2\u00c3\u00c4\t\30\2\2\u00c4\u00c5\t\b\2\2\u00c5\u00c6\t\20\2\2"+
		"\u00c6\u00c7\t\25\2\2\u00c7\24\3\2\2\2\u00c8\u00c9\t\31\2\2\u00c9\u00ca"+
		"\t\6\2\2\u00ca\u00cb\t\32\2\2\u00cb\u00cc\t\n\2\2\u00cc\u00cd\t\7\2\2"+
		"\u00cd\u00ce\t\20\2\2\u00ce\26\3\2\2\2\u00cf\u00d0\t\33\2\2\u00d0\u00d1"+
		"\t\b\2\2\u00d1\u00d2\t\34\2\2\u00d2\u00d3\t\26\2\2\u00d3\u00d4\t\20\2"+
		"\2\u00d4\u00d5\t\5\2\2\u00d5\u00d6\t\20\2\2\u00d6\u00d7\t\7\2\2\u00d7"+
		"\u00d8\t\r\2\2\u00d8\u00d9\t\b\2\2\u00d9\u00da\t\5\2\2\u00da\u00db\t\b"+
		"\2\2\u00db\u00dc\t\27\2\2\u00dc\30\3\2\2\2\u00dd\u00de\t\35\2\2\u00de"+
		"\32\3\2\2\2\u00df\u00e0\7\61\2\2\u00e0\u00e1\7^\2\2\u00e1\34\3\2\2\2\u00e2"+
		"\u00e3\t\36\2\2\u00e3\36\3\2\2\2\u00e4\u00e5\7^\2\2\u00e5\u00e6\7\61\2"+
		"\2\u00e6 \3\2\2\2\u00e7\u00e8\t\21\2\2\u00e8\u00e9\t\27\2\2\u00e9\u00ea"+
		"\t\34\2\2\u00ea\u00eb\t\37\2\2\u00eb\u00ec\t\b\2\2\u00ec\u00ed\t\f\2\2"+
		"\u00ed\u00ee\t\6\2\2\u00ee\u00ef\t\5\2\2\u00ef\"\3\2\2\2\u00f0\u00f1\7"+
		">\2\2\u00f1$\3\2\2\2\u00f2\u00f3\t\21\2\2\u00f3\u00f4\t\27\2\2\u00f4\u00f5"+
		"\t\34\2\2\u00f5\u00f6\t\37\2\2\u00f6\u00f7\t\b\2\2\u00f7\u00f8\t\f\2\2"+
		"\u00f8\u00f9\t\6\2\2\u00f9\u00fa\t\5\2\2\u00fa\u00fb\t\34\2\2\u00fb\u00fc"+
		"\t\36\2\2\u00fc\u00fd\t\34\2\2\u00fd\u00fe\t\16\2\2\u00fe\u00ff\t\32\2"+
		"\2\u00ff\u0100\t \2\2\u0100\u0101\t\20\2\2\u0101\u0102\t\25\2\2\u0102"+
		"&\3\2\2\2\u0103\u0104\7>\2\2\u0104\u0105\7?\2\2\u0105(\3\2\2\2\u0106\u0107"+
		"\t\21\2\2\u0107\u0108\t\27\2\2\u0108\u0109\t\34\2\2\u0109\u010a\t\37\2"+
		"\2\u010a\u010b\t\20\2\2\u010b\u010c\t!\2\2\u010c\u010d\t\6\2\2\u010d\u010e"+
		"\t\5\2\2\u010e*\3\2\2\2\u010f\u0110\7@\2\2\u0110,\3\2\2\2\u0111\u0112"+
		"\t\21\2\2\u0112\u0113\t\27\2\2\u0113\u0114\t\34\2\2\u0114\u0115\t\37\2"+
		"\2\u0115\u0116\t\20\2\2\u0116\u0117\t!\2\2\u0117\u0118\t\6\2\2\u0118\u0119"+
		"\t\5\2\2\u0119\u011a\t\34\2\2\u011a\u011b\t\36\2\2\u011b\u011c\t\34\2"+
		"\2\u011c\u011d\t\16\2\2\u011d\u011e\t\32\2\2\u011e\u011f\t \2\2\u011f"+
		"\u0120\t\20\2\2\u0120\u0121\t\25\2\2\u0121.\3\2\2\2\u0122\u0123\7@\2\2"+
		"\u0123\u0124\7?\2\2\u0124\60\3\2\2\2\u0125\u0126\t\21\2\2\u0126\u0127"+
		"\t\27\2\2\u0127\u0128\t\34\2\2\u0128\u0129\t\16\2\2\u0129\u012a\t\32\2"+
		"\2\u012a\u012b\t \2\2\u012b\u012c\t\20\2\2\u012c\u012d\t\25\2\2\u012d"+
		"\u012e\t\34\2\2\u012e\u012f\t\"\2\2\u012f\62\3\2\2\2\u0130\u0131\7?\2"+
		"\2\u0131\64\3\2\2\2\u0132\u0133\t\21\2\2\u0133\u0134\t\27\2\2\u0134\u0135"+
		"\t\34\2\2\u0135\u0136\t\33\2\2\u0136\u0137\t\n\2\2\u0137\u0138\t#\2\2"+
		"\u0138\u0139\t\b\2\2\u0139\u013a\t\5\2\2\u013a\u013b\t\b\2\2\u013b\u013c"+
		"\t\f\2\2\u013c\u013d\t\r\2\2\u013d\u013e\t\b\2\2\u013e\u013f\t\34\2\2"+
		"\u013f\u0140\t\33\2\2\u0140\u0141\t\b\2\2\u0141\66\3\2\2\2\u0142\u0143"+
		"\7\61\2\2\u0143\u0144\7?\2\2\u01448\3\2\2\2\u0145\u0146\7-\2\2\u0146:"+
		"\3\2\2\2\u0147\u0148\7/\2\2\u0148<\3\2\2\2\u0149\u014a\7,\2\2\u014a>\3"+
		"\2\2\2\u014b\u014c\7\61\2\2\u014c@\3\2\2\2\u014d\u014e\t\37\2\2\u014e"+
		"\u014f\t\6\2\2\u014f\u0150\t\t\2\2\u0150\u0151\t \2\2\u0151\u0152\t\25"+
		"\2\2\u0152\u0153\t\6\2\2\u0153B\3\2\2\2\u0154\u0155\7,\2\2\u0155\u0156"+
		"\7,\2\2\u0156D\3\2\2\2\u0157\u0158\t$\2\2\u0158\u0159\t\6\2\2\u0159\u015a"+
		"\t\34\2\2\u015a\u015b\t%\2\2\u015b\u015c\t \2\2\u015c\u015d\t\7\2\2\u015d"+
		"\u015e\t\b\2\2\u015e\u015f\t\t\2\2\u015f\u0160\t\b\2\2\u0160F\3\2\2\2"+
		"\u0161\u0162\7*\2\2\u0162H\3\2\2\2\u0163\u0164\7+\2\2\u0164J\3\2\2\2\u0165"+
		"\u0167\7/\2\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2"+
		"\2\2\u0168\u016a\t&\2\2\u0169\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016cL\3\2\2\2\u016d\u016f\7/\2\2\u016e"+
		"\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u0172\t&"+
		"\2\2\u0171\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0171\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\7.\2\2\u0176\u0178\t&\2"+
		"\2\u0177\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a"+
		"\3\2\2\2\u017aN\3\2\2\2\u017b\u017c\t\23\2\2\u017c\u017d\t\b\2\2\u017d"+
		"\u017e\t\5\2\2\u017e\u017f\t\t\2\2\u017f\u0180\t\20\2\2\u0180\u0181\t"+
		"\t\2\2\u0181\u0182\t\b\2\2\u0182\u0183\t\5\2\2\u0183\u0184\t\6\2\2\u0184"+
		"P\3\2\2\2\u0185\u0186\t\'\2\2\u0186\u0187\t\20\2\2\u0187\u0188\t\25\2"+
		"\2\u0188\u0189\t\27\2\2\u0189\u018a\t\6\2\2\u018aR\3\2\2\2\u018b\u018f"+
		"\7$\2\2\u018c\u018e\13\2\2\2\u018d\u018c\3\2\2\2\u018e\u0191\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0192\3\2\2\2\u0191\u018f\3\2"+
		"\2\2\u0192\u0193\7$\2\2\u0193T\3\2\2\2\u0194\u0195\7\60\2\2\u0195V\3\2"+
		"\2\2\u0196\u0197\t\"\2\2\u0197\u0198\t\5\2\2\u0198\u0199\t\5\2\2\u0199"+
		"\u019a\t\b\2\2\u019a\u019b\t\32\2\2\u019b\u019c\t\25\2\2\u019c\u019d\t"+
		"\6\2\2\u019dX\3\2\2\2\u019e\u019f\7]\2\2\u019fZ\3\2\2\2\u01a0\u01a1\7"+
		"_\2\2\u01a1\\\3\2\2\2\u01a2\u01a3\7=\2\2\u01a3^\3\2\2\2\u01a4\u01a5\t"+
		"%\2\2\u01a5\u01a6\t\n\2\2\u01a6`\3\2\2\2\u01a7\u01a8\t\21\2\2\u01a8\u01a9"+
		"\t\27\2\2\u01a9b\3\2\2\2\u01aa\u01ab\7<\2\2\u01abd\3\2\2\2\u01ac\u01ad"+
		"\t\36\2\2\u01ad\u01ae\t\34\2\2\u01ae\u01af\t%\2\2\u01af\u01b0\t\n\2\2"+
		"\u01b0f\3\2\2\2\u01b1\u01b2\t\21\2\2\u01b2\u01b3\t\f\2\2\u01b3\u01b4\t"+
		"\34\2\2\u01b4\u01b5\t\36\2\2\u01b5\u01b6\t\r\2\2\u01b6\u01b7\t\5\2\2\u01b7"+
		"\u01b8\t\6\2\2\u01b8\u01b9\t\34\2\2\u01b9\u01ba\t\26\2\2\u01ba\u01bb\t"+
		"\20\2\2\u01bb\u01bc\t\27\2\2\u01bc\u01bd\t\6\2\2\u01bdh\3\2\2\2\u01be"+
		"\u01bf\t\30\2\2\u01bf\u01c0\t\b\2\2\u01c0\u01c1\t\17\2\2\u01c1\u01c2\t"+
		"\b\2\2\u01c2\u01c3\t\r\2\2\u01c3\u01c4\t\n\2\2\u01c4\u01c5\t\5\2\2\u01c5"+
		"j\3\2\2\2\u01c6\u01c7\t\37\2\2\u01c7\u01c8\t\n\2\2\u01c8\u01c9\t\b\2\2"+
		"\u01c9\u01ca\t\f\2\2\u01ca\u01cb\t\r\2\2\u01cb\u01cc\t\5\2\2\u01cc\u01cd"+
		"\t\20\2\2\u01cd\u01ce\t\27\2\2\u01cel\3\2\2\2\u01cf\u01d0\t%\2\2\u01d0"+
		"\u01d1\t\b\2\2\u01d1\u01d2\t\20\2\2\u01d2n\3\2\2\2\u01d3\u01d4\t\23\2"+
		"\2\u01d4\u01d5\t\b\2\2\u01d5\u01d6\t\7\2\2\u01d6\u01d7\t\b\2\2\u01d7\u01d8"+
		"\t\27\2\2\u01d8p\3\2\2\2\u01d9\u01da\t\'\2\2\u01da\u01db\t\n\2\2\u01db"+
		"\u01dc\t\f\2\2\u01dcr\3\2\2\2\u01dd\u01de\t\16\2\2\u01de\u01df\t\13\2"+
		"\2\u01df\u01e0\t\17\2\2\u01e0\u01e1\t\5\2\2\u01e1\u01e2\t\n\2\2\u01e2"+
		"\u01e3\t\13\2\2\u01e3\u01e4\t\n\2\2\u01e4\u01e5\t\5\2\2\u01e5\u01e6\t"+
		"\34\2\2\u01e6\u01e7\t\21\2\2\u01e7\u01e8\t\f\2\2\u01e8\u01e9\t\34\2\2"+
		"\u01e9\u01ea\t\26\2\2\u01ea\u01eb\t\6\2\2\u01eb\u01ec\t\f\2\2\u01ec\u01ed"+
		"\t\27\2\2\u01ed\u01ee\t\6\2\2\u01ee\u01ef\t\25\2\2\u01ef\u01f0\t\20\2"+
		"\2\u01f0t\3\2\2\2\u01f1\u01f2\t\26\2\2\u01f2\u01f3\t\20\2\2\u01f3\u01f4"+
		"\t\17\2\2\u01f4\u01f5\t\r\2\2\u01f5\u01f6\t \2\2\u01f6\u01f7\t\5\2\2\u01f7"+
		"\u01f8\t\20\2\2\u01f8\u01f9\t\5\2\2\u01f9\u01fa\t\34\2\2\u01fa\u01fb\t"+
		"\33\2\2\u01fb\u01fc\t\b\2\2\u01fc\u01fd\t\34\2\2\u01fd\u01fe\t\26\2\2"+
		"\u01fe\u01ff\t\6\2\2\u01ff\u0200\t\f\2\2\u0200\u0201\t\27\2\2\u0201\u0202"+
		"\t\6\2\2\u0202\u0203\t\25\2\2\u0203\u0204\t\20\2\2\u0204v\3\2\2\2\u0205"+
		"\u0209\t(\2\2\u0206\u0208\t)\2\2\u0207\u0206\3\2\2\2\u0208\u020b\3\2\2"+
		"\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020ax\3\2\2\2\u020b\u0209"+
		"\3\2\2\2\f\2\177\u0087\u0166\u016b\u016e\u0173\u0179\u018f\u0209\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}