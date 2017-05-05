// Generated from gramatica.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(gramaticaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#declaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaraciones(gramaticaParser.DeclaracionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(gramaticaParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#exporta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExporta(gramaticaParser.ExportaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#listaParametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaParametros(gramaticaParser.ListaParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(gramaticaParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#nominacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNominacion(gramaticaParser.NominacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#tipoVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoVariable(gramaticaParser.TipoVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#igualdad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgualdad(gramaticaParser.IgualdadContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(gramaticaParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#operacionOY}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacionOY(gramaticaParser.OperacionOYContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(gramaticaParser.ComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#opcomparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcomparacion(gramaticaParser.OpcomparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAritmetica(gramaticaParser.AritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#multiplicacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicacion(gramaticaParser.MultiplicacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#potenciacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotenciacion(gramaticaParser.PotenciacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#negacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegacion(gramaticaParser.NegacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#parentesis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(gramaticaParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#dato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDato(gramaticaParser.DatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogico(gramaticaParser.LogicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(gramaticaParser.NumeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#listaArreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaArreglo(gramaticaParser.ListaArregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#listaCondicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaCondicional(gramaticaParser.ListaCondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#ciclo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo(gramaticaParser.CicloContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#listaImpresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaImpresion(gramaticaParser.ListaImpresionContext ctx);
}