// Generated from Gramatica.g4 by ANTLR 4.6
package classes;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaParser extends Parser {
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
	public static final int
		RULE_programa = 0, RULE_declaraciones = 1, RULE_parametros = 2, RULE_exporta = 3, 
		RULE_listaParametros = 4, RULE_instrucciones = 5, RULE_nominacion = 6, 
		RULE_arreglo = 7, RULE_llamadaIdentificador = 8, RULE_condicional = 9, 
		RULE_ciclo = 10, RULE_impresion = 11, RULE_entrada = 12, RULE_tipoVariable = 13, 
		RULE_igualdad = 14, RULE_listaIdentificadores = 15, RULE_expresion = 16, 
		RULE_operacionOY = 17, RULE_comparacion = 18, RULE_opcomparacion = 19, 
		RULE_aritmetica = 20, RULE_multiplicacion = 21, RULE_potenciacion = 22, 
		RULE_negacion = 23, RULE_parentesis = 24, RULE_dato = 25, RULE_logico = 26, 
		RULE_numero = 27, RULE_listaArreglo = 28, RULE_listaCondicional = 29, 
		RULE_listaImpresion = 30;
	public static final String[] ruleNames = {
		"programa", "declaraciones", "parametros", "exporta", "listaParametros", 
		"instrucciones", "nominacion", "arreglo", "llamadaIdentificador", "condicional", 
		"ciclo", "impresion", "entrada", "tipoVariable", "igualdad", "listaIdentificadores", 
		"expresion", "operacionOY", "comparacion", "opcomparacion", "aritmetica", 
		"multiplicacion", "potenciacion", "negacion", "parentesis", "dato", "logico", 
		"numero", "listaArreglo", "listaCondicional", "listaImpresion"
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

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GramaticaParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				declaraciones();
				setState(63);
				instrucciones();
				setState(64);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracionesContext extends ParserRuleContext {
		public TerminalNode PROCEDIMIENTO() { return getToken(GramaticaParser.PROCEDIMIENTO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode DP() { return getToken(GramaticaParser.DP, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode FIN() { return getToken(GramaticaParser.FIN, 0); }
		public TerminalNode PUNTO() { return getToken(GramaticaParser.PUNTO, 0); }
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public DeclaracionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeclaraciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeclaraciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDeclaraciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionesContext declaraciones() throws RecognitionException {
		DeclaracionesContext _localctx = new DeclaracionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaraciones);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDIMIENTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(PROCEDIMIENTO);
				setState(70);
				match(IDENTIFICADOR);
				setState(71);
				parametros();
				setState(72);
				match(DP);
				setState(73);
				instrucciones();
				setState(74);
				match(FIN);
				setState(75);
				match(PUNTO);
				setState(76);
				declaraciones();
				}
				break;
			case EOF:
			case VARIABLE:
			case CONSTANTE:
			case AREGLO:
			case SI:
			case REPETIR:
			case IMPRIMIR:
			case CAPTURAR:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametrosContext extends ParserRuleContext {
		public TerminalNode IMPORTA() { return getToken(GramaticaParser.IMPORTA, 0); }
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
		public ExportaContext exporta() {
			return getRuleContext(ExportaContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(GramaticaParser.VARIABLE, 0); }
		public TipoVariableContext tipoVariable() {
			return getRuleContext(TipoVariableContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public ArregloContext arreglo() {
			return getRuleContext(ArregloContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parametros);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORTA:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(IMPORTA);
				setState(87);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VARIABLE:
					{
					setState(82);
					match(VARIABLE);
					setState(83);
					tipoVariable();
					setState(84);
					match(IDENTIFICADOR);
					}
					break;
				case AREGLO:
					{
					setState(86);
					arreglo();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(89);
				listaParametros();
				setState(90);
				exporta();
				}
				break;
			case EXPORTA:
			case DP:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				exporta();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExportaContext extends ParserRuleContext {
		public TerminalNode EXPORTA() { return getToken(GramaticaParser.EXPORTA, 0); }
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(GramaticaParser.VARIABLE, 0); }
		public TipoVariableContext tipoVariable() {
			return getRuleContext(TipoVariableContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public ArregloContext arreglo() {
			return getRuleContext(ArregloContext.class,0);
		}
		public ExportaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exporta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExporta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExporta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitExporta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportaContext exporta() throws RecognitionException {
		ExportaContext _localctx = new ExportaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exporta);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXPORTA:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(EXPORTA);
				setState(101);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VARIABLE:
					{
					setState(96);
					match(VARIABLE);
					setState(97);
					tipoVariable();
					setState(98);
					match(IDENTIFICADOR);
					}
					break;
				case AREGLO:
					{
					setState(100);
					arreglo();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(103);
				listaParametros();
				}
				break;
			case DP:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaParametrosContext extends ParserRuleContext {
		public TerminalNode PYC() { return getToken(GramaticaParser.PYC, 0); }
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
		public TipoVariableContext tipoVariable() {
			return getRuleContext(TipoVariableContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public ArregloContext arreglo() {
			return getRuleContext(ArregloContext.class,0);
		}
		public ListaParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterListaParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitListaParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitListaParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaParametrosContext listaParametros() throws RecognitionException {
		ListaParametrosContext _localctx = new ListaParametrosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_listaParametros);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(PYC);
				setState(113);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ENTERA:
				case REAL:
				case LOGICA:
				case CARACTERES:
					{
					setState(109);
					tipoVariable();
					setState(110);
					match(IDENTIFICADOR);
					}
					break;
				case AREGLO:
					{
					setState(112);
					arreglo();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(115);
				listaParametros();
				}
				break;
			case EXPORTA:
			case DP:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstruccionesContext extends ParserRuleContext {
		public NominacionContext nominacion() {
			return getRuleContext(NominacionContext.class,0);
		}
		public TerminalNode PUNTO() { return getToken(GramaticaParser.PUNTO, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public ArregloContext arreglo() {
			return getRuleContext(ArregloContext.class,0);
		}
		public LlamadaIdentificadorContext llamadaIdentificador() {
			return getRuleContext(LlamadaIdentificadorContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public ImpresionContext impresion() {
			return getRuleContext(ImpresionContext.class,0);
		}
		public EntradaContext entrada() {
			return getRuleContext(EntradaContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instrucciones);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
			case CONSTANTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				nominacion();
				setState(121);
				match(PUNTO);
				setState(122);
				instrucciones();
				}
				break;
			case AREGLO:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				arreglo();
				setState(125);
				match(PUNTO);
				setState(126);
				instrucciones();
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				llamadaIdentificador();
				setState(129);
				match(PUNTO);
				setState(130);
				instrucciones();
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				condicional();
				setState(133);
				match(PUNTO);
				setState(134);
				instrucciones();
				}
				break;
			case REPETIR:
				enterOuterAlt(_localctx, 5);
				{
				setState(136);
				ciclo();
				setState(137);
				match(PUNTO);
				setState(138);
				instrucciones();
				}
				break;
			case IMPRIMIR:
				enterOuterAlt(_localctx, 6);
				{
				setState(140);
				impresion();
				setState(141);
				match(PUNTO);
				setState(142);
				instrucciones();
				}
				break;
			case CAPTURAR:
				enterOuterAlt(_localctx, 7);
				{
				setState(144);
				entrada();
				setState(145);
				match(PUNTO);
				setState(146);
				instrucciones();
				}
				break;
			case EOF:
			case SINO:
			case OTROCASO:
			case FIN:
				enterOuterAlt(_localctx, 8);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NominacionContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(GramaticaParser.VARIABLE, 0); }
		public TipoVariableContext tipoVariable() {
			return getRuleContext(TipoVariableContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public IgualdadContext igualdad() {
			return getRuleContext(IgualdadContext.class,0);
		}
		public TerminalNode CONSTANTE() { return getToken(GramaticaParser.CONSTANTE, 0); }
		public NominacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nominacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNominacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNominacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNominacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NominacionContext nominacion() throws RecognitionException {
		NominacionContext _localctx = new NominacionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nominacion);
		int _la;
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(VARIABLE);
				setState(152);
				tipoVariable();
				setState(153);
				match(IDENTIFICADOR);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGUAL || _la==SIGNOIGUAL) {
					{
					setState(154);
					igualdad();
					}
				}

				}
				break;
			case CONSTANTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(CONSTANTE);
				setState(158);
				tipoVariable();
				setState(159);
				match(IDENTIFICADOR);
				setState(160);
				igualdad();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArregloContext extends ParserRuleContext {
		public TerminalNode AREGLO() { return getToken(GramaticaParser.AREGLO, 0); }
		public TerminalNode VARIABLE() { return getToken(GramaticaParser.VARIABLE, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public ArregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arreglo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterArreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitArreglo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitArreglo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArregloContext arreglo() throws RecognitionException {
		ArregloContext _localctx = new ArregloContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arreglo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(AREGLO);
			setState(165);
			match(VARIABLE);
			setState(166);
			match(IDENTIFICADOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LlamadaIdentificadorContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(GramaticaParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(GramaticaParser.IDENTIFICADOR, i);
		}
		public IgualdadContext igualdad() {
			return getRuleContext(IgualdadContext.class,0);
		}
		public TerminalNode CUADRADOI() { return getToken(GramaticaParser.CUADRADOI, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ListaArregloContext listaArreglo() {
			return getRuleContext(ListaArregloContext.class,0);
		}
		public TerminalNode CUADRADOD() { return getToken(GramaticaParser.CUADRADOD, 0); }
		public TerminalNode IMPORTA() { return getToken(GramaticaParser.IMPORTA, 0); }
		public TerminalNode EXPORTA() { return getToken(GramaticaParser.EXPORTA, 0); }
		public ListaIdentificadoresContext listaIdentificadores() {
			return getRuleContext(ListaIdentificadoresContext.class,0);
		}
		public LlamadaIdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamadaIdentificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterLlamadaIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitLlamadaIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitLlamadaIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlamadaIdentificadorContext llamadaIdentificador() throws RecognitionException {
		LlamadaIdentificadorContext _localctx = new LlamadaIdentificadorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_llamadaIdentificador);
		int _la;
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(IDENTIFICADOR);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CUADRADOI) {
					{
					setState(169);
					match(CUADRADOI);
					setState(170);
					expresion();
					setState(171);
					listaArreglo();
					setState(172);
					match(CUADRADOD);
					}
				}

				setState(176);
				igualdad();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(IDENTIFICADOR);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IMPORTA) {
					{
					setState(178);
					match(IMPORTA);
					setState(179);
					expresion();
					setState(180);
					listaArreglo();
					}
				}

				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXPORTA) {
					{
					setState(184);
					match(EXPORTA);
					setState(185);
					match(IDENTIFICADOR);
					setState(186);
					listaIdentificadores();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(GramaticaParser.SI, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode DP() { return getToken(GramaticaParser.DP, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public ListaCondicionalContext listaCondicional() {
			return getRuleContext(ListaCondicionalContext.class,0);
		}
		public TerminalNode FIN() { return getToken(GramaticaParser.FIN, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(SI);
			setState(192);
			expresion();
			setState(193);
			match(DP);
			setState(194);
			instrucciones();
			setState(195);
			listaCondicional();
			setState(196);
			match(FIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CicloContext extends ParserRuleContext {
		public TerminalNode REPETIR() { return getToken(GramaticaParser.REPETIR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode VECES() { return getToken(GramaticaParser.VECES, 0); }
		public TerminalNode DP() { return getToken(GramaticaParser.DP, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode FIN() { return getToken(GramaticaParser.FIN, 0); }
		public TerminalNode MIENTRAS() { return getToken(GramaticaParser.MIENTRAS, 0); }
		public TerminalNode SEA() { return getToken(GramaticaParser.SEA, 0); }
		public LogicoContext logico() {
			return getRuleContext(LogicoContext.class,0);
		}
		public CicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCiclo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCiclo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCiclo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloContext ciclo() throws RecognitionException {
		CicloContext _localctx = new CicloContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ciclo);
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(REPETIR);
				setState(199);
				expresion();
				setState(200);
				match(VECES);
				setState(201);
				match(DP);
				setState(202);
				instrucciones();
				setState(203);
				match(FIN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(REPETIR);
				setState(206);
				match(MIENTRAS);
				setState(207);
				expresion();
				setState(208);
				match(SEA);
				setState(209);
				logico();
				setState(210);
				match(DP);
				setState(211);
				instrucciones();
				setState(212);
				match(FIN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImpresionContext extends ParserRuleContext {
		public TerminalNode IMPRIMIR() { return getToken(GramaticaParser.IMPRIMIR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ListaImpresionContext listaImpresion() {
			return getRuleContext(ListaImpresionContext.class,0);
		}
		public ImpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterImpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitImpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitImpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpresionContext impresion() throws RecognitionException {
		ImpresionContext _localctx = new ImpresionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_impresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(IMPRIMIR);
			setState(217);
			expresion();
			setState(218);
			listaImpresion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntradaContext extends ParserRuleContext {
		public TerminalNode CAPTURAR() { return getToken(GramaticaParser.CAPTURAR, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public EntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterEntrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitEntrada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitEntrada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntradaContext entrada() throws RecognitionException {
		EntradaContext _localctx = new EntradaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_entrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(CAPTURAR);
			setState(221);
			match(IDENTIFICADOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoVariableContext extends ParserRuleContext {
		public TerminalNode ENTERA() { return getToken(GramaticaParser.ENTERA, 0); }
		public TerminalNode REAL() { return getToken(GramaticaParser.REAL, 0); }
		public TerminalNode LOGICA() { return getToken(GramaticaParser.LOGICA, 0); }
		public TerminalNode CARACTERES() { return getToken(GramaticaParser.CARACTERES, 0); }
		public TipoVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTipoVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTipoVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitTipoVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoVariableContext tipoVariable() throws RecognitionException {
		TipoVariableContext _localctx = new TipoVariableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipoVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERA) | (1L << REAL) | (1L << LOGICA) | (1L << CARACTERES))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IgualdadContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(GramaticaParser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode SIGNOIGUAL() { return getToken(GramaticaParser.SIGNOIGUAL, 0); }
		public IgualdadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igualdad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterIgualdad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitIgualdad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitIgualdad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgualdadContext igualdad() throws RecognitionException {
		IgualdadContext _localctx = new IgualdadContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_igualdad);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(IGUAL);
				setState(226);
				expresion();
				}
				break;
			case SIGNOIGUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(SIGNOIGUAL);
				setState(228);
				expresion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaIdentificadoresContext extends ParserRuleContext {
		public TerminalNode PYC() { return getToken(GramaticaParser.PYC, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public ListaIdentificadoresContext listaIdentificadores() {
			return getRuleContext(ListaIdentificadoresContext.class,0);
		}
		public ListaIdentificadoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaIdentificadores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterListaIdentificadores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitListaIdentificadores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitListaIdentificadores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaIdentificadoresContext listaIdentificadores() throws RecognitionException {
		ListaIdentificadoresContext _localctx = new ListaIdentificadoresContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_listaIdentificadores);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(PYC);
				setState(232);
				match(IDENTIFICADOR);
				setState(233);
				listaIdentificadores();
				}
				break;
			case PUNTO:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpresionContext extends ParserRuleContext {
		public OperacionOYContext operacionOY() {
			return getRuleContext(OperacionOYContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			operacionOY(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperacionOYContext extends ParserRuleContext {
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public OperacionOYContext operacionOY() {
			return getRuleContext(OperacionOYContext.class,0);
		}
		public TerminalNode Y() { return getToken(GramaticaParser.Y, 0); }
		public TerminalNode SIGNOY() { return getToken(GramaticaParser.SIGNOY, 0); }
		public TerminalNode O() { return getToken(GramaticaParser.O, 0); }
		public TerminalNode SIGNOO() { return getToken(GramaticaParser.SIGNOO, 0); }
		public OperacionOYContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacionOY; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOperacionOY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOperacionOY(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitOperacionOY(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionOYContext operacionOY() throws RecognitionException {
		return operacionOY(0);
	}

	private OperacionOYContext operacionOY(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperacionOYContext _localctx = new OperacionOYContext(_ctx, _parentState);
		OperacionOYContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_operacionOY, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(240);
			comparacion(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OperacionOYContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_operacionOY);
					setState(242);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(243);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Y) | (1L << SIGNOY) | (1L << O) | (1L << SIGNOO))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(244);
					comparacion(0);
					}
					} 
				}
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComparacionContext extends ParserRuleContext {
		public AritmeticaContext aritmetica() {
			return getRuleContext(AritmeticaContext.class,0);
		}
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public OpcomparacionContext opcomparacion() {
			return getRuleContext(OpcomparacionContext.class,0);
		}
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitComparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		return comparacion(0);
	}

	private ComparacionContext comparacion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ComparacionContext _localctx = new ComparacionContext(_ctx, _parentState);
		ComparacionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_comparacion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(251);
			aritmetica(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ComparacionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_comparacion);
					setState(253);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(254);
					opcomparacion();
					setState(255);
					aritmetica(0);
					}
					} 
				}
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OpcomparacionContext extends ParserRuleContext {
		public TerminalNode MENOR() { return getToken(GramaticaParser.MENOR, 0); }
		public TerminalNode SIGNOMENOR() { return getToken(GramaticaParser.SIGNOMENOR, 0); }
		public TerminalNode MENORIGUAL() { return getToken(GramaticaParser.MENORIGUAL, 0); }
		public TerminalNode SIGNOMENORIGUAL() { return getToken(GramaticaParser.SIGNOMENORIGUAL, 0); }
		public TerminalNode MAYOR() { return getToken(GramaticaParser.MAYOR, 0); }
		public TerminalNode SIGNOMAYOR() { return getToken(GramaticaParser.SIGNOMAYOR, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(GramaticaParser.MAYORIGUAL, 0); }
		public TerminalNode SIGNOMAYORIGUAL() { return getToken(GramaticaParser.SIGNOMAYORIGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(GramaticaParser.DIFERENTE, 0); }
		public TerminalNode SIGNODIFERENTE() { return getToken(GramaticaParser.SIGNODIFERENTE, 0); }
		public TerminalNode IGUAL() { return getToken(GramaticaParser.IGUAL, 0); }
		public TerminalNode SIGNOIGUAL() { return getToken(GramaticaParser.SIGNOIGUAL, 0); }
		public OpcomparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcomparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOpcomparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOpcomparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitOpcomparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcomparacionContext opcomparacion() throws RecognitionException {
		OpcomparacionContext _localctx = new OpcomparacionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_opcomparacion);
		int _la;
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MENOR:
			case SIGNOMENOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				_la = _input.LA(1);
				if ( !(_la==MENOR || _la==SIGNOMENOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case MENORIGUAL:
			case SIGNOMENORIGUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				_la = _input.LA(1);
				if ( !(_la==MENORIGUAL || _la==SIGNOMENORIGUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case MAYOR:
			case SIGNOMAYOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				_la = _input.LA(1);
				if ( !(_la==MAYOR || _la==SIGNOMAYOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case MAYORIGUAL:
			case SIGNOMAYORIGUAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				_la = _input.LA(1);
				if ( !(_la==MAYORIGUAL || _la==SIGNOMAYORIGUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case DIFERENTE:
			case SIGNODIFERENTE:
				enterOuterAlt(_localctx, 5);
				{
				setState(266);
				_la = _input.LA(1);
				if ( !(_la==DIFERENTE || _la==SIGNODIFERENTE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case IGUAL:
			case SIGNOIGUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(267);
				_la = _input.LA(1);
				if ( !(_la==IGUAL || _la==SIGNOIGUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AritmeticaContext extends ParserRuleContext {
		public MultiplicacionContext multiplicacion() {
			return getRuleContext(MultiplicacionContext.class,0);
		}
		public AritmeticaContext aritmetica() {
			return getRuleContext(AritmeticaContext.class,0);
		}
		public TerminalNode SUMA() { return getToken(GramaticaParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(GramaticaParser.RESTA, 0); }
		public AritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitAritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AritmeticaContext aritmetica() throws RecognitionException {
		return aritmetica(0);
	}

	private AritmeticaContext aritmetica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AritmeticaContext _localctx = new AritmeticaContext(_ctx, _parentState);
		AritmeticaContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_aritmetica, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(271);
			multiplicacion(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AritmeticaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_aritmetica);
					setState(273);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(274);
					_la = _input.LA(1);
					if ( !(_la==SUMA || _la==RESTA) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(275);
					multiplicacion(0);
					}
					} 
				}
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicacionContext extends ParserRuleContext {
		public PotenciacionContext potenciacion() {
			return getRuleContext(PotenciacionContext.class,0);
		}
		public MultiplicacionContext multiplicacion() {
			return getRuleContext(MultiplicacionContext.class,0);
		}
		public TerminalNode MULTIPLICACION() { return getToken(GramaticaParser.MULTIPLICACION, 0); }
		public TerminalNode DIVISION() { return getToken(GramaticaParser.DIVISION, 0); }
		public TerminalNode MODULO() { return getToken(GramaticaParser.MODULO, 0); }
		public MultiplicacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterMultiplicacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitMultiplicacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMultiplicacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicacionContext multiplicacion() throws RecognitionException {
		return multiplicacion(0);
	}

	private MultiplicacionContext multiplicacion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicacionContext _localctx = new MultiplicacionContext(_ctx, _parentState);
		MultiplicacionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_multiplicacion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(282);
			potenciacion(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplicacionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_multiplicacion);
					setState(284);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(285);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICACION) | (1L << DIVISION) | (1L << MODULO))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(286);
					potenciacion(0);
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PotenciacionContext extends ParserRuleContext {
		public NegacionContext negacion() {
			return getRuleContext(NegacionContext.class,0);
		}
		public PotenciacionContext potenciacion() {
			return getRuleContext(PotenciacionContext.class,0);
		}
		public TerminalNode POTENCIA() { return getToken(GramaticaParser.POTENCIA, 0); }
		public PotenciacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_potenciacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPotenciacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPotenciacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitPotenciacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PotenciacionContext potenciacion() throws RecognitionException {
		return potenciacion(0);
	}

	private PotenciacionContext potenciacion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PotenciacionContext _localctx = new PotenciacionContext(_ctx, _parentState);
		PotenciacionContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_potenciacion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(293);
			negacion();
			}
			_ctx.stop = _input.LT(-1);
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PotenciacionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_potenciacion);
					setState(295);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(296);
					match(POTENCIA);
					setState(297);
					negacion();
					}
					} 
				}
				setState(302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NegacionContext extends ParserRuleContext {
		public TerminalNode NO() { return getToken(GramaticaParser.NO, 0); }
		public NegacionContext negacion() {
			return getRuleContext(NegacionContext.class,0);
		}
		public ParentesisContext parentesis() {
			return getRuleContext(ParentesisContext.class,0);
		}
		public NegacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNegacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNegacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNegacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegacionContext negacion() throws RecognitionException {
		NegacionContext _localctx = new NegacionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_negacion);
		try {
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NO:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(NO);
				setState(306);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(304);
					negacion();
					}
					break;
				case 2:
					{
					setState(305);
					parentesis();
					}
					break;
				}
				}
				break;
			case IZQUIERDO:
			case ENTERO:
			case NREAL:
			case VERDADERO:
			case FALSO:
			case FRASE:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				parentesis();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParentesisContext extends ParserRuleContext {
		public TerminalNode IZQUIERDO() { return getToken(GramaticaParser.IZQUIERDO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode DERECHO() { return getToken(GramaticaParser.DERECHO, 0); }
		public DatoContext dato() {
			return getRuleContext(DatoContext.class,0);
		}
		public ParentesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parentesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterParentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitParentesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitParentesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParentesisContext parentesis() throws RecognitionException {
		ParentesisContext _localctx = new ParentesisContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parentesis);
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IZQUIERDO:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(IZQUIERDO);
				setState(312);
				expresion();
				setState(313);
				match(DERECHO);
				}
				break;
			case ENTERO:
			case NREAL:
			case VERDADERO:
			case FALSO:
			case FRASE:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				dato();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatoContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public TerminalNode CUADRADOI() { return getToken(GramaticaParser.CUADRADOI, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ListaArregloContext listaArreglo() {
			return getRuleContext(ListaArregloContext.class,0);
		}
		public TerminalNode CUADRADOD() { return getToken(GramaticaParser.CUADRADOD, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public LogicoContext logico() {
			return getRuleContext(LogicoContext.class,0);
		}
		public TerminalNode FRASE() { return getToken(GramaticaParser.FRASE, 0); }
		public DatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatoContext dato() throws RecognitionException {
		DatoContext _localctx = new DatoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_dato);
		try {
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				match(IDENTIFICADOR);
				setState(324);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(319);
					match(CUADRADOI);
					setState(320);
					expresion();
					setState(321);
					listaArreglo();
					setState(322);
					match(CUADRADOD);
					}
					break;
				}
				}
				break;
			case ENTERO:
			case NREAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				numero();
				}
				break;
			case VERDADERO:
			case FALSO:
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
				logico();
				}
				break;
			case FRASE:
				enterOuterAlt(_localctx, 4);
				{
				setState(328);
				match(FRASE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicoContext extends ParserRuleContext {
		public TerminalNode VERDADERO() { return getToken(GramaticaParser.VERDADERO, 0); }
		public TerminalNode FALSO() { return getToken(GramaticaParser.FALSO, 0); }
		public LogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitLogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitLogico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicoContext logico() throws RecognitionException {
		LogicoContext _localctx = new LogicoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_la = _input.LA(1);
			if ( !(_la==VERDADERO || _la==FALSO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumeroContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(GramaticaParser.ENTERO, 0); }
		public TerminalNode NREAL() { return getToken(GramaticaParser.NREAL, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNumero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNumero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			_la = _input.LA(1);
			if ( !(_la==ENTERO || _la==NREAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaArregloContext extends ParserRuleContext {
		public TerminalNode PYC() { return getToken(GramaticaParser.PYC, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ListaArregloContext listaArreglo() {
			return getRuleContext(ListaArregloContext.class,0);
		}
		public ListaArregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaArreglo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterListaArreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitListaArreglo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitListaArreglo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaArregloContext listaArreglo() throws RecognitionException {
		ListaArregloContext _localctx = new ListaArregloContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_listaArreglo);
		try {
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				match(PYC);
				setState(336);
				expresion();
				setState(337);
				listaArreglo();
				}
				break;
			case EXPORTA:
			case PUNTO:
			case CUADRADOD:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaCondicionalContext extends ParserRuleContext {
		public TerminalNode SINO() { return getToken(GramaticaParser.SINO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode DP() { return getToken(GramaticaParser.DP, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public ListaCondicionalContext listaCondicional() {
			return getRuleContext(ListaCondicionalContext.class,0);
		}
		public TerminalNode OTROCASO() { return getToken(GramaticaParser.OTROCASO, 0); }
		public ListaCondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaCondicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterListaCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitListaCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitListaCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaCondicionalContext listaCondicional() throws RecognitionException {
		ListaCondicionalContext _localctx = new ListaCondicionalContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_listaCondicional);
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINO:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				match(SINO);
				setState(343);
				expresion();
				setState(344);
				match(DP);
				setState(345);
				instrucciones();
				setState(346);
				listaCondicional();
				}
				break;
			case OTROCASO:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				match(OTROCASO);
				setState(349);
				match(DP);
				setState(350);
				instrucciones();
				}
				break;
			case FIN:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaImpresionContext extends ParserRuleContext {
		public TerminalNode PYC() { return getToken(GramaticaParser.PYC, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ListaImpresionContext listaImpresion() {
			return getRuleContext(ListaImpresionContext.class,0);
		}
		public ListaImpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaImpresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterListaImpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitListaImpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitListaImpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaImpresionContext listaImpresion() throws RecognitionException {
		ListaImpresionContext _localctx = new ListaImpresionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_listaImpresion);
		try {
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				match(PYC);
				setState(355);
				expresion();
				setState(356);
				listaImpresion();
				}
				break;
			case PUNTO:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return operacionOY_sempred((OperacionOYContext)_localctx, predIndex);
		case 18:
			return comparacion_sempred((ComparacionContext)_localctx, predIndex);
		case 20:
			return aritmetica_sempred((AritmeticaContext)_localctx, predIndex);
		case 21:
			return multiplicacion_sempred((MultiplicacionContext)_localctx, predIndex);
		case 22:
			return potenciacion_sempred((PotenciacionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operacionOY_sempred(OperacionOYContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean comparacion_sempred(ComparacionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean aritmetica_sempred(AritmeticaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multiplicacion_sempred(MultiplicacionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean potenciacion_sempred(PotenciacionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3=\u016c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\2\5\2F\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"R\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4Z\n\4\3\4\3\4\3\4\3\4\5\4`\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5h\n\5\3\5\3\5\3\5\5\5m\n\5\3\6\3\6\3\6\3\6\3\6\5"+
		"\6t\n\6\3\6\3\6\3\6\5\6y\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7\u0098\n\7\3\b\3\b\3\b\3\b\5\b\u009e\n\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u00a5\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b1\n\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u00b9\n\n\3\n\3\n\3\n\5\n\u00be\n\n\5\n\u00c0"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d9\n\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00e8\n\20\3\21\3\21\3\21"+
		"\3\21\5\21\u00ee\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00f8"+
		"\n\23\f\23\16\23\u00fb\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0104"+
		"\n\24\f\24\16\24\u0107\13\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u010f"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0117\n\26\f\26\16\26\u011a\13"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0122\n\27\f\27\16\27\u0125\13"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u012d\n\30\f\30\16\30\u0130\13"+
		"\30\3\31\3\31\3\31\5\31\u0135\n\31\3\31\5\31\u0138\n\31\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u013f\n\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0147\n"+
		"\33\3\33\3\33\3\33\5\33\u014c\n\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u0157\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u0163\n\37\3 \3 \3 \3 \3 \5 \u016a\n \3 \2\7$&*,.!\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\16\3\2\n\r"+
		"\3\2\16\21\3\2\22\23\3\2\24\25\3\2\26\27\3\2\30\31\3\2\34\35\3\2\32\33"+
		"\3\2\36\37\3\2 \"\3\2)*\3\2\'(\u0179\2E\3\2\2\2\4Q\3\2\2\2\6_\3\2\2\2"+
		"\bl\3\2\2\2\nx\3\2\2\2\f\u0097\3\2\2\2\16\u00a4\3\2\2\2\20\u00a6\3\2\2"+
		"\2\22\u00bf\3\2\2\2\24\u00c1\3\2\2\2\26\u00d8\3\2\2\2\30\u00da\3\2\2\2"+
		"\32\u00de\3\2\2\2\34\u00e1\3\2\2\2\36\u00e7\3\2\2\2 \u00ed\3\2\2\2\"\u00ef"+
		"\3\2\2\2$\u00f1\3\2\2\2&\u00fc\3\2\2\2(\u010e\3\2\2\2*\u0110\3\2\2\2,"+
		"\u011b\3\2\2\2.\u0126\3\2\2\2\60\u0137\3\2\2\2\62\u013e\3\2\2\2\64\u014b"+
		"\3\2\2\2\66\u014d\3\2\2\28\u014f\3\2\2\2:\u0156\3\2\2\2<\u0162\3\2\2\2"+
		">\u0169\3\2\2\2@A\5\4\3\2AB\5\f\7\2BC\7\2\2\3CF\3\2\2\2DF\7\2\2\3E@\3"+
		"\2\2\2ED\3\2\2\2F\3\3\2\2\2GH\7\5\2\2HI\7=\2\2IJ\5\6\4\2JK\7\63\2\2KL"+
		"\5\f\7\2LM\7:\2\2MN\7,\2\2NO\5\4\3\2OR\3\2\2\2PR\3\2\2\2QG\3\2\2\2QP\3"+
		"\2\2\2R\5\3\2\2\2SY\7\6\2\2TU\7\b\2\2UV\5\34\17\2VW\7=\2\2WZ\3\2\2\2X"+
		"Z\5\20\t\2YT\3\2\2\2YX\3\2\2\2Z[\3\2\2\2[\\\5\n\6\2\\]\5\b\5\2]`\3\2\2"+
		"\2^`\5\b\5\2_S\3\2\2\2_^\3\2\2\2`\7\3\2\2\2ag\7\7\2\2bc\7\b\2\2cd\5\34"+
		"\17\2de\7=\2\2eh\3\2\2\2fh\5\20\t\2gb\3\2\2\2gf\3\2\2\2hi\3\2\2\2ij\5"+
		"\n\6\2jm\3\2\2\2km\3\2\2\2la\3\2\2\2lk\3\2\2\2m\t\3\2\2\2ns\7\60\2\2o"+
		"p\5\34\17\2pq\7=\2\2qt\3\2\2\2rt\5\20\t\2so\3\2\2\2sr\3\2\2\2tu\3\2\2"+
		"\2uv\5\n\6\2vy\3\2\2\2wy\3\2\2\2xn\3\2\2\2xw\3\2\2\2y\13\3\2\2\2z{\5\16"+
		"\b\2{|\7,\2\2|}\5\f\7\2}\u0098\3\2\2\2~\177\5\20\t\2\177\u0080\7,\2\2"+
		"\u0080\u0081\5\f\7\2\u0081\u0098\3\2\2\2\u0082\u0083\5\22\n\2\u0083\u0084"+
		"\7,\2\2\u0084\u0085\5\f\7\2\u0085\u0098\3\2\2\2\u0086\u0087\5\24\13\2"+
		"\u0087\u0088\7,\2\2\u0088\u0089\5\f\7\2\u0089\u0098\3\2\2\2\u008a\u008b"+
		"\5\26\f\2\u008b\u008c\7,\2\2\u008c\u008d\5\f\7\2\u008d\u0098\3\2\2\2\u008e"+
		"\u008f\5\30\r\2\u008f\u0090\7,\2\2\u0090\u0091\5\f\7\2\u0091\u0098\3\2"+
		"\2\2\u0092\u0093\5\32\16\2\u0093\u0094\7,\2\2\u0094\u0095\5\f\7\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0098\3\2\2\2\u0097z\3\2\2\2\u0097~\3\2\2\2\u0097"+
		"\u0082\3\2\2\2\u0097\u0086\3\2\2\2\u0097\u008a\3\2\2\2\u0097\u008e\3\2"+
		"\2\2\u0097\u0092\3\2\2\2\u0097\u0096\3\2\2\2\u0098\r\3\2\2\2\u0099\u009a"+
		"\7\b\2\2\u009a\u009b\5\34\17\2\u009b\u009d\7=\2\2\u009c\u009e\5\36\20"+
		"\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a5\3\2\2\2\u009f\u00a0"+
		"\7\t\2\2\u00a0\u00a1\5\34\17\2\u00a1\u00a2\7=\2\2\u00a2\u00a3\5\36\20"+
		"\2\u00a3\u00a5\3\2\2\2\u00a4\u0099\3\2\2\2\u00a4\u009f\3\2\2\2\u00a5\17"+
		"\3\2\2\2\u00a6\u00a7\7-\2\2\u00a7\u00a8\7\b\2\2\u00a8\u00a9\7=\2\2\u00a9"+
		"\21\3\2\2\2\u00aa\u00b0\7=\2\2\u00ab\u00ac\7.\2\2\u00ac\u00ad\5\"\22\2"+
		"\u00ad\u00ae\5:\36\2\u00ae\u00af\7/\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ab"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00c0\5\36\20\2"+
		"\u00b3\u00b8\7=\2\2\u00b4\u00b5\7\6\2\2\u00b5\u00b6\5\"\22\2\u00b6\u00b7"+
		"\5:\36\2\u00b7\u00b9\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00bd\3\2\2\2\u00ba\u00bb\7\7\2\2\u00bb\u00bc\7=\2\2\u00bc\u00be\5 \21"+
		"\2\u00bd\u00ba\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00aa"+
		"\3\2\2\2\u00bf\u00b3\3\2\2\2\u00c0\23\3\2\2\2\u00c1\u00c2\7\61\2\2\u00c2"+
		"\u00c3\5\"\22\2\u00c3\u00c4\7\63\2\2\u00c4\u00c5\5\f\7\2\u00c5\u00c6\5"+
		"<\37\2\u00c6\u00c7\7:\2\2\u00c7\25\3\2\2\2\u00c8\u00c9\7\66\2\2\u00c9"+
		"\u00ca\5\"\22\2\u00ca\u00cb\79\2\2\u00cb\u00cc\7\63\2\2\u00cc\u00cd\5"+
		"\f\7\2\u00cd\u00ce\7:\2\2\u00ce\u00d9\3\2\2\2\u00cf\u00d0\7\66\2\2\u00d0"+
		"\u00d1\7\67\2\2\u00d1\u00d2\5\"\22\2\u00d2\u00d3\78\2\2\u00d3\u00d4\5"+
		"\66\34\2\u00d4\u00d5\7\63\2\2\u00d5\u00d6\5\f\7\2\u00d6\u00d7\7:\2\2\u00d7"+
		"\u00d9\3\2\2\2\u00d8\u00c8\3\2\2\2\u00d8\u00cf\3\2\2\2\u00d9\27\3\2\2"+
		"\2\u00da\u00db\7;\2\2\u00db\u00dc\5\"\22\2\u00dc\u00dd\5> \2\u00dd\31"+
		"\3\2\2\2\u00de\u00df\7<\2\2\u00df\u00e0\7=\2\2\u00e0\33\3\2\2\2\u00e1"+
		"\u00e2\t\2\2\2\u00e2\35\3\2\2\2\u00e3\u00e4\7\32\2\2\u00e4\u00e8\5\"\22"+
		"\2\u00e5\u00e6\7\33\2\2\u00e6\u00e8\5\"\22\2\u00e7\u00e3\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e8\37\3\2\2\2\u00e9\u00ea\7\60\2\2\u00ea\u00eb\7=\2"+
		"\2\u00eb\u00ee\5 \21\2\u00ec\u00ee\3\2\2\2\u00ed\u00e9\3\2\2\2\u00ed\u00ec"+
		"\3\2\2\2\u00ee!\3\2\2\2\u00ef\u00f0\5$\23\2\u00f0#\3\2\2\2\u00f1\u00f2"+
		"\b\23\1\2\u00f2\u00f3\5&\24\2\u00f3\u00f9\3\2\2\2\u00f4\u00f5\f\4\2\2"+
		"\u00f5\u00f6\t\3\2\2\u00f6\u00f8\5&\24\2\u00f7\u00f4\3\2\2\2\u00f8\u00fb"+
		"\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa%\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fc\u00fd\b\24\1\2\u00fd\u00fe\5*\26\2\u00fe\u0105\3"+
		"\2\2\2\u00ff\u0100\f\4\2\2\u0100\u0101\5(\25\2\u0101\u0102\5*\26\2\u0102"+
		"\u0104\3\2\2\2\u0103\u00ff\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2"+
		"\2\2\u0105\u0106\3\2\2\2\u0106\'\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010f"+
		"\t\4\2\2\u0109\u010f\t\5\2\2\u010a\u010f\t\6\2\2\u010b\u010f\t\7\2\2\u010c"+
		"\u010f\t\b\2\2\u010d\u010f\t\t\2\2\u010e\u0108\3\2\2\2\u010e\u0109\3\2"+
		"\2\2\u010e\u010a\3\2\2\2\u010e\u010b\3\2\2\2\u010e\u010c\3\2\2\2\u010e"+
		"\u010d\3\2\2\2\u010f)\3\2\2\2\u0110\u0111\b\26\1\2\u0111\u0112\5,\27\2"+
		"\u0112\u0118\3\2\2\2\u0113\u0114\f\4\2\2\u0114\u0115\t\n\2\2\u0115\u0117"+
		"\5,\27\2\u0116\u0113\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119+\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\b\27\1\2"+
		"\u011c\u011d\5.\30\2\u011d\u0123\3\2\2\2\u011e\u011f\f\4\2\2\u011f\u0120"+
		"\t\13\2\2\u0120\u0122\5.\30\2\u0121\u011e\3\2\2\2\u0122\u0125\3\2\2\2"+
		"\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124-\3\2\2\2\u0125\u0123\3"+
		"\2\2\2\u0126\u0127\b\30\1\2\u0127\u0128\5\60\31\2\u0128\u012e\3\2\2\2"+
		"\u0129\u012a\f\4\2\2\u012a\u012b\7#\2\2\u012b\u012d\5\60\31\2\u012c\u0129"+
		"\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"/\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0134\7$\2\2\u0132\u0135\5\60\31\2"+
		"\u0133\u0135\5\62\32\2\u0134\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135\u0138"+
		"\3\2\2\2\u0136\u0138\5\62\32\2\u0137\u0131\3\2\2\2\u0137\u0136\3\2\2\2"+
		"\u0138\61\3\2\2\2\u0139\u013a\7%\2\2\u013a\u013b\5\"\22\2\u013b\u013c"+
		"\7&\2\2\u013c\u013f\3\2\2\2\u013d\u013f\5\64\33\2\u013e\u0139\3\2\2\2"+
		"\u013e\u013d\3\2\2\2\u013f\63\3\2\2\2\u0140\u0146\7=\2\2\u0141\u0142\7"+
		".\2\2\u0142\u0143\5\"\22\2\u0143\u0144\5:\36\2\u0144\u0145\7/\2\2\u0145"+
		"\u0147\3\2\2\2\u0146\u0141\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u014c\3\2"+
		"\2\2\u0148\u014c\58\35\2\u0149\u014c\5\66\34\2\u014a\u014c\7+\2\2\u014b"+
		"\u0140\3\2\2\2\u014b\u0148\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014a\3\2"+
		"\2\2\u014c\65\3\2\2\2\u014d\u014e\t\f\2\2\u014e\67\3\2\2\2\u014f\u0150"+
		"\t\r\2\2\u01509\3\2\2\2\u0151\u0152\7\60\2\2\u0152\u0153\5\"\22\2\u0153"+
		"\u0154\5:\36\2\u0154\u0157\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0151\3\2"+
		"\2\2\u0156\u0155\3\2\2\2\u0157;\3\2\2\2\u0158\u0159\7\64\2\2\u0159\u015a"+
		"\5\"\22\2\u015a\u015b\7\63\2\2\u015b\u015c\5\f\7\2\u015c\u015d\5<\37\2"+
		"\u015d\u0163\3\2\2\2\u015e\u015f\7\65\2\2\u015f\u0160\7\63\2\2\u0160\u0163"+
		"\5\f\7\2\u0161\u0163\3\2\2\2\u0162\u0158\3\2\2\2\u0162\u015e\3\2\2\2\u0162"+
		"\u0161\3\2\2\2\u0163=\3\2\2\2\u0164\u0165\7\60\2\2\u0165\u0166\5\"\22"+
		"\2\u0166\u0167\5> \2\u0167\u016a\3\2\2\2\u0168\u016a\3\2\2\2\u0169\u0164"+
		"\3\2\2\2\u0169\u0168\3\2\2\2\u016a?\3\2\2\2\"EQY_glsx\u0097\u009d\u00a4"+
		"\u00b0\u00b8\u00bd\u00bf\u00d8\u00e7\u00ed\u00f9\u0105\u010e\u0118\u0123"+
		"\u012e\u0134\u0137\u013e\u0146\u014b\u0156\u0162\u0169";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}