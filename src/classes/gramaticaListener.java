// Generated from Gramatica.g4 by ANTLR 4.6
package classes;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void enterDeclaraciones(GramaticaParser.DeclaracionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void exitDeclaraciones(GramaticaParser.DeclaracionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(GramaticaParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(GramaticaParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#exporta}.
	 * @param ctx the parse tree
	 */
	void enterExporta(GramaticaParser.ExportaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#exporta}.
	 * @param ctx the parse tree
	 */
	void exitExporta(GramaticaParser.ExportaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void enterListaParametros(GramaticaParser.ListaParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void exitListaParametros(GramaticaParser.ListaParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(GramaticaParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(GramaticaParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#nominacion}.
	 * @param ctx the parse tree
	 */
	void enterNominacion(GramaticaParser.NominacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#nominacion}.
	 * @param ctx the parse tree
	 */
	void exitNominacion(GramaticaParser.NominacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#arreglo}.
	 * @param ctx the parse tree
	 */
	void enterArreglo(GramaticaParser.ArregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#arreglo}.
	 * @param ctx the parse tree
	 */
	void exitArreglo(GramaticaParser.ArregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#llamadaIdentificador}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaIdentificador(GramaticaParser.LlamadaIdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#llamadaIdentificador}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaIdentificador(GramaticaParser.LlamadaIdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(GramaticaParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(GramaticaParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#ciclo}.
	 * @param ctx the parse tree
	 */
	void enterCiclo(GramaticaParser.CicloContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#ciclo}.
	 * @param ctx the parse tree
	 */
	void exitCiclo(GramaticaParser.CicloContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#impresion}.
	 * @param ctx the parse tree
	 */
	void enterImpresion(GramaticaParser.ImpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#impresion}.
	 * @param ctx the parse tree
	 */
	void exitImpresion(GramaticaParser.ImpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#entrada}.
	 * @param ctx the parse tree
	 */
	void enterEntrada(GramaticaParser.EntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#entrada}.
	 * @param ctx the parse tree
	 */
	void exitEntrada(GramaticaParser.EntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#tipoVariable}.
	 * @param ctx the parse tree
	 */
	void enterTipoVariable(GramaticaParser.TipoVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#tipoVariable}.
	 * @param ctx the parse tree
	 */
	void exitTipoVariable(GramaticaParser.TipoVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#igualdad}.
	 * @param ctx the parse tree
	 */
	void enterIgualdad(GramaticaParser.IgualdadContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#igualdad}.
	 * @param ctx the parse tree
	 */
	void exitIgualdad(GramaticaParser.IgualdadContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#listaIdentificadores}.
	 * @param ctx the parse tree
	 */
	void enterListaIdentificadores(GramaticaParser.ListaIdentificadoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#listaIdentificadores}.
	 * @param ctx the parse tree
	 */
	void exitListaIdentificadores(GramaticaParser.ListaIdentificadoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(GramaticaParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(GramaticaParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#operacionOY}.
	 * @param ctx the parse tree
	 */
	void enterOperacionOY(GramaticaParser.OperacionOYContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#operacionOY}.
	 * @param ctx the parse tree
	 */
	void exitOperacionOY(GramaticaParser.OperacionOYContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(GramaticaParser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(GramaticaParser.ComparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#opcomparacion}.
	 * @param ctx the parse tree
	 */
	void enterOpcomparacion(GramaticaParser.OpcomparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#opcomparacion}.
	 * @param ctx the parse tree
	 */
	void exitOpcomparacion(GramaticaParser.OpcomparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterAritmetica(GramaticaParser.AritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitAritmetica(GramaticaParser.AritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#multiplicacion}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicacion(GramaticaParser.MultiplicacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#multiplicacion}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicacion(GramaticaParser.MultiplicacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#potenciacion}.
	 * @param ctx the parse tree
	 */
	void enterPotenciacion(GramaticaParser.PotenciacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#potenciacion}.
	 * @param ctx the parse tree
	 */
	void exitPotenciacion(GramaticaParser.PotenciacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#negacion}.
	 * @param ctx the parse tree
	 */
	void enterNegacion(GramaticaParser.NegacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#negacion}.
	 * @param ctx the parse tree
	 */
	void exitNegacion(GramaticaParser.NegacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#parentesis}.
	 * @param ctx the parse tree
	 */
	void enterParentesis(GramaticaParser.ParentesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#parentesis}.
	 * @param ctx the parse tree
	 */
	void exitParentesis(GramaticaParser.ParentesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#dato}.
	 * @param ctx the parse tree
	 */
	void enterDato(GramaticaParser.DatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#dato}.
	 * @param ctx the parse tree
	 */
	void exitDato(GramaticaParser.DatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#logico}.
	 * @param ctx the parse tree
	 */
	void enterLogico(GramaticaParser.LogicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#logico}.
	 * @param ctx the parse tree
	 */
	void exitLogico(GramaticaParser.LogicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(GramaticaParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(GramaticaParser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#listaArreglo}.
	 * @param ctx the parse tree
	 */
	void enterListaArreglo(GramaticaParser.ListaArregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#listaArreglo}.
	 * @param ctx the parse tree
	 */
	void exitListaArreglo(GramaticaParser.ListaArregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#listaCondicional}.
	 * @param ctx the parse tree
	 */
	void enterListaCondicional(GramaticaParser.ListaCondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#listaCondicional}.
	 * @param ctx the parse tree
	 */
	void exitListaCondicional(GramaticaParser.ListaCondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#listaImpresion}.
	 * @param ctx the parse tree
	 */
	void enterListaImpresion(GramaticaParser.ListaImpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#listaImpresion}.
	 * @param ctx the parse tree
	 */
	void exitListaImpresion(GramaticaParser.ListaImpresionContext ctx);
}