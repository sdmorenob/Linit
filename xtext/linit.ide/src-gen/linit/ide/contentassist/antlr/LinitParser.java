/*
 * generated by Xtext 2.12.0
 */
package linit.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import linit.ide.contentassist.antlr.internal.InternalLinitParser;
import linit.services.LinitGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class LinitParser extends AbstractContentAssistParser {

	@Inject
	private LinitGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalLinitParser createParser() {
		InternalLinitParser result = new InternalLinitParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDeclaracionesAccess().getAlternatives_0(), "rule__Declaraciones__Alternatives_0");
					put(grammarAccess.getDeclaracionesAccess().getAlternatives_5(), "rule__Declaraciones__Alternatives_5");
					put(grammarAccess.getParametrosAccess().getAlternatives(), "rule__Parametros__Alternatives");
					put(grammarAccess.getParametrosAccess().getAlternatives_0_0(), "rule__Parametros__Alternatives_0_0");
					put(grammarAccess.getParametrosAccess().getAlternatives_0_1(), "rule__Parametros__Alternatives_0_1");
					put(grammarAccess.getParametrosAccess().getAlternatives_0_1_0_0(), "rule__Parametros__Alternatives_0_1_0_0");
					put(grammarAccess.getExporta2Access().getAlternatives_0(), "rule__Exporta2__Alternatives_0");
					put(grammarAccess.getExporta2Access().getAlternatives_1(), "rule__Exporta2__Alternatives_1");
					put(grammarAccess.getExporta2Access().getAlternatives_1_0_0(), "rule__Exporta2__Alternatives_1_0_0");
					put(grammarAccess.getListaParametrosAccess().getAlternatives_1(), "rule__ListaParametros__Alternatives_1");
					put(grammarAccess.getInstruccionesAccess().getAlternatives_1(), "rule__Instrucciones__Alternatives_1");
					put(grammarAccess.getNominacionAccess().getAlternatives(), "rule__Nominacion__Alternatives");
					put(grammarAccess.getNominacionAccess().getAlternatives_0_0(), "rule__Nominacion__Alternatives_0_0");
					put(grammarAccess.getNominacionAccess().getAlternatives_1_0(), "rule__Nominacion__Alternatives_1_0");
					put(grammarAccess.getArregloAccess().getAlternatives_0(), "rule__Arreglo__Alternatives_0");
					put(grammarAccess.getArregloAccess().getAlternatives_1(), "rule__Arreglo__Alternatives_1");
					put(grammarAccess.getLlamadaIdentificadorAccess().getAlternatives(), "rule__LlamadaIdentificador__Alternatives");
					put(grammarAccess.getLlamadaIdentificadorAccess().getAlternatives_1_1_0(), "rule__LlamadaIdentificador__Alternatives_1_1_0");
					put(grammarAccess.getLlamadaIdentificadorAccess().getAlternatives_1_2_0(), "rule__LlamadaIdentificador__Alternatives_1_2_0");
					put(grammarAccess.getCondicionalAccess().getAlternatives_0(), "rule__Condicional__Alternatives_0");
					put(grammarAccess.getCondicionalAccess().getAlternatives_5(), "rule__Condicional__Alternatives_5");
					put(grammarAccess.getCicloAccess().getAlternatives(), "rule__Ciclo__Alternatives");
					put(grammarAccess.getCicloAccess().getAlternatives_0_0(), "rule__Ciclo__Alternatives_0_0");
					put(grammarAccess.getCicloAccess().getAlternatives_0_2(), "rule__Ciclo__Alternatives_0_2");
					put(grammarAccess.getCicloAccess().getAlternatives_0_5(), "rule__Ciclo__Alternatives_0_5");
					put(grammarAccess.getCicloAccess().getAlternatives_1_0(), "rule__Ciclo__Alternatives_1_0");
					put(grammarAccess.getCicloAccess().getAlternatives_1_1(), "rule__Ciclo__Alternatives_1_1");
					put(grammarAccess.getCicloAccess().getAlternatives_1_3(), "rule__Ciclo__Alternatives_1_3");
					put(grammarAccess.getCicloAccess().getAlternatives_1_7(), "rule__Ciclo__Alternatives_1_7");
					put(grammarAccess.getImpresionAccess().getAlternatives_0(), "rule__Impresion__Alternatives_0");
					put(grammarAccess.getEntradaAccess().getAlternatives_0(), "rule__Entrada__Alternatives_0");
					put(grammarAccess.getTipoVariableAccess().getAlternatives(), "rule__TipoVariable__Alternatives");
					put(grammarAccess.getTipoVariableAccess().getAlternatives_0(), "rule__TipoVariable__Alternatives_0");
					put(grammarAccess.getTipoVariableAccess().getAlternatives_1(), "rule__TipoVariable__Alternatives_1");
					put(grammarAccess.getTipoVariableAccess().getAlternatives_2(), "rule__TipoVariable__Alternatives_2");
					put(grammarAccess.getTipoVariableAccess().getAlternatives_3(), "rule__TipoVariable__Alternatives_3");
					put(grammarAccess.getIgualdadAccess().getAlternatives(), "rule__Igualdad__Alternatives");
					put(grammarAccess.getIgualdadAccess().getAlternatives_0_0(), "rule__Igualdad__Alternatives_0_0");
					put(grammarAccess.getOperacionOYAccess().getAlternatives_1_0(), "rule__OperacionOY__Alternatives_1_0");
					put(grammarAccess.getOpcomparacionAccess().getAlternatives(), "rule__Opcomparacion__Alternatives");
					put(grammarAccess.getOpcomparacionAccess().getAlternatives_0(), "rule__Opcomparacion__Alternatives_0");
					put(grammarAccess.getOpcomparacionAccess().getAlternatives_0_0(), "rule__Opcomparacion__Alternatives_0_0");
					put(grammarAccess.getOpcomparacionAccess().getAlternatives_1(), "rule__Opcomparacion__Alternatives_1");
					put(grammarAccess.getOpcomparacionAccess().getAlternatives_1_0(), "rule__Opcomparacion__Alternatives_1_0");
					put(grammarAccess.getOpcomparacionAccess().getAlternatives_2(), "rule__Opcomparacion__Alternatives_2");
					put(grammarAccess.getOpcomparacionAccess().getAlternatives_2_0(), "rule__Opcomparacion__Alternatives_2_0");
					put(grammarAccess.getOpcomparacionAccess().getAlternatives_3(), "rule__Opcomparacion__Alternatives_3");
					put(grammarAccess.getOpcomparacionAccess().getAlternatives_3_0(), "rule__Opcomparacion__Alternatives_3_0");
					put(grammarAccess.getOpcomparacionAccess().getAlternatives_4(), "rule__Opcomparacion__Alternatives_4");
					put(grammarAccess.getOpcomparacionAccess().getAlternatives_4_0(), "rule__Opcomparacion__Alternatives_4_0");
					put(grammarAccess.getOpcomparacionAccess().getAlternatives_5(), "rule__Opcomparacion__Alternatives_5");
					put(grammarAccess.getOpcomparacionAccess().getAlternatives_5_0(), "rule__Opcomparacion__Alternatives_5_0");
					put(grammarAccess.getAritmeticaAccess().getAlternatives_1_0(), "rule__Aritmetica__Alternatives_1_0");
					put(grammarAccess.getMultiplicacion_Access().getAlternatives_1_0(), "rule__Multiplicacion___Alternatives_1_0");
					put(grammarAccess.getNegacionAccess().getAlternatives_0(), "rule__Negacion__Alternatives_0");
					put(grammarAccess.getParentesisAccess().getAlternatives(), "rule__Parentesis__Alternatives");
					put(grammarAccess.getDatoAccess().getAlternatives(), "rule__Dato__Alternatives");
					put(grammarAccess.getLogicoAccess().getAlternatives(), "rule__Logico__Alternatives");
					put(grammarAccess.getNumeroAccess().getAlternatives(), "rule__Numero__Alternatives");
					put(grammarAccess.getListaCondicionalAccess().getAlternatives_1(), "rule__ListaCondicional__Alternatives_1");
					put(grammarAccess.getListaCondicionalAccess().getAlternatives_1_0_0(), "rule__ListaCondicional__Alternatives_1_0_0");
					put(grammarAccess.getListaCondicionalAccess().getAlternatives_1_1_0(), "rule__ListaCondicional__Alternatives_1_1_0");
					put(grammarAccess.getProgramaAccess().getGroup(), "rule__Programa__Group__0");
					put(grammarAccess.getDeclaracionesAccess().getGroup(), "rule__Declaraciones__Group__0");
					put(grammarAccess.getParametrosAccess().getGroup_0(), "rule__Parametros__Group_0__0");
					put(grammarAccess.getParametrosAccess().getGroup_0_1_0(), "rule__Parametros__Group_0_1_0__0");
					put(grammarAccess.getExporta2Access().getGroup(), "rule__Exporta2__Group__0");
					put(grammarAccess.getExporta2Access().getGroup_1_0(), "rule__Exporta2__Group_1_0__0");
					put(grammarAccess.getListaParametrosAccess().getGroup(), "rule__ListaParametros__Group__0");
					put(grammarAccess.getListaParametrosAccess().getGroup_1_0(), "rule__ListaParametros__Group_1_0__0");
					put(grammarAccess.getInstruccionesAccess().getGroup(), "rule__Instrucciones__Group__0");
					put(grammarAccess.getInstruccionesAccess().getGroup_1_0(), "rule__Instrucciones__Group_1_0__0");
					put(grammarAccess.getInstruccionesAccess().getGroup_1_1(), "rule__Instrucciones__Group_1_1__0");
					put(grammarAccess.getInstruccionesAccess().getGroup_1_2(), "rule__Instrucciones__Group_1_2__0");
					put(grammarAccess.getInstruccionesAccess().getGroup_1_3(), "rule__Instrucciones__Group_1_3__0");
					put(grammarAccess.getInstruccionesAccess().getGroup_1_4(), "rule__Instrucciones__Group_1_4__0");
					put(grammarAccess.getInstruccionesAccess().getGroup_1_5(), "rule__Instrucciones__Group_1_5__0");
					put(grammarAccess.getInstruccionesAccess().getGroup_1_6(), "rule__Instrucciones__Group_1_6__0");
					put(grammarAccess.getNominacionAccess().getGroup_0(), "rule__Nominacion__Group_0__0");
					put(grammarAccess.getNominacionAccess().getGroup_1(), "rule__Nominacion__Group_1__0");
					put(grammarAccess.getArregloAccess().getGroup(), "rule__Arreglo__Group__0");
					put(grammarAccess.getLlamadaIdentificadorAccess().getGroup_0(), "rule__LlamadaIdentificador__Group_0__0");
					put(grammarAccess.getLlamadaIdentificadorAccess().getGroup_0_1(), "rule__LlamadaIdentificador__Group_0_1__0");
					put(grammarAccess.getLlamadaIdentificadorAccess().getGroup_1(), "rule__LlamadaIdentificador__Group_1__0");
					put(grammarAccess.getLlamadaIdentificadorAccess().getGroup_1_1(), "rule__LlamadaIdentificador__Group_1_1__0");
					put(grammarAccess.getLlamadaIdentificadorAccess().getGroup_1_2(), "rule__LlamadaIdentificador__Group_1_2__0");
					put(grammarAccess.getCondicionalAccess().getGroup(), "rule__Condicional__Group__0");
					put(grammarAccess.getCicloAccess().getGroup_0(), "rule__Ciclo__Group_0__0");
					put(grammarAccess.getCicloAccess().getGroup_1(), "rule__Ciclo__Group_1__0");
					put(grammarAccess.getImpresionAccess().getGroup(), "rule__Impresion__Group__0");
					put(grammarAccess.getEntradaAccess().getGroup(), "rule__Entrada__Group__0");
					put(grammarAccess.getIgualdadAccess().getGroup_0(), "rule__Igualdad__Group_0__0");
					put(grammarAccess.getIgualdadAccess().getGroup_1(), "rule__Igualdad__Group_1__0");
					put(grammarAccess.getListaIdentificadoresAccess().getGroup(), "rule__ListaIdentificadores__Group__0");
					put(grammarAccess.getOperacionOYAccess().getGroup(), "rule__OperacionOY__Group__0");
					put(grammarAccess.getOperacionOYAccess().getGroup_1(), "rule__OperacionOY__Group_1__0");
					put(grammarAccess.getComparacionAccess().getGroup(), "rule__Comparacion__Group__0");
					put(grammarAccess.getComparacionAccess().getGroup_1(), "rule__Comparacion__Group_1__0");
					put(grammarAccess.getAritmeticaAccess().getGroup(), "rule__Aritmetica__Group__0");
					put(grammarAccess.getAritmeticaAccess().getGroup_1(), "rule__Aritmetica__Group_1__0");
					put(grammarAccess.getMultiplicacion_Access().getGroup(), "rule__Multiplicacion___Group__0");
					put(grammarAccess.getMultiplicacion_Access().getGroup_1(), "rule__Multiplicacion___Group_1__0");
					put(grammarAccess.getPotenciacionAccess().getGroup(), "rule__Potenciacion__Group__0");
					put(grammarAccess.getPotenciacionAccess().getGroup_1(), "rule__Potenciacion__Group_1__0");
					put(grammarAccess.getNegacionAccess().getGroup(), "rule__Negacion__Group__0");
					put(grammarAccess.getParentesisAccess().getGroup_0(), "rule__Parentesis__Group_0__0");
					put(grammarAccess.getDatoAccess().getGroup_0(), "rule__Dato__Group_0__0");
					put(grammarAccess.getDatoAccess().getGroup_0_1(), "rule__Dato__Group_0_1__0");
					put(grammarAccess.getListaArregloAccess().getGroup(), "rule__ListaArreglo__Group__0");
					put(grammarAccess.getListaCondicionalAccess().getGroup(), "rule__ListaCondicional__Group__0");
					put(grammarAccess.getListaCondicionalAccess().getGroup_1_0(), "rule__ListaCondicional__Group_1_0__0");
					put(grammarAccess.getListaCondicionalAccess().getGroup_1_1(), "rule__ListaCondicional__Group_1_1__0");
					put(grammarAccess.getListaImpresionAccess().getGroup(), "rule__ListaImpresion__Group__0");
					put(grammarAccess.getProgramaAccess().getDAssignment_0(), "rule__Programa__DAssignment_0");
					put(grammarAccess.getProgramaAccess().getIAssignment_1(), "rule__Programa__IAssignment_1");
					put(grammarAccess.getDeclaracionesAccess().getIAssignment_4(), "rule__Declaraciones__IAssignment_4");
					put(grammarAccess.getDeclaracionesAccess().getDAssignment_7(), "rule__Declaraciones__DAssignment_7");
					put(grammarAccess.getInstruccionesAccess().getIAssignment_1_0_2(), "rule__Instrucciones__IAssignment_1_0_2");
					put(grammarAccess.getInstruccionesAccess().getIAssignment_1_1_2(), "rule__Instrucciones__IAssignment_1_1_2");
					put(grammarAccess.getInstruccionesAccess().getIAssignment_1_2_2(), "rule__Instrucciones__IAssignment_1_2_2");
					put(grammarAccess.getInstruccionesAccess().getCAssignment_1_3_0(), "rule__Instrucciones__CAssignment_1_3_0");
					put(grammarAccess.getInstruccionesAccess().getIAssignment_1_3_2(), "rule__Instrucciones__IAssignment_1_3_2");
					put(grammarAccess.getInstruccionesAccess().getFAssignment_1_4_0(), "rule__Instrucciones__FAssignment_1_4_0");
					put(grammarAccess.getInstruccionesAccess().getIAssignment_1_4_2(), "rule__Instrucciones__IAssignment_1_4_2");
					put(grammarAccess.getInstruccionesAccess().getIAssignment_1_5_2(), "rule__Instrucciones__IAssignment_1_5_2");
					put(grammarAccess.getInstruccionesAccess().getIAssignment_1_6_2(), "rule__Instrucciones__IAssignment_1_6_2");
					put(grammarAccess.getCondicionalAccess().getIAssignment_3(), "rule__Condicional__IAssignment_3");
					put(grammarAccess.getCondicionalAccess().getLAssignment_4(), "rule__Condicional__LAssignment_4");
					put(grammarAccess.getListaCondicionalAccess().getIAssignment_1_0_3(), "rule__ListaCondicional__IAssignment_1_0_3");
					put(grammarAccess.getListaCondicionalAccess().getLAssignment_1_0_4(), "rule__ListaCondicional__LAssignment_1_0_4");
					put(grammarAccess.getListaCondicionalAccess().getIAssignment_1_1_2(), "rule__ListaCondicional__IAssignment_1_1_2");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public LinitGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LinitGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}