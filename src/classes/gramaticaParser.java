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
		RULE_impresion = 10, RULE_entrada = 11, RULE_tipoVariable = 12, RULE_igualdad = 13, 
		RULE_listaIdentificadores = 14, RULE_expresion = 15, RULE_operacionOY = 16, 
		RULE_comparacion = 17, RULE_opcomparacion = 18, RULE_aritmetica = 19, 
		RULE_multiplicacion = 20, RULE_potenciacion = 21, RULE_negacion = 22, 
		RULE_parentesis = 23, RULE_dato = 24, RULE_logico = 25, RULE_numero = 26, 
		RULE_listaArreglo = 27, RULE_listaCondicional = 28, RULE_ciclo = 29, RULE_listaImpresion = 30;
	public static final String[] ruleNames = {
		"programa", "declaraciones", "parametros", "exporta", "listaParametros", 
		"instrucciones", "nominacion", "arreglo", "llamadaIdentificador", "condicional", 
		"impresion", "entrada", "tipoVariable", "igualdad", "listaIdentificadores", 
		"expresion", "operacionOY", "comparacion", "opcomparacion", "aritmetica", 
		"multiplicacion", "potenciacion", "negacion", "parentesis", "dato", "logico", 
		"numero", "listaArreglo", "listaCondicional", "ciclo", "listaImpresion"
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
		public TerminalNode VARIABLE() { return getToken(GramaticaParser.VARIABLE, 0); }
		public TipoVariableContext tipoVariable() {
			return getRuleContext(TipoVariableContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
		public ExportaContext exporta() {
			return getRuleContext(ExportaContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(IMPORTA);
			setState(82);
			match(VARIABLE);
			setState(83);
			tipoVariable();
			setState(84);
			match(IDENTIFICADOR);
			setState(85);
			listaParametros();
			setState(86);
			exporta();
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
		public TerminalNode VARIABLE() { return getToken(GramaticaParser.VARIABLE, 0); }
		public TipoVariableContext tipoVariable() {
			return getRuleContext(TipoVariableContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(EXPORTA);
			setState(89);
			match(VARIABLE);
			setState(90);
			tipoVariable();
			setState(91);
			match(IDENTIFICADOR);
			setState(92);
			listaParametros();
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
		public TipoVariableContext tipoVariable() {
			return getRuleContext(TipoVariableContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(GramaticaParser.IDENTIFICADOR, 0); }
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
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
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(PYC);
				setState(95);
				tipoVariable();
				setState(96);
				match(IDENTIFICADOR);
				setState(97);
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
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
			case CONSTANTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				nominacion();
				setState(103);
				match(PUNTO);
				setState(104);
				instrucciones();
				}
				break;
			case AREGLO:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				arreglo();
				setState(107);
				match(PUNTO);
				setState(108);
				instrucciones();
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				llamadaIdentificador();
				setState(111);
				match(PUNTO);
				setState(112);
				instrucciones();
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				condicional();
				setState(115);
				match(PUNTO);
				setState(116);
				instrucciones();
				}
				break;
			case REPETIR:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				ciclo();
				setState(119);
				match(PUNTO);
				setState(120);
				instrucciones();
				}
				break;
			case IMPRIMIR:
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
				impresion();
				setState(123);
				match(PUNTO);
				setState(124);
				instrucciones();
				}
				break;
			case CAPTURAR:
				enterOuterAlt(_localctx, 7);
				{
				setState(126);
				entrada();
				setState(127);
				match(PUNTO);
				setState(128);
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
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(VARIABLE);
				setState(134);
				tipoVariable();
				setState(135);
				match(IDENTIFICADOR);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGUAL || _la==SIGNOIGUAL) {
					{
					setState(136);
					igualdad();
					}
				}

				}
				break;
			case CONSTANTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(CONSTANTE);
				setState(140);
				tipoVariable();
				setState(141);
				match(IDENTIFICADOR);
				setState(142);
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
			setState(146);
			match(AREGLO);
			setState(147);
			match(VARIABLE);
			setState(148);
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
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(IDENTIFICADOR);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CUADRADOI) {
					{
					setState(151);
					match(CUADRADOI);
					setState(152);
					expresion();
					setState(153);
					listaArreglo();
					setState(154);
					match(CUADRADOD);
					}
				}

				setState(158);
				igualdad();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(IDENTIFICADOR);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IMPORTA) {
					{
					setState(160);
					match(IMPORTA);
					setState(161);
					expresion();
					setState(162);
					listaArreglo();
					}
				}

				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXPORTA) {
					{
					setState(166);
					match(EXPORTA);
					setState(167);
					match(IDENTIFICADOR);
					setState(168);
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
			setState(173);
			match(SI);
			setState(174);
			expresion();
			setState(175);
			match(DP);
			setState(176);
			instrucciones();
			setState(177);
			listaCondicional();
			setState(178);
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
		enterRule(_localctx, 20, RULE_impresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(IMPRIMIR);
			setState(181);
			expresion();
			setState(182);
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
		enterRule(_localctx, 22, RULE_entrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(CAPTURAR);
			setState(185);
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
		enterRule(_localctx, 24, RULE_tipoVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
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
		enterRule(_localctx, 26, RULE_igualdad);
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(IGUAL);
				setState(190);
				expresion();
				}
				break;
			case SIGNOIGUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(SIGNOIGUAL);
				setState(192);
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
		enterRule(_localctx, 28, RULE_listaIdentificadores);
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(PYC);
				setState(196);
				match(IDENTIFICADOR);
				setState(197);
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
		enterRule(_localctx, 30, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_operacionOY, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(204);
			comparacion(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OperacionOYContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_operacionOY);
					setState(206);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(207);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Y) | (1L << SIGNOY) | (1L << O) | (1L << SIGNOO))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(208);
					comparacion(0);
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_comparacion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(215);
			aritmetica(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ComparacionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_comparacion);
					setState(217);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(218);
					opcomparacion();
					setState(219);
					aritmetica(0);
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		enterRule(_localctx, 36, RULE_opcomparacion);
		int _la;
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MENOR:
			case SIGNOMENOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
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
				setState(227);
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
				setState(228);
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
				setState(229);
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
				setState(230);
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
				setState(231);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_aritmetica, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(235);
			multiplicacion(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AritmeticaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_aritmetica);
					setState(237);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(238);
					_la = _input.LA(1);
					if ( !(_la==SUMA || _la==RESTA) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(239);
					multiplicacion(0);
					}
					} 
				}
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_multiplicacion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(246);
			potenciacion(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplicacionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_multiplicacion);
					setState(248);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(249);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICACION) | (1L << DIVISION) | (1L << MODULO))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(250);
					potenciacion(0);
					}
					} 
				}
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_potenciacion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(257);
			negacion();
			}
			_ctx.stop = _input.LT(-1);
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PotenciacionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_potenciacion);
					setState(259);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(260);
					match(POTENCIA);
					setState(261);
					negacion();
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		enterRule(_localctx, 44, RULE_negacion);
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NO:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(NO);
				setState(270);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(268);
					negacion();
					}
					break;
				case 2:
					{
					setState(269);
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
				setState(272);
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
		enterRule(_localctx, 46, RULE_parentesis);
		try {
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IZQUIERDO:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(IZQUIERDO);
				setState(276);
				expresion();
				setState(277);
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
				setState(279);
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
		enterRule(_localctx, 48, RULE_dato);
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(IDENTIFICADOR);
				setState(288);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(283);
					match(CUADRADOI);
					setState(284);
					expresion();
					setState(285);
					listaArreglo();
					setState(286);
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
				setState(290);
				numero();
				}
				break;
			case VERDADERO:
			case FALSO:
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				logico();
				}
				break;
			case FRASE:
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
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
		enterRule(_localctx, 50, RULE_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
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
		enterRule(_localctx, 52, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
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
		enterRule(_localctx, 54, RULE_listaArreglo);
		try {
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(PYC);
				setState(300);
				expresion();
				setState(301);
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
		enterRule(_localctx, 56, RULE_listaCondicional);
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINO:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				match(SINO);
				setState(307);
				expresion();
				setState(308);
				match(DP);
				setState(309);
				instrucciones();
				setState(310);
				listaCondicional();
				}
				break;
			case OTROCASO:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				match(OTROCASO);
				setState(313);
				match(DP);
				setState(314);
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
		enterRule(_localctx, 58, RULE_ciclo);
		try {
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				match(REPETIR);
				setState(319);
				expresion();
				setState(320);
				match(VECES);
				setState(321);
				match(DP);
				setState(322);
				instrucciones();
				setState(323);
				match(FIN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				match(REPETIR);
				setState(326);
				match(MIENTRAS);
				setState(327);
				expresion();
				setState(328);
				match(SEA);
				setState(329);
				logico();
				setState(330);
				match(DP);
				setState(331);
				instrucciones();
				setState(332);
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
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				match(PYC);
				setState(337);
				expresion();
				setState(338);
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
		case 16:
			return operacionOY_sempred((OperacionOYContext)_localctx, predIndex);
		case 17:
			return comparacion_sempred((ComparacionContext)_localctx, predIndex);
		case 19:
			return aritmetica_sempred((AritmeticaContext)_localctx, predIndex);
		case 20:
			return multiplicacion_sempred((MultiplicacionContext)_localctx, predIndex);
		case 21:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3=\u015a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\2\5\2F\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"R\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6g\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7\u0086\n\7\3\b\3\b\3\b\3\b\5\b\u008c\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0093"+
		"\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009f\n\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u00a7\n\n\3\n\3\n\3\n\5\n\u00ac\n\n\5\n\u00ae\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\5\17\u00c4\n\17\3\20\3\20\3\20\3\20\5\20\u00ca\n\20"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00d4\n\22\f\22\16\22\u00d7"+
		"\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00e0\n\23\f\23\16\23\u00e3"+
		"\13\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00eb\n\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\7\25\u00f3\n\25\f\25\16\25\u00f6\13\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\7\26\u00fe\n\26\f\26\16\26\u0101\13\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\7\27\u0109\n\27\f\27\16\27\u010c\13\27\3\30\3\30\3\30\5"+
		"\30\u0111\n\30\3\30\5\30\u0114\n\30\3\31\3\31\3\31\3\31\3\31\5\31\u011b"+
		"\n\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0123\n\32\3\32\3\32\3\32\5\32"+
		"\u0128\n\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u0133\n"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u013f\n\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u0151\n\37\3 \3 \3 \3 \3 \5 \u0158\n \3 \2\7\"$(*,!\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\16\3"+
		"\2\n\r\3\2\16\21\3\2\22\23\3\2\24\25\3\2\26\27\3\2\30\31\3\2\34\35\3\2"+
		"\32\33\3\2\36\37\3\2 \"\3\2)*\3\2\'(\u0162\2E\3\2\2\2\4Q\3\2\2\2\6S\3"+
		"\2\2\2\bZ\3\2\2\2\nf\3\2\2\2\f\u0085\3\2\2\2\16\u0092\3\2\2\2\20\u0094"+
		"\3\2\2\2\22\u00ad\3\2\2\2\24\u00af\3\2\2\2\26\u00b6\3\2\2\2\30\u00ba\3"+
		"\2\2\2\32\u00bd\3\2\2\2\34\u00c3\3\2\2\2\36\u00c9\3\2\2\2 \u00cb\3\2\2"+
		"\2\"\u00cd\3\2\2\2$\u00d8\3\2\2\2&\u00ea\3\2\2\2(\u00ec\3\2\2\2*\u00f7"+
		"\3\2\2\2,\u0102\3\2\2\2.\u0113\3\2\2\2\60\u011a\3\2\2\2\62\u0127\3\2\2"+
		"\2\64\u0129\3\2\2\2\66\u012b\3\2\2\28\u0132\3\2\2\2:\u013e\3\2\2\2<\u0150"+
		"\3\2\2\2>\u0157\3\2\2\2@A\5\4\3\2AB\5\f\7\2BC\7\2\2\3CF\3\2\2\2DF\7\2"+
		"\2\3E@\3\2\2\2ED\3\2\2\2F\3\3\2\2\2GH\7\5\2\2HI\7=\2\2IJ\5\6\4\2JK\7\63"+
		"\2\2KL\5\f\7\2LM\7:\2\2MN\7,\2\2NO\5\4\3\2OR\3\2\2\2PR\3\2\2\2QG\3\2\2"+
		"\2QP\3\2\2\2R\5\3\2\2\2ST\7\6\2\2TU\7\b\2\2UV\5\32\16\2VW\7=\2\2WX\5\n"+
		"\6\2XY\5\b\5\2Y\7\3\2\2\2Z[\7\7\2\2[\\\7\b\2\2\\]\5\32\16\2]^\7=\2\2^"+
		"_\5\n\6\2_\t\3\2\2\2`a\7\60\2\2ab\5\32\16\2bc\7=\2\2cd\5\n\6\2dg\3\2\2"+
		"\2eg\3\2\2\2f`\3\2\2\2fe\3\2\2\2g\13\3\2\2\2hi\5\16\b\2ij\7,\2\2jk\5\f"+
		"\7\2k\u0086\3\2\2\2lm\5\20\t\2mn\7,\2\2no\5\f\7\2o\u0086\3\2\2\2pq\5\22"+
		"\n\2qr\7,\2\2rs\5\f\7\2s\u0086\3\2\2\2tu\5\24\13\2uv\7,\2\2vw\5\f\7\2"+
		"w\u0086\3\2\2\2xy\5<\37\2yz\7,\2\2z{\5\f\7\2{\u0086\3\2\2\2|}\5\26\f\2"+
		"}~\7,\2\2~\177\5\f\7\2\177\u0086\3\2\2\2\u0080\u0081\5\30\r\2\u0081\u0082"+
		"\7,\2\2\u0082\u0083\5\f\7\2\u0083\u0086\3\2\2\2\u0084\u0086\3\2\2\2\u0085"+
		"h\3\2\2\2\u0085l\3\2\2\2\u0085p\3\2\2\2\u0085t\3\2\2\2\u0085x\3\2\2\2"+
		"\u0085|\3\2\2\2\u0085\u0080\3\2\2\2\u0085\u0084\3\2\2\2\u0086\r\3\2\2"+
		"\2\u0087\u0088\7\b\2\2\u0088\u0089\5\32\16\2\u0089\u008b\7=\2\2\u008a"+
		"\u008c\5\34\17\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0093\3"+
		"\2\2\2\u008d\u008e\7\t\2\2\u008e\u008f\5\32\16\2\u008f\u0090\7=\2\2\u0090"+
		"\u0091\5\34\17\2\u0091\u0093\3\2\2\2\u0092\u0087\3\2\2\2\u0092\u008d\3"+
		"\2\2\2\u0093\17\3\2\2\2\u0094\u0095\7-\2\2\u0095\u0096\7\b\2\2\u0096\u0097"+
		"\7=\2\2\u0097\21\3\2\2\2\u0098\u009e\7=\2\2\u0099\u009a\7.\2\2\u009a\u009b"+
		"\5 \21\2\u009b\u009c\58\35\2\u009c\u009d\7/\2\2\u009d\u009f\3\2\2\2\u009e"+
		"\u0099\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00ae\5\34"+
		"\17\2\u00a1\u00a6\7=\2\2\u00a2\u00a3\7\6\2\2\u00a3\u00a4\5 \21\2\u00a4"+
		"\u00a5\58\35\2\u00a5\u00a7\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00ab\3\2\2\2\u00a8\u00a9\7\7\2\2\u00a9\u00aa\7=\2\2\u00aa"+
		"\u00ac\5\36\20\2\u00ab\u00a8\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3"+
		"\2\2\2\u00ad\u0098\3\2\2\2\u00ad\u00a1\3\2\2\2\u00ae\23\3\2\2\2\u00af"+
		"\u00b0\7\61\2\2\u00b0\u00b1\5 \21\2\u00b1\u00b2\7\63\2\2\u00b2\u00b3\5"+
		"\f\7\2\u00b3\u00b4\5:\36\2\u00b4\u00b5\7:\2\2\u00b5\25\3\2\2\2\u00b6\u00b7"+
		"\7;\2\2\u00b7\u00b8\5 \21\2\u00b8\u00b9\5> \2\u00b9\27\3\2\2\2\u00ba\u00bb"+
		"\7<\2\2\u00bb\u00bc\7=\2\2\u00bc\31\3\2\2\2\u00bd\u00be\t\2\2\2\u00be"+
		"\33\3\2\2\2\u00bf\u00c0\7\32\2\2\u00c0\u00c4\5 \21\2\u00c1\u00c2\7\33"+
		"\2\2\u00c2\u00c4\5 \21\2\u00c3\u00bf\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4"+
		"\35\3\2\2\2\u00c5\u00c6\7\60\2\2\u00c6\u00c7\7=\2\2\u00c7\u00ca\5\36\20"+
		"\2\u00c8\u00ca\3\2\2\2\u00c9\u00c5\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\37"+
		"\3\2\2\2\u00cb\u00cc\5\"\22\2\u00cc!\3\2\2\2\u00cd\u00ce\b\22\1\2\u00ce"+
		"\u00cf\5$\23\2\u00cf\u00d5\3\2\2\2\u00d0\u00d1\f\4\2\2\u00d1\u00d2\t\3"+
		"\2\2\u00d2\u00d4\5$\23\2\u00d3\u00d0\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6#\3\2\2\2\u00d7\u00d5\3\2\2\2"+
		"\u00d8\u00d9\b\23\1\2\u00d9\u00da\5(\25\2\u00da\u00e1\3\2\2\2\u00db\u00dc"+
		"\f\4\2\2\u00dc\u00dd\5&\24\2\u00dd\u00de\5(\25\2\u00de\u00e0\3\2\2\2\u00df"+
		"\u00db\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2%\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00eb\t\4\2\2\u00e5\u00eb"+
		"\t\5\2\2\u00e6\u00eb\t\6\2\2\u00e7\u00eb\t\7\2\2\u00e8\u00eb\t\b\2\2\u00e9"+
		"\u00eb\t\t\2\2\u00ea\u00e4\3\2\2\2\u00ea\u00e5\3\2\2\2\u00ea\u00e6\3\2"+
		"\2\2\u00ea\u00e7\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb"+
		"\'\3\2\2\2\u00ec\u00ed\b\25\1\2\u00ed\u00ee\5*\26\2\u00ee\u00f4\3\2\2"+
		"\2\u00ef\u00f0\f\4\2\2\u00f0\u00f1\t\n\2\2\u00f1\u00f3\5*\26\2\u00f2\u00ef"+
		"\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		")\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\b\26\1\2\u00f8\u00f9\5,\27\2"+
		"\u00f9\u00ff\3\2\2\2\u00fa\u00fb\f\4\2\2\u00fb\u00fc\t\13\2\2\u00fc\u00fe"+
		"\5,\27\2\u00fd\u00fa\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100+\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\b\27\1\2"+
		"\u0103\u0104\5.\30\2\u0104\u010a\3\2\2\2\u0105\u0106\f\4\2\2\u0106\u0107"+
		"\7#\2\2\u0107\u0109\5.\30\2\u0108\u0105\3\2\2\2\u0109\u010c\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b-\3\2\2\2\u010c\u010a\3\2\2\2"+
		"\u010d\u0110\7$\2\2\u010e\u0111\5.\30\2\u010f\u0111\5\60\31\2\u0110\u010e"+
		"\3\2\2\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0114\5\60\31\2"+
		"\u0113\u010d\3\2\2\2\u0113\u0112\3\2\2\2\u0114/\3\2\2\2\u0115\u0116\7"+
		"%\2\2\u0116\u0117\5 \21\2\u0117\u0118\7&\2\2\u0118\u011b\3\2\2\2\u0119"+
		"\u011b\5\62\32\2\u011a\u0115\3\2\2\2\u011a\u0119\3\2\2\2\u011b\61\3\2"+
		"\2\2\u011c\u0122\7=\2\2\u011d\u011e\7.\2\2\u011e\u011f\5 \21\2\u011f\u0120"+
		"\58\35\2\u0120\u0121\7/\2\2\u0121\u0123\3\2\2\2\u0122\u011d\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0128\3\2\2\2\u0124\u0128\5\66\34\2\u0125\u0128\5"+
		"\64\33\2\u0126\u0128\7+\2\2\u0127\u011c\3\2\2\2\u0127\u0124\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0126\3\2\2\2\u0128\63\3\2\2\2\u0129\u012a\t\f\2"+
		"\2\u012a\65\3\2\2\2\u012b\u012c\t\r\2\2\u012c\67\3\2\2\2\u012d\u012e\7"+
		"\60\2\2\u012e\u012f\5 \21\2\u012f\u0130\58\35\2\u0130\u0133\3\2\2\2\u0131"+
		"\u0133\3\2\2\2\u0132\u012d\3\2\2\2\u0132\u0131\3\2\2\2\u01339\3\2\2\2"+
		"\u0134\u0135\7\64\2\2\u0135\u0136\5 \21\2\u0136\u0137\7\63\2\2\u0137\u0138"+
		"\5\f\7\2\u0138\u0139\5:\36\2\u0139\u013f\3\2\2\2\u013a\u013b\7\65\2\2"+
		"\u013b\u013c\7\63\2\2\u013c\u013f\5\f\7\2\u013d\u013f\3\2\2\2\u013e\u0134"+
		"\3\2\2\2\u013e\u013a\3\2\2\2\u013e\u013d\3\2\2\2\u013f;\3\2\2\2\u0140"+
		"\u0141\7\66\2\2\u0141\u0142\5 \21\2\u0142\u0143\79\2\2\u0143\u0144\7\63"+
		"\2\2\u0144\u0145\5\f\7\2\u0145\u0146\7:\2\2\u0146\u0151\3\2\2\2\u0147"+
		"\u0148\7\66\2\2\u0148\u0149\7\67\2\2\u0149\u014a\5 \21\2\u014a\u014b\7"+
		"8\2\2\u014b\u014c\5\64\33\2\u014c\u014d\7\63\2\2\u014d\u014e\5\f\7\2\u014e"+
		"\u014f\7:\2\2\u014f\u0151\3\2\2\2\u0150\u0140\3\2\2\2\u0150\u0147\3\2"+
		"\2\2\u0151=\3\2\2\2\u0152\u0153\7\60\2\2\u0153\u0154\5 \21\2\u0154\u0155"+
		"\5> \2\u0155\u0158\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0152\3\2\2\2\u0157"+
		"\u0156\3\2\2\2\u0158?\3\2\2\2\35EQf\u0085\u008b\u0092\u009e\u00a6\u00ab"+
		"\u00ad\u00c3\u00c9\u00d5\u00e1\u00ea\u00f4\u00ff\u010a\u0110\u0113\u011a"+
		"\u0122\u0127\u0132\u013e\u0150\u0157";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}