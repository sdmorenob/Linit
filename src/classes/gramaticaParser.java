// Generated from gramatica.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaticaParser extends Parser {
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
	public static final int
		RULE_programa = 0, RULE_instrucciones = 1, RULE_nominacion = 2, RULE_tipoVariable = 3, 
		RULE_igualdad = 4, RULE_expresion = 5, RULE_operacionOY = 6, RULE_comparacion = 7, 
		RULE_opcomparacion = 8, RULE_aritmetica = 9, RULE_multiplicacion = 10, 
		RULE_potenciacion = 11, RULE_negacion = 12, RULE_parentesis = 13, RULE_dato = 14, 
		RULE_logico = 15, RULE_numero = 16, RULE_listaArreglo = 17, RULE_listaCondicional = 18, 
		RULE_ciclo = 19, RULE_listaImpresion = 20;
	public static final String[] ruleNames = {
		"programa", "instrucciones", "nominacion", "tipoVariable", "igualdad", 
		"expresion", "operacionOY", "comparacion", "opcomparacion", "aritmetica", 
		"multiplicacion", "potenciacion", "negacion", "parentesis", "dato", "logico", 
		"numero", "listaArreglo", "listaCondicional", "ciclo", "listaImpresion"
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

	@Override
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(gramaticaParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				instrucciones();
				setState(43);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
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

	public static class InstruccionesContext extends ParserRuleContext {
		public NominacionContext nominacion() {
			return getRuleContext(NominacionContext.class,0);
		}
		public TerminalNode PUNTO() { return getToken(gramaticaParser.PUNTO, 0); }
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public TerminalNode AREGLO() { return getToken(gramaticaParser.AREGLO, 0); }
		public TerminalNode VARIABLE() { return getToken(gramaticaParser.VARIABLE, 0); }
		public TipoVariableContext tipoVariable() {
			return getRuleContext(TipoVariableContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(gramaticaParser.IDENTIFICADOR, 0); }
		public TerminalNode LONGITUD() { return getToken(gramaticaParser.LONGITUD, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ListaArregloContext listaArreglo() {
			return getRuleContext(ListaArregloContext.class,0);
		}
		public IgualdadContext igualdad() {
			return getRuleContext(IgualdadContext.class,0);
		}
		public TerminalNode CUADRADOI() { return getToken(gramaticaParser.CUADRADOI, 0); }
		public TerminalNode CUADRADOD() { return getToken(gramaticaParser.CUADRADOD, 0); }
		public TerminalNode SI() { return getToken(gramaticaParser.SI, 0); }
		public TerminalNode DP() { return getToken(gramaticaParser.DP, 0); }
		public ListaCondicionalContext listaCondicional() {
			return getRuleContext(ListaCondicionalContext.class,0);
		}
		public TerminalNode FIN() { return getToken(gramaticaParser.FIN, 0); }
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public TerminalNode IMPRIMIR() { return getToken(gramaticaParser.IMPRIMIR, 0); }
		public ListaImpresionContext listaImpresion() {
			return getRuleContext(ListaImpresionContext.class,0);
		}
		public TerminalNode CAPTURAR() { return getToken(gramaticaParser.CAPTURAR, 0); }
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);
		int _la;
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
			case CONSTANTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				nominacion();
				setState(49);
				match(PUNTO);
				setState(50);
				instrucciones();
				}
				break;
			case AREGLO:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(AREGLO);
				setState(53);
				match(VARIABLE);
				setState(54);
				tipoVariable();
				setState(55);
				match(IDENTIFICADOR);
				setState(56);
				match(LONGITUD);
				setState(57);
				expresion();
				setState(58);
				listaArreglo();
				setState(59);
				match(PUNTO);
				setState(60);
				instrucciones();
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				match(IDENTIFICADOR);
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CUADRADOI) {
					{
					setState(63);
					match(CUADRADOI);
					setState(64);
					expresion();
					setState(65);
					listaArreglo();
					setState(66);
					match(CUADRADOD);
					}
				}

				setState(70);
				igualdad();
				setState(71);
				match(PUNTO);
				setState(72);
				instrucciones();
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				match(SI);
				setState(75);
				expresion();
				setState(76);
				match(DP);
				setState(77);
				instrucciones();
				setState(78);
				listaCondicional();
				setState(79);
				match(FIN);
				setState(80);
				match(PUNTO);
				setState(81);
				instrucciones();
				}
				break;
			case REPETIR:
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				ciclo();
				setState(84);
				match(PUNTO);
				setState(85);
				instrucciones();
				}
				break;
			case IMPRIMIR:
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				match(IMPRIMIR);
				setState(88);
				expresion();
				setState(89);
				listaImpresion();
				setState(90);
				match(PUNTO);
				setState(91);
				instrucciones();
				}
				break;
			case CAPTURAR:
				enterOuterAlt(_localctx, 7);
				{
				setState(93);
				match(CAPTURAR);
				setState(94);
				match(IDENTIFICADOR);
				setState(95);
				match(PUNTO);
				setState(96);
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
		public TerminalNode VARIABLE() { return getToken(gramaticaParser.VARIABLE, 0); }
		public TipoVariableContext tipoVariable() {
			return getRuleContext(TipoVariableContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(gramaticaParser.IDENTIFICADOR, 0); }
		public IgualdadContext igualdad() {
			return getRuleContext(IgualdadContext.class,0);
		}
		public TerminalNode CONSTANTE() { return getToken(gramaticaParser.CONSTANTE, 0); }
		public NominacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nominacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterNominacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitNominacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitNominacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NominacionContext nominacion() throws RecognitionException {
		NominacionContext _localctx = new NominacionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nominacion);
		int _la;
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(VARIABLE);
				setState(101);
				tipoVariable();
				setState(102);
				match(IDENTIFICADOR);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGUAL || _la==SIGNOIGUAL) {
					{
					setState(103);
					igualdad();
					}
				}

				}
				break;
			case CONSTANTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(CONSTANTE);
				setState(107);
				tipoVariable();
				setState(108);
				match(IDENTIFICADOR);
				setState(109);
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

	public static class TipoVariableContext extends ParserRuleContext {
		public TerminalNode ENTERA() { return getToken(gramaticaParser.ENTERA, 0); }
		public TerminalNode REAL() { return getToken(gramaticaParser.REAL, 0); }
		public TerminalNode LOGICA() { return getToken(gramaticaParser.LOGICA, 0); }
		public TerminalNode CARACTERES() { return getToken(gramaticaParser.CARACTERES, 0); }
		public TipoVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTipoVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTipoVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitTipoVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoVariableContext tipoVariable() throws RecognitionException {
		TipoVariableContext _localctx = new TipoVariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipoVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
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
		public TerminalNode IGUAL() { return getToken(gramaticaParser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode SIGNOIGUAL() { return getToken(gramaticaParser.SIGNOIGUAL, 0); }
		public IgualdadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igualdad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterIgualdad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitIgualdad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitIgualdad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgualdadContext igualdad() throws RecognitionException {
		IgualdadContext _localctx = new IgualdadContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_igualdad);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(IGUAL);
				setState(116);
				expresion();
				}
				break;
			case SIGNOIGUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(SIGNOIGUAL);
				setState(118);
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
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
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
		public TerminalNode Y() { return getToken(gramaticaParser.Y, 0); }
		public TerminalNode SIGNOY() { return getToken(gramaticaParser.SIGNOY, 0); }
		public TerminalNode O() { return getToken(gramaticaParser.O, 0); }
		public TerminalNode SIGNOO() { return getToken(gramaticaParser.SIGNOO, 0); }
		public OperacionOYContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacionOY; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOperacionOY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOperacionOY(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitOperacionOY(this);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_operacionOY, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(124);
			comparacion(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OperacionOYContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_operacionOY);
					setState(126);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(127);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Y) | (1L << SIGNOY) | (1L << O) | (1L << SIGNOO))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(128);
					comparacion(0);
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitComparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitComparacion(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_comparacion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(135);
			aritmetica(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ComparacionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_comparacion);
					setState(137);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(138);
					opcomparacion();
					setState(139);
					aritmetica(0);
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		public TerminalNode MENOR() { return getToken(gramaticaParser.MENOR, 0); }
		public TerminalNode SIGNOMENOR() { return getToken(gramaticaParser.SIGNOMENOR, 0); }
		public TerminalNode MENORIGUAL() { return getToken(gramaticaParser.MENORIGUAL, 0); }
		public TerminalNode SIGNOMENORIGUAL() { return getToken(gramaticaParser.SIGNOMENORIGUAL, 0); }
		public TerminalNode MAYOR() { return getToken(gramaticaParser.MAYOR, 0); }
		public TerminalNode SIGNOMAYOR() { return getToken(gramaticaParser.SIGNOMAYOR, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(gramaticaParser.MAYORIGUAL, 0); }
		public TerminalNode SIGNOMAYORIGUAL() { return getToken(gramaticaParser.SIGNOMAYORIGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(gramaticaParser.DIFERENTE, 0); }
		public TerminalNode SIGNODIFERENTE() { return getToken(gramaticaParser.SIGNODIFERENTE, 0); }
		public TerminalNode IGUAL() { return getToken(gramaticaParser.IGUAL, 0); }
		public TerminalNode SIGNOIGUAL() { return getToken(gramaticaParser.SIGNOIGUAL, 0); }
		public OpcomparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcomparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOpcomparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOpcomparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitOpcomparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcomparacionContext opcomparacion() throws RecognitionException {
		OpcomparacionContext _localctx = new OpcomparacionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_opcomparacion);
		int _la;
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MENOR:
			case SIGNOMENOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
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
				setState(147);
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
				setState(148);
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
				setState(149);
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
				setState(150);
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
				setState(151);
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
		public TerminalNode SUMA() { return getToken(gramaticaParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(gramaticaParser.RESTA, 0); }
		public AritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitAritmetica(this);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_aritmetica, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(155);
			multiplicacion(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AritmeticaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_aritmetica);
					setState(157);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(158);
					_la = _input.LA(1);
					if ( !(_la==SUMA || _la==RESTA) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(159);
					multiplicacion(0);
					}
					} 
				}
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		public TerminalNode MULTIPLICACION() { return getToken(gramaticaParser.MULTIPLICACION, 0); }
		public TerminalNode DIVISION() { return getToken(gramaticaParser.DIVISION, 0); }
		public TerminalNode MODULO() { return getToken(gramaticaParser.MODULO, 0); }
		public MultiplicacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterMultiplicacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitMultiplicacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitMultiplicacion(this);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_multiplicacion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(166);
			potenciacion(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplicacionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_multiplicacion);
					setState(168);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(169);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICACION) | (1L << DIVISION) | (1L << MODULO))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(170);
					potenciacion(0);
					}
					} 
				}
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		public TerminalNode POTENCIA() { return getToken(gramaticaParser.POTENCIA, 0); }
		public PotenciacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_potenciacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPotenciacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPotenciacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitPotenciacion(this);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_potenciacion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(177);
			negacion();
			}
			_ctx.stop = _input.LT(-1);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PotenciacionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_potenciacion);
					setState(179);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(180);
					match(POTENCIA);
					setState(181);
					negacion();
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		public TerminalNode NO() { return getToken(gramaticaParser.NO, 0); }
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
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterNegacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitNegacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitNegacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegacionContext negacion() throws RecognitionException {
		NegacionContext _localctx = new NegacionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_negacion);
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NO:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(NO);
				setState(190);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(188);
					negacion();
					}
					break;
				case 2:
					{
					setState(189);
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
				setState(192);
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
		public TerminalNode IZQUIERDO() { return getToken(gramaticaParser.IZQUIERDO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode DERECHO() { return getToken(gramaticaParser.DERECHO, 0); }
		public DatoContext dato() {
			return getRuleContext(DatoContext.class,0);
		}
		public ParentesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parentesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterParentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitParentesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitParentesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParentesisContext parentesis() throws RecognitionException {
		ParentesisContext _localctx = new ParentesisContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parentesis);
		try {
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IZQUIERDO:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(IZQUIERDO);
				setState(196);
				expresion();
				setState(197);
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
				setState(199);
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
		public TerminalNode IDENTIFICADOR() { return getToken(gramaticaParser.IDENTIFICADOR, 0); }
		public TerminalNode CUADRADOI() { return getToken(gramaticaParser.CUADRADOI, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ListaArregloContext listaArreglo() {
			return getRuleContext(ListaArregloContext.class,0);
		}
		public TerminalNode CUADRADOD() { return getToken(gramaticaParser.CUADRADOD, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public LogicoContext logico() {
			return getRuleContext(LogicoContext.class,0);
		}
		public TerminalNode FRASE() { return getToken(gramaticaParser.FRASE, 0); }
		public DatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatoContext dato() throws RecognitionException {
		DatoContext _localctx = new DatoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dato);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(IDENTIFICADOR);
				setState(208);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(203);
					match(CUADRADOI);
					setState(204);
					expresion();
					setState(205);
					listaArreglo();
					setState(206);
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
				setState(210);
				numero();
				}
				break;
			case VERDADERO:
			case FALSO:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				logico();
				}
				break;
			case FRASE:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
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
		public TerminalNode VERDADERO() { return getToken(gramaticaParser.VERDADERO, 0); }
		public TerminalNode FALSO() { return getToken(gramaticaParser.FALSO, 0); }
		public LogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitLogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitLogico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicoContext logico() throws RecognitionException {
		LogicoContext _localctx = new LogicoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
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
		public TerminalNode ENTERO() { return getToken(gramaticaParser.ENTERO, 0); }
		public TerminalNode NREAL() { return getToken(gramaticaParser.NREAL, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitNumero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitNumero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
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
		public TerminalNode PYC() { return getToken(gramaticaParser.PYC, 0); }
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
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterListaArreglo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitListaArreglo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitListaArreglo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaArregloContext listaArreglo() throws RecognitionException {
		ListaArregloContext _localctx = new ListaArregloContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_listaArreglo);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(PYC);
				setState(220);
				expresion();
				setState(221);
				listaArreglo();
				}
				break;
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
		public TerminalNode SINO() { return getToken(gramaticaParser.SINO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode DP() { return getToken(gramaticaParser.DP, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public ListaCondicionalContext listaCondicional() {
			return getRuleContext(ListaCondicionalContext.class,0);
		}
		public TerminalNode OTROCASO() { return getToken(gramaticaParser.OTROCASO, 0); }
		public ListaCondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaCondicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterListaCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitListaCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitListaCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaCondicionalContext listaCondicional() throws RecognitionException {
		ListaCondicionalContext _localctx = new ListaCondicionalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_listaCondicional);
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINO:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(SINO);
				setState(227);
				expresion();
				setState(228);
				match(DP);
				setState(229);
				instrucciones();
				setState(230);
				listaCondicional();
				}
				break;
			case OTROCASO:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(OTROCASO);
				setState(233);
				match(DP);
				setState(234);
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
		public TerminalNode REPETIR() { return getToken(gramaticaParser.REPETIR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode VECES() { return getToken(gramaticaParser.VECES, 0); }
		public TerminalNode DP() { return getToken(gramaticaParser.DP, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode FIN() { return getToken(gramaticaParser.FIN, 0); }
		public TerminalNode MIENTRAS() { return getToken(gramaticaParser.MIENTRAS, 0); }
		public TerminalNode SEA() { return getToken(gramaticaParser.SEA, 0); }
		public LogicoContext logico() {
			return getRuleContext(LogicoContext.class,0);
		}
		public CicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCiclo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCiclo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCiclo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloContext ciclo() throws RecognitionException {
		CicloContext _localctx = new CicloContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ciclo);
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(REPETIR);
				setState(239);
				expresion();
				setState(240);
				match(VECES);
				setState(241);
				match(DP);
				setState(242);
				instrucciones();
				setState(243);
				match(FIN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(REPETIR);
				setState(246);
				match(MIENTRAS);
				setState(247);
				expresion();
				setState(248);
				match(SEA);
				setState(249);
				logico();
				setState(250);
				match(DP);
				setState(251);
				instrucciones();
				setState(252);
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
		public TerminalNode PYC() { return getToken(gramaticaParser.PYC, 0); }
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
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterListaImpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitListaImpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitListaImpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaImpresionContext listaImpresion() throws RecognitionException {
		ListaImpresionContext _localctx = new ListaImpresionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_listaImpresion);
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(PYC);
				setState(257);
				expresion();
				setState(258);
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
		case 6:
			return operacionOY_sempred((OperacionOYContext)_localctx, predIndex);
		case 7:
			return comparacion_sempred((ComparacionContext)_localctx, predIndex);
		case 9:
			return aritmetica_sempred((AritmeticaContext)_localctx, predIndex);
		case 10:
			return multiplicacion_sempred((MultiplicacionContext)_localctx, predIndex);
		case 11:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3;\u010a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\5\2\61\n\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3G\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3e\n\3"+
		"\3\4\3\4\3\4\3\4\5\4k\n\4\3\4\3\4\3\4\3\4\3\4\5\4r\n\4\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\5\6z\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0084\n\b\f\b\16"+
		"\b\u0087\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0090\n\t\f\t\16\t\u0093"+
		"\13\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009b\n\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\7\13\u00a3\n\13\f\13\16\13\u00a6\13\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f"+
		"\u00ae\n\f\f\f\16\f\u00b1\13\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00b9\n\r\f"+
		"\r\16\r\u00bc\13\r\3\16\3\16\3\16\5\16\u00c1\n\16\3\16\5\16\u00c4\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00cb\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00d3\n\20\3\20\3\20\3\20\5\20\u00d8\n\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\5\23\u00e3\n\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u00ef\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0101\n\25\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u0108\n\26\3\26\2\7\16\20\24\26\30\27\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*\2\16\3\2\7\n\3\2\13\16\3\2\17\20\3"+
		"\2\21\22\3\2\23\24\3\2\25\26\3\2\31\32\3\2\27\30\3\2\33\34\3\2\35\37\3"+
		"\2&\'\3\2$%\u0116\2\60\3\2\2\2\4d\3\2\2\2\6q\3\2\2\2\bs\3\2\2\2\ny\3\2"+
		"\2\2\f{\3\2\2\2\16}\3\2\2\2\20\u0088\3\2\2\2\22\u009a\3\2\2\2\24\u009c"+
		"\3\2\2\2\26\u00a7\3\2\2\2\30\u00b2\3\2\2\2\32\u00c3\3\2\2\2\34\u00ca\3"+
		"\2\2\2\36\u00d7\3\2\2\2 \u00d9\3\2\2\2\"\u00db\3\2\2\2$\u00e2\3\2\2\2"+
		"&\u00ee\3\2\2\2(\u0100\3\2\2\2*\u0107\3\2\2\2,-\5\4\3\2-.\7\2\2\3.\61"+
		"\3\2\2\2/\61\7\2\2\3\60,\3\2\2\2\60/\3\2\2\2\61\3\3\2\2\2\62\63\5\6\4"+
		"\2\63\64\7)\2\2\64\65\5\4\3\2\65e\3\2\2\2\66\67\7*\2\2\678\7\5\2\289\5"+
		"\b\5\29:\7;\2\2:;\7+\2\2;<\5\f\7\2<=\5$\23\2=>\7)\2\2>?\5\4\3\2?e\3\2"+
		"\2\2@F\7;\2\2AB\7,\2\2BC\5\f\7\2CD\5$\23\2DE\7-\2\2EG\3\2\2\2FA\3\2\2"+
		"\2FG\3\2\2\2GH\3\2\2\2HI\5\n\6\2IJ\7)\2\2JK\5\4\3\2Ke\3\2\2\2LM\7/\2\2"+
		"MN\5\f\7\2NO\7\61\2\2OP\5\4\3\2PQ\5&\24\2QR\78\2\2RS\7)\2\2ST\5\4\3\2"+
		"Te\3\2\2\2UV\5(\25\2VW\7)\2\2WX\5\4\3\2Xe\3\2\2\2YZ\79\2\2Z[\5\f\7\2["+
		"\\\5*\26\2\\]\7)\2\2]^\5\4\3\2^e\3\2\2\2_`\7:\2\2`a\7;\2\2ab\7)\2\2be"+
		"\5\4\3\2ce\3\2\2\2d\62\3\2\2\2d\66\3\2\2\2d@\3\2\2\2dL\3\2\2\2dU\3\2\2"+
		"\2dY\3\2\2\2d_\3\2\2\2dc\3\2\2\2e\5\3\2\2\2fg\7\5\2\2gh\5\b\5\2hj\7;\2"+
		"\2ik\5\n\6\2ji\3\2\2\2jk\3\2\2\2kr\3\2\2\2lm\7\6\2\2mn\5\b\5\2no\7;\2"+
		"\2op\5\n\6\2pr\3\2\2\2qf\3\2\2\2ql\3\2\2\2r\7\3\2\2\2st\t\2\2\2t\t\3\2"+
		"\2\2uv\7\27\2\2vz\5\f\7\2wx\7\30\2\2xz\5\f\7\2yu\3\2\2\2yw\3\2\2\2z\13"+
		"\3\2\2\2{|\5\16\b\2|\r\3\2\2\2}~\b\b\1\2~\177\5\20\t\2\177\u0085\3\2\2"+
		"\2\u0080\u0081\f\4\2\2\u0081\u0082\t\3\2\2\u0082\u0084\5\20\t\2\u0083"+
		"\u0080\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\17\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\b\t\1\2\u0089\u008a"+
		"\5\24\13\2\u008a\u0091\3\2\2\2\u008b\u008c\f\4\2\2\u008c\u008d\5\22\n"+
		"\2\u008d\u008e\5\24\13\2\u008e\u0090\3\2\2\2\u008f\u008b\3\2\2\2\u0090"+
		"\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\21\3\2\2"+
		"\2\u0093\u0091\3\2\2\2\u0094\u009b\t\4\2\2\u0095\u009b\t\5\2\2\u0096\u009b"+
		"\t\6\2\2\u0097\u009b\t\7\2\2\u0098\u009b\t\b\2\2\u0099\u009b\t\t\2\2\u009a"+
		"\u0094\3\2\2\2\u009a\u0095\3\2\2\2\u009a\u0096\3\2\2\2\u009a\u0097\3\2"+
		"\2\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\23\3\2\2\2\u009c\u009d"+
		"\b\13\1\2\u009d\u009e\5\26\f\2\u009e\u00a4\3\2\2\2\u009f\u00a0\f\4\2\2"+
		"\u00a0\u00a1\t\n\2\2\u00a1\u00a3\5\26\f\2\u00a2\u009f\3\2\2\2\u00a3\u00a6"+
		"\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\25\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a7\u00a8\b\f\1\2\u00a8\u00a9\5\30\r\2\u00a9\u00af\3"+
		"\2\2\2\u00aa\u00ab\f\4\2\2\u00ab\u00ac\t\13\2\2\u00ac\u00ae\5\30\r\2\u00ad"+
		"\u00aa\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\27\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\b\r\1\2\u00b3\u00b4"+
		"\5\32\16\2\u00b4\u00ba\3\2\2\2\u00b5\u00b6\f\4\2\2\u00b6\u00b7\7 \2\2"+
		"\u00b7\u00b9\5\32\16\2\u00b8\u00b5\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\31\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd"+
		"\u00c0\7!\2\2\u00be\u00c1\5\32\16\2\u00bf\u00c1\5\34\17\2\u00c0\u00be"+
		"\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c4\5\34\17\2"+
		"\u00c3\u00bd\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\33\3\2\2\2\u00c5\u00c6"+
		"\7\"\2\2\u00c6\u00c7\5\f\7\2\u00c7\u00c8\7#\2\2\u00c8\u00cb\3\2\2\2\u00c9"+
		"\u00cb\5\36\20\2\u00ca\u00c5\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\35\3\2"+
		"\2\2\u00cc\u00d2\7;\2\2\u00cd\u00ce\7,\2\2\u00ce\u00cf\5\f\7\2\u00cf\u00d0"+
		"\5$\23\2\u00d0\u00d1\7-\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d8\3\2\2\2\u00d4\u00d8\5\"\22\2\u00d5\u00d8\5"+
		" \21\2\u00d6\u00d8\7(\2\2\u00d7\u00cc\3\2\2\2\u00d7\u00d4\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\37\3\2\2\2\u00d9\u00da\t\f\2"+
		"\2\u00da!\3\2\2\2\u00db\u00dc\t\r\2\2\u00dc#\3\2\2\2\u00dd\u00de\7.\2"+
		"\2\u00de\u00df\5\f\7\2\u00df\u00e0\5$\23\2\u00e0\u00e3\3\2\2\2\u00e1\u00e3"+
		"\3\2\2\2\u00e2\u00dd\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3%\3\2\2\2\u00e4"+
		"\u00e5\7\62\2\2\u00e5\u00e6\5\f\7\2\u00e6\u00e7\7\61\2\2\u00e7\u00e8\5"+
		"\4\3\2\u00e8\u00e9\5&\24\2\u00e9\u00ef\3\2\2\2\u00ea\u00eb\7\63\2\2\u00eb"+
		"\u00ec\7\61\2\2\u00ec\u00ef\5\4\3\2\u00ed\u00ef\3\2\2\2\u00ee\u00e4\3"+
		"\2\2\2\u00ee\u00ea\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\'\3\2\2\2\u00f0\u00f1"+
		"\7\64\2\2\u00f1\u00f2\5\f\7\2\u00f2\u00f3\7\67\2\2\u00f3\u00f4\7\61\2"+
		"\2\u00f4\u00f5\5\4\3\2\u00f5\u00f6\78\2\2\u00f6\u0101\3\2\2\2\u00f7\u00f8"+
		"\7\64\2\2\u00f8\u00f9\7\65\2\2\u00f9\u00fa\5\f\7\2\u00fa\u00fb\7\66\2"+
		"\2\u00fb\u00fc\5 \21\2\u00fc\u00fd\7\61\2\2\u00fd\u00fe\5\4\3\2\u00fe"+
		"\u00ff\78\2\2\u00ff\u0101\3\2\2\2\u0100\u00f0\3\2\2\2\u0100\u00f7\3\2"+
		"\2\2\u0101)\3\2\2\2\u0102\u0103\7.\2\2\u0103\u0104\5\f\7\2\u0104\u0105"+
		"\5*\26\2\u0105\u0108\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0102\3\2\2\2\u0107"+
		"\u0106\3\2\2\2\u0108+\3\2\2\2\27\60Fdjqy\u0085\u0091\u009a\u00a4\u00af"+
		"\u00ba\u00c0\u00c3\u00ca\u00d2\u00d7\u00e2\u00ee\u0100\u0107";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}