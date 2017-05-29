// Generated from Gramatica.g4 by ANTLR 4.6
package classes;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#declaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaraciones(GramaticaParser.DeclaracionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(GramaticaParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#exporta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExporta(GramaticaParser.ExportaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#listaParametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaParametros(GramaticaParser.ListaParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(GramaticaParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#nominacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNominacion(GramaticaParser.NominacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#arreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArreglo(GramaticaParser.ArregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#llamadaIdentificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadaIdentificador(GramaticaParser.LlamadaIdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(GramaticaParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#ciclo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo(GramaticaParser.CicloContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#impresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresion(GramaticaParser.ImpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#entrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntrada(GramaticaParser.EntradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#tipoVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoVariable(GramaticaParser.TipoVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#igualdad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgualdad(GramaticaParser.IgualdadContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#listaIdentificadores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaIdentificadores(GramaticaParser.ListaIdentificadoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(GramaticaParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#operacionOY}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacionOY(GramaticaParser.OperacionOYContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(GramaticaParser.ComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#opcomparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcomparacion(GramaticaParser.OpcomparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAritmetica(GramaticaParser.AritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#multiplicacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicacion(GramaticaParser.MultiplicacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#potenciacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotenciacion(GramaticaParser.PotenciacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#negacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegacion(GramaticaParser.NegacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#parentesis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(GramaticaParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#dato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDato(GramaticaParser.DatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogico(GramaticaParser.LogicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(GramaticaParser.NumeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#listaArreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaArreglo(GramaticaParser.ListaArregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#listaCondicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaCondicional(GramaticaParser.ListaCondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#listaImpresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaImpresion(GramaticaParser.ListaImpresionContext ctx);
}