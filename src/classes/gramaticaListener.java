// Generated from gramatica.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(gramaticaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(gramaticaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void enterDeclaraciones(gramaticaParser.DeclaracionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void exitDeclaraciones(gramaticaParser.DeclaracionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(gramaticaParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(gramaticaParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#exporta}.
	 * @param ctx the parse tree
	 */
	void enterExporta(gramaticaParser.ExportaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#exporta}.
	 * @param ctx the parse tree
	 */
	void exitExporta(gramaticaParser.ExportaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void enterListaParametros(gramaticaParser.ListaParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void exitListaParametros(gramaticaParser.ListaParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(gramaticaParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(gramaticaParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#nominacion}.
	 * @param ctx the parse tree
	 */
	void enterNominacion(gramaticaParser.NominacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#nominacion}.
	 * @param ctx the parse tree
	 */
	void exitNominacion(gramaticaParser.NominacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#tipoVariable}.
	 * @param ctx the parse tree
	 */
	void enterTipoVariable(gramaticaParser.TipoVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#tipoVariable}.
	 * @param ctx the parse tree
	 */
	void exitTipoVariable(gramaticaParser.TipoVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#igualdad}.
	 * @param ctx the parse tree
	 */
	void enterIgualdad(gramaticaParser.IgualdadContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#igualdad}.
	 * @param ctx the parse tree
	 */
	void exitIgualdad(gramaticaParser.IgualdadContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(gramaticaParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(gramaticaParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#operacionOY}.
	 * @param ctx the parse tree
	 */
	void enterOperacionOY(gramaticaParser.OperacionOYContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#operacionOY}.
	 * @param ctx the parse tree
	 */
	void exitOperacionOY(gramaticaParser.OperacionOYContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(gramaticaParser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(gramaticaParser.ComparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#opcomparacion}.
	 * @param ctx the parse tree
	 */
	void enterOpcomparacion(gramaticaParser.OpcomparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#opcomparacion}.
	 * @param ctx the parse tree
	 */
	void exitOpcomparacion(gramaticaParser.OpcomparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterAritmetica(gramaticaParser.AritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitAritmetica(gramaticaParser.AritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#multiplicacion}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicacion(gramaticaParser.MultiplicacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#multiplicacion}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicacion(gramaticaParser.MultiplicacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#potenciacion}.
	 * @param ctx the parse tree
	 */
	void enterPotenciacion(gramaticaParser.PotenciacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#potenciacion}.
	 * @param ctx the parse tree
	 */
	void exitPotenciacion(gramaticaParser.PotenciacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#negacion}.
	 * @param ctx the parse tree
	 */
	void enterNegacion(gramaticaParser.NegacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#negacion}.
	 * @param ctx the parse tree
	 */
	void exitNegacion(gramaticaParser.NegacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#parentesis}.
	 * @param ctx the parse tree
	 */
	void enterParentesis(gramaticaParser.ParentesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#parentesis}.
	 * @param ctx the parse tree
	 */
	void exitParentesis(gramaticaParser.ParentesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#dato}.
	 * @param ctx the parse tree
	 */
	void enterDato(gramaticaParser.DatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#dato}.
	 * @param ctx the parse tree
	 */
	void exitDato(gramaticaParser.DatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#logico}.
	 * @param ctx the parse tree
	 */
	void enterLogico(gramaticaParser.LogicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#logico}.
	 * @param ctx the parse tree
	 */
	void exitLogico(gramaticaParser.LogicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(gramaticaParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(gramaticaParser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#listaArreglo}.
	 * @param ctx the parse tree
	 */
	void enterListaArreglo(gramaticaParser.ListaArregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#listaArreglo}.
	 * @param ctx the parse tree
	 */
	void exitListaArreglo(gramaticaParser.ListaArregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#listaCondicional}.
	 * @param ctx the parse tree
	 */
	void enterListaCondicional(gramaticaParser.ListaCondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#listaCondicional}.
	 * @param ctx the parse tree
	 */
	void exitListaCondicional(gramaticaParser.ListaCondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#ciclo}.
	 * @param ctx the parse tree
	 */
	void enterCiclo(gramaticaParser.CicloContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#ciclo}.
	 * @param ctx the parse tree
	 */
	void exitCiclo(gramaticaParser.CicloContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#listaImpresion}.
	 * @param ctx the parse tree
	 */
	void enterListaImpresion(gramaticaParser.ListaImpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#listaImpresion}.
	 * @param ctx the parse tree
	 */
	void exitListaImpresion(gramaticaParser.ListaImpresionContext ctx);
}