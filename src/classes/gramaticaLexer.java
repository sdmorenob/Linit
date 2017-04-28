// Generated from gramatica.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LINE_COMMENT=1, WS=2, VARIABLE=3, CONSTANTE=4, ENTERA=5, REAL=6, LOGICA=7, 
		CARACTERES=8, Y=9, SIGNOY=10, O=11, SIGNOO=12, MENOR=13, SIGNOMENOR=14, 
		MENORIGUAL=15, SIGNOMENORIGUAL=16, MAYOR=17, SIGNOMAYOR=18, MAYORIGUAL=19, 
		SIGNOMAYORIGUAL=20, IGUAL=21, SIGNOIGUAL=22, DIFERENTE=23, SIGNODIFERENTE=24, 
		SUMA=25, RESTA=26, MULTIPLICACION=27, DIVISION=28, MODULO=29, POTENCIA=30, 
		NO=31, IZQUIERDO=32, DERECHO=33, ENTERO=34, NREAL=35, VERDADERO=36, FALSO=37, 
		FRASE=38, PUNTO=39, AREGLO=40, LONGITUD=41, CUADRADOI=42, CUADRADOD=43, 
		PYC=44, SI=45, ES=46, DP=47, SINO=48, OTROCASO=49, REPETIR=50, MIENTRAS=51, 
		SEA=52, VECES=53, FIN=54, IMPRIMIR=55, CAPTURAR=56, IDENTIFICADOR=57;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LINE_COMMENT", "WS", "VARIABLE", "CONSTANTE", "ENTERA", "REAL", "LOGICA", 
		"CARACTERES", "Y", "SIGNOY", "O", "SIGNOO", "MENOR", "SIGNOMENOR", "MENORIGUAL", 
		"SIGNOMENORIGUAL", "MAYOR", "SIGNOMAYOR", "MAYORIGUAL", "SIGNOMAYORIGUAL", 
		"IGUAL", "SIGNOIGUAL", "DIFERENTE", "SIGNODIFERENTE", "SUMA", "RESTA", 
		"MULTIPLICACION", "DIVISION", "MODULO", "POTENCIA", "NO", "IZQUIERDO", 
		"DERECHO", "ENTERO", "NREAL", "VERDADERO", "FALSO", "FRASE", "PUNTO", 
		"AREGLO", "LONGITUD", "CUADRADOI", "CUADRADOD", "PYC", "SI", "ES", "DP", 
		"SINO", "OTROCASO", "REPETIR", "MIENTRAS", "SEA", "VECES", "FIN", "IMPRIMIR", 
		"CAPTURAR", "IDENTIFICADOR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "'/\\'", null, 
		"'\\/'", null, "'<'", null, "'<='", null, "'>'", null, "'>='", null, "'='", 
		null, "'/='", "'+'", "'-'", "'*'", "'/'", null, "'**'", null, "'('", "')'", 
		null, null, null, null, null, "'.'", null, null, "'['", "']'", "';'", 
		null, null, "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LINE_COMMENT", "WS", "VARIABLE", "CONSTANTE", "ENTERA", "REAL", 
		"LOGICA", "CARACTERES", "Y", "SIGNOY", "O", "SIGNOO", "MENOR", "SIGNOMENOR", 
		"MENORIGUAL", "SIGNOMENORIGUAL", "MAYOR", "SIGNOMAYOR", "MAYORIGUAL", 
		"SIGNOMAYORIGUAL", "IGUAL", "SIGNOIGUAL", "DIFERENTE", "SIGNODIFERENTE", 
		"SUMA", "RESTA", "MULTIPLICACION", "DIVISION", "MODULO", "POTENCIA", "NO", 
		"IZQUIERDO", "DERECHO", "ENTERO", "NREAL", "VERDADERO", "FALSO", "FRASE", 
		"PUNTO", "AREGLO", "LONGITUD", "CUADRADOI", "CUADRADOD", "PYC", "SI", 
		"ES", "DP", "SINO", "OTROCASO", "REPETIR", "MIENTRAS", "SEA", "VECES", 
		"FIN", "IMPRIMIR", "CAPTURAR", "IDENTIFICADOR"
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


	public gramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2;\u01f6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\2\7"+
		"\2z\n\2\f\2\16\2}\13\2\3\2\3\2\3\3\6\3\u0082\n\3\r\3\16\3\u0083\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3!\3!\3\"\3\"\3#\5#\u0145\n#\3#\6#\u0148\n#\r#\16#\u0149\3$\5$\u014d"+
		"\n$\3$\6$\u0150\n$\r$\16$\u0151\3$\3$\6$\u0156\n$\r$\16$\u0157\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\7\'\u016c\n\'\f\'\16"+
		"\'\u016f\13\'\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\61"+
		"\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\38\38\38\38\38\38"+
		"\38\38\38\38\38\38\38\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39"+
		"\39\39\39\39\3:\3:\7:\u01f2\n:\f:\16:\u01f5\13:\3\u016d\2;\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;\3\2(\4"+
		"\2\f\f\17\17\5\2\13\f\17\17\"\"\3\2XX\4\2CCcc\4\2TTtt\4\2KKkk\4\2DDdd"+
		"\4\2NNnn\4\2GGgg\3\2EE\4\2QQqq\4\2PPpp\4\2UUuu\4\2VVvv\3\2GG\3\2TT\3\2"+
		"NN\4\2IIii\4\2EEee\3\2FF\3\2\"\"\3\2[[\3\2QQ\3\2OO\3\2KK\4\2WWww\4\2["+
		"[{{\3\2CC\4\2HHhh\4\2FFff\3\2PP\3\2UU\3\2\62;\3\2HH\4\2RRrr\4\2OOoo\3"+
		"\2c|\5\2\62;C\\c|\u01fe\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5"+
		"\u0081\3\2\2\2\7\u0087\3\2\2\2\t\u0090\3\2\2\2\13\u009a\3\2\2\2\r\u00a1"+
		"\3\2\2\2\17\u00a6\3\2\2\2\21\u00ad\3\2\2\2\23\u00bb\3\2\2\2\25\u00bd\3"+
		"\2\2\2\27\u00c0\3\2\2\2\31\u00c2\3\2\2\2\33\u00c5\3\2\2\2\35\u00ce\3\2"+
		"\2\2\37\u00d0\3\2\2\2!\u00e1\3\2\2\2#\u00e4\3\2\2\2%\u00ed\3\2\2\2\'\u00ef"+
		"\3\2\2\2)\u0100\3\2\2\2+\u0103\3\2\2\2-\u010e\3\2\2\2/\u0110\3\2\2\2\61"+
		"\u0120\3\2\2\2\63\u0123\3\2\2\2\65\u0125\3\2\2\2\67\u0127\3\2\2\29\u0129"+
		"\3\2\2\2;\u012b\3\2\2\2=\u0132\3\2\2\2?\u0135\3\2\2\2A\u013f\3\2\2\2C"+
		"\u0141\3\2\2\2E\u0144\3\2\2\2G\u014c\3\2\2\2I\u0159\3\2\2\2K\u0163\3\2"+
		"\2\2M\u0169\3\2\2\2O\u0172\3\2\2\2Q\u0174\3\2\2\2S\u017c\3\2\2\2U\u0188"+
		"\3\2\2\2W\u018a\3\2\2\2Y\u018c\3\2\2\2[\u018e\3\2\2\2]\u0191\3\2\2\2_"+
		"\u0194\3\2\2\2a\u0196\3\2\2\2c\u019b\3\2\2\2e\u01a8\3\2\2\2g\u01b0\3\2"+
		"\2\2i\u01b9\3\2\2\2k\u01bd\3\2\2\2m\u01c3\3\2\2\2o\u01c7\3\2\2\2q\u01db"+
		"\3\2\2\2s\u01ef\3\2\2\2uv\7@\2\2vw\7@\2\2w{\3\2\2\2xz\n\2\2\2yx\3\2\2"+
		"\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\b\2\2\2\177"+
		"\4\3\2\2\2\u0080\u0082\t\3\2\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2"+
		"\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086"+
		"\b\3\2\2\u0086\6\3\2\2\2\u0087\u0088\t\4\2\2\u0088\u0089\t\5\2\2\u0089"+
		"\u008a\t\6\2\2\u008a\u008b\t\7\2\2\u008b\u008c\t\5\2\2\u008c\u008d\t\b"+
		"\2\2\u008d\u008e\t\t\2\2\u008e\u008f\t\n\2\2\u008f\b\3\2\2\2\u0090\u0091"+
		"\t\13\2\2\u0091\u0092\t\f\2\2\u0092\u0093\t\r\2\2\u0093\u0094\t\16\2\2"+
		"\u0094\u0095\t\17\2\2\u0095\u0096\t\5\2\2\u0096\u0097\t\r\2\2\u0097\u0098"+
		"\t\17\2\2\u0098\u0099\t\n\2\2\u0099\n\3\2\2\2\u009a\u009b\t\20\2\2\u009b"+
		"\u009c\t\r\2\2\u009c\u009d\t\17\2\2\u009d\u009e\t\n\2\2\u009e\u009f\t"+
		"\6\2\2\u009f\u00a0\t\5\2\2\u00a0\f\3\2\2\2\u00a1\u00a2\t\21\2\2\u00a2"+
		"\u00a3\t\n\2\2\u00a3\u00a4\t\5\2\2\u00a4\u00a5\t\t\2\2\u00a5\16\3\2\2"+
		"\2\u00a6\u00a7\t\22\2\2\u00a7\u00a8\t\f\2\2\u00a8\u00a9\t\23\2\2\u00a9"+
		"\u00aa\t\7\2\2\u00aa\u00ab\t\24\2\2\u00ab\u00ac\t\5\2\2\u00ac\20\3\2\2"+
		"\2\u00ad\u00ae\t\25\2\2\u00ae\u00af\t\n\2\2\u00af\u00b0\t\26\2\2\u00b0"+
		"\u00b1\t\13\2\2\u00b1\u00b2\t\5\2\2\u00b2\u00b3\t\6\2\2\u00b3\u00b4\t"+
		"\5\2\2\u00b4\u00b5\t\24\2\2\u00b5\u00b6\t\17\2\2\u00b6\u00b7\t\n\2\2\u00b7"+
		"\u00b8\t\6\2\2\u00b8\u00b9\t\n\2\2\u00b9\u00ba\t\16\2\2\u00ba\22\3\2\2"+
		"\2\u00bb\u00bc\t\27\2\2\u00bc\24\3\2\2\2\u00bd\u00be\7\61\2\2\u00be\u00bf"+
		"\7^\2\2\u00bf\26\3\2\2\2\u00c0\u00c1\t\30\2\2\u00c1\30\3\2\2\2\u00c2\u00c3"+
		"\7^\2\2\u00c3\u00c4\7\61\2\2\u00c4\32\3\2\2\2\u00c5\u00c6\t\20\2\2\u00c6"+
		"\u00c7\t\16\2\2\u00c7\u00c8\t\26\2\2\u00c8\u00c9\t\31\2\2\u00c9\u00ca"+
		"\t\n\2\2\u00ca\u00cb\t\r\2\2\u00cb\u00cc\t\f\2\2\u00cc\u00cd\t\6\2\2\u00cd"+
		"\34\3\2\2\2\u00ce\u00cf\7>\2\2\u00cf\36\3\2\2\2\u00d0\u00d1\t\20\2\2\u00d1"+
		"\u00d2\t\16\2\2\u00d2\u00d3\t\26\2\2\u00d3\u00d4\t\31\2\2\u00d4\u00d5"+
		"\t\n\2\2\u00d5\u00d6\t\r\2\2\u00d6\u00d7\t\f\2\2\u00d7\u00d8\t\6\2\2\u00d8"+
		"\u00d9\t\26\2\2\u00d9\u00da\t\30\2\2\u00da\u00db\t\26\2\2\u00db\u00dc"+
		"\t\32\2\2\u00dc\u00dd\t\23\2\2\u00dd\u00de\t\33\2\2\u00de\u00df\t\5\2"+
		"\2\u00df\u00e0\t\t\2\2\u00e0 \3\2\2\2\u00e1\u00e2\7>\2\2\u00e2\u00e3\7"+
		"?\2\2\u00e3\"\3\2\2\2\u00e4\u00e5\t\20\2\2\u00e5\u00e6\t\16\2\2\u00e6"+
		"\u00e7\t\26\2\2\u00e7\u00e8\t\31\2\2\u00e8\u00e9\t\5\2\2\u00e9\u00ea\t"+
		"\34\2\2\u00ea\u00eb\t\f\2\2\u00eb\u00ec\t\6\2\2\u00ec$\3\2\2\2\u00ed\u00ee"+
		"\7@\2\2\u00ee&\3\2\2\2\u00ef\u00f0\t\20\2\2\u00f0\u00f1\t\16\2\2\u00f1"+
		"\u00f2\t\26\2\2\u00f2\u00f3\t\31\2\2\u00f3\u00f4\t\5\2\2\u00f4\u00f5\t"+
		"\34\2\2\u00f5\u00f6\t\f\2\2\u00f6\u00f7\t\6\2\2\u00f7\u00f8\t\26\2\2\u00f8"+
		"\u00f9\t\30\2\2\u00f9\u00fa\t\26\2\2\u00fa\u00fb\t\32\2\2\u00fb\u00fc"+
		"\t\23\2\2\u00fc\u00fd\t\33\2\2\u00fd\u00fe\t\5\2\2\u00fe\u00ff\t\t\2\2"+
		"\u00ff(\3\2\2\2\u0100\u0101\7@\2\2\u0101\u0102\7?\2\2\u0102*\3\2\2\2\u0103"+
		"\u0104\t\20\2\2\u0104\u0105\t\16\2\2\u0105\u0106\t\26\2\2\u0106\u0107"+
		"\t\32\2\2\u0107\u0108\t\23\2\2\u0108\u0109\t\33\2\2\u0109\u010a\t\5\2"+
		"\2\u010a\u010b\t\t\2\2\u010b\u010c\t\26\2\2\u010c\u010d\t\35\2\2\u010d"+
		",\3\2\2\2\u010e\u010f\7?\2\2\u010f.\3\2\2\2\u0110\u0111\t\20\2\2\u0111"+
		"\u0112\t\16\2\2\u0112\u0113\t\26\2\2\u0113\u0114\t\25\2\2\u0114\u0115"+
		"\t\7\2\2\u0115\u0116\t\36\2\2\u0116\u0117\t\n\2\2\u0117\u0118\t\6\2\2"+
		"\u0118\u0119\t\n\2\2\u0119\u011a\t\r\2\2\u011a\u011b\t\17\2\2\u011b\u011c"+
		"\t\n\2\2\u011c\u011d\t\26\2\2\u011d\u011e\t\25\2\2\u011e\u011f\t\n\2\2"+
		"\u011f\60\3\2\2\2\u0120\u0121\7\61\2\2\u0121\u0122\7?\2\2\u0122\62\3\2"+
		"\2\2\u0123\u0124\7-\2\2\u0124\64\3\2\2\2\u0125\u0126\7/\2\2\u0126\66\3"+
		"\2\2\2\u0127\u0128\7,\2\2\u01288\3\2\2\2\u0129\u012a\7\61\2\2\u012a:\3"+
		"\2\2\2\u012b\u012c\t\31\2\2\u012c\u012d\t\f\2\2\u012d\u012e\t\37\2\2\u012e"+
		"\u012f\t\33\2\2\u012f\u0130\t\t\2\2\u0130\u0131\t\f\2\2\u0131<\3\2\2\2"+
		"\u0132\u0133\7,\2\2\u0133\u0134\7,\2\2\u0134>\3\2\2\2\u0135\u0136\t \2"+
		"\2\u0136\u0137\t\f\2\2\u0137\u0138\t\26\2\2\u0138\u0139\t!\2\2\u0139\u013a"+
		"\t\33\2\2\u013a\u013b\t\24\2\2\u013b\u013c\t\n\2\2\u013c\u013d\t\37\2"+
		"\2\u013d\u013e\t\n\2\2\u013e@\3\2\2\2\u013f\u0140\7*\2\2\u0140B\3\2\2"+
		"\2\u0141\u0142\7+\2\2\u0142D\3\2\2\2\u0143\u0145\7/\2\2\u0144\u0143\3"+
		"\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0148\t\"\2\2\u0147"+
		"\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2"+
		"\2\2\u014aF\3\2\2\2\u014b\u014d\7/\2\2\u014c\u014b\3\2\2\2\u014c\u014d"+
		"\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u0150\t\"\2\2\u014f\u014e\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2"+
		"\2\2\u0153\u0155\7.\2\2\u0154\u0156\t\"\2\2\u0155\u0154\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158H\3\2\2\2"+
		"\u0159\u015a\t\4\2\2\u015a\u015b\t\n\2\2\u015b\u015c\t\6\2\2\u015c\u015d"+
		"\t\37\2\2\u015d\u015e\t\5\2\2\u015e\u015f\t\37\2\2\u015f\u0160\t\n\2\2"+
		"\u0160\u0161\t\6\2\2\u0161\u0162\t\f\2\2\u0162J\3\2\2\2\u0163\u0164\t"+
		"#\2\2\u0164\u0165\t\5\2\2\u0165\u0166\t\t\2\2\u0166\u0167\t\16\2\2\u0167"+
		"\u0168\t\f\2\2\u0168L\3\2\2\2\u0169\u016d\7$\2\2\u016a\u016c\13\2\2\2"+
		"\u016b\u016a\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016e\3\2\2\2\u016d\u016b"+
		"\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\7$\2\2\u0171"+
		"N\3\2\2\2\u0172\u0173\7\60\2\2\u0173P\3\2\2\2\u0174\u0175\t\35\2\2\u0175"+
		"\u0176\t\6\2\2\u0176\u0177\t\6\2\2\u0177\u0178\t\n\2\2\u0178\u0179\t\23"+
		"\2\2\u0179\u017a\t\t\2\2\u017a\u017b\t\f\2\2\u017bR\3\2\2\2\u017c\u017d"+
		"\t\25\2\2\u017d\u017e\t\n\2\2\u017e\u017f\t\26\2\2\u017f\u0180\t\22\2"+
		"\2\u0180\u0181\t\f\2\2\u0181\u0182\t\r\2\2\u0182\u0183\t\23\2\2\u0183"+
		"\u0184\t\7\2\2\u0184\u0185\t\17\2\2\u0185\u0186\t\33\2\2\u0186\u0187\t"+
		"\37\2\2\u0187T\3\2\2\2\u0188\u0189\7]\2\2\u0189V\3\2\2\2\u018a\u018b\7"+
		"_\2\2\u018bX\3\2\2\2\u018c\u018d\7=\2\2\u018dZ\3\2\2\2\u018e\u018f\t!"+
		"\2\2\u018f\u0190\t\7\2\2\u0190\\\3\2\2\2\u0191\u0192\t\20\2\2\u0192\u0193"+
		"\t\16\2\2\u0193^\3\2\2\2\u0194\u0195\7<\2\2\u0195`\3\2\2\2\u0196\u0197"+
		"\t\30\2\2\u0197\u0198\t\26\2\2\u0198\u0199\t!\2\2\u0199\u019a\t\7\2\2"+
		"\u019ab\3\2\2\2\u019b\u019c\t\20\2\2\u019c\u019d\t\r\2\2\u019d\u019e\t"+
		"\26\2\2\u019e\u019f\t\30\2\2\u019f\u01a0\t\17\2\2\u01a0\u01a1\t\6\2\2"+
		"\u01a1\u01a2\t\f\2\2\u01a2\u01a3\t\26\2\2\u01a3\u01a4\t\13\2\2\u01a4\u01a5"+
		"\t\5\2\2\u01a5\u01a6\t\16\2\2\u01a6\u01a7\t\f\2\2\u01a7d\3\2\2\2\u01a8"+
		"\u01a9\t\21\2\2\u01a9\u01aa\t\n\2\2\u01aa\u01ab\t$\2\2\u01ab\u01ac\t\n"+
		"\2\2\u01ac\u01ad\t\17\2\2\u01ad\u01ae\t\7\2\2\u01ae\u01af\t\6\2\2\u01af"+
		"f\3\2\2\2\u01b0\u01b1\t\31\2\2\u01b1\u01b2\t\7\2\2\u01b2\u01b3\t\n\2\2"+
		"\u01b3\u01b4\t\r\2\2\u01b4\u01b5\t\17\2\2\u01b5\u01b6\t\6\2\2\u01b6\u01b7"+
		"\t\5\2\2\u01b7\u01b8\t\16\2\2\u01b8h\3\2\2\2\u01b9\u01ba\t!\2\2\u01ba"+
		"\u01bb\t\n\2\2\u01bb\u01bc\t\5\2\2\u01bcj\3\2\2\2\u01bd\u01be\t\4\2\2"+
		"\u01be\u01bf\t\n\2\2\u01bf\u01c0\t\24\2\2\u01c0\u01c1\t\n\2\2\u01c1\u01c2"+
		"\t\16\2\2\u01c2l\3\2\2\2\u01c3\u01c4\t#\2\2\u01c4\u01c5\t\7\2\2\u01c5"+
		"\u01c6\t\r\2\2\u01c6n\3\2\2\2\u01c7\u01c8\t\32\2\2\u01c8\u01c9\t%\2\2"+
		"\u01c9\u01ca\t$\2\2\u01ca\u01cb\t\6\2\2\u01cb\u01cc\t\7\2\2\u01cc\u01cd"+
		"\t%\2\2\u01cd\u01ce\t\7\2\2\u01ce\u01cf\t\6\2\2\u01cf\u01d0\t\26\2\2\u01d0"+
		"\u01d1\t\20\2\2\u01d1\u01d2\t\r\2\2\u01d2\u01d3\t\26\2\2\u01d3\u01d4\t"+
		"\13\2\2\u01d4\u01d5\t\f\2\2\u01d5\u01d6\t\r\2\2\u01d6\u01d7\t\16\2\2\u01d7"+
		"\u01d8\t\f\2\2\u01d8\u01d9\t\t\2\2\u01d9\u01da\t\5\2\2\u01dap\3\2\2\2"+
		"\u01db\u01dc\t\13\2\2\u01dc\u01dd\t\5\2\2\u01dd\u01de\t$\2\2\u01de\u01df"+
		"\t\17\2\2\u01df\u01e0\t\33\2\2\u01e0\u01e1\t\6\2\2\u01e1\u01e2\t\5\2\2"+
		"\u01e2\u01e3\t\6\2\2\u01e3\u01e4\t\26\2\2\u01e4\u01e5\t\25\2\2\u01e5\u01e6"+
		"\t\n\2\2\u01e6\u01e7\t\26\2\2\u01e7\u01e8\t\13\2\2\u01e8\u01e9\t\f\2\2"+
		"\u01e9\u01ea\t\r\2\2\u01ea\u01eb\t\16\2\2\u01eb\u01ec\t\f\2\2\u01ec\u01ed"+
		"\t\t\2\2\u01ed\u01ee\t\5\2\2\u01eer\3\2\2\2\u01ef\u01f3\t&\2\2\u01f0\u01f2"+
		"\t\'\2\2\u01f1\u01f0\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3"+
		"\u01f4\3\2\2\2\u01f4t\3\2\2\2\u01f5\u01f3\3\2\2\2\f\2{\u0083\u0144\u0149"+
		"\u014c\u0151\u0157\u016d\u01f3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}