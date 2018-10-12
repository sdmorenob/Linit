package linit.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import linit.services.LinitGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLinitParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PROCEDIMIENTO", "RULE_IDENTIFICADOR", "RULE_FIN", "RULE_IMPORTA", "RULE_VARIABLE", "RULE_EXPORTA", "RULE_CONSTANTE", "RULE_AREGLO", "RULE_CUADRADOI", "RULE_CUADRADOD", "RULE_SI", "RULE_REPETIR", "RULE_VECES", "RULE_MIENTRAS", "RULE_SEA", "RULE_IMPRIMIR", "RULE_CAPTURAR", "RULE_ENTERA", "RULE_REAL", "RULE_LOGICA", "RULE_CARACTERES", "RULE_IGUAL", "RULE_SIGNOIGUAL", "RULE_SIGNOY", "RULE_SIGNOO", "RULE_MENOR", "RULE_SIGNOMENOR", "RULE_MENORIGUAL", "RULE_SIGNOMENORIGUAL", "RULE_MAYOR", "RULE_SIGNOMAYOR", "RULE_MAYORIGUAL", "RULE_SIGNOMAYORIGUAL", "RULE_DIFERENTE", "RULE_SIGNODIFERENTE", "RULE_SUMA", "RULE_RESTA", "RULE_MULTIPLICACION", "RULE_DIVISION", "RULE_MODULO", "RULE_POTENCIA", "RULE_NO", "RULE_IZQUIERDO", "RULE_DERECHO", "RULE_FRASE", "RULE_VERDADERO", "RULE_FALSO", "RULE_ENTERO", "RULE_NREAL", "RULE_SINO", "RULE_OTROCASO", "RULE_LINE_COMMENT", "RULE_WS", "RULE_INT", "RULE_ES", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'PROCEDIMIENTO'", "':'", "'FIN'", "'.'", "'IMPORTA'", "'VARIABLE'", "'EXPORTA'", "';'", "'CONSTANTE'", "'ARREGLO'", "'SI'", "'REPETIR'", "'VECES'", "'MIENTRAS'", "'SEA'", "'IMPRIMIR EN CONSOLA'", "'CAPTURAR DE CONSOLA'", "'ENTERA'", "'REAL'", "'LOGICA'", "'DE CARACTERES'", "'ES IGUAL A'", "'Y'", "'O'", "'ES MENOR A'", "'ES MENOR O IGUAL A'", "'ES MAYOR A'", "'ES MAYOR O IGUAL A'", "'ES DIFERENTE DE A'", "'NO SUCEDE'", "'VERDADERO'", "'FALSO'", "'O SI'", "'EN OTRO CASO'"
    };
    public static final int RULE_VECES=16;
    public static final int RULE_SIGNOMAYORIGUAL=36;
    public static final int RULE_PROCEDIMIENTO=4;
    public static final int RULE_SIGNOMENORIGUAL=32;
    public static final int RULE_RESTA=40;
    public static final int RULE_FIN=6;
    public static final int RULE_ID=59;
    public static final int RULE_LOGICA=23;
    public static final int RULE_REAL=22;
    public static final int RULE_FALSO=50;
    public static final int RULE_IGUAL=25;
    public static final int RULE_INT=57;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=61;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_MIENTRAS=17;
    public static final int RULE_FRASE=48;
    public static final int RULE_SEA=18;
    public static final int RULE_AREGLO=11;
    public static final int RULE_NREAL=52;
    public static final int RULE_SI=14;
    public static final int RULE_VERDADERO=49;
    public static final int RULE_ENTERA=21;
    public static final int RULE_VARIABLE=8;
    public static final int RULE_REPETIR=15;
    public static final int RULE_MAYOR=33;
    public static final int RULE_DERECHO=47;
    public static final int RULE_ENTERO=51;
    public static final int RULE_LINE_COMMENT=55;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int RULE_CONSTANTE=10;
    public static final int T__90=90;
    public static final int RULE_OTROCASO=54;
    public static final int RULE_SIGNODIFERENTE=38;
    public static final int RULE_POTENCIA=44;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int RULE_EXPORTA=9;
    public static final int RULE_CARACTERES=24;
    public static final int RULE_IZQUIERDO=46;
    public static final int RULE_SIGNOMAYOR=34;
    public static final int RULE_MENOR=29;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int RULE_DIFERENTE=37;
    public static final int T__72=72;
    public static final int RULE_IMPORTA=7;
    public static final int RULE_STRING=60;
    public static final int RULE_ES=58;
    public static final int RULE_SL_COMMENT=62;
    public static final int RULE_SINO=53;
    public static final int RULE_MULTIPLICACION=41;
    public static final int RULE_SIGNOY=27;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int RULE_MENORIGUAL=31;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int RULE_SIGNOO=28;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int RULE_SIGNOIGUAL=26;
    public static final int T__81=81;
    public static final int RULE_SIGNOMENOR=30;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=56;
    public static final int RULE_CUADRADOD=13;
    public static final int RULE_CAPTURAR=20;
    public static final int RULE_ANY_OTHER=63;
    public static final int RULE_CUADRADOI=12;
    public static final int RULE_MAYORIGUAL=35;
    public static final int RULE_MODULO=43;
    public static final int RULE_SUMA=39;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int RULE_IDENTIFICADOR=5;
    public static final int T__84=84;
    public static final int RULE_DIVISION=42;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int RULE_IMPRIMIR=19;
    public static final int RULE_NO=45;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalLinitParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLinitParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLinitParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLinit.g"; }



     	private LinitGrammarAccess grammarAccess;

        public InternalLinitParser(TokenStream input, LinitGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "programa";
       	}

       	@Override
       	protected LinitGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleprograma"
    // InternalLinit.g:64:1: entryRuleprograma returns [EObject current=null] : iv_ruleprograma= ruleprograma EOF ;
    public final EObject entryRuleprograma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprograma = null;


        try {
            // InternalLinit.g:64:49: (iv_ruleprograma= ruleprograma EOF )
            // InternalLinit.g:65:2: iv_ruleprograma= ruleprograma EOF
            {
             newCompositeNode(grammarAccess.getProgramaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleprograma=ruleprograma();

            state._fsp--;

             current =iv_ruleprograma; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprograma"


    // $ANTLR start "ruleprograma"
    // InternalLinit.g:71:1: ruleprograma returns [EObject current=null] : ( ( (lv_d_0_0= ruledeclaraciones ) ) ( (lv_i_1_0= ruleinstrucciones ) ) ) ;
    public final EObject ruleprograma() throws RecognitionException {
        EObject current = null;

        EObject lv_d_0_0 = null;

        EObject lv_i_1_0 = null;



        	enterRule();

        try {
            // InternalLinit.g:77:2: ( ( ( (lv_d_0_0= ruledeclaraciones ) ) ( (lv_i_1_0= ruleinstrucciones ) ) ) )
            // InternalLinit.g:78:2: ( ( (lv_d_0_0= ruledeclaraciones ) ) ( (lv_i_1_0= ruleinstrucciones ) ) )
            {
            // InternalLinit.g:78:2: ( ( (lv_d_0_0= ruledeclaraciones ) ) ( (lv_i_1_0= ruleinstrucciones ) ) )
            // InternalLinit.g:79:3: ( (lv_d_0_0= ruledeclaraciones ) ) ( (lv_i_1_0= ruleinstrucciones ) )
            {
            // InternalLinit.g:79:3: ( (lv_d_0_0= ruledeclaraciones ) )
            // InternalLinit.g:80:4: (lv_d_0_0= ruledeclaraciones )
            {
            // InternalLinit.g:80:4: (lv_d_0_0= ruledeclaraciones )
            // InternalLinit.g:81:5: lv_d_0_0= ruledeclaraciones
            {

            					newCompositeNode(grammarAccess.getProgramaAccess().getDDeclaracionesParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_d_0_0=ruledeclaraciones();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramaRule());
            					}
            					set(
            						current,
            						"d",
            						lv_d_0_0,
            						"linit.Linit.declaraciones");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLinit.g:98:3: ( (lv_i_1_0= ruleinstrucciones ) )
            // InternalLinit.g:99:4: (lv_i_1_0= ruleinstrucciones )
            {
            // InternalLinit.g:99:4: (lv_i_1_0= ruleinstrucciones )
            // InternalLinit.g:100:5: lv_i_1_0= ruleinstrucciones
            {

            					newCompositeNode(grammarAccess.getProgramaAccess().getIInstruccionesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_i_1_0=ruleinstrucciones();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramaRule());
            					}
            					set(
            						current,
            						"i",
            						lv_i_1_0,
            						"linit.Linit.instrucciones");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprograma"


    // $ANTLR start "entryRuledeclaraciones"
    // InternalLinit.g:121:1: entryRuledeclaraciones returns [EObject current=null] : iv_ruledeclaraciones= ruledeclaraciones EOF ;
    public final EObject entryRuledeclaraciones() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledeclaraciones = null;


        try {
            // InternalLinit.g:121:54: (iv_ruledeclaraciones= ruledeclaraciones EOF )
            // InternalLinit.g:122:2: iv_ruledeclaraciones= ruledeclaraciones EOF
            {
             newCompositeNode(grammarAccess.getDeclaracionesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruledeclaraciones=ruledeclaraciones();

            state._fsp--;

             current =iv_ruledeclaraciones; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledeclaraciones"


    // $ANTLR start "ruledeclaraciones"
    // InternalLinit.g:128:1: ruledeclaraciones returns [EObject current=null] : ( (otherlv_0= 'PROCEDIMIENTO' | this_PROCEDIMIENTO_1= RULE_PROCEDIMIENTO ) this_IDENTIFICADOR_2= RULE_IDENTIFICADOR ruleparametros otherlv_4= ':' ( (lv_i_5_0= ruleinstrucciones ) ) (otherlv_6= 'FIN' | this_FIN_7= RULE_FIN ) otherlv_8= '.' ( (lv_d_9_0= ruledeclaraciones ) ) )? ;
    public final EObject ruledeclaraciones() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_PROCEDIMIENTO_1=null;
        Token this_IDENTIFICADOR_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_FIN_7=null;
        Token otherlv_8=null;
        EObject lv_i_5_0 = null;

        EObject lv_d_9_0 = null;



        	enterRule();

        try {
            // InternalLinit.g:134:2: ( ( (otherlv_0= 'PROCEDIMIENTO' | this_PROCEDIMIENTO_1= RULE_PROCEDIMIENTO ) this_IDENTIFICADOR_2= RULE_IDENTIFICADOR ruleparametros otherlv_4= ':' ( (lv_i_5_0= ruleinstrucciones ) ) (otherlv_6= 'FIN' | this_FIN_7= RULE_FIN ) otherlv_8= '.' ( (lv_d_9_0= ruledeclaraciones ) ) )? )
            // InternalLinit.g:135:2: ( (otherlv_0= 'PROCEDIMIENTO' | this_PROCEDIMIENTO_1= RULE_PROCEDIMIENTO ) this_IDENTIFICADOR_2= RULE_IDENTIFICADOR ruleparametros otherlv_4= ':' ( (lv_i_5_0= ruleinstrucciones ) ) (otherlv_6= 'FIN' | this_FIN_7= RULE_FIN ) otherlv_8= '.' ( (lv_d_9_0= ruledeclaraciones ) ) )?
            {
            // InternalLinit.g:135:2: ( (otherlv_0= 'PROCEDIMIENTO' | this_PROCEDIMIENTO_1= RULE_PROCEDIMIENTO ) this_IDENTIFICADOR_2= RULE_IDENTIFICADOR ruleparametros otherlv_4= ':' ( (lv_i_5_0= ruleinstrucciones ) ) (otherlv_6= 'FIN' | this_FIN_7= RULE_FIN ) otherlv_8= '.' ( (lv_d_9_0= ruledeclaraciones ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_PROCEDIMIENTO||LA3_0==64) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalLinit.g:136:3: (otherlv_0= 'PROCEDIMIENTO' | this_PROCEDIMIENTO_1= RULE_PROCEDIMIENTO ) this_IDENTIFICADOR_2= RULE_IDENTIFICADOR ruleparametros otherlv_4= ':' ( (lv_i_5_0= ruleinstrucciones ) ) (otherlv_6= 'FIN' | this_FIN_7= RULE_FIN ) otherlv_8= '.' ( (lv_d_9_0= ruledeclaraciones ) )
                    {
                    // InternalLinit.g:136:3: (otherlv_0= 'PROCEDIMIENTO' | this_PROCEDIMIENTO_1= RULE_PROCEDIMIENTO )
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==64) ) {
                        alt1=1;
                    }
                    else if ( (LA1_0==RULE_PROCEDIMIENTO) ) {
                        alt1=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 0, input);

                        throw nvae;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalLinit.g:137:4: otherlv_0= 'PROCEDIMIENTO'
                            {
                            otherlv_0=(Token)match(input,64,FOLLOW_4); 

                            				newLeafNode(otherlv_0, grammarAccess.getDeclaracionesAccess().getPROCEDIMIENTOKeyword_0_0());
                            			

                            }
                            break;
                        case 2 :
                            // InternalLinit.g:142:4: this_PROCEDIMIENTO_1= RULE_PROCEDIMIENTO
                            {
                            this_PROCEDIMIENTO_1=(Token)match(input,RULE_PROCEDIMIENTO,FOLLOW_4); 

                            				newLeafNode(this_PROCEDIMIENTO_1, grammarAccess.getDeclaracionesAccess().getPROCEDIMIENTOTerminalRuleCall_0_1());
                            			

                            }
                            break;

                    }

                    this_IDENTIFICADOR_2=(Token)match(input,RULE_IDENTIFICADOR,FOLLOW_5); 

                    			newLeafNode(this_IDENTIFICADOR_2, grammarAccess.getDeclaracionesAccess().getIDENTIFICADORTerminalRuleCall_1());
                    		

                    			newCompositeNode(grammarAccess.getDeclaracionesAccess().getParametrosParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_6);
                    ruleparametros();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		
                    otherlv_4=(Token)match(input,65,FOLLOW_7); 

                    			newLeafNode(otherlv_4, grammarAccess.getDeclaracionesAccess().getColonKeyword_3());
                    		
                    // InternalLinit.g:162:3: ( (lv_i_5_0= ruleinstrucciones ) )
                    // InternalLinit.g:163:4: (lv_i_5_0= ruleinstrucciones )
                    {
                    // InternalLinit.g:163:4: (lv_i_5_0= ruleinstrucciones )
                    // InternalLinit.g:164:5: lv_i_5_0= ruleinstrucciones
                    {

                    					newCompositeNode(grammarAccess.getDeclaracionesAccess().getIInstruccionesParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_i_5_0=ruleinstrucciones();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclaracionesRule());
                    					}
                    					set(
                    						current,
                    						"i",
                    						lv_i_5_0,
                    						"linit.Linit.instrucciones");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }

                    // InternalLinit.g:181:3: (otherlv_6= 'FIN' | this_FIN_7= RULE_FIN )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==66) ) {
                        alt2=1;
                    }
                    else if ( (LA2_0==RULE_FIN) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalLinit.g:182:4: otherlv_6= 'FIN'
                            {
                            otherlv_6=(Token)match(input,66,FOLLOW_9); 

                            				newLeafNode(otherlv_6, grammarAccess.getDeclaracionesAccess().getFINKeyword_5_0());
                            			

                            }
                            break;
                        case 2 :
                            // InternalLinit.g:187:4: this_FIN_7= RULE_FIN
                            {
                            this_FIN_7=(Token)match(input,RULE_FIN,FOLLOW_9); 

                            				newLeafNode(this_FIN_7, grammarAccess.getDeclaracionesAccess().getFINTerminalRuleCall_5_1());
                            			

                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,67,FOLLOW_10); 

                    			newLeafNode(otherlv_8, grammarAccess.getDeclaracionesAccess().getFullStopKeyword_6());
                    		
                    // InternalLinit.g:196:3: ( (lv_d_9_0= ruledeclaraciones ) )
                    // InternalLinit.g:197:4: (lv_d_9_0= ruledeclaraciones )
                    {
                    // InternalLinit.g:197:4: (lv_d_9_0= ruledeclaraciones )
                    // InternalLinit.g:198:5: lv_d_9_0= ruledeclaraciones
                    {

                    					newCompositeNode(grammarAccess.getDeclaracionesAccess().getDDeclaracionesParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_d_9_0=ruledeclaraciones();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclaracionesRule());
                    					}
                    					set(
                    						current,
                    						"d",
                    						lv_d_9_0,
                    						"linit.Linit.declaraciones");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledeclaraciones"


    // $ANTLR start "entryRuleparametros"
    // InternalLinit.g:219:1: entryRuleparametros returns [String current=null] : iv_ruleparametros= ruleparametros EOF ;
    public final String entryRuleparametros() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleparametros = null;


        try {
            // InternalLinit.g:219:50: (iv_ruleparametros= ruleparametros EOF )
            // InternalLinit.g:220:2: iv_ruleparametros= ruleparametros EOF
            {
             newCompositeNode(grammarAccess.getParametrosRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleparametros=ruleparametros();

            state._fsp--;

             current =iv_ruleparametros.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleparametros"


    // $ANTLR start "ruleparametros"
    // InternalLinit.g:226:1: ruleparametros returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= 'IMPORTA' | this_IMPORTA_1= RULE_IMPORTA ) ( ( (kw= 'VARIABLE' | this_VARIABLE_3= RULE_VARIABLE ) this_tipoVariable_4= ruletipoVariable this_IDENTIFICADOR_5= RULE_IDENTIFICADOR ) | this_arreglo_6= rulearreglo ) this_listaParametros_7= rulelistaParametros this_exporta2_8= ruleexporta2 ) | this_exporta2_9= ruleexporta2 ) ;
    public final AntlrDatatypeRuleToken ruleparametros() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IMPORTA_1=null;
        Token this_VARIABLE_3=null;
        Token this_IDENTIFICADOR_5=null;
        AntlrDatatypeRuleToken this_tipoVariable_4 = null;

        AntlrDatatypeRuleToken this_arreglo_6 = null;

        AntlrDatatypeRuleToken this_listaParametros_7 = null;

        AntlrDatatypeRuleToken this_exporta2_8 = null;

        AntlrDatatypeRuleToken this_exporta2_9 = null;



        	enterRule();

        try {
            // InternalLinit.g:232:2: ( ( ( (kw= 'IMPORTA' | this_IMPORTA_1= RULE_IMPORTA ) ( ( (kw= 'VARIABLE' | this_VARIABLE_3= RULE_VARIABLE ) this_tipoVariable_4= ruletipoVariable this_IDENTIFICADOR_5= RULE_IDENTIFICADOR ) | this_arreglo_6= rulearreglo ) this_listaParametros_7= rulelistaParametros this_exporta2_8= ruleexporta2 ) | this_exporta2_9= ruleexporta2 ) )
            // InternalLinit.g:233:2: ( ( (kw= 'IMPORTA' | this_IMPORTA_1= RULE_IMPORTA ) ( ( (kw= 'VARIABLE' | this_VARIABLE_3= RULE_VARIABLE ) this_tipoVariable_4= ruletipoVariable this_IDENTIFICADOR_5= RULE_IDENTIFICADOR ) | this_arreglo_6= rulearreglo ) this_listaParametros_7= rulelistaParametros this_exporta2_8= ruleexporta2 ) | this_exporta2_9= ruleexporta2 )
            {
            // InternalLinit.g:233:2: ( ( (kw= 'IMPORTA' | this_IMPORTA_1= RULE_IMPORTA ) ( ( (kw= 'VARIABLE' | this_VARIABLE_3= RULE_VARIABLE ) this_tipoVariable_4= ruletipoVariable this_IDENTIFICADOR_5= RULE_IDENTIFICADOR ) | this_arreglo_6= rulearreglo ) this_listaParametros_7= rulelistaParametros this_exporta2_8= ruleexporta2 ) | this_exporta2_9= ruleexporta2 )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_IMPORTA||LA7_0==68) ) {
                alt7=1;
            }
            else if ( (LA7_0==EOF||LA7_0==RULE_EXPORTA||LA7_0==65||LA7_0==70) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalLinit.g:234:3: ( (kw= 'IMPORTA' | this_IMPORTA_1= RULE_IMPORTA ) ( ( (kw= 'VARIABLE' | this_VARIABLE_3= RULE_VARIABLE ) this_tipoVariable_4= ruletipoVariable this_IDENTIFICADOR_5= RULE_IDENTIFICADOR ) | this_arreglo_6= rulearreglo ) this_listaParametros_7= rulelistaParametros this_exporta2_8= ruleexporta2 )
                    {
                    // InternalLinit.g:234:3: ( (kw= 'IMPORTA' | this_IMPORTA_1= RULE_IMPORTA ) ( ( (kw= 'VARIABLE' | this_VARIABLE_3= RULE_VARIABLE ) this_tipoVariable_4= ruletipoVariable this_IDENTIFICADOR_5= RULE_IDENTIFICADOR ) | this_arreglo_6= rulearreglo ) this_listaParametros_7= rulelistaParametros this_exporta2_8= ruleexporta2 )
                    // InternalLinit.g:235:4: (kw= 'IMPORTA' | this_IMPORTA_1= RULE_IMPORTA ) ( ( (kw= 'VARIABLE' | this_VARIABLE_3= RULE_VARIABLE ) this_tipoVariable_4= ruletipoVariable this_IDENTIFICADOR_5= RULE_IDENTIFICADOR ) | this_arreglo_6= rulearreglo ) this_listaParametros_7= rulelistaParametros this_exporta2_8= ruleexporta2
                    {
                    // InternalLinit.g:235:4: (kw= 'IMPORTA' | this_IMPORTA_1= RULE_IMPORTA )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==68) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==RULE_IMPORTA) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalLinit.g:236:5: kw= 'IMPORTA'
                            {
                            kw=(Token)match(input,68,FOLLOW_11); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getParametrosAccess().getIMPORTAKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalLinit.g:242:5: this_IMPORTA_1= RULE_IMPORTA
                            {
                            this_IMPORTA_1=(Token)match(input,RULE_IMPORTA,FOLLOW_11); 

                            					current.merge(this_IMPORTA_1);
                            				

                            					newLeafNode(this_IMPORTA_1, grammarAccess.getParametrosAccess().getIMPORTATerminalRuleCall_0_0_1());
                            				

                            }
                            break;

                    }

                    // InternalLinit.g:250:4: ( ( (kw= 'VARIABLE' | this_VARIABLE_3= RULE_VARIABLE ) this_tipoVariable_4= ruletipoVariable this_IDENTIFICADOR_5= RULE_IDENTIFICADOR ) | this_arreglo_6= rulearreglo )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_VARIABLE||LA6_0==69) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==RULE_AREGLO||LA6_0==73) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalLinit.g:251:5: ( (kw= 'VARIABLE' | this_VARIABLE_3= RULE_VARIABLE ) this_tipoVariable_4= ruletipoVariable this_IDENTIFICADOR_5= RULE_IDENTIFICADOR )
                            {
                            // InternalLinit.g:251:5: ( (kw= 'VARIABLE' | this_VARIABLE_3= RULE_VARIABLE ) this_tipoVariable_4= ruletipoVariable this_IDENTIFICADOR_5= RULE_IDENTIFICADOR )
                            // InternalLinit.g:252:6: (kw= 'VARIABLE' | this_VARIABLE_3= RULE_VARIABLE ) this_tipoVariable_4= ruletipoVariable this_IDENTIFICADOR_5= RULE_IDENTIFICADOR
                            {
                            // InternalLinit.g:252:6: (kw= 'VARIABLE' | this_VARIABLE_3= RULE_VARIABLE )
                            int alt5=2;
                            int LA5_0 = input.LA(1);

                            if ( (LA5_0==69) ) {
                                alt5=1;
                            }
                            else if ( (LA5_0==RULE_VARIABLE) ) {
                                alt5=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 0, input);

                                throw nvae;
                            }
                            switch (alt5) {
                                case 1 :
                                    // InternalLinit.g:253:7: kw= 'VARIABLE'
                                    {
                                    kw=(Token)match(input,69,FOLLOW_12); 

                                    							current.merge(kw);
                                    							newLeafNode(kw, grammarAccess.getParametrosAccess().getVARIABLEKeyword_0_1_0_0_0());
                                    						

                                    }
                                    break;
                                case 2 :
                                    // InternalLinit.g:259:7: this_VARIABLE_3= RULE_VARIABLE
                                    {
                                    this_VARIABLE_3=(Token)match(input,RULE_VARIABLE,FOLLOW_12); 

                                    							current.merge(this_VARIABLE_3);
                                    						

                                    							newLeafNode(this_VARIABLE_3, grammarAccess.getParametrosAccess().getVARIABLETerminalRuleCall_0_1_0_0_1());
                                    						

                                    }
                                    break;

                            }


                            						newCompositeNode(grammarAccess.getParametrosAccess().getTipoVariableParserRuleCall_0_1_0_1());
                            					
                            pushFollow(FOLLOW_4);
                            this_tipoVariable_4=ruletipoVariable();

                            state._fsp--;


                            						current.merge(this_tipoVariable_4);
                            					

                            						afterParserOrEnumRuleCall();
                            					
                            this_IDENTIFICADOR_5=(Token)match(input,RULE_IDENTIFICADOR,FOLLOW_13); 

                            						current.merge(this_IDENTIFICADOR_5);
                            					

                            						newLeafNode(this_IDENTIFICADOR_5, grammarAccess.getParametrosAccess().getIDENTIFICADORTerminalRuleCall_0_1_0_2());
                            					

                            }


                            }
                            break;
                        case 2 :
                            // InternalLinit.g:286:5: this_arreglo_6= rulearreglo
                            {

                            					newCompositeNode(grammarAccess.getParametrosAccess().getArregloParserRuleCall_0_1_1());
                            				
                            pushFollow(FOLLOW_13);
                            this_arreglo_6=rulearreglo();

                            state._fsp--;


                            					current.merge(this_arreglo_6);
                            				

                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getParametrosAccess().getListaParametrosParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_14);
                    this_listaParametros_7=rulelistaParametros();

                    state._fsp--;


                    				current.merge(this_listaParametros_7);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getParametrosAccess().getExporta2ParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_2);
                    this_exporta2_8=ruleexporta2();

                    state._fsp--;


                    				current.merge(this_exporta2_8);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLinit.g:319:3: this_exporta2_9= ruleexporta2
                    {

                    			newCompositeNode(grammarAccess.getParametrosAccess().getExporta2ParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_exporta2_9=ruleexporta2();

                    state._fsp--;


                    			current.merge(this_exporta2_9);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleparametros"


    // $ANTLR start "entryRuleexporta2"
    // InternalLinit.g:333:1: entryRuleexporta2 returns [String current=null] : iv_ruleexporta2= ruleexporta2 EOF ;
    public final String entryRuleexporta2() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexporta2 = null;


        try {
            // InternalLinit.g:333:48: (iv_ruleexporta2= ruleexporta2 EOF )
            // InternalLinit.g:334:2: iv_ruleexporta2= ruleexporta2 EOF
            {
             newCompositeNode(grammarAccess.getExporta2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleexporta2=ruleexporta2();

            state._fsp--;

             current =iv_ruleexporta2.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexporta2"


    // $ANTLR start "ruleexporta2"
    // InternalLinit.g:340:1: ruleexporta2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'EXPORTA' | this_EXPORTA_1= RULE_EXPORTA ) ( ( (kw= 'VARIABLE' | this_VARIABLE_3= RULE_VARIABLE ) this_tipoVariable_4= ruletipoVariable this_IDENTIFICADOR_5= RULE_IDENTIFICADOR ) | this_arreglo_6= rulearreglo ) this_listaParametros_7= rulelistaParametros )? ;
    public final AntlrDatatypeRuleToken ruleexporta2() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_EXPORTA_1=null;
        Token this_VARIABLE_3=null;
        Token this_IDENTIFICADOR_5=null;
        AntlrDatatypeRuleToken this_tipoVariable_4 = null;

        AntlrDatatypeRuleToken this_arreglo_6 = null;

        AntlrDatatypeRuleToken this_listaParametros_7 = null;



        	enterRule();

        try {
            // InternalLinit.g:346:2: ( ( (kw= 'EXPORTA' | this_EXPORTA_1= RULE_EXPORTA ) ( ( (kw= 'VARIABLE' | this_VARIABLE_3= RULE_VARIABLE ) this_tipoVariable_4= ruletipoVariable this_IDENTIFICADOR_5= RULE_IDENTIFICADOR ) | this_arreglo_6= rulearreglo ) this_listaParametros_7= rulelistaParametros )? )
            // InternalLinit.g:347:2: ( (kw= 'EXPORTA' | this_EXPORTA_1= RULE_EXPORTA ) ( ( (kw= 'VARIABLE' | this_VARIABLE_3= RULE_VARIABLE ) this_tipoVariable_4= ruletipoVariable this_IDENTIFICADOR_5= RULE_IDENTIFICADOR ) | this_arreglo_6= rulearreglo ) this_listaParametros_7= rulelistaParametros )?
            {
            // InternalLinit.g:347:2: ( (kw= 'EXPORTA' | this_EXPORTA_1= RULE_EXPORTA ) ( ( (kw= 'VARIABLE' | this_VARIABLE_3= RULE_VARIABLE ) this_tipoVariable_4= ruletipoVariable this_IDENTIFICADOR_5= RULE_IDENTIFICADOR ) | this_arreglo_6= rulearreglo ) this_listaParametros_7= rulelistaParametros )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_EXPORTA||LA11_0==70) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalLinit.g:348:3: (kw= 'EXPORTA' | this_EXPORTA_1= RULE_EXPORTA ) ( ( (kw= 'VARIABLE' | this_VARIABLE_3= RULE_VARIABLE ) this_tipoVariable_4= ruletipoVariable this_IDENTIFICADOR_5= RULE_IDENTIFICADOR ) | this_arreglo_6= rulearreglo ) this_listaParametros_7= rulelistaParametros
                    {
                    // InternalLinit.g:348:3: (kw= 'EXPORTA' | this_EXPORTA_1= RULE_EXPORTA )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==70) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==RULE_EXPORTA) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalLinit.g:349:4: kw= 'EXPORTA'
                            {
                            kw=(Token)match(input,70,FOLLOW_11); 

                            				current.merge(kw);
                            				newLeafNode(kw, grammarAccess.getExporta2Access().getEXPORTAKeyword_0_0());
                            			

                            }
                            break;
                        case 2 :
                            // InternalLinit.g:355:4: this_EXPORTA_1= RULE_EXPORTA
                            {
                            this_EXPORTA_1=(Token)match(input,RULE_EXPORTA,FOLLOW_11); 

                            				current.merge(this_EXPORTA_1);
                            			

                            				newLeafNode(this_EXPORTA_1, grammarAccess.getExporta2Access().getEXPORTATerminalRuleCall_0_1());
                            			

                            }
                            break;

                    }

                    // InternalLinit.g:363:3: ( ( (kw= 'VARIABLE' | this_VARIABLE_3= RULE_VARIABLE ) this_tipoVariable_4= ruletipoVariable this_IDENTIFICADOR_5= RULE_IDENTIFICADOR ) | this_arreglo_6= rulearreglo )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_VARIABLE||LA10_0==69) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==RULE_AREGLO||LA10_0==73) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalLinit.g:364:4: ( (kw= 'VARIABLE' | this_VARIABLE_3= RULE_VARIABLE ) this_tipoVariable_4= ruletipoVariable this_IDENTIFICADOR_5= RULE_IDENTIFICADOR )
                            {
                            // InternalLinit.g:364:4: ( (kw= 'VARIABLE' | this_VARIABLE_3= RULE_VARIABLE ) this_tipoVariable_4= ruletipoVariable this_IDENTIFICADOR_5= RULE_IDENTIFICADOR )
                            // InternalLinit.g:365:5: (kw= 'VARIABLE' | this_VARIABLE_3= RULE_VARIABLE ) this_tipoVariable_4= ruletipoVariable this_IDENTIFICADOR_5= RULE_IDENTIFICADOR
                            {
                            // InternalLinit.g:365:5: (kw= 'VARIABLE' | this_VARIABLE_3= RULE_VARIABLE )
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( (LA9_0==69) ) {
                                alt9=1;
                            }
                            else if ( (LA9_0==RULE_VARIABLE) ) {
                                alt9=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 9, 0, input);

                                throw nvae;
                            }
                            switch (alt9) {
                                case 1 :
                                    // InternalLinit.g:366:6: kw= 'VARIABLE'
                                    {
                                    kw=(Token)match(input,69,FOLLOW_12); 

                                    						current.merge(kw);
                                    						newLeafNode(kw, grammarAccess.getExporta2Access().getVARIABLEKeyword_1_0_0_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalLinit.g:372:6: this_VARIABLE_3= RULE_VARIABLE
                                    {
                                    this_VARIABLE_3=(Token)match(input,RULE_VARIABLE,FOLLOW_12); 

                                    						current.merge(this_VARIABLE_3);
                                    					

                                    						newLeafNode(this_VARIABLE_3, grammarAccess.getExporta2Access().getVARIABLETerminalRuleCall_1_0_0_1());
                                    					

                                    }
                                    break;

                            }


                            					newCompositeNode(grammarAccess.getExporta2Access().getTipoVariableParserRuleCall_1_0_1());
                            				
                            pushFollow(FOLLOW_4);
                            this_tipoVariable_4=ruletipoVariable();

                            state._fsp--;


                            					current.merge(this_tipoVariable_4);
                            				

                            					afterParserOrEnumRuleCall();
                            				
                            this_IDENTIFICADOR_5=(Token)match(input,RULE_IDENTIFICADOR,FOLLOW_15); 

                            					current.merge(this_IDENTIFICADOR_5);
                            				

                            					newLeafNode(this_IDENTIFICADOR_5, grammarAccess.getExporta2Access().getIDENTIFICADORTerminalRuleCall_1_0_2());
                            				

                            }


                            }
                            break;
                        case 2 :
                            // InternalLinit.g:399:4: this_arreglo_6= rulearreglo
                            {

                            				newCompositeNode(grammarAccess.getExporta2Access().getArregloParserRuleCall_1_1());
                            			
                            pushFollow(FOLLOW_15);
                            this_arreglo_6=rulearreglo();

                            state._fsp--;


                            				current.merge(this_arreglo_6);
                            			

                            				afterParserOrEnumRuleCall();
                            			

                            }
                            break;

                    }


                    			newCompositeNode(grammarAccess.getExporta2Access().getListaParametrosParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_listaParametros_7=rulelistaParametros();

                    state._fsp--;


                    			current.merge(this_listaParametros_7);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexporta2"


    // $ANTLR start "entryRulelistaParametros"
    // InternalLinit.g:424:1: entryRulelistaParametros returns [String current=null] : iv_rulelistaParametros= rulelistaParametros EOF ;
    public final String entryRulelistaParametros() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelistaParametros = null;


        try {
            // InternalLinit.g:424:55: (iv_rulelistaParametros= rulelistaParametros EOF )
            // InternalLinit.g:425:2: iv_rulelistaParametros= rulelistaParametros EOF
            {
             newCompositeNode(grammarAccess.getListaParametrosRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelistaParametros=rulelistaParametros();

            state._fsp--;

             current =iv_rulelistaParametros.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelistaParametros"


    // $ANTLR start "rulelistaParametros"
    // InternalLinit.g:431:1: rulelistaParametros returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ';' ( (this_tipoVariable_1= ruletipoVariable this_IDENTIFICADOR_2= RULE_IDENTIFICADOR ) | this_arreglo_3= rulearreglo ) this_listaParametros_4= rulelistaParametros )? ;
    public final AntlrDatatypeRuleToken rulelistaParametros() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFICADOR_2=null;
        AntlrDatatypeRuleToken this_tipoVariable_1 = null;

        AntlrDatatypeRuleToken this_arreglo_3 = null;

        AntlrDatatypeRuleToken this_listaParametros_4 = null;



        	enterRule();

        try {
            // InternalLinit.g:437:2: ( (kw= ';' ( (this_tipoVariable_1= ruletipoVariable this_IDENTIFICADOR_2= RULE_IDENTIFICADOR ) | this_arreglo_3= rulearreglo ) this_listaParametros_4= rulelistaParametros )? )
            // InternalLinit.g:438:2: (kw= ';' ( (this_tipoVariable_1= ruletipoVariable this_IDENTIFICADOR_2= RULE_IDENTIFICADOR ) | this_arreglo_3= rulearreglo ) this_listaParametros_4= rulelistaParametros )?
            {
            // InternalLinit.g:438:2: (kw= ';' ( (this_tipoVariable_1= ruletipoVariable this_IDENTIFICADOR_2= RULE_IDENTIFICADOR ) | this_arreglo_3= rulearreglo ) this_listaParametros_4= rulelistaParametros )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==71) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalLinit.g:439:3: kw= ';' ( (this_tipoVariable_1= ruletipoVariable this_IDENTIFICADOR_2= RULE_IDENTIFICADOR ) | this_arreglo_3= rulearreglo ) this_listaParametros_4= rulelistaParametros
                    {
                    kw=(Token)match(input,71,FOLLOW_16); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getListaParametrosAccess().getSemicolonKeyword_0());
                    		
                    // InternalLinit.g:444:3: ( (this_tipoVariable_1= ruletipoVariable this_IDENTIFICADOR_2= RULE_IDENTIFICADOR ) | this_arreglo_3= rulearreglo )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0>=RULE_ENTERA && LA12_0<=RULE_CARACTERES)||(LA12_0>=81 && LA12_0<=84)) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==RULE_AREGLO||LA12_0==73) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalLinit.g:445:4: (this_tipoVariable_1= ruletipoVariable this_IDENTIFICADOR_2= RULE_IDENTIFICADOR )
                            {
                            // InternalLinit.g:445:4: (this_tipoVariable_1= ruletipoVariable this_IDENTIFICADOR_2= RULE_IDENTIFICADOR )
                            // InternalLinit.g:446:5: this_tipoVariable_1= ruletipoVariable this_IDENTIFICADOR_2= RULE_IDENTIFICADOR
                            {

                            					newCompositeNode(grammarAccess.getListaParametrosAccess().getTipoVariableParserRuleCall_1_0_0());
                            				
                            pushFollow(FOLLOW_4);
                            this_tipoVariable_1=ruletipoVariable();

                            state._fsp--;


                            					current.merge(this_tipoVariable_1);
                            				

                            					afterParserOrEnumRuleCall();
                            				
                            this_IDENTIFICADOR_2=(Token)match(input,RULE_IDENTIFICADOR,FOLLOW_15); 

                            					current.merge(this_IDENTIFICADOR_2);
                            				

                            					newLeafNode(this_IDENTIFICADOR_2, grammarAccess.getListaParametrosAccess().getIDENTIFICADORTerminalRuleCall_1_0_1());
                            				

                            }


                            }
                            break;
                        case 2 :
                            // InternalLinit.g:465:4: this_arreglo_3= rulearreglo
                            {

                            				newCompositeNode(grammarAccess.getListaParametrosAccess().getArregloParserRuleCall_1_1());
                            			
                            pushFollow(FOLLOW_15);
                            this_arreglo_3=rulearreglo();

                            state._fsp--;


                            				current.merge(this_arreglo_3);
                            			

                            				afterParserOrEnumRuleCall();
                            			

                            }
                            break;

                    }


                    			newCompositeNode(grammarAccess.getListaParametrosAccess().getListaParametrosParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_listaParametros_4=rulelistaParametros();

                    state._fsp--;


                    			current.merge(this_listaParametros_4);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelistaParametros"


    // $ANTLR start "entryRuleinstrucciones"
    // InternalLinit.g:490:1: entryRuleinstrucciones returns [EObject current=null] : iv_ruleinstrucciones= ruleinstrucciones EOF ;
    public final EObject entryRuleinstrucciones() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinstrucciones = null;


        try {
            // InternalLinit.g:490:54: (iv_ruleinstrucciones= ruleinstrucciones EOF )
            // InternalLinit.g:491:2: iv_ruleinstrucciones= ruleinstrucciones EOF
            {
             newCompositeNode(grammarAccess.getInstruccionesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleinstrucciones=ruleinstrucciones();

            state._fsp--;

             current =iv_ruleinstrucciones; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleinstrucciones"


    // $ANTLR start "ruleinstrucciones"
    // InternalLinit.g:497:1: ruleinstrucciones returns [EObject current=null] : ( () ( ( rulenominacion otherlv_2= '.' ( (lv_i_3_0= ruleinstrucciones ) ) ) | ( rulearreglo otherlv_5= '.' ( (lv_i_6_0= ruleinstrucciones ) ) ) | ( rulellamadaIdentificador otherlv_8= '.' ( (lv_i_9_0= ruleinstrucciones ) ) ) | ( ( (lv_c_10_0= rulecondicional ) ) otherlv_11= '.' ( (lv_i_12_0= ruleinstrucciones ) ) ) | ( ( (lv_f_13_0= ruleciclo ) ) otherlv_14= '.' ( (lv_i_15_0= ruleinstrucciones ) ) ) | ( ruleimpresion otherlv_17= '.' ( (lv_i_18_0= ruleinstrucciones ) ) ) | ( ruleentrada otherlv_20= '.' ( (lv_i_21_0= ruleinstrucciones ) ) ) )? ) ;
    public final EObject ruleinstrucciones() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        EObject lv_i_3_0 = null;

        EObject lv_i_6_0 = null;

        EObject lv_i_9_0 = null;

        EObject lv_c_10_0 = null;

        EObject lv_i_12_0 = null;

        EObject lv_f_13_0 = null;

        EObject lv_i_15_0 = null;

        EObject lv_i_18_0 = null;

        EObject lv_i_21_0 = null;



        	enterRule();

        try {
            // InternalLinit.g:503:2: ( ( () ( ( rulenominacion otherlv_2= '.' ( (lv_i_3_0= ruleinstrucciones ) ) ) | ( rulearreglo otherlv_5= '.' ( (lv_i_6_0= ruleinstrucciones ) ) ) | ( rulellamadaIdentificador otherlv_8= '.' ( (lv_i_9_0= ruleinstrucciones ) ) ) | ( ( (lv_c_10_0= rulecondicional ) ) otherlv_11= '.' ( (lv_i_12_0= ruleinstrucciones ) ) ) | ( ( (lv_f_13_0= ruleciclo ) ) otherlv_14= '.' ( (lv_i_15_0= ruleinstrucciones ) ) ) | ( ruleimpresion otherlv_17= '.' ( (lv_i_18_0= ruleinstrucciones ) ) ) | ( ruleentrada otherlv_20= '.' ( (lv_i_21_0= ruleinstrucciones ) ) ) )? ) )
            // InternalLinit.g:504:2: ( () ( ( rulenominacion otherlv_2= '.' ( (lv_i_3_0= ruleinstrucciones ) ) ) | ( rulearreglo otherlv_5= '.' ( (lv_i_6_0= ruleinstrucciones ) ) ) | ( rulellamadaIdentificador otherlv_8= '.' ( (lv_i_9_0= ruleinstrucciones ) ) ) | ( ( (lv_c_10_0= rulecondicional ) ) otherlv_11= '.' ( (lv_i_12_0= ruleinstrucciones ) ) ) | ( ( (lv_f_13_0= ruleciclo ) ) otherlv_14= '.' ( (lv_i_15_0= ruleinstrucciones ) ) ) | ( ruleimpresion otherlv_17= '.' ( (lv_i_18_0= ruleinstrucciones ) ) ) | ( ruleentrada otherlv_20= '.' ( (lv_i_21_0= ruleinstrucciones ) ) ) )? )
            {
            // InternalLinit.g:504:2: ( () ( ( rulenominacion otherlv_2= '.' ( (lv_i_3_0= ruleinstrucciones ) ) ) | ( rulearreglo otherlv_5= '.' ( (lv_i_6_0= ruleinstrucciones ) ) ) | ( rulellamadaIdentificador otherlv_8= '.' ( (lv_i_9_0= ruleinstrucciones ) ) ) | ( ( (lv_c_10_0= rulecondicional ) ) otherlv_11= '.' ( (lv_i_12_0= ruleinstrucciones ) ) ) | ( ( (lv_f_13_0= ruleciclo ) ) otherlv_14= '.' ( (lv_i_15_0= ruleinstrucciones ) ) ) | ( ruleimpresion otherlv_17= '.' ( (lv_i_18_0= ruleinstrucciones ) ) ) | ( ruleentrada otherlv_20= '.' ( (lv_i_21_0= ruleinstrucciones ) ) ) )? )
            // InternalLinit.g:505:3: () ( ( rulenominacion otherlv_2= '.' ( (lv_i_3_0= ruleinstrucciones ) ) ) | ( rulearreglo otherlv_5= '.' ( (lv_i_6_0= ruleinstrucciones ) ) ) | ( rulellamadaIdentificador otherlv_8= '.' ( (lv_i_9_0= ruleinstrucciones ) ) ) | ( ( (lv_c_10_0= rulecondicional ) ) otherlv_11= '.' ( (lv_i_12_0= ruleinstrucciones ) ) ) | ( ( (lv_f_13_0= ruleciclo ) ) otherlv_14= '.' ( (lv_i_15_0= ruleinstrucciones ) ) ) | ( ruleimpresion otherlv_17= '.' ( (lv_i_18_0= ruleinstrucciones ) ) ) | ( ruleentrada otherlv_20= '.' ( (lv_i_21_0= ruleinstrucciones ) ) ) )?
            {
            // InternalLinit.g:505:3: ()
            // InternalLinit.g:506:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInstruccionesAccess().getInstruccionesAction_0(),
            					current);
            			

            }

            // InternalLinit.g:512:3: ( ( rulenominacion otherlv_2= '.' ( (lv_i_3_0= ruleinstrucciones ) ) ) | ( rulearreglo otherlv_5= '.' ( (lv_i_6_0= ruleinstrucciones ) ) ) | ( rulellamadaIdentificador otherlv_8= '.' ( (lv_i_9_0= ruleinstrucciones ) ) ) | ( ( (lv_c_10_0= rulecondicional ) ) otherlv_11= '.' ( (lv_i_12_0= ruleinstrucciones ) ) ) | ( ( (lv_f_13_0= ruleciclo ) ) otherlv_14= '.' ( (lv_i_15_0= ruleinstrucciones ) ) ) | ( ruleimpresion otherlv_17= '.' ( (lv_i_18_0= ruleinstrucciones ) ) ) | ( ruleentrada otherlv_20= '.' ( (lv_i_21_0= ruleinstrucciones ) ) ) )?
            int alt14=8;
            switch ( input.LA(1) ) {
                case RULE_VARIABLE:
                case RULE_CONSTANTE:
                case 69:
                case 72:
                    {
                    alt14=1;
                    }
                    break;
                case RULE_AREGLO:
                case 73:
                    {
                    alt14=2;
                    }
                    break;
                case RULE_IDENTIFICADOR:
                    {
                    alt14=3;
                    }
                    break;
                case RULE_SI:
                case 74:
                    {
                    alt14=4;
                    }
                    break;
                case RULE_REPETIR:
                case 75:
                    {
                    alt14=5;
                    }
                    break;
                case RULE_IMPRIMIR:
                case 79:
                    {
                    alt14=6;
                    }
                    break;
                case RULE_CAPTURAR:
                case 80:
                    {
                    alt14=7;
                    }
                    break;
            }

            switch (alt14) {
                case 1 :
                    // InternalLinit.g:513:4: ( rulenominacion otherlv_2= '.' ( (lv_i_3_0= ruleinstrucciones ) ) )
                    {
                    // InternalLinit.g:513:4: ( rulenominacion otherlv_2= '.' ( (lv_i_3_0= ruleinstrucciones ) ) )
                    // InternalLinit.g:514:5: rulenominacion otherlv_2= '.' ( (lv_i_3_0= ruleinstrucciones ) )
                    {

                    					newCompositeNode(grammarAccess.getInstruccionesAccess().getNominacionParserRuleCall_1_0_0());
                    				
                    pushFollow(FOLLOW_9);
                    rulenominacion();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    otherlv_2=(Token)match(input,67,FOLLOW_3); 

                    					newLeafNode(otherlv_2, grammarAccess.getInstruccionesAccess().getFullStopKeyword_1_0_1());
                    				
                    // InternalLinit.g:525:5: ( (lv_i_3_0= ruleinstrucciones ) )
                    // InternalLinit.g:526:6: (lv_i_3_0= ruleinstrucciones )
                    {
                    // InternalLinit.g:526:6: (lv_i_3_0= ruleinstrucciones )
                    // InternalLinit.g:527:7: lv_i_3_0= ruleinstrucciones
                    {

                    							newCompositeNode(grammarAccess.getInstruccionesAccess().getIInstruccionesParserRuleCall_1_0_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_i_3_0=ruleinstrucciones();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getInstruccionesRule());
                    							}
                    							set(
                    								current,
                    								"i",
                    								lv_i_3_0,
                    								"linit.Linit.instrucciones");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLinit.g:546:4: ( rulearreglo otherlv_5= '.' ( (lv_i_6_0= ruleinstrucciones ) ) )
                    {
                    // InternalLinit.g:546:4: ( rulearreglo otherlv_5= '.' ( (lv_i_6_0= ruleinstrucciones ) ) )
                    // InternalLinit.g:547:5: rulearreglo otherlv_5= '.' ( (lv_i_6_0= ruleinstrucciones ) )
                    {

                    					newCompositeNode(grammarAccess.getInstruccionesAccess().getArregloParserRuleCall_1_1_0());
                    				
                    pushFollow(FOLLOW_9);
                    rulearreglo();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    otherlv_5=(Token)match(input,67,FOLLOW_3); 

                    					newLeafNode(otherlv_5, grammarAccess.getInstruccionesAccess().getFullStopKeyword_1_1_1());
                    				
                    // InternalLinit.g:558:5: ( (lv_i_6_0= ruleinstrucciones ) )
                    // InternalLinit.g:559:6: (lv_i_6_0= ruleinstrucciones )
                    {
                    // InternalLinit.g:559:6: (lv_i_6_0= ruleinstrucciones )
                    // InternalLinit.g:560:7: lv_i_6_0= ruleinstrucciones
                    {

                    							newCompositeNode(grammarAccess.getInstruccionesAccess().getIInstruccionesParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_i_6_0=ruleinstrucciones();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getInstruccionesRule());
                    							}
                    							set(
                    								current,
                    								"i",
                    								lv_i_6_0,
                    								"linit.Linit.instrucciones");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalLinit.g:579:4: ( rulellamadaIdentificador otherlv_8= '.' ( (lv_i_9_0= ruleinstrucciones ) ) )
                    {
                    // InternalLinit.g:579:4: ( rulellamadaIdentificador otherlv_8= '.' ( (lv_i_9_0= ruleinstrucciones ) ) )
                    // InternalLinit.g:580:5: rulellamadaIdentificador otherlv_8= '.' ( (lv_i_9_0= ruleinstrucciones ) )
                    {

                    					newCompositeNode(grammarAccess.getInstruccionesAccess().getLlamadaIdentificadorParserRuleCall_1_2_0());
                    				
                    pushFollow(FOLLOW_9);
                    rulellamadaIdentificador();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    otherlv_8=(Token)match(input,67,FOLLOW_3); 

                    					newLeafNode(otherlv_8, grammarAccess.getInstruccionesAccess().getFullStopKeyword_1_2_1());
                    				
                    // InternalLinit.g:591:5: ( (lv_i_9_0= ruleinstrucciones ) )
                    // InternalLinit.g:592:6: (lv_i_9_0= ruleinstrucciones )
                    {
                    // InternalLinit.g:592:6: (lv_i_9_0= ruleinstrucciones )
                    // InternalLinit.g:593:7: lv_i_9_0= ruleinstrucciones
                    {

                    							newCompositeNode(grammarAccess.getInstruccionesAccess().getIInstruccionesParserRuleCall_1_2_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_i_9_0=ruleinstrucciones();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getInstruccionesRule());
                    							}
                    							set(
                    								current,
                    								"i",
                    								lv_i_9_0,
                    								"linit.Linit.instrucciones");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalLinit.g:612:4: ( ( (lv_c_10_0= rulecondicional ) ) otherlv_11= '.' ( (lv_i_12_0= ruleinstrucciones ) ) )
                    {
                    // InternalLinit.g:612:4: ( ( (lv_c_10_0= rulecondicional ) ) otherlv_11= '.' ( (lv_i_12_0= ruleinstrucciones ) ) )
                    // InternalLinit.g:613:5: ( (lv_c_10_0= rulecondicional ) ) otherlv_11= '.' ( (lv_i_12_0= ruleinstrucciones ) )
                    {
                    // InternalLinit.g:613:5: ( (lv_c_10_0= rulecondicional ) )
                    // InternalLinit.g:614:6: (lv_c_10_0= rulecondicional )
                    {
                    // InternalLinit.g:614:6: (lv_c_10_0= rulecondicional )
                    // InternalLinit.g:615:7: lv_c_10_0= rulecondicional
                    {

                    							newCompositeNode(grammarAccess.getInstruccionesAccess().getCCondicionalParserRuleCall_1_3_0_0());
                    						
                    pushFollow(FOLLOW_9);
                    lv_c_10_0=rulecondicional();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getInstruccionesRule());
                    							}
                    							set(
                    								current,
                    								"c",
                    								lv_c_10_0,
                    								"linit.Linit.condicional");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_11=(Token)match(input,67,FOLLOW_3); 

                    					newLeafNode(otherlv_11, grammarAccess.getInstruccionesAccess().getFullStopKeyword_1_3_1());
                    				
                    // InternalLinit.g:636:5: ( (lv_i_12_0= ruleinstrucciones ) )
                    // InternalLinit.g:637:6: (lv_i_12_0= ruleinstrucciones )
                    {
                    // InternalLinit.g:637:6: (lv_i_12_0= ruleinstrucciones )
                    // InternalLinit.g:638:7: lv_i_12_0= ruleinstrucciones
                    {

                    							newCompositeNode(grammarAccess.getInstruccionesAccess().getIInstruccionesParserRuleCall_1_3_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_i_12_0=ruleinstrucciones();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getInstruccionesRule());
                    							}
                    							set(
                    								current,
                    								"i",
                    								lv_i_12_0,
                    								"linit.Linit.instrucciones");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalLinit.g:657:4: ( ( (lv_f_13_0= ruleciclo ) ) otherlv_14= '.' ( (lv_i_15_0= ruleinstrucciones ) ) )
                    {
                    // InternalLinit.g:657:4: ( ( (lv_f_13_0= ruleciclo ) ) otherlv_14= '.' ( (lv_i_15_0= ruleinstrucciones ) ) )
                    // InternalLinit.g:658:5: ( (lv_f_13_0= ruleciclo ) ) otherlv_14= '.' ( (lv_i_15_0= ruleinstrucciones ) )
                    {
                    // InternalLinit.g:658:5: ( (lv_f_13_0= ruleciclo ) )
                    // InternalLinit.g:659:6: (lv_f_13_0= ruleciclo )
                    {
                    // InternalLinit.g:659:6: (lv_f_13_0= ruleciclo )
                    // InternalLinit.g:660:7: lv_f_13_0= ruleciclo
                    {

                    							newCompositeNode(grammarAccess.getInstruccionesAccess().getFCicloParserRuleCall_1_4_0_0());
                    						
                    pushFollow(FOLLOW_9);
                    lv_f_13_0=ruleciclo();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getInstruccionesRule());
                    							}
                    							add(
                    								current,
                    								"f",
                    								lv_f_13_0,
                    								"linit.Linit.ciclo");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_14=(Token)match(input,67,FOLLOW_3); 

                    					newLeafNode(otherlv_14, grammarAccess.getInstruccionesAccess().getFullStopKeyword_1_4_1());
                    				
                    // InternalLinit.g:681:5: ( (lv_i_15_0= ruleinstrucciones ) )
                    // InternalLinit.g:682:6: (lv_i_15_0= ruleinstrucciones )
                    {
                    // InternalLinit.g:682:6: (lv_i_15_0= ruleinstrucciones )
                    // InternalLinit.g:683:7: lv_i_15_0= ruleinstrucciones
                    {

                    							newCompositeNode(grammarAccess.getInstruccionesAccess().getIInstruccionesParserRuleCall_1_4_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_i_15_0=ruleinstrucciones();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getInstruccionesRule());
                    							}
                    							set(
                    								current,
                    								"i",
                    								lv_i_15_0,
                    								"linit.Linit.instrucciones");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalLinit.g:702:4: ( ruleimpresion otherlv_17= '.' ( (lv_i_18_0= ruleinstrucciones ) ) )
                    {
                    // InternalLinit.g:702:4: ( ruleimpresion otherlv_17= '.' ( (lv_i_18_0= ruleinstrucciones ) ) )
                    // InternalLinit.g:703:5: ruleimpresion otherlv_17= '.' ( (lv_i_18_0= ruleinstrucciones ) )
                    {

                    					newCompositeNode(grammarAccess.getInstruccionesAccess().getImpresionParserRuleCall_1_5_0());
                    				
                    pushFollow(FOLLOW_9);
                    ruleimpresion();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    otherlv_17=(Token)match(input,67,FOLLOW_3); 

                    					newLeafNode(otherlv_17, grammarAccess.getInstruccionesAccess().getFullStopKeyword_1_5_1());
                    				
                    // InternalLinit.g:714:5: ( (lv_i_18_0= ruleinstrucciones ) )
                    // InternalLinit.g:715:6: (lv_i_18_0= ruleinstrucciones )
                    {
                    // InternalLinit.g:715:6: (lv_i_18_0= ruleinstrucciones )
                    // InternalLinit.g:716:7: lv_i_18_0= ruleinstrucciones
                    {

                    							newCompositeNode(grammarAccess.getInstruccionesAccess().getIInstruccionesParserRuleCall_1_5_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_i_18_0=ruleinstrucciones();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getInstruccionesRule());
                    							}
                    							set(
                    								current,
                    								"i",
                    								lv_i_18_0,
                    								"linit.Linit.instrucciones");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalLinit.g:735:4: ( ruleentrada otherlv_20= '.' ( (lv_i_21_0= ruleinstrucciones ) ) )
                    {
                    // InternalLinit.g:735:4: ( ruleentrada otherlv_20= '.' ( (lv_i_21_0= ruleinstrucciones ) ) )
                    // InternalLinit.g:736:5: ruleentrada otherlv_20= '.' ( (lv_i_21_0= ruleinstrucciones ) )
                    {

                    					newCompositeNode(grammarAccess.getInstruccionesAccess().getEntradaParserRuleCall_1_6_0());
                    				
                    pushFollow(FOLLOW_9);
                    ruleentrada();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    otherlv_20=(Token)match(input,67,FOLLOW_3); 

                    					newLeafNode(otherlv_20, grammarAccess.getInstruccionesAccess().getFullStopKeyword_1_6_1());
                    				
                    // InternalLinit.g:747:5: ( (lv_i_21_0= ruleinstrucciones ) )
                    // InternalLinit.g:748:6: (lv_i_21_0= ruleinstrucciones )
                    {
                    // InternalLinit.g:748:6: (lv_i_21_0= ruleinstrucciones )
                    // InternalLinit.g:749:7: lv_i_21_0= ruleinstrucciones
                    {

                    							newCompositeNode(grammarAccess.getInstruccionesAccess().getIInstruccionesParserRuleCall_1_6_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_i_21_0=ruleinstrucciones();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getInstruccionesRule());
                    							}
                    							set(
                    								current,
                    								"i",
                    								lv_i_21_0,
                    								"linit.Linit.instrucciones");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleinstrucciones"


    // $ANTLR start "entryRulenominacion"
    // InternalLinit.g:772:1: entryRulenominacion returns [String current=null] : iv_rulenominacion= rulenominacion EOF ;
    public final String entryRulenominacion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulenominacion = null;


        try {
            // InternalLinit.g:772:50: (iv_rulenominacion= rulenominacion EOF )
            // InternalLinit.g:773:2: iv_rulenominacion= rulenominacion EOF
            {
             newCompositeNode(grammarAccess.getNominacionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulenominacion=rulenominacion();

            state._fsp--;

             current =iv_rulenominacion.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenominacion"


    // $ANTLR start "rulenominacion"
    // InternalLinit.g:779:1: rulenominacion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= 'VARIABLE' | this_VARIABLE_1= RULE_VARIABLE ) this_tipoVariable_2= ruletipoVariable this_IDENTIFICADOR_3= RULE_IDENTIFICADOR (this_igualdad_4= ruleigualdad )? ) | ( (kw= 'CONSTANTE' | this_CONSTANTE_6= RULE_CONSTANTE ) this_tipoVariable_7= ruletipoVariable this_IDENTIFICADOR_8= RULE_IDENTIFICADOR this_igualdad_9= ruleigualdad ) ) ;
    public final AntlrDatatypeRuleToken rulenominacion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_VARIABLE_1=null;
        Token this_IDENTIFICADOR_3=null;
        Token this_CONSTANTE_6=null;
        Token this_IDENTIFICADOR_8=null;
        AntlrDatatypeRuleToken this_tipoVariable_2 = null;

        AntlrDatatypeRuleToken this_igualdad_4 = null;

        AntlrDatatypeRuleToken this_tipoVariable_7 = null;

        AntlrDatatypeRuleToken this_igualdad_9 = null;



        	enterRule();

        try {
            // InternalLinit.g:785:2: ( ( ( (kw= 'VARIABLE' | this_VARIABLE_1= RULE_VARIABLE ) this_tipoVariable_2= ruletipoVariable this_IDENTIFICADOR_3= RULE_IDENTIFICADOR (this_igualdad_4= ruleigualdad )? ) | ( (kw= 'CONSTANTE' | this_CONSTANTE_6= RULE_CONSTANTE ) this_tipoVariable_7= ruletipoVariable this_IDENTIFICADOR_8= RULE_IDENTIFICADOR this_igualdad_9= ruleigualdad ) ) )
            // InternalLinit.g:786:2: ( ( (kw= 'VARIABLE' | this_VARIABLE_1= RULE_VARIABLE ) this_tipoVariable_2= ruletipoVariable this_IDENTIFICADOR_3= RULE_IDENTIFICADOR (this_igualdad_4= ruleigualdad )? ) | ( (kw= 'CONSTANTE' | this_CONSTANTE_6= RULE_CONSTANTE ) this_tipoVariable_7= ruletipoVariable this_IDENTIFICADOR_8= RULE_IDENTIFICADOR this_igualdad_9= ruleigualdad ) )
            {
            // InternalLinit.g:786:2: ( ( (kw= 'VARIABLE' | this_VARIABLE_1= RULE_VARIABLE ) this_tipoVariable_2= ruletipoVariable this_IDENTIFICADOR_3= RULE_IDENTIFICADOR (this_igualdad_4= ruleigualdad )? ) | ( (kw= 'CONSTANTE' | this_CONSTANTE_6= RULE_CONSTANTE ) this_tipoVariable_7= ruletipoVariable this_IDENTIFICADOR_8= RULE_IDENTIFICADOR this_igualdad_9= ruleigualdad ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_VARIABLE||LA18_0==69) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_CONSTANTE||LA18_0==72) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalLinit.g:787:3: ( (kw= 'VARIABLE' | this_VARIABLE_1= RULE_VARIABLE ) this_tipoVariable_2= ruletipoVariable this_IDENTIFICADOR_3= RULE_IDENTIFICADOR (this_igualdad_4= ruleigualdad )? )
                    {
                    // InternalLinit.g:787:3: ( (kw= 'VARIABLE' | this_VARIABLE_1= RULE_VARIABLE ) this_tipoVariable_2= ruletipoVariable this_IDENTIFICADOR_3= RULE_IDENTIFICADOR (this_igualdad_4= ruleigualdad )? )
                    // InternalLinit.g:788:4: (kw= 'VARIABLE' | this_VARIABLE_1= RULE_VARIABLE ) this_tipoVariable_2= ruletipoVariable this_IDENTIFICADOR_3= RULE_IDENTIFICADOR (this_igualdad_4= ruleigualdad )?
                    {
                    // InternalLinit.g:788:4: (kw= 'VARIABLE' | this_VARIABLE_1= RULE_VARIABLE )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==69) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==RULE_VARIABLE) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalLinit.g:789:5: kw= 'VARIABLE'
                            {
                            kw=(Token)match(input,69,FOLLOW_12); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getNominacionAccess().getVARIABLEKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalLinit.g:795:5: this_VARIABLE_1= RULE_VARIABLE
                            {
                            this_VARIABLE_1=(Token)match(input,RULE_VARIABLE,FOLLOW_12); 

                            					current.merge(this_VARIABLE_1);
                            				

                            					newLeafNode(this_VARIABLE_1, grammarAccess.getNominacionAccess().getVARIABLETerminalRuleCall_0_0_1());
                            				

                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getNominacionAccess().getTipoVariableParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_4);
                    this_tipoVariable_2=ruletipoVariable();

                    state._fsp--;


                    				current.merge(this_tipoVariable_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    this_IDENTIFICADOR_3=(Token)match(input,RULE_IDENTIFICADOR,FOLLOW_17); 

                    				current.merge(this_IDENTIFICADOR_3);
                    			

                    				newLeafNode(this_IDENTIFICADOR_3, grammarAccess.getNominacionAccess().getIDENTIFICADORTerminalRuleCall_0_2());
                    			
                    // InternalLinit.g:820:4: (this_igualdad_4= ruleigualdad )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=RULE_IGUAL && LA16_0<=RULE_SIGNOIGUAL)||LA16_0==85) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalLinit.g:821:5: this_igualdad_4= ruleigualdad
                            {

                            					newCompositeNode(grammarAccess.getNominacionAccess().getIgualdadParserRuleCall_0_3());
                            				
                            pushFollow(FOLLOW_2);
                            this_igualdad_4=ruleigualdad();

                            state._fsp--;


                            					current.merge(this_igualdad_4);
                            				

                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLinit.g:834:3: ( (kw= 'CONSTANTE' | this_CONSTANTE_6= RULE_CONSTANTE ) this_tipoVariable_7= ruletipoVariable this_IDENTIFICADOR_8= RULE_IDENTIFICADOR this_igualdad_9= ruleigualdad )
                    {
                    // InternalLinit.g:834:3: ( (kw= 'CONSTANTE' | this_CONSTANTE_6= RULE_CONSTANTE ) this_tipoVariable_7= ruletipoVariable this_IDENTIFICADOR_8= RULE_IDENTIFICADOR this_igualdad_9= ruleigualdad )
                    // InternalLinit.g:835:4: (kw= 'CONSTANTE' | this_CONSTANTE_6= RULE_CONSTANTE ) this_tipoVariable_7= ruletipoVariable this_IDENTIFICADOR_8= RULE_IDENTIFICADOR this_igualdad_9= ruleigualdad
                    {
                    // InternalLinit.g:835:4: (kw= 'CONSTANTE' | this_CONSTANTE_6= RULE_CONSTANTE )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==72) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==RULE_CONSTANTE) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalLinit.g:836:5: kw= 'CONSTANTE'
                            {
                            kw=(Token)match(input,72,FOLLOW_12); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getNominacionAccess().getCONSTANTEKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalLinit.g:842:5: this_CONSTANTE_6= RULE_CONSTANTE
                            {
                            this_CONSTANTE_6=(Token)match(input,RULE_CONSTANTE,FOLLOW_12); 

                            					current.merge(this_CONSTANTE_6);
                            				

                            					newLeafNode(this_CONSTANTE_6, grammarAccess.getNominacionAccess().getCONSTANTETerminalRuleCall_1_0_1());
                            				

                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getNominacionAccess().getTipoVariableParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_4);
                    this_tipoVariable_7=ruletipoVariable();

                    state._fsp--;


                    				current.merge(this_tipoVariable_7);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    this_IDENTIFICADOR_8=(Token)match(input,RULE_IDENTIFICADOR,FOLLOW_18); 

                    				current.merge(this_IDENTIFICADOR_8);
                    			

                    				newLeafNode(this_IDENTIFICADOR_8, grammarAccess.getNominacionAccess().getIDENTIFICADORTerminalRuleCall_1_2());
                    			

                    				newCompositeNode(grammarAccess.getNominacionAccess().getIgualdadParserRuleCall_1_3());
                    			
                    pushFollow(FOLLOW_2);
                    this_igualdad_9=ruleigualdad();

                    state._fsp--;


                    				current.merge(this_igualdad_9);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenominacion"


    // $ANTLR start "entryRulearreglo"
    // InternalLinit.g:882:1: entryRulearreglo returns [String current=null] : iv_rulearreglo= rulearreglo EOF ;
    public final String entryRulearreglo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulearreglo = null;


        try {
            // InternalLinit.g:882:47: (iv_rulearreglo= rulearreglo EOF )
            // InternalLinit.g:883:2: iv_rulearreglo= rulearreglo EOF
            {
             newCompositeNode(grammarAccess.getArregloRule()); 
            pushFollow(FOLLOW_1);
            iv_rulearreglo=rulearreglo();

            state._fsp--;

             current =iv_rulearreglo.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulearreglo"


    // $ANTLR start "rulearreglo"
    // InternalLinit.g:889:1: rulearreglo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'ARREGLO' | this_AREGLO_1= RULE_AREGLO ) (kw= 'VARIABLE' | this_VARIABLE_3= RULE_VARIABLE ) this_IDENTIFICADOR_4= RULE_IDENTIFICADOR ) ;
    public final AntlrDatatypeRuleToken rulearreglo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_AREGLO_1=null;
        Token this_VARIABLE_3=null;
        Token this_IDENTIFICADOR_4=null;


        	enterRule();

        try {
            // InternalLinit.g:895:2: ( ( (kw= 'ARREGLO' | this_AREGLO_1= RULE_AREGLO ) (kw= 'VARIABLE' | this_VARIABLE_3= RULE_VARIABLE ) this_IDENTIFICADOR_4= RULE_IDENTIFICADOR ) )
            // InternalLinit.g:896:2: ( (kw= 'ARREGLO' | this_AREGLO_1= RULE_AREGLO ) (kw= 'VARIABLE' | this_VARIABLE_3= RULE_VARIABLE ) this_IDENTIFICADOR_4= RULE_IDENTIFICADOR )
            {
            // InternalLinit.g:896:2: ( (kw= 'ARREGLO' | this_AREGLO_1= RULE_AREGLO ) (kw= 'VARIABLE' | this_VARIABLE_3= RULE_VARIABLE ) this_IDENTIFICADOR_4= RULE_IDENTIFICADOR )
            // InternalLinit.g:897:3: (kw= 'ARREGLO' | this_AREGLO_1= RULE_AREGLO ) (kw= 'VARIABLE' | this_VARIABLE_3= RULE_VARIABLE ) this_IDENTIFICADOR_4= RULE_IDENTIFICADOR
            {
            // InternalLinit.g:897:3: (kw= 'ARREGLO' | this_AREGLO_1= RULE_AREGLO )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==73) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_AREGLO) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalLinit.g:898:4: kw= 'ARREGLO'
                    {
                    kw=(Token)match(input,73,FOLLOW_19); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getArregloAccess().getARREGLOKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLinit.g:904:4: this_AREGLO_1= RULE_AREGLO
                    {
                    this_AREGLO_1=(Token)match(input,RULE_AREGLO,FOLLOW_19); 

                    				current.merge(this_AREGLO_1);
                    			

                    				newLeafNode(this_AREGLO_1, grammarAccess.getArregloAccess().getAREGLOTerminalRuleCall_0_1());
                    			

                    }
                    break;

            }

            // InternalLinit.g:912:3: (kw= 'VARIABLE' | this_VARIABLE_3= RULE_VARIABLE )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==69) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_VARIABLE) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalLinit.g:913:4: kw= 'VARIABLE'
                    {
                    kw=(Token)match(input,69,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getArregloAccess().getVARIABLEKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLinit.g:919:4: this_VARIABLE_3= RULE_VARIABLE
                    {
                    this_VARIABLE_3=(Token)match(input,RULE_VARIABLE,FOLLOW_4); 

                    				current.merge(this_VARIABLE_3);
                    			

                    				newLeafNode(this_VARIABLE_3, grammarAccess.getArregloAccess().getVARIABLETerminalRuleCall_1_1());
                    			

                    }
                    break;

            }

            this_IDENTIFICADOR_4=(Token)match(input,RULE_IDENTIFICADOR,FOLLOW_2); 

            			current.merge(this_IDENTIFICADOR_4);
            		

            			newLeafNode(this_IDENTIFICADOR_4, grammarAccess.getArregloAccess().getIDENTIFICADORTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulearreglo"


    // $ANTLR start "entryRulellamadaIdentificador"
    // InternalLinit.g:938:1: entryRulellamadaIdentificador returns [String current=null] : iv_rulellamadaIdentificador= rulellamadaIdentificador EOF ;
    public final String entryRulellamadaIdentificador() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulellamadaIdentificador = null;


        try {
            // InternalLinit.g:938:60: (iv_rulellamadaIdentificador= rulellamadaIdentificador EOF )
            // InternalLinit.g:939:2: iv_rulellamadaIdentificador= rulellamadaIdentificador EOF
            {
             newCompositeNode(grammarAccess.getLlamadaIdentificadorRule()); 
            pushFollow(FOLLOW_1);
            iv_rulellamadaIdentificador=rulellamadaIdentificador();

            state._fsp--;

             current =iv_rulellamadaIdentificador.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulellamadaIdentificador"


    // $ANTLR start "rulellamadaIdentificador"
    // InternalLinit.g:945:1: rulellamadaIdentificador returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_IDENTIFICADOR_0= RULE_IDENTIFICADOR (this_CUADRADOI_1= RULE_CUADRADOI this_expresion_2= ruleexpresion this_listaArreglo_3= rulelistaArreglo this_CUADRADOD_4= RULE_CUADRADOD )? this_igualdad_5= ruleigualdad ) | (this_IDENTIFICADOR_6= RULE_IDENTIFICADOR ( (kw= 'IMPORTA' | this_IMPORTA_8= RULE_IMPORTA ) this_expresion_9= ruleexpresion this_listaArreglo_10= rulelistaArreglo )? ( (kw= 'EXPORTA' | this_EXPORTA_12= RULE_EXPORTA ) this_IDENTIFICADOR_13= RULE_IDENTIFICADOR this_listaIdentificadores_14= rulelistaIdentificadores )? ) ) ;
    public final AntlrDatatypeRuleToken rulellamadaIdentificador() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFICADOR_0=null;
        Token this_CUADRADOI_1=null;
        Token this_CUADRADOD_4=null;
        Token this_IDENTIFICADOR_6=null;
        Token kw=null;
        Token this_IMPORTA_8=null;
        Token this_EXPORTA_12=null;
        Token this_IDENTIFICADOR_13=null;
        AntlrDatatypeRuleToken this_expresion_2 = null;

        AntlrDatatypeRuleToken this_listaArreglo_3 = null;

        AntlrDatatypeRuleToken this_igualdad_5 = null;

        AntlrDatatypeRuleToken this_expresion_9 = null;

        AntlrDatatypeRuleToken this_listaArreglo_10 = null;

        AntlrDatatypeRuleToken this_listaIdentificadores_14 = null;



        	enterRule();

        try {
            // InternalLinit.g:951:2: ( ( (this_IDENTIFICADOR_0= RULE_IDENTIFICADOR (this_CUADRADOI_1= RULE_CUADRADOI this_expresion_2= ruleexpresion this_listaArreglo_3= rulelistaArreglo this_CUADRADOD_4= RULE_CUADRADOD )? this_igualdad_5= ruleigualdad ) | (this_IDENTIFICADOR_6= RULE_IDENTIFICADOR ( (kw= 'IMPORTA' | this_IMPORTA_8= RULE_IMPORTA ) this_expresion_9= ruleexpresion this_listaArreglo_10= rulelistaArreglo )? ( (kw= 'EXPORTA' | this_EXPORTA_12= RULE_EXPORTA ) this_IDENTIFICADOR_13= RULE_IDENTIFICADOR this_listaIdentificadores_14= rulelistaIdentificadores )? ) ) )
            // InternalLinit.g:952:2: ( (this_IDENTIFICADOR_0= RULE_IDENTIFICADOR (this_CUADRADOI_1= RULE_CUADRADOI this_expresion_2= ruleexpresion this_listaArreglo_3= rulelistaArreglo this_CUADRADOD_4= RULE_CUADRADOD )? this_igualdad_5= ruleigualdad ) | (this_IDENTIFICADOR_6= RULE_IDENTIFICADOR ( (kw= 'IMPORTA' | this_IMPORTA_8= RULE_IMPORTA ) this_expresion_9= ruleexpresion this_listaArreglo_10= rulelistaArreglo )? ( (kw= 'EXPORTA' | this_EXPORTA_12= RULE_EXPORTA ) this_IDENTIFICADOR_13= RULE_IDENTIFICADOR this_listaIdentificadores_14= rulelistaIdentificadores )? ) )
            {
            // InternalLinit.g:952:2: ( (this_IDENTIFICADOR_0= RULE_IDENTIFICADOR (this_CUADRADOI_1= RULE_CUADRADOI this_expresion_2= ruleexpresion this_listaArreglo_3= rulelistaArreglo this_CUADRADOD_4= RULE_CUADRADOD )? this_igualdad_5= ruleigualdad ) | (this_IDENTIFICADOR_6= RULE_IDENTIFICADOR ( (kw= 'IMPORTA' | this_IMPORTA_8= RULE_IMPORTA ) this_expresion_9= ruleexpresion this_listaArreglo_10= rulelistaArreglo )? ( (kw= 'EXPORTA' | this_EXPORTA_12= RULE_EXPORTA ) this_IDENTIFICADOR_13= RULE_IDENTIFICADOR this_listaIdentificadores_14= rulelistaIdentificadores )? ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_IDENTIFICADOR) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==RULE_CUADRADOI||(LA26_1>=RULE_IGUAL && LA26_1<=RULE_SIGNOIGUAL)||LA26_1==85) ) {
                    alt26=1;
                }
                else if ( (LA26_1==EOF||LA26_1==RULE_IMPORTA||LA26_1==RULE_EXPORTA||(LA26_1>=67 && LA26_1<=68)||LA26_1==70) ) {
                    alt26=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalLinit.g:953:3: (this_IDENTIFICADOR_0= RULE_IDENTIFICADOR (this_CUADRADOI_1= RULE_CUADRADOI this_expresion_2= ruleexpresion this_listaArreglo_3= rulelistaArreglo this_CUADRADOD_4= RULE_CUADRADOD )? this_igualdad_5= ruleigualdad )
                    {
                    // InternalLinit.g:953:3: (this_IDENTIFICADOR_0= RULE_IDENTIFICADOR (this_CUADRADOI_1= RULE_CUADRADOI this_expresion_2= ruleexpresion this_listaArreglo_3= rulelistaArreglo this_CUADRADOD_4= RULE_CUADRADOD )? this_igualdad_5= ruleigualdad )
                    // InternalLinit.g:954:4: this_IDENTIFICADOR_0= RULE_IDENTIFICADOR (this_CUADRADOI_1= RULE_CUADRADOI this_expresion_2= ruleexpresion this_listaArreglo_3= rulelistaArreglo this_CUADRADOD_4= RULE_CUADRADOD )? this_igualdad_5= ruleigualdad
                    {
                    this_IDENTIFICADOR_0=(Token)match(input,RULE_IDENTIFICADOR,FOLLOW_20); 

                    				current.merge(this_IDENTIFICADOR_0);
                    			

                    				newLeafNode(this_IDENTIFICADOR_0, grammarAccess.getLlamadaIdentificadorAccess().getIDENTIFICADORTerminalRuleCall_0_0());
                    			
                    // InternalLinit.g:961:4: (this_CUADRADOI_1= RULE_CUADRADOI this_expresion_2= ruleexpresion this_listaArreglo_3= rulelistaArreglo this_CUADRADOD_4= RULE_CUADRADOD )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_CUADRADOI) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalLinit.g:962:5: this_CUADRADOI_1= RULE_CUADRADOI this_expresion_2= ruleexpresion this_listaArreglo_3= rulelistaArreglo this_CUADRADOD_4= RULE_CUADRADOD
                            {
                            this_CUADRADOI_1=(Token)match(input,RULE_CUADRADOI,FOLLOW_21); 

                            					current.merge(this_CUADRADOI_1);
                            				

                            					newLeafNode(this_CUADRADOI_1, grammarAccess.getLlamadaIdentificadorAccess().getCUADRADOITerminalRuleCall_0_1_0());
                            				

                            					newCompositeNode(grammarAccess.getLlamadaIdentificadorAccess().getExpresionParserRuleCall_0_1_1());
                            				
                            pushFollow(FOLLOW_22);
                            this_expresion_2=ruleexpresion();

                            state._fsp--;


                            					current.merge(this_expresion_2);
                            				

                            					afterParserOrEnumRuleCall();
                            				

                            					newCompositeNode(grammarAccess.getLlamadaIdentificadorAccess().getListaArregloParserRuleCall_0_1_2());
                            				
                            pushFollow(FOLLOW_23);
                            this_listaArreglo_3=rulelistaArreglo();

                            state._fsp--;


                            					current.merge(this_listaArreglo_3);
                            				

                            					afterParserOrEnumRuleCall();
                            				
                            this_CUADRADOD_4=(Token)match(input,RULE_CUADRADOD,FOLLOW_18); 

                            					current.merge(this_CUADRADOD_4);
                            				

                            					newLeafNode(this_CUADRADOD_4, grammarAccess.getLlamadaIdentificadorAccess().getCUADRADODTerminalRuleCall_0_1_3());
                            				

                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getLlamadaIdentificadorAccess().getIgualdadParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_igualdad_5=ruleigualdad();

                    state._fsp--;


                    				current.merge(this_igualdad_5);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLinit.g:1009:3: (this_IDENTIFICADOR_6= RULE_IDENTIFICADOR ( (kw= 'IMPORTA' | this_IMPORTA_8= RULE_IMPORTA ) this_expresion_9= ruleexpresion this_listaArreglo_10= rulelistaArreglo )? ( (kw= 'EXPORTA' | this_EXPORTA_12= RULE_EXPORTA ) this_IDENTIFICADOR_13= RULE_IDENTIFICADOR this_listaIdentificadores_14= rulelistaIdentificadores )? )
                    {
                    // InternalLinit.g:1009:3: (this_IDENTIFICADOR_6= RULE_IDENTIFICADOR ( (kw= 'IMPORTA' | this_IMPORTA_8= RULE_IMPORTA ) this_expresion_9= ruleexpresion this_listaArreglo_10= rulelistaArreglo )? ( (kw= 'EXPORTA' | this_EXPORTA_12= RULE_EXPORTA ) this_IDENTIFICADOR_13= RULE_IDENTIFICADOR this_listaIdentificadores_14= rulelistaIdentificadores )? )
                    // InternalLinit.g:1010:4: this_IDENTIFICADOR_6= RULE_IDENTIFICADOR ( (kw= 'IMPORTA' | this_IMPORTA_8= RULE_IMPORTA ) this_expresion_9= ruleexpresion this_listaArreglo_10= rulelistaArreglo )? ( (kw= 'EXPORTA' | this_EXPORTA_12= RULE_EXPORTA ) this_IDENTIFICADOR_13= RULE_IDENTIFICADOR this_listaIdentificadores_14= rulelistaIdentificadores )?
                    {
                    this_IDENTIFICADOR_6=(Token)match(input,RULE_IDENTIFICADOR,FOLLOW_24); 

                    				current.merge(this_IDENTIFICADOR_6);
                    			

                    				newLeafNode(this_IDENTIFICADOR_6, grammarAccess.getLlamadaIdentificadorAccess().getIDENTIFICADORTerminalRuleCall_1_0());
                    			
                    // InternalLinit.g:1017:4: ( (kw= 'IMPORTA' | this_IMPORTA_8= RULE_IMPORTA ) this_expresion_9= ruleexpresion this_listaArreglo_10= rulelistaArreglo )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_IMPORTA||LA23_0==68) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalLinit.g:1018:5: (kw= 'IMPORTA' | this_IMPORTA_8= RULE_IMPORTA ) this_expresion_9= ruleexpresion this_listaArreglo_10= rulelistaArreglo
                            {
                            // InternalLinit.g:1018:5: (kw= 'IMPORTA' | this_IMPORTA_8= RULE_IMPORTA )
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( (LA22_0==68) ) {
                                alt22=1;
                            }
                            else if ( (LA22_0==RULE_IMPORTA) ) {
                                alt22=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 22, 0, input);

                                throw nvae;
                            }
                            switch (alt22) {
                                case 1 :
                                    // InternalLinit.g:1019:6: kw= 'IMPORTA'
                                    {
                                    kw=(Token)match(input,68,FOLLOW_21); 

                                    						current.merge(kw);
                                    						newLeafNode(kw, grammarAccess.getLlamadaIdentificadorAccess().getIMPORTAKeyword_1_1_0_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalLinit.g:1025:6: this_IMPORTA_8= RULE_IMPORTA
                                    {
                                    this_IMPORTA_8=(Token)match(input,RULE_IMPORTA,FOLLOW_21); 

                                    						current.merge(this_IMPORTA_8);
                                    					

                                    						newLeafNode(this_IMPORTA_8, grammarAccess.getLlamadaIdentificadorAccess().getIMPORTATerminalRuleCall_1_1_0_1());
                                    					

                                    }
                                    break;

                            }


                            					newCompositeNode(grammarAccess.getLlamadaIdentificadorAccess().getExpresionParserRuleCall_1_1_1());
                            				
                            pushFollow(FOLLOW_13);
                            this_expresion_9=ruleexpresion();

                            state._fsp--;


                            					current.merge(this_expresion_9);
                            				

                            					afterParserOrEnumRuleCall();
                            				

                            					newCompositeNode(grammarAccess.getLlamadaIdentificadorAccess().getListaArregloParserRuleCall_1_1_2());
                            				
                            pushFollow(FOLLOW_25);
                            this_listaArreglo_10=rulelistaArreglo();

                            state._fsp--;


                            					current.merge(this_listaArreglo_10);
                            				

                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }

                    // InternalLinit.g:1054:4: ( (kw= 'EXPORTA' | this_EXPORTA_12= RULE_EXPORTA ) this_IDENTIFICADOR_13= RULE_IDENTIFICADOR this_listaIdentificadores_14= rulelistaIdentificadores )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==RULE_EXPORTA||LA25_0==70) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalLinit.g:1055:5: (kw= 'EXPORTA' | this_EXPORTA_12= RULE_EXPORTA ) this_IDENTIFICADOR_13= RULE_IDENTIFICADOR this_listaIdentificadores_14= rulelistaIdentificadores
                            {
                            // InternalLinit.g:1055:5: (kw= 'EXPORTA' | this_EXPORTA_12= RULE_EXPORTA )
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( (LA24_0==70) ) {
                                alt24=1;
                            }
                            else if ( (LA24_0==RULE_EXPORTA) ) {
                                alt24=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 24, 0, input);

                                throw nvae;
                            }
                            switch (alt24) {
                                case 1 :
                                    // InternalLinit.g:1056:6: kw= 'EXPORTA'
                                    {
                                    kw=(Token)match(input,70,FOLLOW_4); 

                                    						current.merge(kw);
                                    						newLeafNode(kw, grammarAccess.getLlamadaIdentificadorAccess().getEXPORTAKeyword_1_2_0_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalLinit.g:1062:6: this_EXPORTA_12= RULE_EXPORTA
                                    {
                                    this_EXPORTA_12=(Token)match(input,RULE_EXPORTA,FOLLOW_4); 

                                    						current.merge(this_EXPORTA_12);
                                    					

                                    						newLeafNode(this_EXPORTA_12, grammarAccess.getLlamadaIdentificadorAccess().getEXPORTATerminalRuleCall_1_2_0_1());
                                    					

                                    }
                                    break;

                            }

                            this_IDENTIFICADOR_13=(Token)match(input,RULE_IDENTIFICADOR,FOLLOW_15); 

                            					current.merge(this_IDENTIFICADOR_13);
                            				

                            					newLeafNode(this_IDENTIFICADOR_13, grammarAccess.getLlamadaIdentificadorAccess().getIDENTIFICADORTerminalRuleCall_1_2_1());
                            				

                            					newCompositeNode(grammarAccess.getLlamadaIdentificadorAccess().getListaIdentificadoresParserRuleCall_1_2_2());
                            				
                            pushFollow(FOLLOW_2);
                            this_listaIdentificadores_14=rulelistaIdentificadores();

                            state._fsp--;


                            					current.merge(this_listaIdentificadores_14);
                            				

                            					afterParserOrEnumRuleCall();
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulellamadaIdentificador"


    // $ANTLR start "entryRulecondicional"
    // InternalLinit.g:1093:1: entryRulecondicional returns [EObject current=null] : iv_rulecondicional= rulecondicional EOF ;
    public final EObject entryRulecondicional() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecondicional = null;


        try {
            // InternalLinit.g:1093:52: (iv_rulecondicional= rulecondicional EOF )
            // InternalLinit.g:1094:2: iv_rulecondicional= rulecondicional EOF
            {
             newCompositeNode(grammarAccess.getCondicionalRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecondicional=rulecondicional();

            state._fsp--;

             current =iv_rulecondicional; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecondicional"


    // $ANTLR start "rulecondicional"
    // InternalLinit.g:1100:1: rulecondicional returns [EObject current=null] : ( (otherlv_0= 'SI' | this_SI_1= RULE_SI ) ruleexpresion otherlv_3= ':' ( (lv_i_4_0= ruleinstrucciones ) ) ( (lv_l_5_0= rulelistaCondicional ) ) (otherlv_6= 'FIN' | this_FIN_7= RULE_FIN ) ) ;
    public final EObject rulecondicional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_SI_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token this_FIN_7=null;
        EObject lv_i_4_0 = null;

        EObject lv_l_5_0 = null;



        	enterRule();

        try {
            // InternalLinit.g:1106:2: ( ( (otherlv_0= 'SI' | this_SI_1= RULE_SI ) ruleexpresion otherlv_3= ':' ( (lv_i_4_0= ruleinstrucciones ) ) ( (lv_l_5_0= rulelistaCondicional ) ) (otherlv_6= 'FIN' | this_FIN_7= RULE_FIN ) ) )
            // InternalLinit.g:1107:2: ( (otherlv_0= 'SI' | this_SI_1= RULE_SI ) ruleexpresion otherlv_3= ':' ( (lv_i_4_0= ruleinstrucciones ) ) ( (lv_l_5_0= rulelistaCondicional ) ) (otherlv_6= 'FIN' | this_FIN_7= RULE_FIN ) )
            {
            // InternalLinit.g:1107:2: ( (otherlv_0= 'SI' | this_SI_1= RULE_SI ) ruleexpresion otherlv_3= ':' ( (lv_i_4_0= ruleinstrucciones ) ) ( (lv_l_5_0= rulelistaCondicional ) ) (otherlv_6= 'FIN' | this_FIN_7= RULE_FIN ) )
            // InternalLinit.g:1108:3: (otherlv_0= 'SI' | this_SI_1= RULE_SI ) ruleexpresion otherlv_3= ':' ( (lv_i_4_0= ruleinstrucciones ) ) ( (lv_l_5_0= rulelistaCondicional ) ) (otherlv_6= 'FIN' | this_FIN_7= RULE_FIN )
            {
            // InternalLinit.g:1108:3: (otherlv_0= 'SI' | this_SI_1= RULE_SI )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==74) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_SI) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalLinit.g:1109:4: otherlv_0= 'SI'
                    {
                    otherlv_0=(Token)match(input,74,FOLLOW_21); 

                    				newLeafNode(otherlv_0, grammarAccess.getCondicionalAccess().getSIKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLinit.g:1114:4: this_SI_1= RULE_SI
                    {
                    this_SI_1=(Token)match(input,RULE_SI,FOLLOW_21); 

                    				newLeafNode(this_SI_1, grammarAccess.getCondicionalAccess().getSITerminalRuleCall_0_1());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getCondicionalAccess().getExpresionParserRuleCall_1());
            		
            pushFollow(FOLLOW_6);
            ruleexpresion();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_3=(Token)match(input,65,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getCondicionalAccess().getColonKeyword_2());
            		
            // InternalLinit.g:1130:3: ( (lv_i_4_0= ruleinstrucciones ) )
            // InternalLinit.g:1131:4: (lv_i_4_0= ruleinstrucciones )
            {
            // InternalLinit.g:1131:4: (lv_i_4_0= ruleinstrucciones )
            // InternalLinit.g:1132:5: lv_i_4_0= ruleinstrucciones
            {

            					newCompositeNode(grammarAccess.getCondicionalAccess().getIInstruccionesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
            lv_i_4_0=ruleinstrucciones();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCondicionalRule());
            					}
            					set(
            						current,
            						"i",
            						lv_i_4_0,
            						"linit.Linit.instrucciones");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLinit.g:1149:3: ( (lv_l_5_0= rulelistaCondicional ) )
            // InternalLinit.g:1150:4: (lv_l_5_0= rulelistaCondicional )
            {
            // InternalLinit.g:1150:4: (lv_l_5_0= rulelistaCondicional )
            // InternalLinit.g:1151:5: lv_l_5_0= rulelistaCondicional
            {

            					newCompositeNode(grammarAccess.getCondicionalAccess().getLListaCondicionalParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_l_5_0=rulelistaCondicional();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCondicionalRule());
            					}
            					set(
            						current,
            						"l",
            						lv_l_5_0,
            						"linit.Linit.listaCondicional");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLinit.g:1168:3: (otherlv_6= 'FIN' | this_FIN_7= RULE_FIN )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==66) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_FIN) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalLinit.g:1169:4: otherlv_6= 'FIN'
                    {
                    otherlv_6=(Token)match(input,66,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getCondicionalAccess().getFINKeyword_5_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLinit.g:1174:4: this_FIN_7= RULE_FIN
                    {
                    this_FIN_7=(Token)match(input,RULE_FIN,FOLLOW_2); 

                    				newLeafNode(this_FIN_7, grammarAccess.getCondicionalAccess().getFINTerminalRuleCall_5_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecondicional"


    // $ANTLR start "entryRuleciclo"
    // InternalLinit.g:1183:1: entryRuleciclo returns [EObject current=null] : iv_ruleciclo= ruleciclo EOF ;
    public final EObject entryRuleciclo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleciclo = null;


        try {
            // InternalLinit.g:1183:46: (iv_ruleciclo= ruleciclo EOF )
            // InternalLinit.g:1184:2: iv_ruleciclo= ruleciclo EOF
            {
             newCompositeNode(grammarAccess.getCicloRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleciclo=ruleciclo();

            state._fsp--;

             current =iv_ruleciclo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleciclo"


    // $ANTLR start "ruleciclo"
    // InternalLinit.g:1190:1: ruleciclo returns [EObject current=null] : ( ( (otherlv_0= 'REPETIR' | this_REPETIR_1= RULE_REPETIR ) ruleexpresion (otherlv_3= 'VECES' | this_VECES_4= RULE_VECES ) otherlv_5= ':' this_instrucciones_6= ruleinstrucciones (otherlv_7= 'FIN' | this_FIN_8= RULE_FIN ) ) | ( (otherlv_9= 'REPETIR' | this_REPETIR_10= RULE_REPETIR ) (otherlv_11= 'MIENTRAS' | this_MIENTRAS_12= RULE_MIENTRAS ) ruleexpresion (otherlv_14= 'SEA' | this_SEA_15= RULE_SEA ) rulelogico otherlv_17= ':' this_instrucciones_18= ruleinstrucciones (otherlv_19= 'FIN' | this_FIN_20= RULE_FIN ) ) ) ;
    public final EObject ruleciclo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_REPETIR_1=null;
        Token otherlv_3=null;
        Token this_VECES_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token this_FIN_8=null;
        Token otherlv_9=null;
        Token this_REPETIR_10=null;
        Token otherlv_11=null;
        Token this_MIENTRAS_12=null;
        Token otherlv_14=null;
        Token this_SEA_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token this_FIN_20=null;
        EObject this_instrucciones_6 = null;

        EObject this_instrucciones_18 = null;



        	enterRule();

        try {
            // InternalLinit.g:1196:2: ( ( ( (otherlv_0= 'REPETIR' | this_REPETIR_1= RULE_REPETIR ) ruleexpresion (otherlv_3= 'VECES' | this_VECES_4= RULE_VECES ) otherlv_5= ':' this_instrucciones_6= ruleinstrucciones (otherlv_7= 'FIN' | this_FIN_8= RULE_FIN ) ) | ( (otherlv_9= 'REPETIR' | this_REPETIR_10= RULE_REPETIR ) (otherlv_11= 'MIENTRAS' | this_MIENTRAS_12= RULE_MIENTRAS ) ruleexpresion (otherlv_14= 'SEA' | this_SEA_15= RULE_SEA ) rulelogico otherlv_17= ':' this_instrucciones_18= ruleinstrucciones (otherlv_19= 'FIN' | this_FIN_20= RULE_FIN ) ) ) )
            // InternalLinit.g:1197:2: ( ( (otherlv_0= 'REPETIR' | this_REPETIR_1= RULE_REPETIR ) ruleexpresion (otherlv_3= 'VECES' | this_VECES_4= RULE_VECES ) otherlv_5= ':' this_instrucciones_6= ruleinstrucciones (otherlv_7= 'FIN' | this_FIN_8= RULE_FIN ) ) | ( (otherlv_9= 'REPETIR' | this_REPETIR_10= RULE_REPETIR ) (otherlv_11= 'MIENTRAS' | this_MIENTRAS_12= RULE_MIENTRAS ) ruleexpresion (otherlv_14= 'SEA' | this_SEA_15= RULE_SEA ) rulelogico otherlv_17= ':' this_instrucciones_18= ruleinstrucciones (otherlv_19= 'FIN' | this_FIN_20= RULE_FIN ) ) )
            {
            // InternalLinit.g:1197:2: ( ( (otherlv_0= 'REPETIR' | this_REPETIR_1= RULE_REPETIR ) ruleexpresion (otherlv_3= 'VECES' | this_VECES_4= RULE_VECES ) otherlv_5= ':' this_instrucciones_6= ruleinstrucciones (otherlv_7= 'FIN' | this_FIN_8= RULE_FIN ) ) | ( (otherlv_9= 'REPETIR' | this_REPETIR_10= RULE_REPETIR ) (otherlv_11= 'MIENTRAS' | this_MIENTRAS_12= RULE_MIENTRAS ) ruleexpresion (otherlv_14= 'SEA' | this_SEA_15= RULE_SEA ) rulelogico otherlv_17= ':' this_instrucciones_18= ruleinstrucciones (otherlv_19= 'FIN' | this_FIN_20= RULE_FIN ) ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==75) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==RULE_MIENTRAS||LA36_1==77) ) {
                    alt36=2;
                }
                else if ( (LA36_1==RULE_IDENTIFICADOR||(LA36_1>=RULE_NO && LA36_1<=RULE_IZQUIERDO)||(LA36_1>=RULE_FRASE && LA36_1<=RULE_NREAL)||(LA36_1>=93 && LA36_1<=95)) ) {
                    alt36=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA36_0==RULE_REPETIR) ) {
                int LA36_2 = input.LA(2);

                if ( (LA36_2==RULE_IDENTIFICADOR||(LA36_2>=RULE_NO && LA36_2<=RULE_IZQUIERDO)||(LA36_2>=RULE_FRASE && LA36_2<=RULE_NREAL)||(LA36_2>=93 && LA36_2<=95)) ) {
                    alt36=1;
                }
                else if ( (LA36_2==RULE_MIENTRAS||LA36_2==77) ) {
                    alt36=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalLinit.g:1198:3: ( (otherlv_0= 'REPETIR' | this_REPETIR_1= RULE_REPETIR ) ruleexpresion (otherlv_3= 'VECES' | this_VECES_4= RULE_VECES ) otherlv_5= ':' this_instrucciones_6= ruleinstrucciones (otherlv_7= 'FIN' | this_FIN_8= RULE_FIN ) )
                    {
                    // InternalLinit.g:1198:3: ( (otherlv_0= 'REPETIR' | this_REPETIR_1= RULE_REPETIR ) ruleexpresion (otherlv_3= 'VECES' | this_VECES_4= RULE_VECES ) otherlv_5= ':' this_instrucciones_6= ruleinstrucciones (otherlv_7= 'FIN' | this_FIN_8= RULE_FIN ) )
                    // InternalLinit.g:1199:4: (otherlv_0= 'REPETIR' | this_REPETIR_1= RULE_REPETIR ) ruleexpresion (otherlv_3= 'VECES' | this_VECES_4= RULE_VECES ) otherlv_5= ':' this_instrucciones_6= ruleinstrucciones (otherlv_7= 'FIN' | this_FIN_8= RULE_FIN )
                    {
                    // InternalLinit.g:1199:4: (otherlv_0= 'REPETIR' | this_REPETIR_1= RULE_REPETIR )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==75) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==RULE_REPETIR) ) {
                        alt29=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalLinit.g:1200:5: otherlv_0= 'REPETIR'
                            {
                            otherlv_0=(Token)match(input,75,FOLLOW_21); 

                            					newLeafNode(otherlv_0, grammarAccess.getCicloAccess().getREPETIRKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalLinit.g:1205:5: this_REPETIR_1= RULE_REPETIR
                            {
                            this_REPETIR_1=(Token)match(input,RULE_REPETIR,FOLLOW_21); 

                            					newLeafNode(this_REPETIR_1, grammarAccess.getCicloAccess().getREPETIRTerminalRuleCall_0_0_1());
                            				

                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getCicloAccess().getExpresionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_28);
                    ruleexpresion();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalLinit.g:1217:4: (otherlv_3= 'VECES' | this_VECES_4= RULE_VECES )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==76) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==RULE_VECES) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalLinit.g:1218:5: otherlv_3= 'VECES'
                            {
                            otherlv_3=(Token)match(input,76,FOLLOW_6); 

                            					newLeafNode(otherlv_3, grammarAccess.getCicloAccess().getVECESKeyword_0_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalLinit.g:1223:5: this_VECES_4= RULE_VECES
                            {
                            this_VECES_4=(Token)match(input,RULE_VECES,FOLLOW_6); 

                            					newLeafNode(this_VECES_4, grammarAccess.getCicloAccess().getVECESTerminalRuleCall_0_2_1());
                            				

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,65,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getCicloAccess().getColonKeyword_0_3());
                    			

                    				newCompositeNode(grammarAccess.getCicloAccess().getInstruccionesParserRuleCall_0_4());
                    			
                    pushFollow(FOLLOW_8);
                    this_instrucciones_6=ruleinstrucciones();

                    state._fsp--;


                    				current = this_instrucciones_6;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalLinit.g:1240:4: (otherlv_7= 'FIN' | this_FIN_8= RULE_FIN )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==66) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==RULE_FIN) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalLinit.g:1241:5: otherlv_7= 'FIN'
                            {
                            otherlv_7=(Token)match(input,66,FOLLOW_2); 

                            					newLeafNode(otherlv_7, grammarAccess.getCicloAccess().getFINKeyword_0_5_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalLinit.g:1246:5: this_FIN_8= RULE_FIN
                            {
                            this_FIN_8=(Token)match(input,RULE_FIN,FOLLOW_2); 

                            					newLeafNode(this_FIN_8, grammarAccess.getCicloAccess().getFINTerminalRuleCall_0_5_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLinit.g:1253:3: ( (otherlv_9= 'REPETIR' | this_REPETIR_10= RULE_REPETIR ) (otherlv_11= 'MIENTRAS' | this_MIENTRAS_12= RULE_MIENTRAS ) ruleexpresion (otherlv_14= 'SEA' | this_SEA_15= RULE_SEA ) rulelogico otherlv_17= ':' this_instrucciones_18= ruleinstrucciones (otherlv_19= 'FIN' | this_FIN_20= RULE_FIN ) )
                    {
                    // InternalLinit.g:1253:3: ( (otherlv_9= 'REPETIR' | this_REPETIR_10= RULE_REPETIR ) (otherlv_11= 'MIENTRAS' | this_MIENTRAS_12= RULE_MIENTRAS ) ruleexpresion (otherlv_14= 'SEA' | this_SEA_15= RULE_SEA ) rulelogico otherlv_17= ':' this_instrucciones_18= ruleinstrucciones (otherlv_19= 'FIN' | this_FIN_20= RULE_FIN ) )
                    // InternalLinit.g:1254:4: (otherlv_9= 'REPETIR' | this_REPETIR_10= RULE_REPETIR ) (otherlv_11= 'MIENTRAS' | this_MIENTRAS_12= RULE_MIENTRAS ) ruleexpresion (otherlv_14= 'SEA' | this_SEA_15= RULE_SEA ) rulelogico otherlv_17= ':' this_instrucciones_18= ruleinstrucciones (otherlv_19= 'FIN' | this_FIN_20= RULE_FIN )
                    {
                    // InternalLinit.g:1254:4: (otherlv_9= 'REPETIR' | this_REPETIR_10= RULE_REPETIR )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==75) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==RULE_REPETIR) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalLinit.g:1255:5: otherlv_9= 'REPETIR'
                            {
                            otherlv_9=(Token)match(input,75,FOLLOW_29); 

                            					newLeafNode(otherlv_9, grammarAccess.getCicloAccess().getREPETIRKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalLinit.g:1260:5: this_REPETIR_10= RULE_REPETIR
                            {
                            this_REPETIR_10=(Token)match(input,RULE_REPETIR,FOLLOW_29); 

                            					newLeafNode(this_REPETIR_10, grammarAccess.getCicloAccess().getREPETIRTerminalRuleCall_1_0_1());
                            				

                            }
                            break;

                    }

                    // InternalLinit.g:1265:4: (otherlv_11= 'MIENTRAS' | this_MIENTRAS_12= RULE_MIENTRAS )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==77) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==RULE_MIENTRAS) ) {
                        alt33=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalLinit.g:1266:5: otherlv_11= 'MIENTRAS'
                            {
                            otherlv_11=(Token)match(input,77,FOLLOW_21); 

                            					newLeafNode(otherlv_11, grammarAccess.getCicloAccess().getMIENTRASKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalLinit.g:1271:5: this_MIENTRAS_12= RULE_MIENTRAS
                            {
                            this_MIENTRAS_12=(Token)match(input,RULE_MIENTRAS,FOLLOW_21); 

                            					newLeafNode(this_MIENTRAS_12, grammarAccess.getCicloAccess().getMIENTRASTerminalRuleCall_1_1_1());
                            				

                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getCicloAccess().getExpresionParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_30);
                    ruleexpresion();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalLinit.g:1283:4: (otherlv_14= 'SEA' | this_SEA_15= RULE_SEA )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==78) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==RULE_SEA) ) {
                        alt34=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalLinit.g:1284:5: otherlv_14= 'SEA'
                            {
                            otherlv_14=(Token)match(input,78,FOLLOW_31); 

                            					newLeafNode(otherlv_14, grammarAccess.getCicloAccess().getSEAKeyword_1_3_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalLinit.g:1289:5: this_SEA_15= RULE_SEA
                            {
                            this_SEA_15=(Token)match(input,RULE_SEA,FOLLOW_31); 

                            					newLeafNode(this_SEA_15, grammarAccess.getCicloAccess().getSEATerminalRuleCall_1_3_1());
                            				

                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getCicloAccess().getLogicoParserRuleCall_1_4());
                    			
                    pushFollow(FOLLOW_6);
                    rulelogico();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_17=(Token)match(input,65,FOLLOW_7); 

                    				newLeafNode(otherlv_17, grammarAccess.getCicloAccess().getColonKeyword_1_5());
                    			

                    				newCompositeNode(grammarAccess.getCicloAccess().getInstruccionesParserRuleCall_1_6());
                    			
                    pushFollow(FOLLOW_8);
                    this_instrucciones_18=ruleinstrucciones();

                    state._fsp--;


                    				current = this_instrucciones_18;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalLinit.g:1313:4: (otherlv_19= 'FIN' | this_FIN_20= RULE_FIN )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==66) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==RULE_FIN) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalLinit.g:1314:5: otherlv_19= 'FIN'
                            {
                            otherlv_19=(Token)match(input,66,FOLLOW_2); 

                            					newLeafNode(otherlv_19, grammarAccess.getCicloAccess().getFINKeyword_1_7_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalLinit.g:1319:5: this_FIN_20= RULE_FIN
                            {
                            this_FIN_20=(Token)match(input,RULE_FIN,FOLLOW_2); 

                            					newLeafNode(this_FIN_20, grammarAccess.getCicloAccess().getFINTerminalRuleCall_1_7_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleciclo"


    // $ANTLR start "entryRuleimpresion"
    // InternalLinit.g:1329:1: entryRuleimpresion returns [String current=null] : iv_ruleimpresion= ruleimpresion EOF ;
    public final String entryRuleimpresion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleimpresion = null;


        try {
            // InternalLinit.g:1329:49: (iv_ruleimpresion= ruleimpresion EOF )
            // InternalLinit.g:1330:2: iv_ruleimpresion= ruleimpresion EOF
            {
             newCompositeNode(grammarAccess.getImpresionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleimpresion=ruleimpresion();

            state._fsp--;

             current =iv_ruleimpresion.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleimpresion"


    // $ANTLR start "ruleimpresion"
    // InternalLinit.g:1336:1: ruleimpresion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'IMPRIMIR EN CONSOLA' | this_IMPRIMIR_1= RULE_IMPRIMIR ) this_expresion_2= ruleexpresion this_listaImpresion_3= rulelistaImpresion ) ;
    public final AntlrDatatypeRuleToken ruleimpresion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IMPRIMIR_1=null;
        AntlrDatatypeRuleToken this_expresion_2 = null;

        AntlrDatatypeRuleToken this_listaImpresion_3 = null;



        	enterRule();

        try {
            // InternalLinit.g:1342:2: ( ( (kw= 'IMPRIMIR EN CONSOLA' | this_IMPRIMIR_1= RULE_IMPRIMIR ) this_expresion_2= ruleexpresion this_listaImpresion_3= rulelistaImpresion ) )
            // InternalLinit.g:1343:2: ( (kw= 'IMPRIMIR EN CONSOLA' | this_IMPRIMIR_1= RULE_IMPRIMIR ) this_expresion_2= ruleexpresion this_listaImpresion_3= rulelistaImpresion )
            {
            // InternalLinit.g:1343:2: ( (kw= 'IMPRIMIR EN CONSOLA' | this_IMPRIMIR_1= RULE_IMPRIMIR ) this_expresion_2= ruleexpresion this_listaImpresion_3= rulelistaImpresion )
            // InternalLinit.g:1344:3: (kw= 'IMPRIMIR EN CONSOLA' | this_IMPRIMIR_1= RULE_IMPRIMIR ) this_expresion_2= ruleexpresion this_listaImpresion_3= rulelistaImpresion
            {
            // InternalLinit.g:1344:3: (kw= 'IMPRIMIR EN CONSOLA' | this_IMPRIMIR_1= RULE_IMPRIMIR )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==79) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_IMPRIMIR) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalLinit.g:1345:4: kw= 'IMPRIMIR EN CONSOLA'
                    {
                    kw=(Token)match(input,79,FOLLOW_21); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getImpresionAccess().getIMPRIMIRENCONSOLAKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLinit.g:1351:4: this_IMPRIMIR_1= RULE_IMPRIMIR
                    {
                    this_IMPRIMIR_1=(Token)match(input,RULE_IMPRIMIR,FOLLOW_21); 

                    				current.merge(this_IMPRIMIR_1);
                    			

                    				newLeafNode(this_IMPRIMIR_1, grammarAccess.getImpresionAccess().getIMPRIMIRTerminalRuleCall_0_1());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getImpresionAccess().getExpresionParserRuleCall_1());
            		
            pushFollow(FOLLOW_15);
            this_expresion_2=ruleexpresion();

            state._fsp--;


            			current.merge(this_expresion_2);
            		

            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getImpresionAccess().getListaImpresionParserRuleCall_2());
            		
            pushFollow(FOLLOW_2);
            this_listaImpresion_3=rulelistaImpresion();

            state._fsp--;


            			current.merge(this_listaImpresion_3);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleimpresion"


    // $ANTLR start "entryRuleentrada"
    // InternalLinit.g:1383:1: entryRuleentrada returns [String current=null] : iv_ruleentrada= ruleentrada EOF ;
    public final String entryRuleentrada() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleentrada = null;


        try {
            // InternalLinit.g:1383:47: (iv_ruleentrada= ruleentrada EOF )
            // InternalLinit.g:1384:2: iv_ruleentrada= ruleentrada EOF
            {
             newCompositeNode(grammarAccess.getEntradaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleentrada=ruleentrada();

            state._fsp--;

             current =iv_ruleentrada.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleentrada"


    // $ANTLR start "ruleentrada"
    // InternalLinit.g:1390:1: ruleentrada returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'CAPTURAR DE CONSOLA' | this_CAPTURAR_1= RULE_CAPTURAR ) this_IDENTIFICADOR_2= RULE_IDENTIFICADOR ) ;
    public final AntlrDatatypeRuleToken ruleentrada() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_CAPTURAR_1=null;
        Token this_IDENTIFICADOR_2=null;


        	enterRule();

        try {
            // InternalLinit.g:1396:2: ( ( (kw= 'CAPTURAR DE CONSOLA' | this_CAPTURAR_1= RULE_CAPTURAR ) this_IDENTIFICADOR_2= RULE_IDENTIFICADOR ) )
            // InternalLinit.g:1397:2: ( (kw= 'CAPTURAR DE CONSOLA' | this_CAPTURAR_1= RULE_CAPTURAR ) this_IDENTIFICADOR_2= RULE_IDENTIFICADOR )
            {
            // InternalLinit.g:1397:2: ( (kw= 'CAPTURAR DE CONSOLA' | this_CAPTURAR_1= RULE_CAPTURAR ) this_IDENTIFICADOR_2= RULE_IDENTIFICADOR )
            // InternalLinit.g:1398:3: (kw= 'CAPTURAR DE CONSOLA' | this_CAPTURAR_1= RULE_CAPTURAR ) this_IDENTIFICADOR_2= RULE_IDENTIFICADOR
            {
            // InternalLinit.g:1398:3: (kw= 'CAPTURAR DE CONSOLA' | this_CAPTURAR_1= RULE_CAPTURAR )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==80) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_CAPTURAR) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalLinit.g:1399:4: kw= 'CAPTURAR DE CONSOLA'
                    {
                    kw=(Token)match(input,80,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEntradaAccess().getCAPTURARDECONSOLAKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLinit.g:1405:4: this_CAPTURAR_1= RULE_CAPTURAR
                    {
                    this_CAPTURAR_1=(Token)match(input,RULE_CAPTURAR,FOLLOW_4); 

                    				current.merge(this_CAPTURAR_1);
                    			

                    				newLeafNode(this_CAPTURAR_1, grammarAccess.getEntradaAccess().getCAPTURARTerminalRuleCall_0_1());
                    			

                    }
                    break;

            }

            this_IDENTIFICADOR_2=(Token)match(input,RULE_IDENTIFICADOR,FOLLOW_2); 

            			current.merge(this_IDENTIFICADOR_2);
            		

            			newLeafNode(this_IDENTIFICADOR_2, grammarAccess.getEntradaAccess().getIDENTIFICADORTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleentrada"


    // $ANTLR start "entryRuletipoVariable"
    // InternalLinit.g:1424:1: entryRuletipoVariable returns [String current=null] : iv_ruletipoVariable= ruletipoVariable EOF ;
    public final String entryRuletipoVariable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruletipoVariable = null;


        try {
            // InternalLinit.g:1424:52: (iv_ruletipoVariable= ruletipoVariable EOF )
            // InternalLinit.g:1425:2: iv_ruletipoVariable= ruletipoVariable EOF
            {
             newCompositeNode(grammarAccess.getTipoVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletipoVariable=ruletipoVariable();

            state._fsp--;

             current =iv_ruletipoVariable.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletipoVariable"


    // $ANTLR start "ruletipoVariable"
    // InternalLinit.g:1431:1: ruletipoVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'ENTERA' | this_ENTERA_1= RULE_ENTERA ) | (kw= 'REAL' | this_REAL_3= RULE_REAL ) | (kw= 'LOGICA' | this_LOGICA_5= RULE_LOGICA ) | (kw= 'DE CARACTERES' | this_CARACTERES_7= RULE_CARACTERES ) ) ;
    public final AntlrDatatypeRuleToken ruletipoVariable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ENTERA_1=null;
        Token this_REAL_3=null;
        Token this_LOGICA_5=null;
        Token this_CARACTERES_7=null;


        	enterRule();

        try {
            // InternalLinit.g:1437:2: ( ( (kw= 'ENTERA' | this_ENTERA_1= RULE_ENTERA ) | (kw= 'REAL' | this_REAL_3= RULE_REAL ) | (kw= 'LOGICA' | this_LOGICA_5= RULE_LOGICA ) | (kw= 'DE CARACTERES' | this_CARACTERES_7= RULE_CARACTERES ) ) )
            // InternalLinit.g:1438:2: ( (kw= 'ENTERA' | this_ENTERA_1= RULE_ENTERA ) | (kw= 'REAL' | this_REAL_3= RULE_REAL ) | (kw= 'LOGICA' | this_LOGICA_5= RULE_LOGICA ) | (kw= 'DE CARACTERES' | this_CARACTERES_7= RULE_CARACTERES ) )
            {
            // InternalLinit.g:1438:2: ( (kw= 'ENTERA' | this_ENTERA_1= RULE_ENTERA ) | (kw= 'REAL' | this_REAL_3= RULE_REAL ) | (kw= 'LOGICA' | this_LOGICA_5= RULE_LOGICA ) | (kw= 'DE CARACTERES' | this_CARACTERES_7= RULE_CARACTERES ) )
            int alt43=4;
            switch ( input.LA(1) ) {
            case RULE_ENTERA:
            case 81:
                {
                alt43=1;
                }
                break;
            case RULE_REAL:
            case 82:
                {
                alt43=2;
                }
                break;
            case RULE_LOGICA:
            case 83:
                {
                alt43=3;
                }
                break;
            case RULE_CARACTERES:
            case 84:
                {
                alt43=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalLinit.g:1439:3: (kw= 'ENTERA' | this_ENTERA_1= RULE_ENTERA )
                    {
                    // InternalLinit.g:1439:3: (kw= 'ENTERA' | this_ENTERA_1= RULE_ENTERA )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==81) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==RULE_ENTERA) ) {
                        alt39=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalLinit.g:1440:4: kw= 'ENTERA'
                            {
                            kw=(Token)match(input,81,FOLLOW_2); 

                            				current.merge(kw);
                            				newLeafNode(kw, grammarAccess.getTipoVariableAccess().getENTERAKeyword_0_0());
                            			

                            }
                            break;
                        case 2 :
                            // InternalLinit.g:1446:4: this_ENTERA_1= RULE_ENTERA
                            {
                            this_ENTERA_1=(Token)match(input,RULE_ENTERA,FOLLOW_2); 

                            				current.merge(this_ENTERA_1);
                            			

                            				newLeafNode(this_ENTERA_1, grammarAccess.getTipoVariableAccess().getENTERATerminalRuleCall_0_1());
                            			

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalLinit.g:1455:3: (kw= 'REAL' | this_REAL_3= RULE_REAL )
                    {
                    // InternalLinit.g:1455:3: (kw= 'REAL' | this_REAL_3= RULE_REAL )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==82) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==RULE_REAL) ) {
                        alt40=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalLinit.g:1456:4: kw= 'REAL'
                            {
                            kw=(Token)match(input,82,FOLLOW_2); 

                            				current.merge(kw);
                            				newLeafNode(kw, grammarAccess.getTipoVariableAccess().getREALKeyword_1_0());
                            			

                            }
                            break;
                        case 2 :
                            // InternalLinit.g:1462:4: this_REAL_3= RULE_REAL
                            {
                            this_REAL_3=(Token)match(input,RULE_REAL,FOLLOW_2); 

                            				current.merge(this_REAL_3);
                            			

                            				newLeafNode(this_REAL_3, grammarAccess.getTipoVariableAccess().getREALTerminalRuleCall_1_1());
                            			

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // InternalLinit.g:1471:3: (kw= 'LOGICA' | this_LOGICA_5= RULE_LOGICA )
                    {
                    // InternalLinit.g:1471:3: (kw= 'LOGICA' | this_LOGICA_5= RULE_LOGICA )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==83) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==RULE_LOGICA) ) {
                        alt41=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalLinit.g:1472:4: kw= 'LOGICA'
                            {
                            kw=(Token)match(input,83,FOLLOW_2); 

                            				current.merge(kw);
                            				newLeafNode(kw, grammarAccess.getTipoVariableAccess().getLOGICAKeyword_2_0());
                            			

                            }
                            break;
                        case 2 :
                            // InternalLinit.g:1478:4: this_LOGICA_5= RULE_LOGICA
                            {
                            this_LOGICA_5=(Token)match(input,RULE_LOGICA,FOLLOW_2); 

                            				current.merge(this_LOGICA_5);
                            			

                            				newLeafNode(this_LOGICA_5, grammarAccess.getTipoVariableAccess().getLOGICATerminalRuleCall_2_1());
                            			

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // InternalLinit.g:1487:3: (kw= 'DE CARACTERES' | this_CARACTERES_7= RULE_CARACTERES )
                    {
                    // InternalLinit.g:1487:3: (kw= 'DE CARACTERES' | this_CARACTERES_7= RULE_CARACTERES )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==84) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==RULE_CARACTERES) ) {
                        alt42=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalLinit.g:1488:4: kw= 'DE CARACTERES'
                            {
                            kw=(Token)match(input,84,FOLLOW_2); 

                            				current.merge(kw);
                            				newLeafNode(kw, grammarAccess.getTipoVariableAccess().getDECARACTERESKeyword_3_0());
                            			

                            }
                            break;
                        case 2 :
                            // InternalLinit.g:1494:4: this_CARACTERES_7= RULE_CARACTERES
                            {
                            this_CARACTERES_7=(Token)match(input,RULE_CARACTERES,FOLLOW_2); 

                            				current.merge(this_CARACTERES_7);
                            			

                            				newLeafNode(this_CARACTERES_7, grammarAccess.getTipoVariableAccess().getCARACTERESTerminalRuleCall_3_1());
                            			

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletipoVariable"


    // $ANTLR start "entryRuleigualdad"
    // InternalLinit.g:1506:1: entryRuleigualdad returns [String current=null] : iv_ruleigualdad= ruleigualdad EOF ;
    public final String entryRuleigualdad() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleigualdad = null;


        try {
            // InternalLinit.g:1506:48: (iv_ruleigualdad= ruleigualdad EOF )
            // InternalLinit.g:1507:2: iv_ruleigualdad= ruleigualdad EOF
            {
             newCompositeNode(grammarAccess.getIgualdadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleigualdad=ruleigualdad();

            state._fsp--;

             current =iv_ruleigualdad.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleigualdad"


    // $ANTLR start "ruleigualdad"
    // InternalLinit.g:1513:1: ruleigualdad returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= 'ES IGUAL A' | this_IGUAL_1= RULE_IGUAL ) this_expresion_2= ruleexpresion ) | (this_SIGNOIGUAL_3= RULE_SIGNOIGUAL this_expresion_4= ruleexpresion ) ) ;
    public final AntlrDatatypeRuleToken ruleigualdad() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IGUAL_1=null;
        Token this_SIGNOIGUAL_3=null;
        AntlrDatatypeRuleToken this_expresion_2 = null;

        AntlrDatatypeRuleToken this_expresion_4 = null;



        	enterRule();

        try {
            // InternalLinit.g:1519:2: ( ( ( (kw= 'ES IGUAL A' | this_IGUAL_1= RULE_IGUAL ) this_expresion_2= ruleexpresion ) | (this_SIGNOIGUAL_3= RULE_SIGNOIGUAL this_expresion_4= ruleexpresion ) ) )
            // InternalLinit.g:1520:2: ( ( (kw= 'ES IGUAL A' | this_IGUAL_1= RULE_IGUAL ) this_expresion_2= ruleexpresion ) | (this_SIGNOIGUAL_3= RULE_SIGNOIGUAL this_expresion_4= ruleexpresion ) )
            {
            // InternalLinit.g:1520:2: ( ( (kw= 'ES IGUAL A' | this_IGUAL_1= RULE_IGUAL ) this_expresion_2= ruleexpresion ) | (this_SIGNOIGUAL_3= RULE_SIGNOIGUAL this_expresion_4= ruleexpresion ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_IGUAL||LA45_0==85) ) {
                alt45=1;
            }
            else if ( (LA45_0==RULE_SIGNOIGUAL) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalLinit.g:1521:3: ( (kw= 'ES IGUAL A' | this_IGUAL_1= RULE_IGUAL ) this_expresion_2= ruleexpresion )
                    {
                    // InternalLinit.g:1521:3: ( (kw= 'ES IGUAL A' | this_IGUAL_1= RULE_IGUAL ) this_expresion_2= ruleexpresion )
                    // InternalLinit.g:1522:4: (kw= 'ES IGUAL A' | this_IGUAL_1= RULE_IGUAL ) this_expresion_2= ruleexpresion
                    {
                    // InternalLinit.g:1522:4: (kw= 'ES IGUAL A' | this_IGUAL_1= RULE_IGUAL )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==85) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==RULE_IGUAL) ) {
                        alt44=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalLinit.g:1523:5: kw= 'ES IGUAL A'
                            {
                            kw=(Token)match(input,85,FOLLOW_21); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getIgualdadAccess().getESIGUALAKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalLinit.g:1529:5: this_IGUAL_1= RULE_IGUAL
                            {
                            this_IGUAL_1=(Token)match(input,RULE_IGUAL,FOLLOW_21); 

                            					current.merge(this_IGUAL_1);
                            				

                            					newLeafNode(this_IGUAL_1, grammarAccess.getIgualdadAccess().getIGUALTerminalRuleCall_0_0_1());
                            				

                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getIgualdadAccess().getExpresionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_expresion_2=ruleexpresion();

                    state._fsp--;


                    				current.merge(this_expresion_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLinit.g:1549:3: (this_SIGNOIGUAL_3= RULE_SIGNOIGUAL this_expresion_4= ruleexpresion )
                    {
                    // InternalLinit.g:1549:3: (this_SIGNOIGUAL_3= RULE_SIGNOIGUAL this_expresion_4= ruleexpresion )
                    // InternalLinit.g:1550:4: this_SIGNOIGUAL_3= RULE_SIGNOIGUAL this_expresion_4= ruleexpresion
                    {
                    this_SIGNOIGUAL_3=(Token)match(input,RULE_SIGNOIGUAL,FOLLOW_21); 

                    				current.merge(this_SIGNOIGUAL_3);
                    			

                    				newLeafNode(this_SIGNOIGUAL_3, grammarAccess.getIgualdadAccess().getSIGNOIGUALTerminalRuleCall_1_0());
                    			

                    				newCompositeNode(grammarAccess.getIgualdadAccess().getExpresionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_expresion_4=ruleexpresion();

                    state._fsp--;


                    				current.merge(this_expresion_4);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleigualdad"


    // $ANTLR start "entryRulelistaIdentificadores"
    // InternalLinit.g:1572:1: entryRulelistaIdentificadores returns [String current=null] : iv_rulelistaIdentificadores= rulelistaIdentificadores EOF ;
    public final String entryRulelistaIdentificadores() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelistaIdentificadores = null;


        try {
            // InternalLinit.g:1572:60: (iv_rulelistaIdentificadores= rulelistaIdentificadores EOF )
            // InternalLinit.g:1573:2: iv_rulelistaIdentificadores= rulelistaIdentificadores EOF
            {
             newCompositeNode(grammarAccess.getListaIdentificadoresRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelistaIdentificadores=rulelistaIdentificadores();

            state._fsp--;

             current =iv_rulelistaIdentificadores.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelistaIdentificadores"


    // $ANTLR start "rulelistaIdentificadores"
    // InternalLinit.g:1579:1: rulelistaIdentificadores returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ';' this_IDENTIFICADOR_1= RULE_IDENTIFICADOR this_listaIdentificadores_2= rulelistaIdentificadores )? ;
    public final AntlrDatatypeRuleToken rulelistaIdentificadores() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_IDENTIFICADOR_1=null;
        AntlrDatatypeRuleToken this_listaIdentificadores_2 = null;



        	enterRule();

        try {
            // InternalLinit.g:1585:2: ( (kw= ';' this_IDENTIFICADOR_1= RULE_IDENTIFICADOR this_listaIdentificadores_2= rulelistaIdentificadores )? )
            // InternalLinit.g:1586:2: (kw= ';' this_IDENTIFICADOR_1= RULE_IDENTIFICADOR this_listaIdentificadores_2= rulelistaIdentificadores )?
            {
            // InternalLinit.g:1586:2: (kw= ';' this_IDENTIFICADOR_1= RULE_IDENTIFICADOR this_listaIdentificadores_2= rulelistaIdentificadores )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==71) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalLinit.g:1587:3: kw= ';' this_IDENTIFICADOR_1= RULE_IDENTIFICADOR this_listaIdentificadores_2= rulelistaIdentificadores
                    {
                    kw=(Token)match(input,71,FOLLOW_4); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getListaIdentificadoresAccess().getSemicolonKeyword_0());
                    		
                    this_IDENTIFICADOR_1=(Token)match(input,RULE_IDENTIFICADOR,FOLLOW_15); 

                    			current.merge(this_IDENTIFICADOR_1);
                    		

                    			newLeafNode(this_IDENTIFICADOR_1, grammarAccess.getListaIdentificadoresAccess().getIDENTIFICADORTerminalRuleCall_1());
                    		

                    			newCompositeNode(grammarAccess.getListaIdentificadoresAccess().getListaIdentificadoresParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_listaIdentificadores_2=rulelistaIdentificadores();

                    state._fsp--;


                    			current.merge(this_listaIdentificadores_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelistaIdentificadores"


    // $ANTLR start "entryRuleexpresion"
    // InternalLinit.g:1613:1: entryRuleexpresion returns [String current=null] : iv_ruleexpresion= ruleexpresion EOF ;
    public final String entryRuleexpresion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexpresion = null;


        try {
            // InternalLinit.g:1613:49: (iv_ruleexpresion= ruleexpresion EOF )
            // InternalLinit.g:1614:2: iv_ruleexpresion= ruleexpresion EOF
            {
             newCompositeNode(grammarAccess.getExpresionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleexpresion=ruleexpresion();

            state._fsp--;

             current =iv_ruleexpresion.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleexpresion"


    // $ANTLR start "ruleexpresion"
    // InternalLinit.g:1620:1: ruleexpresion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_operacionOY_0= ruleoperacionOY ;
    public final AntlrDatatypeRuleToken ruleexpresion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_operacionOY_0 = null;



        	enterRule();

        try {
            // InternalLinit.g:1626:2: (this_operacionOY_0= ruleoperacionOY )
            // InternalLinit.g:1627:2: this_operacionOY_0= ruleoperacionOY
            {

            		newCompositeNode(grammarAccess.getExpresionAccess().getOperacionOYParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_operacionOY_0=ruleoperacionOY();

            state._fsp--;


            		current.merge(this_operacionOY_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleexpresion"


    // $ANTLR start "entryRuleoperacionOY"
    // InternalLinit.g:1640:1: entryRuleoperacionOY returns [String current=null] : iv_ruleoperacionOY= ruleoperacionOY EOF ;
    public final String entryRuleoperacionOY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleoperacionOY = null;


        try {
            // InternalLinit.g:1640:51: (iv_ruleoperacionOY= ruleoperacionOY EOF )
            // InternalLinit.g:1641:2: iv_ruleoperacionOY= ruleoperacionOY EOF
            {
             newCompositeNode(grammarAccess.getOperacionOYRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleoperacionOY=ruleoperacionOY();

            state._fsp--;

             current =iv_ruleoperacionOY.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleoperacionOY"


    // $ANTLR start "ruleoperacionOY"
    // InternalLinit.g:1647:1: ruleoperacionOY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_comparacion_0= rulecomparacion ( (kw= 'Y' | this_SIGNOY_2= RULE_SIGNOY | kw= 'O' | this_SIGNOO_4= RULE_SIGNOO ) this_operacionOY_5= ruleoperacionOY )? ) ;
    public final AntlrDatatypeRuleToken ruleoperacionOY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_SIGNOY_2=null;
        Token this_SIGNOO_4=null;
        AntlrDatatypeRuleToken this_comparacion_0 = null;

        AntlrDatatypeRuleToken this_operacionOY_5 = null;



        	enterRule();

        try {
            // InternalLinit.g:1653:2: ( (this_comparacion_0= rulecomparacion ( (kw= 'Y' | this_SIGNOY_2= RULE_SIGNOY | kw= 'O' | this_SIGNOO_4= RULE_SIGNOO ) this_operacionOY_5= ruleoperacionOY )? ) )
            // InternalLinit.g:1654:2: (this_comparacion_0= rulecomparacion ( (kw= 'Y' | this_SIGNOY_2= RULE_SIGNOY | kw= 'O' | this_SIGNOO_4= RULE_SIGNOO ) this_operacionOY_5= ruleoperacionOY )? )
            {
            // InternalLinit.g:1654:2: (this_comparacion_0= rulecomparacion ( (kw= 'Y' | this_SIGNOY_2= RULE_SIGNOY | kw= 'O' | this_SIGNOO_4= RULE_SIGNOO ) this_operacionOY_5= ruleoperacionOY )? )
            // InternalLinit.g:1655:3: this_comparacion_0= rulecomparacion ( (kw= 'Y' | this_SIGNOY_2= RULE_SIGNOY | kw= 'O' | this_SIGNOO_4= RULE_SIGNOO ) this_operacionOY_5= ruleoperacionOY )?
            {

            			newCompositeNode(grammarAccess.getOperacionOYAccess().getComparacionParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_comparacion_0=rulecomparacion();

            state._fsp--;


            			current.merge(this_comparacion_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalLinit.g:1665:3: ( (kw= 'Y' | this_SIGNOY_2= RULE_SIGNOY | kw= 'O' | this_SIGNOO_4= RULE_SIGNOO ) this_operacionOY_5= ruleoperacionOY )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_SIGNOY && LA48_0<=RULE_SIGNOO)||(LA48_0>=86 && LA48_0<=87)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalLinit.g:1666:4: (kw= 'Y' | this_SIGNOY_2= RULE_SIGNOY | kw= 'O' | this_SIGNOO_4= RULE_SIGNOO ) this_operacionOY_5= ruleoperacionOY
                    {
                    // InternalLinit.g:1666:4: (kw= 'Y' | this_SIGNOY_2= RULE_SIGNOY | kw= 'O' | this_SIGNOO_4= RULE_SIGNOO )
                    int alt47=4;
                    switch ( input.LA(1) ) {
                    case 86:
                        {
                        alt47=1;
                        }
                        break;
                    case RULE_SIGNOY:
                        {
                        alt47=2;
                        }
                        break;
                    case 87:
                        {
                        alt47=3;
                        }
                        break;
                    case RULE_SIGNOO:
                        {
                        alt47=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }

                    switch (alt47) {
                        case 1 :
                            // InternalLinit.g:1667:5: kw= 'Y'
                            {
                            kw=(Token)match(input,86,FOLLOW_21); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getOperacionOYAccess().getYKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalLinit.g:1673:5: this_SIGNOY_2= RULE_SIGNOY
                            {
                            this_SIGNOY_2=(Token)match(input,RULE_SIGNOY,FOLLOW_21); 

                            					current.merge(this_SIGNOY_2);
                            				

                            					newLeafNode(this_SIGNOY_2, grammarAccess.getOperacionOYAccess().getSIGNOYTerminalRuleCall_1_0_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalLinit.g:1681:5: kw= 'O'
                            {
                            kw=(Token)match(input,87,FOLLOW_21); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getOperacionOYAccess().getOKeyword_1_0_2());
                            				

                            }
                            break;
                        case 4 :
                            // InternalLinit.g:1687:5: this_SIGNOO_4= RULE_SIGNOO
                            {
                            this_SIGNOO_4=(Token)match(input,RULE_SIGNOO,FOLLOW_21); 

                            					current.merge(this_SIGNOO_4);
                            				

                            					newLeafNode(this_SIGNOO_4, grammarAccess.getOperacionOYAccess().getSIGNOOTerminalRuleCall_1_0_3());
                            				

                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getOperacionOYAccess().getOperacionOYParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_operacionOY_5=ruleoperacionOY();

                    state._fsp--;


                    				current.merge(this_operacionOY_5);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleoperacionOY"


    // $ANTLR start "entryRulecomparacion"
    // InternalLinit.g:1710:1: entryRulecomparacion returns [String current=null] : iv_rulecomparacion= rulecomparacion EOF ;
    public final String entryRulecomparacion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecomparacion = null;


        try {
            // InternalLinit.g:1710:51: (iv_rulecomparacion= rulecomparacion EOF )
            // InternalLinit.g:1711:2: iv_rulecomparacion= rulecomparacion EOF
            {
             newCompositeNode(grammarAccess.getComparacionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecomparacion=rulecomparacion();

            state._fsp--;

             current =iv_rulecomparacion.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecomparacion"


    // $ANTLR start "rulecomparacion"
    // InternalLinit.g:1717:1: rulecomparacion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_aritmetica_0= rulearitmetica (this_opcomparacion_1= ruleopcomparacion this_comparacion_2= rulecomparacion )? ) ;
    public final AntlrDatatypeRuleToken rulecomparacion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_aritmetica_0 = null;

        AntlrDatatypeRuleToken this_opcomparacion_1 = null;

        AntlrDatatypeRuleToken this_comparacion_2 = null;



        	enterRule();

        try {
            // InternalLinit.g:1723:2: ( (this_aritmetica_0= rulearitmetica (this_opcomparacion_1= ruleopcomparacion this_comparacion_2= rulecomparacion )? ) )
            // InternalLinit.g:1724:2: (this_aritmetica_0= rulearitmetica (this_opcomparacion_1= ruleopcomparacion this_comparacion_2= rulecomparacion )? )
            {
            // InternalLinit.g:1724:2: (this_aritmetica_0= rulearitmetica (this_opcomparacion_1= ruleopcomparacion this_comparacion_2= rulecomparacion )? )
            // InternalLinit.g:1725:3: this_aritmetica_0= rulearitmetica (this_opcomparacion_1= ruleopcomparacion this_comparacion_2= rulecomparacion )?
            {

            			newCompositeNode(grammarAccess.getComparacionAccess().getAritmeticaParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_aritmetica_0=rulearitmetica();

            state._fsp--;


            			current.merge(this_aritmetica_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalLinit.g:1735:3: (this_opcomparacion_1= ruleopcomparacion this_comparacion_2= rulecomparacion )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_IGUAL && LA49_0<=RULE_SIGNOIGUAL)||(LA49_0>=RULE_MENOR && LA49_0<=RULE_SIGNODIFERENTE)||LA49_0==85||(LA49_0>=88 && LA49_0<=92)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalLinit.g:1736:4: this_opcomparacion_1= ruleopcomparacion this_comparacion_2= rulecomparacion
                    {

                    				newCompositeNode(grammarAccess.getComparacionAccess().getOpcomparacionParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_21);
                    this_opcomparacion_1=ruleopcomparacion();

                    state._fsp--;


                    				current.merge(this_opcomparacion_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getComparacionAccess().getComparacionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_comparacion_2=rulecomparacion();

                    state._fsp--;


                    				current.merge(this_comparacion_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecomparacion"


    // $ANTLR start "entryRuleopcomparacion"
    // InternalLinit.g:1761:1: entryRuleopcomparacion returns [String current=null] : iv_ruleopcomparacion= ruleopcomparacion EOF ;
    public final String entryRuleopcomparacion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleopcomparacion = null;


        try {
            // InternalLinit.g:1761:53: (iv_ruleopcomparacion= ruleopcomparacion EOF )
            // InternalLinit.g:1762:2: iv_ruleopcomparacion= ruleopcomparacion EOF
            {
             newCompositeNode(grammarAccess.getOpcomparacionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleopcomparacion=ruleopcomparacion();

            state._fsp--;

             current =iv_ruleopcomparacion.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleopcomparacion"


    // $ANTLR start "ruleopcomparacion"
    // InternalLinit.g:1768:1: ruleopcomparacion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= 'ES MENOR A' | this_MENOR_1= RULE_MENOR ) | this_SIGNOMENOR_2= RULE_SIGNOMENOR ) | ( (kw= 'ES MENOR O IGUAL A' | this_MENORIGUAL_4= RULE_MENORIGUAL ) | this_SIGNOMENORIGUAL_5= RULE_SIGNOMENORIGUAL ) | ( (kw= 'ES MAYOR A' | this_MAYOR_7= RULE_MAYOR ) | this_SIGNOMAYOR_8= RULE_SIGNOMAYOR ) | ( (kw= 'ES MAYOR O IGUAL A' | this_MAYORIGUAL_10= RULE_MAYORIGUAL ) | this_SIGNOMAYORIGUAL_11= RULE_SIGNOMAYORIGUAL ) | ( (kw= 'ES DIFERENTE DE A' | this_DIFERENTE_13= RULE_DIFERENTE ) | this_SIGNODIFERENTE_14= RULE_SIGNODIFERENTE ) | ( (kw= 'ES IGUAL A' | this_IGUAL_16= RULE_IGUAL ) | this_SIGNOIGUAL_17= RULE_SIGNOIGUAL ) ) ;
    public final AntlrDatatypeRuleToken ruleopcomparacion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_MENOR_1=null;
        Token this_SIGNOMENOR_2=null;
        Token this_MENORIGUAL_4=null;
        Token this_SIGNOMENORIGUAL_5=null;
        Token this_MAYOR_7=null;
        Token this_SIGNOMAYOR_8=null;
        Token this_MAYORIGUAL_10=null;
        Token this_SIGNOMAYORIGUAL_11=null;
        Token this_DIFERENTE_13=null;
        Token this_SIGNODIFERENTE_14=null;
        Token this_IGUAL_16=null;
        Token this_SIGNOIGUAL_17=null;


        	enterRule();

        try {
            // InternalLinit.g:1774:2: ( ( ( (kw= 'ES MENOR A' | this_MENOR_1= RULE_MENOR ) | this_SIGNOMENOR_2= RULE_SIGNOMENOR ) | ( (kw= 'ES MENOR O IGUAL A' | this_MENORIGUAL_4= RULE_MENORIGUAL ) | this_SIGNOMENORIGUAL_5= RULE_SIGNOMENORIGUAL ) | ( (kw= 'ES MAYOR A' | this_MAYOR_7= RULE_MAYOR ) | this_SIGNOMAYOR_8= RULE_SIGNOMAYOR ) | ( (kw= 'ES MAYOR O IGUAL A' | this_MAYORIGUAL_10= RULE_MAYORIGUAL ) | this_SIGNOMAYORIGUAL_11= RULE_SIGNOMAYORIGUAL ) | ( (kw= 'ES DIFERENTE DE A' | this_DIFERENTE_13= RULE_DIFERENTE ) | this_SIGNODIFERENTE_14= RULE_SIGNODIFERENTE ) | ( (kw= 'ES IGUAL A' | this_IGUAL_16= RULE_IGUAL ) | this_SIGNOIGUAL_17= RULE_SIGNOIGUAL ) ) )
            // InternalLinit.g:1775:2: ( ( (kw= 'ES MENOR A' | this_MENOR_1= RULE_MENOR ) | this_SIGNOMENOR_2= RULE_SIGNOMENOR ) | ( (kw= 'ES MENOR O IGUAL A' | this_MENORIGUAL_4= RULE_MENORIGUAL ) | this_SIGNOMENORIGUAL_5= RULE_SIGNOMENORIGUAL ) | ( (kw= 'ES MAYOR A' | this_MAYOR_7= RULE_MAYOR ) | this_SIGNOMAYOR_8= RULE_SIGNOMAYOR ) | ( (kw= 'ES MAYOR O IGUAL A' | this_MAYORIGUAL_10= RULE_MAYORIGUAL ) | this_SIGNOMAYORIGUAL_11= RULE_SIGNOMAYORIGUAL ) | ( (kw= 'ES DIFERENTE DE A' | this_DIFERENTE_13= RULE_DIFERENTE ) | this_SIGNODIFERENTE_14= RULE_SIGNODIFERENTE ) | ( (kw= 'ES IGUAL A' | this_IGUAL_16= RULE_IGUAL ) | this_SIGNOIGUAL_17= RULE_SIGNOIGUAL ) )
            {
            // InternalLinit.g:1775:2: ( ( (kw= 'ES MENOR A' | this_MENOR_1= RULE_MENOR ) | this_SIGNOMENOR_2= RULE_SIGNOMENOR ) | ( (kw= 'ES MENOR O IGUAL A' | this_MENORIGUAL_4= RULE_MENORIGUAL ) | this_SIGNOMENORIGUAL_5= RULE_SIGNOMENORIGUAL ) | ( (kw= 'ES MAYOR A' | this_MAYOR_7= RULE_MAYOR ) | this_SIGNOMAYOR_8= RULE_SIGNOMAYOR ) | ( (kw= 'ES MAYOR O IGUAL A' | this_MAYORIGUAL_10= RULE_MAYORIGUAL ) | this_SIGNOMAYORIGUAL_11= RULE_SIGNOMAYORIGUAL ) | ( (kw= 'ES DIFERENTE DE A' | this_DIFERENTE_13= RULE_DIFERENTE ) | this_SIGNODIFERENTE_14= RULE_SIGNODIFERENTE ) | ( (kw= 'ES IGUAL A' | this_IGUAL_16= RULE_IGUAL ) | this_SIGNOIGUAL_17= RULE_SIGNOIGUAL ) )
            int alt62=6;
            switch ( input.LA(1) ) {
            case RULE_MENOR:
            case RULE_SIGNOMENOR:
            case 88:
                {
                alt62=1;
                }
                break;
            case RULE_MENORIGUAL:
            case RULE_SIGNOMENORIGUAL:
            case 89:
                {
                alt62=2;
                }
                break;
            case RULE_MAYOR:
            case RULE_SIGNOMAYOR:
            case 90:
                {
                alt62=3;
                }
                break;
            case RULE_MAYORIGUAL:
            case RULE_SIGNOMAYORIGUAL:
            case 91:
                {
                alt62=4;
                }
                break;
            case RULE_DIFERENTE:
            case RULE_SIGNODIFERENTE:
            case 92:
                {
                alt62=5;
                }
                break;
            case RULE_IGUAL:
            case RULE_SIGNOIGUAL:
            case 85:
                {
                alt62=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // InternalLinit.g:1776:3: ( (kw= 'ES MENOR A' | this_MENOR_1= RULE_MENOR ) | this_SIGNOMENOR_2= RULE_SIGNOMENOR )
                    {
                    // InternalLinit.g:1776:3: ( (kw= 'ES MENOR A' | this_MENOR_1= RULE_MENOR ) | this_SIGNOMENOR_2= RULE_SIGNOMENOR )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==RULE_MENOR||LA51_0==88) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==RULE_SIGNOMENOR) ) {
                        alt51=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalLinit.g:1777:4: (kw= 'ES MENOR A' | this_MENOR_1= RULE_MENOR )
                            {
                            // InternalLinit.g:1777:4: (kw= 'ES MENOR A' | this_MENOR_1= RULE_MENOR )
                            int alt50=2;
                            int LA50_0 = input.LA(1);

                            if ( (LA50_0==88) ) {
                                alt50=1;
                            }
                            else if ( (LA50_0==RULE_MENOR) ) {
                                alt50=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 50, 0, input);

                                throw nvae;
                            }
                            switch (alt50) {
                                case 1 :
                                    // InternalLinit.g:1778:5: kw= 'ES MENOR A'
                                    {
                                    kw=(Token)match(input,88,FOLLOW_2); 

                                    					current.merge(kw);
                                    					newLeafNode(kw, grammarAccess.getOpcomparacionAccess().getESMENORAKeyword_0_0_0());
                                    				

                                    }
                                    break;
                                case 2 :
                                    // InternalLinit.g:1784:5: this_MENOR_1= RULE_MENOR
                                    {
                                    this_MENOR_1=(Token)match(input,RULE_MENOR,FOLLOW_2); 

                                    					current.merge(this_MENOR_1);
                                    				

                                    					newLeafNode(this_MENOR_1, grammarAccess.getOpcomparacionAccess().getMENORTerminalRuleCall_0_0_1());
                                    				

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // InternalLinit.g:1793:4: this_SIGNOMENOR_2= RULE_SIGNOMENOR
                            {
                            this_SIGNOMENOR_2=(Token)match(input,RULE_SIGNOMENOR,FOLLOW_2); 

                            				current.merge(this_SIGNOMENOR_2);
                            			

                            				newLeafNode(this_SIGNOMENOR_2, grammarAccess.getOpcomparacionAccess().getSIGNOMENORTerminalRuleCall_0_1());
                            			

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalLinit.g:1802:3: ( (kw= 'ES MENOR O IGUAL A' | this_MENORIGUAL_4= RULE_MENORIGUAL ) | this_SIGNOMENORIGUAL_5= RULE_SIGNOMENORIGUAL )
                    {
                    // InternalLinit.g:1802:3: ( (kw= 'ES MENOR O IGUAL A' | this_MENORIGUAL_4= RULE_MENORIGUAL ) | this_SIGNOMENORIGUAL_5= RULE_SIGNOMENORIGUAL )
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==RULE_MENORIGUAL||LA53_0==89) ) {
                        alt53=1;
                    }
                    else if ( (LA53_0==RULE_SIGNOMENORIGUAL) ) {
                        alt53=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        throw nvae;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalLinit.g:1803:4: (kw= 'ES MENOR O IGUAL A' | this_MENORIGUAL_4= RULE_MENORIGUAL )
                            {
                            // InternalLinit.g:1803:4: (kw= 'ES MENOR O IGUAL A' | this_MENORIGUAL_4= RULE_MENORIGUAL )
                            int alt52=2;
                            int LA52_0 = input.LA(1);

                            if ( (LA52_0==89) ) {
                                alt52=1;
                            }
                            else if ( (LA52_0==RULE_MENORIGUAL) ) {
                                alt52=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 52, 0, input);

                                throw nvae;
                            }
                            switch (alt52) {
                                case 1 :
                                    // InternalLinit.g:1804:5: kw= 'ES MENOR O IGUAL A'
                                    {
                                    kw=(Token)match(input,89,FOLLOW_2); 

                                    					current.merge(kw);
                                    					newLeafNode(kw, grammarAccess.getOpcomparacionAccess().getESMENOROIGUALAKeyword_1_0_0());
                                    				

                                    }
                                    break;
                                case 2 :
                                    // InternalLinit.g:1810:5: this_MENORIGUAL_4= RULE_MENORIGUAL
                                    {
                                    this_MENORIGUAL_4=(Token)match(input,RULE_MENORIGUAL,FOLLOW_2); 

                                    					current.merge(this_MENORIGUAL_4);
                                    				

                                    					newLeafNode(this_MENORIGUAL_4, grammarAccess.getOpcomparacionAccess().getMENORIGUALTerminalRuleCall_1_0_1());
                                    				

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // InternalLinit.g:1819:4: this_SIGNOMENORIGUAL_5= RULE_SIGNOMENORIGUAL
                            {
                            this_SIGNOMENORIGUAL_5=(Token)match(input,RULE_SIGNOMENORIGUAL,FOLLOW_2); 

                            				current.merge(this_SIGNOMENORIGUAL_5);
                            			

                            				newLeafNode(this_SIGNOMENORIGUAL_5, grammarAccess.getOpcomparacionAccess().getSIGNOMENORIGUALTerminalRuleCall_1_1());
                            			

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // InternalLinit.g:1828:3: ( (kw= 'ES MAYOR A' | this_MAYOR_7= RULE_MAYOR ) | this_SIGNOMAYOR_8= RULE_SIGNOMAYOR )
                    {
                    // InternalLinit.g:1828:3: ( (kw= 'ES MAYOR A' | this_MAYOR_7= RULE_MAYOR ) | this_SIGNOMAYOR_8= RULE_SIGNOMAYOR )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==RULE_MAYOR||LA55_0==90) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==RULE_SIGNOMAYOR) ) {
                        alt55=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalLinit.g:1829:4: (kw= 'ES MAYOR A' | this_MAYOR_7= RULE_MAYOR )
                            {
                            // InternalLinit.g:1829:4: (kw= 'ES MAYOR A' | this_MAYOR_7= RULE_MAYOR )
                            int alt54=2;
                            int LA54_0 = input.LA(1);

                            if ( (LA54_0==90) ) {
                                alt54=1;
                            }
                            else if ( (LA54_0==RULE_MAYOR) ) {
                                alt54=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 54, 0, input);

                                throw nvae;
                            }
                            switch (alt54) {
                                case 1 :
                                    // InternalLinit.g:1830:5: kw= 'ES MAYOR A'
                                    {
                                    kw=(Token)match(input,90,FOLLOW_2); 

                                    					current.merge(kw);
                                    					newLeafNode(kw, grammarAccess.getOpcomparacionAccess().getESMAYORAKeyword_2_0_0());
                                    				

                                    }
                                    break;
                                case 2 :
                                    // InternalLinit.g:1836:5: this_MAYOR_7= RULE_MAYOR
                                    {
                                    this_MAYOR_7=(Token)match(input,RULE_MAYOR,FOLLOW_2); 

                                    					current.merge(this_MAYOR_7);
                                    				

                                    					newLeafNode(this_MAYOR_7, grammarAccess.getOpcomparacionAccess().getMAYORTerminalRuleCall_2_0_1());
                                    				

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // InternalLinit.g:1845:4: this_SIGNOMAYOR_8= RULE_SIGNOMAYOR
                            {
                            this_SIGNOMAYOR_8=(Token)match(input,RULE_SIGNOMAYOR,FOLLOW_2); 

                            				current.merge(this_SIGNOMAYOR_8);
                            			

                            				newLeafNode(this_SIGNOMAYOR_8, grammarAccess.getOpcomparacionAccess().getSIGNOMAYORTerminalRuleCall_2_1());
                            			

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // InternalLinit.g:1854:3: ( (kw= 'ES MAYOR O IGUAL A' | this_MAYORIGUAL_10= RULE_MAYORIGUAL ) | this_SIGNOMAYORIGUAL_11= RULE_SIGNOMAYORIGUAL )
                    {
                    // InternalLinit.g:1854:3: ( (kw= 'ES MAYOR O IGUAL A' | this_MAYORIGUAL_10= RULE_MAYORIGUAL ) | this_SIGNOMAYORIGUAL_11= RULE_SIGNOMAYORIGUAL )
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==RULE_MAYORIGUAL||LA57_0==91) ) {
                        alt57=1;
                    }
                    else if ( (LA57_0==RULE_SIGNOMAYORIGUAL) ) {
                        alt57=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 0, input);

                        throw nvae;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalLinit.g:1855:4: (kw= 'ES MAYOR O IGUAL A' | this_MAYORIGUAL_10= RULE_MAYORIGUAL )
                            {
                            // InternalLinit.g:1855:4: (kw= 'ES MAYOR O IGUAL A' | this_MAYORIGUAL_10= RULE_MAYORIGUAL )
                            int alt56=2;
                            int LA56_0 = input.LA(1);

                            if ( (LA56_0==91) ) {
                                alt56=1;
                            }
                            else if ( (LA56_0==RULE_MAYORIGUAL) ) {
                                alt56=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 56, 0, input);

                                throw nvae;
                            }
                            switch (alt56) {
                                case 1 :
                                    // InternalLinit.g:1856:5: kw= 'ES MAYOR O IGUAL A'
                                    {
                                    kw=(Token)match(input,91,FOLLOW_2); 

                                    					current.merge(kw);
                                    					newLeafNode(kw, grammarAccess.getOpcomparacionAccess().getESMAYOROIGUALAKeyword_3_0_0());
                                    				

                                    }
                                    break;
                                case 2 :
                                    // InternalLinit.g:1862:5: this_MAYORIGUAL_10= RULE_MAYORIGUAL
                                    {
                                    this_MAYORIGUAL_10=(Token)match(input,RULE_MAYORIGUAL,FOLLOW_2); 

                                    					current.merge(this_MAYORIGUAL_10);
                                    				

                                    					newLeafNode(this_MAYORIGUAL_10, grammarAccess.getOpcomparacionAccess().getMAYORIGUALTerminalRuleCall_3_0_1());
                                    				

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // InternalLinit.g:1871:4: this_SIGNOMAYORIGUAL_11= RULE_SIGNOMAYORIGUAL
                            {
                            this_SIGNOMAYORIGUAL_11=(Token)match(input,RULE_SIGNOMAYORIGUAL,FOLLOW_2); 

                            				current.merge(this_SIGNOMAYORIGUAL_11);
                            			

                            				newLeafNode(this_SIGNOMAYORIGUAL_11, grammarAccess.getOpcomparacionAccess().getSIGNOMAYORIGUALTerminalRuleCall_3_1());
                            			

                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // InternalLinit.g:1880:3: ( (kw= 'ES DIFERENTE DE A' | this_DIFERENTE_13= RULE_DIFERENTE ) | this_SIGNODIFERENTE_14= RULE_SIGNODIFERENTE )
                    {
                    // InternalLinit.g:1880:3: ( (kw= 'ES DIFERENTE DE A' | this_DIFERENTE_13= RULE_DIFERENTE ) | this_SIGNODIFERENTE_14= RULE_SIGNODIFERENTE )
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==RULE_DIFERENTE||LA59_0==92) ) {
                        alt59=1;
                    }
                    else if ( (LA59_0==RULE_SIGNODIFERENTE) ) {
                        alt59=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 0, input);

                        throw nvae;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalLinit.g:1881:4: (kw= 'ES DIFERENTE DE A' | this_DIFERENTE_13= RULE_DIFERENTE )
                            {
                            // InternalLinit.g:1881:4: (kw= 'ES DIFERENTE DE A' | this_DIFERENTE_13= RULE_DIFERENTE )
                            int alt58=2;
                            int LA58_0 = input.LA(1);

                            if ( (LA58_0==92) ) {
                                alt58=1;
                            }
                            else if ( (LA58_0==RULE_DIFERENTE) ) {
                                alt58=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 58, 0, input);

                                throw nvae;
                            }
                            switch (alt58) {
                                case 1 :
                                    // InternalLinit.g:1882:5: kw= 'ES DIFERENTE DE A'
                                    {
                                    kw=(Token)match(input,92,FOLLOW_2); 

                                    					current.merge(kw);
                                    					newLeafNode(kw, grammarAccess.getOpcomparacionAccess().getESDIFERENTEDEAKeyword_4_0_0());
                                    				

                                    }
                                    break;
                                case 2 :
                                    // InternalLinit.g:1888:5: this_DIFERENTE_13= RULE_DIFERENTE
                                    {
                                    this_DIFERENTE_13=(Token)match(input,RULE_DIFERENTE,FOLLOW_2); 

                                    					current.merge(this_DIFERENTE_13);
                                    				

                                    					newLeafNode(this_DIFERENTE_13, grammarAccess.getOpcomparacionAccess().getDIFERENTETerminalRuleCall_4_0_1());
                                    				

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // InternalLinit.g:1897:4: this_SIGNODIFERENTE_14= RULE_SIGNODIFERENTE
                            {
                            this_SIGNODIFERENTE_14=(Token)match(input,RULE_SIGNODIFERENTE,FOLLOW_2); 

                            				current.merge(this_SIGNODIFERENTE_14);
                            			

                            				newLeafNode(this_SIGNODIFERENTE_14, grammarAccess.getOpcomparacionAccess().getSIGNODIFERENTETerminalRuleCall_4_1());
                            			

                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // InternalLinit.g:1906:3: ( (kw= 'ES IGUAL A' | this_IGUAL_16= RULE_IGUAL ) | this_SIGNOIGUAL_17= RULE_SIGNOIGUAL )
                    {
                    // InternalLinit.g:1906:3: ( (kw= 'ES IGUAL A' | this_IGUAL_16= RULE_IGUAL ) | this_SIGNOIGUAL_17= RULE_SIGNOIGUAL )
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==RULE_IGUAL||LA61_0==85) ) {
                        alt61=1;
                    }
                    else if ( (LA61_0==RULE_SIGNOIGUAL) ) {
                        alt61=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 0, input);

                        throw nvae;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalLinit.g:1907:4: (kw= 'ES IGUAL A' | this_IGUAL_16= RULE_IGUAL )
                            {
                            // InternalLinit.g:1907:4: (kw= 'ES IGUAL A' | this_IGUAL_16= RULE_IGUAL )
                            int alt60=2;
                            int LA60_0 = input.LA(1);

                            if ( (LA60_0==85) ) {
                                alt60=1;
                            }
                            else if ( (LA60_0==RULE_IGUAL) ) {
                                alt60=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 60, 0, input);

                                throw nvae;
                            }
                            switch (alt60) {
                                case 1 :
                                    // InternalLinit.g:1908:5: kw= 'ES IGUAL A'
                                    {
                                    kw=(Token)match(input,85,FOLLOW_2); 

                                    					current.merge(kw);
                                    					newLeafNode(kw, grammarAccess.getOpcomparacionAccess().getESIGUALAKeyword_5_0_0());
                                    				

                                    }
                                    break;
                                case 2 :
                                    // InternalLinit.g:1914:5: this_IGUAL_16= RULE_IGUAL
                                    {
                                    this_IGUAL_16=(Token)match(input,RULE_IGUAL,FOLLOW_2); 

                                    					current.merge(this_IGUAL_16);
                                    				

                                    					newLeafNode(this_IGUAL_16, grammarAccess.getOpcomparacionAccess().getIGUALTerminalRuleCall_5_0_1());
                                    				

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // InternalLinit.g:1923:4: this_SIGNOIGUAL_17= RULE_SIGNOIGUAL
                            {
                            this_SIGNOIGUAL_17=(Token)match(input,RULE_SIGNOIGUAL,FOLLOW_2); 

                            				current.merge(this_SIGNOIGUAL_17);
                            			

                            				newLeafNode(this_SIGNOIGUAL_17, grammarAccess.getOpcomparacionAccess().getSIGNOIGUALTerminalRuleCall_5_1());
                            			

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleopcomparacion"


    // $ANTLR start "entryRulearitmetica"
    // InternalLinit.g:1935:1: entryRulearitmetica returns [String current=null] : iv_rulearitmetica= rulearitmetica EOF ;
    public final String entryRulearitmetica() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulearitmetica = null;


        try {
            // InternalLinit.g:1935:50: (iv_rulearitmetica= rulearitmetica EOF )
            // InternalLinit.g:1936:2: iv_rulearitmetica= rulearitmetica EOF
            {
             newCompositeNode(grammarAccess.getAritmeticaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulearitmetica=rulearitmetica();

            state._fsp--;

             current =iv_rulearitmetica.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulearitmetica"


    // $ANTLR start "rulearitmetica"
    // InternalLinit.g:1942:1: rulearitmetica returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_multiplicacion__0= rulemultiplicacion_ ( (this_SUMA_1= RULE_SUMA | this_RESTA_2= RULE_RESTA ) this_aritmetica_3= rulearitmetica )? ) ;
    public final AntlrDatatypeRuleToken rulearitmetica() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SUMA_1=null;
        Token this_RESTA_2=null;
        AntlrDatatypeRuleToken this_multiplicacion__0 = null;

        AntlrDatatypeRuleToken this_aritmetica_3 = null;



        	enterRule();

        try {
            // InternalLinit.g:1948:2: ( (this_multiplicacion__0= rulemultiplicacion_ ( (this_SUMA_1= RULE_SUMA | this_RESTA_2= RULE_RESTA ) this_aritmetica_3= rulearitmetica )? ) )
            // InternalLinit.g:1949:2: (this_multiplicacion__0= rulemultiplicacion_ ( (this_SUMA_1= RULE_SUMA | this_RESTA_2= RULE_RESTA ) this_aritmetica_3= rulearitmetica )? )
            {
            // InternalLinit.g:1949:2: (this_multiplicacion__0= rulemultiplicacion_ ( (this_SUMA_1= RULE_SUMA | this_RESTA_2= RULE_RESTA ) this_aritmetica_3= rulearitmetica )? )
            // InternalLinit.g:1950:3: this_multiplicacion__0= rulemultiplicacion_ ( (this_SUMA_1= RULE_SUMA | this_RESTA_2= RULE_RESTA ) this_aritmetica_3= rulearitmetica )?
            {

            			newCompositeNode(grammarAccess.getAritmeticaAccess().getMultiplicacion_ParserRuleCall_0());
            		
            pushFollow(FOLLOW_34);
            this_multiplicacion__0=rulemultiplicacion_();

            state._fsp--;


            			current.merge(this_multiplicacion__0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalLinit.g:1960:3: ( (this_SUMA_1= RULE_SUMA | this_RESTA_2= RULE_RESTA ) this_aritmetica_3= rulearitmetica )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=RULE_SUMA && LA64_0<=RULE_RESTA)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalLinit.g:1961:4: (this_SUMA_1= RULE_SUMA | this_RESTA_2= RULE_RESTA ) this_aritmetica_3= rulearitmetica
                    {
                    // InternalLinit.g:1961:4: (this_SUMA_1= RULE_SUMA | this_RESTA_2= RULE_RESTA )
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==RULE_SUMA) ) {
                        alt63=1;
                    }
                    else if ( (LA63_0==RULE_RESTA) ) {
                        alt63=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 63, 0, input);

                        throw nvae;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalLinit.g:1962:5: this_SUMA_1= RULE_SUMA
                            {
                            this_SUMA_1=(Token)match(input,RULE_SUMA,FOLLOW_21); 

                            					current.merge(this_SUMA_1);
                            				

                            					newLeafNode(this_SUMA_1, grammarAccess.getAritmeticaAccess().getSUMATerminalRuleCall_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalLinit.g:1970:5: this_RESTA_2= RULE_RESTA
                            {
                            this_RESTA_2=(Token)match(input,RULE_RESTA,FOLLOW_21); 

                            					current.merge(this_RESTA_2);
                            				

                            					newLeafNode(this_RESTA_2, grammarAccess.getAritmeticaAccess().getRESTATerminalRuleCall_1_0_1());
                            				

                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getAritmeticaAccess().getAritmeticaParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_aritmetica_3=rulearitmetica();

                    state._fsp--;


                    				current.merge(this_aritmetica_3);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulearitmetica"


    // $ANTLR start "entryRulemultiplicacion_"
    // InternalLinit.g:1993:1: entryRulemultiplicacion_ returns [String current=null] : iv_rulemultiplicacion_= rulemultiplicacion_ EOF ;
    public final String entryRulemultiplicacion_() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemultiplicacion_ = null;


        try {
            // InternalLinit.g:1993:55: (iv_rulemultiplicacion_= rulemultiplicacion_ EOF )
            // InternalLinit.g:1994:2: iv_rulemultiplicacion_= rulemultiplicacion_ EOF
            {
             newCompositeNode(grammarAccess.getMultiplicacion_Rule()); 
            pushFollow(FOLLOW_1);
            iv_rulemultiplicacion_=rulemultiplicacion_();

            state._fsp--;

             current =iv_rulemultiplicacion_.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemultiplicacion_"


    // $ANTLR start "rulemultiplicacion_"
    // InternalLinit.g:2000:1: rulemultiplicacion_ returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_potenciacion_0= rulepotenciacion ( (this_MULTIPLICACION_1= RULE_MULTIPLICACION | this_DIVISION_2= RULE_DIVISION | this_MODULO_3= RULE_MODULO ) this_multiplicacion__4= rulemultiplicacion_ )? ) ;
    public final AntlrDatatypeRuleToken rulemultiplicacion_() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MULTIPLICACION_1=null;
        Token this_DIVISION_2=null;
        Token this_MODULO_3=null;
        AntlrDatatypeRuleToken this_potenciacion_0 = null;

        AntlrDatatypeRuleToken this_multiplicacion__4 = null;



        	enterRule();

        try {
            // InternalLinit.g:2006:2: ( (this_potenciacion_0= rulepotenciacion ( (this_MULTIPLICACION_1= RULE_MULTIPLICACION | this_DIVISION_2= RULE_DIVISION | this_MODULO_3= RULE_MODULO ) this_multiplicacion__4= rulemultiplicacion_ )? ) )
            // InternalLinit.g:2007:2: (this_potenciacion_0= rulepotenciacion ( (this_MULTIPLICACION_1= RULE_MULTIPLICACION | this_DIVISION_2= RULE_DIVISION | this_MODULO_3= RULE_MODULO ) this_multiplicacion__4= rulemultiplicacion_ )? )
            {
            // InternalLinit.g:2007:2: (this_potenciacion_0= rulepotenciacion ( (this_MULTIPLICACION_1= RULE_MULTIPLICACION | this_DIVISION_2= RULE_DIVISION | this_MODULO_3= RULE_MODULO ) this_multiplicacion__4= rulemultiplicacion_ )? )
            // InternalLinit.g:2008:3: this_potenciacion_0= rulepotenciacion ( (this_MULTIPLICACION_1= RULE_MULTIPLICACION | this_DIVISION_2= RULE_DIVISION | this_MODULO_3= RULE_MODULO ) this_multiplicacion__4= rulemultiplicacion_ )?
            {

            			newCompositeNode(grammarAccess.getMultiplicacion_Access().getPotenciacionParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_potenciacion_0=rulepotenciacion();

            state._fsp--;


            			current.merge(this_potenciacion_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalLinit.g:2018:3: ( (this_MULTIPLICACION_1= RULE_MULTIPLICACION | this_DIVISION_2= RULE_DIVISION | this_MODULO_3= RULE_MODULO ) this_multiplicacion__4= rulemultiplicacion_ )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=RULE_MULTIPLICACION && LA66_0<=RULE_MODULO)) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalLinit.g:2019:4: (this_MULTIPLICACION_1= RULE_MULTIPLICACION | this_DIVISION_2= RULE_DIVISION | this_MODULO_3= RULE_MODULO ) this_multiplicacion__4= rulemultiplicacion_
                    {
                    // InternalLinit.g:2019:4: (this_MULTIPLICACION_1= RULE_MULTIPLICACION | this_DIVISION_2= RULE_DIVISION | this_MODULO_3= RULE_MODULO )
                    int alt65=3;
                    switch ( input.LA(1) ) {
                    case RULE_MULTIPLICACION:
                        {
                        alt65=1;
                        }
                        break;
                    case RULE_DIVISION:
                        {
                        alt65=2;
                        }
                        break;
                    case RULE_MODULO:
                        {
                        alt65=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 0, input);

                        throw nvae;
                    }

                    switch (alt65) {
                        case 1 :
                            // InternalLinit.g:2020:5: this_MULTIPLICACION_1= RULE_MULTIPLICACION
                            {
                            this_MULTIPLICACION_1=(Token)match(input,RULE_MULTIPLICACION,FOLLOW_21); 

                            					current.merge(this_MULTIPLICACION_1);
                            				

                            					newLeafNode(this_MULTIPLICACION_1, grammarAccess.getMultiplicacion_Access().getMULTIPLICACIONTerminalRuleCall_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalLinit.g:2028:5: this_DIVISION_2= RULE_DIVISION
                            {
                            this_DIVISION_2=(Token)match(input,RULE_DIVISION,FOLLOW_21); 

                            					current.merge(this_DIVISION_2);
                            				

                            					newLeafNode(this_DIVISION_2, grammarAccess.getMultiplicacion_Access().getDIVISIONTerminalRuleCall_1_0_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalLinit.g:2036:5: this_MODULO_3= RULE_MODULO
                            {
                            this_MODULO_3=(Token)match(input,RULE_MODULO,FOLLOW_21); 

                            					current.merge(this_MODULO_3);
                            				

                            					newLeafNode(this_MODULO_3, grammarAccess.getMultiplicacion_Access().getMODULOTerminalRuleCall_1_0_2());
                            				

                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getMultiplicacion_Access().getMultiplicacion_ParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_multiplicacion__4=rulemultiplicacion_();

                    state._fsp--;


                    				current.merge(this_multiplicacion__4);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemultiplicacion_"


    // $ANTLR start "entryRulepotenciacion"
    // InternalLinit.g:2059:1: entryRulepotenciacion returns [String current=null] : iv_rulepotenciacion= rulepotenciacion EOF ;
    public final String entryRulepotenciacion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepotenciacion = null;


        try {
            // InternalLinit.g:2059:52: (iv_rulepotenciacion= rulepotenciacion EOF )
            // InternalLinit.g:2060:2: iv_rulepotenciacion= rulepotenciacion EOF
            {
             newCompositeNode(grammarAccess.getPotenciacionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulepotenciacion=rulepotenciacion();

            state._fsp--;

             current =iv_rulepotenciacion.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepotenciacion"


    // $ANTLR start "rulepotenciacion"
    // InternalLinit.g:2066:1: rulepotenciacion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_negacion_0= rulenegacion (this_POTENCIA_1= RULE_POTENCIA this_potenciacion_2= rulepotenciacion )? ) ;
    public final AntlrDatatypeRuleToken rulepotenciacion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_POTENCIA_1=null;
        AntlrDatatypeRuleToken this_negacion_0 = null;

        AntlrDatatypeRuleToken this_potenciacion_2 = null;



        	enterRule();

        try {
            // InternalLinit.g:2072:2: ( (this_negacion_0= rulenegacion (this_POTENCIA_1= RULE_POTENCIA this_potenciacion_2= rulepotenciacion )? ) )
            // InternalLinit.g:2073:2: (this_negacion_0= rulenegacion (this_POTENCIA_1= RULE_POTENCIA this_potenciacion_2= rulepotenciacion )? )
            {
            // InternalLinit.g:2073:2: (this_negacion_0= rulenegacion (this_POTENCIA_1= RULE_POTENCIA this_potenciacion_2= rulepotenciacion )? )
            // InternalLinit.g:2074:3: this_negacion_0= rulenegacion (this_POTENCIA_1= RULE_POTENCIA this_potenciacion_2= rulepotenciacion )?
            {

            			newCompositeNode(grammarAccess.getPotenciacionAccess().getNegacionParserRuleCall_0());
            		
            pushFollow(FOLLOW_36);
            this_negacion_0=rulenegacion();

            state._fsp--;


            			current.merge(this_negacion_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalLinit.g:2084:3: (this_POTENCIA_1= RULE_POTENCIA this_potenciacion_2= rulepotenciacion )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_POTENCIA) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalLinit.g:2085:4: this_POTENCIA_1= RULE_POTENCIA this_potenciacion_2= rulepotenciacion
                    {
                    this_POTENCIA_1=(Token)match(input,RULE_POTENCIA,FOLLOW_21); 

                    				current.merge(this_POTENCIA_1);
                    			

                    				newLeafNode(this_POTENCIA_1, grammarAccess.getPotenciacionAccess().getPOTENCIATerminalRuleCall_1_0());
                    			

                    				newCompositeNode(grammarAccess.getPotenciacionAccess().getPotenciacionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_potenciacion_2=rulepotenciacion();

                    state._fsp--;


                    				current.merge(this_potenciacion_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepotenciacion"


    // $ANTLR start "entryRulenegacion"
    // InternalLinit.g:2107:1: entryRulenegacion returns [String current=null] : iv_rulenegacion= rulenegacion EOF ;
    public final String entryRulenegacion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulenegacion = null;


        try {
            // InternalLinit.g:2107:48: (iv_rulenegacion= rulenegacion EOF )
            // InternalLinit.g:2108:2: iv_rulenegacion= rulenegacion EOF
            {
             newCompositeNode(grammarAccess.getNegacionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulenegacion=rulenegacion();

            state._fsp--;

             current =iv_rulenegacion.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenegacion"


    // $ANTLR start "rulenegacion"
    // InternalLinit.g:2114:1: rulenegacion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'NO SUCEDE' | this_NO_1= RULE_NO )* this_parentesis_2= ruleparentesis ) ;
    public final AntlrDatatypeRuleToken rulenegacion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NO_1=null;
        AntlrDatatypeRuleToken this_parentesis_2 = null;



        	enterRule();

        try {
            // InternalLinit.g:2120:2: ( ( (kw= 'NO SUCEDE' | this_NO_1= RULE_NO )* this_parentesis_2= ruleparentesis ) )
            // InternalLinit.g:2121:2: ( (kw= 'NO SUCEDE' | this_NO_1= RULE_NO )* this_parentesis_2= ruleparentesis )
            {
            // InternalLinit.g:2121:2: ( (kw= 'NO SUCEDE' | this_NO_1= RULE_NO )* this_parentesis_2= ruleparentesis )
            // InternalLinit.g:2122:3: (kw= 'NO SUCEDE' | this_NO_1= RULE_NO )* this_parentesis_2= ruleparentesis
            {
            // InternalLinit.g:2122:3: (kw= 'NO SUCEDE' | this_NO_1= RULE_NO )*
            loop68:
            do {
                int alt68=3;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==93) ) {
                    alt68=1;
                }
                else if ( (LA68_0==RULE_NO) ) {
                    alt68=2;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalLinit.g:2123:4: kw= 'NO SUCEDE'
            	    {
            	    kw=(Token)match(input,93,FOLLOW_21); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getNegacionAccess().getNOSUCEDEKeyword_0_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalLinit.g:2129:4: this_NO_1= RULE_NO
            	    {
            	    this_NO_1=(Token)match(input,RULE_NO,FOLLOW_21); 

            	    				current.merge(this_NO_1);
            	    			

            	    				newLeafNode(this_NO_1, grammarAccess.getNegacionAccess().getNOTerminalRuleCall_0_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


            			newCompositeNode(grammarAccess.getNegacionAccess().getParentesisParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_parentesis_2=ruleparentesis();

            state._fsp--;


            			current.merge(this_parentesis_2);
            		

            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenegacion"


    // $ANTLR start "entryRuleparentesis"
    // InternalLinit.g:2151:1: entryRuleparentesis returns [String current=null] : iv_ruleparentesis= ruleparentesis EOF ;
    public final String entryRuleparentesis() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleparentesis = null;


        try {
            // InternalLinit.g:2151:50: (iv_ruleparentesis= ruleparentesis EOF )
            // InternalLinit.g:2152:2: iv_ruleparentesis= ruleparentesis EOF
            {
             newCompositeNode(grammarAccess.getParentesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleparentesis=ruleparentesis();

            state._fsp--;

             current =iv_ruleparentesis.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleparentesis"


    // $ANTLR start "ruleparentesis"
    // InternalLinit.g:2158:1: ruleparentesis returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_IZQUIERDO_0= RULE_IZQUIERDO this_expresion_1= ruleexpresion this_DERECHO_2= RULE_DERECHO ) | this_dato_3= ruledato ) ;
    public final AntlrDatatypeRuleToken ruleparentesis() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IZQUIERDO_0=null;
        Token this_DERECHO_2=null;
        AntlrDatatypeRuleToken this_expresion_1 = null;

        AntlrDatatypeRuleToken this_dato_3 = null;



        	enterRule();

        try {
            // InternalLinit.g:2164:2: ( ( (this_IZQUIERDO_0= RULE_IZQUIERDO this_expresion_1= ruleexpresion this_DERECHO_2= RULE_DERECHO ) | this_dato_3= ruledato ) )
            // InternalLinit.g:2165:2: ( (this_IZQUIERDO_0= RULE_IZQUIERDO this_expresion_1= ruleexpresion this_DERECHO_2= RULE_DERECHO ) | this_dato_3= ruledato )
            {
            // InternalLinit.g:2165:2: ( (this_IZQUIERDO_0= RULE_IZQUIERDO this_expresion_1= ruleexpresion this_DERECHO_2= RULE_DERECHO ) | this_dato_3= ruledato )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_IZQUIERDO) ) {
                alt69=1;
            }
            else if ( (LA69_0==RULE_IDENTIFICADOR||(LA69_0>=RULE_FRASE && LA69_0<=RULE_NREAL)||(LA69_0>=94 && LA69_0<=95)) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalLinit.g:2166:3: (this_IZQUIERDO_0= RULE_IZQUIERDO this_expresion_1= ruleexpresion this_DERECHO_2= RULE_DERECHO )
                    {
                    // InternalLinit.g:2166:3: (this_IZQUIERDO_0= RULE_IZQUIERDO this_expresion_1= ruleexpresion this_DERECHO_2= RULE_DERECHO )
                    // InternalLinit.g:2167:4: this_IZQUIERDO_0= RULE_IZQUIERDO this_expresion_1= ruleexpresion this_DERECHO_2= RULE_DERECHO
                    {
                    this_IZQUIERDO_0=(Token)match(input,RULE_IZQUIERDO,FOLLOW_21); 

                    				current.merge(this_IZQUIERDO_0);
                    			

                    				newLeafNode(this_IZQUIERDO_0, grammarAccess.getParentesisAccess().getIZQUIERDOTerminalRuleCall_0_0());
                    			

                    				newCompositeNode(grammarAccess.getParentesisAccess().getExpresionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_37);
                    this_expresion_1=ruleexpresion();

                    state._fsp--;


                    				current.merge(this_expresion_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    this_DERECHO_2=(Token)match(input,RULE_DERECHO,FOLLOW_2); 

                    				current.merge(this_DERECHO_2);
                    			

                    				newLeafNode(this_DERECHO_2, grammarAccess.getParentesisAccess().getDERECHOTerminalRuleCall_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLinit.g:2193:3: this_dato_3= ruledato
                    {

                    			newCompositeNode(grammarAccess.getParentesisAccess().getDatoParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_dato_3=ruledato();

                    state._fsp--;


                    			current.merge(this_dato_3);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleparentesis"


    // $ANTLR start "entryRuledato"
    // InternalLinit.g:2207:1: entryRuledato returns [String current=null] : iv_ruledato= ruledato EOF ;
    public final String entryRuledato() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledato = null;


        try {
            // InternalLinit.g:2207:44: (iv_ruledato= ruledato EOF )
            // InternalLinit.g:2208:2: iv_ruledato= ruledato EOF
            {
             newCompositeNode(grammarAccess.getDatoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruledato=ruledato();

            state._fsp--;

             current =iv_ruledato.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledato"


    // $ANTLR start "ruledato"
    // InternalLinit.g:2214:1: ruledato returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_IDENTIFICADOR_0= RULE_IDENTIFICADOR (this_CUADRADOI_1= RULE_CUADRADOI this_expresion_2= ruleexpresion this_listaArreglo_3= rulelistaArreglo this_CUADRADOD_4= RULE_CUADRADOD )? ) | this_numero_5= rulenumero | this_logico_6= rulelogico | this_FRASE_7= RULE_FRASE ) ;
    public final AntlrDatatypeRuleToken ruledato() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_IDENTIFICADOR_0=null;
        Token this_CUADRADOI_1=null;
        Token this_CUADRADOD_4=null;
        Token this_FRASE_7=null;
        AntlrDatatypeRuleToken this_expresion_2 = null;

        AntlrDatatypeRuleToken this_listaArreglo_3 = null;

        AntlrDatatypeRuleToken this_numero_5 = null;

        AntlrDatatypeRuleToken this_logico_6 = null;



        	enterRule();

        try {
            // InternalLinit.g:2220:2: ( ( (this_IDENTIFICADOR_0= RULE_IDENTIFICADOR (this_CUADRADOI_1= RULE_CUADRADOI this_expresion_2= ruleexpresion this_listaArreglo_3= rulelistaArreglo this_CUADRADOD_4= RULE_CUADRADOD )? ) | this_numero_5= rulenumero | this_logico_6= rulelogico | this_FRASE_7= RULE_FRASE ) )
            // InternalLinit.g:2221:2: ( (this_IDENTIFICADOR_0= RULE_IDENTIFICADOR (this_CUADRADOI_1= RULE_CUADRADOI this_expresion_2= ruleexpresion this_listaArreglo_3= rulelistaArreglo this_CUADRADOD_4= RULE_CUADRADOD )? ) | this_numero_5= rulenumero | this_logico_6= rulelogico | this_FRASE_7= RULE_FRASE )
            {
            // InternalLinit.g:2221:2: ( (this_IDENTIFICADOR_0= RULE_IDENTIFICADOR (this_CUADRADOI_1= RULE_CUADRADOI this_expresion_2= ruleexpresion this_listaArreglo_3= rulelistaArreglo this_CUADRADOD_4= RULE_CUADRADOD )? ) | this_numero_5= rulenumero | this_logico_6= rulelogico | this_FRASE_7= RULE_FRASE )
            int alt71=4;
            switch ( input.LA(1) ) {
            case RULE_IDENTIFICADOR:
                {
                alt71=1;
                }
                break;
            case RULE_ENTERO:
            case RULE_NREAL:
                {
                alt71=2;
                }
                break;
            case RULE_VERDADERO:
            case RULE_FALSO:
            case 94:
            case 95:
                {
                alt71=3;
                }
                break;
            case RULE_FRASE:
                {
                alt71=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // InternalLinit.g:2222:3: (this_IDENTIFICADOR_0= RULE_IDENTIFICADOR (this_CUADRADOI_1= RULE_CUADRADOI this_expresion_2= ruleexpresion this_listaArreglo_3= rulelistaArreglo this_CUADRADOD_4= RULE_CUADRADOD )? )
                    {
                    // InternalLinit.g:2222:3: (this_IDENTIFICADOR_0= RULE_IDENTIFICADOR (this_CUADRADOI_1= RULE_CUADRADOI this_expresion_2= ruleexpresion this_listaArreglo_3= rulelistaArreglo this_CUADRADOD_4= RULE_CUADRADOD )? )
                    // InternalLinit.g:2223:4: this_IDENTIFICADOR_0= RULE_IDENTIFICADOR (this_CUADRADOI_1= RULE_CUADRADOI this_expresion_2= ruleexpresion this_listaArreglo_3= rulelistaArreglo this_CUADRADOD_4= RULE_CUADRADOD )?
                    {
                    this_IDENTIFICADOR_0=(Token)match(input,RULE_IDENTIFICADOR,FOLLOW_38); 

                    				current.merge(this_IDENTIFICADOR_0);
                    			

                    				newLeafNode(this_IDENTIFICADOR_0, grammarAccess.getDatoAccess().getIDENTIFICADORTerminalRuleCall_0_0());
                    			
                    // InternalLinit.g:2230:4: (this_CUADRADOI_1= RULE_CUADRADOI this_expresion_2= ruleexpresion this_listaArreglo_3= rulelistaArreglo this_CUADRADOD_4= RULE_CUADRADOD )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==RULE_CUADRADOI) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // InternalLinit.g:2231:5: this_CUADRADOI_1= RULE_CUADRADOI this_expresion_2= ruleexpresion this_listaArreglo_3= rulelistaArreglo this_CUADRADOD_4= RULE_CUADRADOD
                            {
                            this_CUADRADOI_1=(Token)match(input,RULE_CUADRADOI,FOLLOW_21); 

                            					current.merge(this_CUADRADOI_1);
                            				

                            					newLeafNode(this_CUADRADOI_1, grammarAccess.getDatoAccess().getCUADRADOITerminalRuleCall_0_1_0());
                            				

                            					newCompositeNode(grammarAccess.getDatoAccess().getExpresionParserRuleCall_0_1_1());
                            				
                            pushFollow(FOLLOW_22);
                            this_expresion_2=ruleexpresion();

                            state._fsp--;


                            					current.merge(this_expresion_2);
                            				

                            					afterParserOrEnumRuleCall();
                            				

                            					newCompositeNode(grammarAccess.getDatoAccess().getListaArregloParserRuleCall_0_1_2());
                            				
                            pushFollow(FOLLOW_23);
                            this_listaArreglo_3=rulelistaArreglo();

                            state._fsp--;


                            					current.merge(this_listaArreglo_3);
                            				

                            					afterParserOrEnumRuleCall();
                            				
                            this_CUADRADOD_4=(Token)match(input,RULE_CUADRADOD,FOLLOW_2); 

                            					current.merge(this_CUADRADOD_4);
                            				

                            					newLeafNode(this_CUADRADOD_4, grammarAccess.getDatoAccess().getCUADRADODTerminalRuleCall_0_1_3());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLinit.g:2268:3: this_numero_5= rulenumero
                    {

                    			newCompositeNode(grammarAccess.getDatoAccess().getNumeroParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_numero_5=rulenumero();

                    state._fsp--;


                    			current.merge(this_numero_5);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLinit.g:2279:3: this_logico_6= rulelogico
                    {

                    			newCompositeNode(grammarAccess.getDatoAccess().getLogicoParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_logico_6=rulelogico();

                    state._fsp--;


                    			current.merge(this_logico_6);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalLinit.g:2290:3: this_FRASE_7= RULE_FRASE
                    {
                    this_FRASE_7=(Token)match(input,RULE_FRASE,FOLLOW_2); 

                    			current.merge(this_FRASE_7);
                    		

                    			newLeafNode(this_FRASE_7, grammarAccess.getDatoAccess().getFRASETerminalRuleCall_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledato"


    // $ANTLR start "entryRulelogico"
    // InternalLinit.g:2301:1: entryRulelogico returns [String current=null] : iv_rulelogico= rulelogico EOF ;
    public final String entryRulelogico() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelogico = null;


        try {
            // InternalLinit.g:2301:46: (iv_rulelogico= rulelogico EOF )
            // InternalLinit.g:2302:2: iv_rulelogico= rulelogico EOF
            {
             newCompositeNode(grammarAccess.getLogicoRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelogico=rulelogico();

            state._fsp--;

             current =iv_rulelogico.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelogico"


    // $ANTLR start "rulelogico"
    // InternalLinit.g:2308:1: rulelogico returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'VERDADERO' | this_VERDADERO_1= RULE_VERDADERO ) | (kw= 'FALSO' | this_FALSO_3= RULE_FALSO ) ) ;
    public final AntlrDatatypeRuleToken rulelogico() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_VERDADERO_1=null;
        Token this_FALSO_3=null;


        	enterRule();

        try {
            // InternalLinit.g:2314:2: ( ( (kw= 'VERDADERO' | this_VERDADERO_1= RULE_VERDADERO ) | (kw= 'FALSO' | this_FALSO_3= RULE_FALSO ) ) )
            // InternalLinit.g:2315:2: ( (kw= 'VERDADERO' | this_VERDADERO_1= RULE_VERDADERO ) | (kw= 'FALSO' | this_FALSO_3= RULE_FALSO ) )
            {
            // InternalLinit.g:2315:2: ( (kw= 'VERDADERO' | this_VERDADERO_1= RULE_VERDADERO ) | (kw= 'FALSO' | this_FALSO_3= RULE_FALSO ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_VERDADERO||LA74_0==94) ) {
                alt74=1;
            }
            else if ( (LA74_0==RULE_FALSO||LA74_0==95) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // InternalLinit.g:2316:3: (kw= 'VERDADERO' | this_VERDADERO_1= RULE_VERDADERO )
                    {
                    // InternalLinit.g:2316:3: (kw= 'VERDADERO' | this_VERDADERO_1= RULE_VERDADERO )
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==94) ) {
                        alt72=1;
                    }
                    else if ( (LA72_0==RULE_VERDADERO) ) {
                        alt72=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 72, 0, input);

                        throw nvae;
                    }
                    switch (alt72) {
                        case 1 :
                            // InternalLinit.g:2317:4: kw= 'VERDADERO'
                            {
                            kw=(Token)match(input,94,FOLLOW_2); 

                            				current.merge(kw);
                            				newLeafNode(kw, grammarAccess.getLogicoAccess().getVERDADEROKeyword_0_0());
                            			

                            }
                            break;
                        case 2 :
                            // InternalLinit.g:2323:4: this_VERDADERO_1= RULE_VERDADERO
                            {
                            this_VERDADERO_1=(Token)match(input,RULE_VERDADERO,FOLLOW_2); 

                            				current.merge(this_VERDADERO_1);
                            			

                            				newLeafNode(this_VERDADERO_1, grammarAccess.getLogicoAccess().getVERDADEROTerminalRuleCall_0_1());
                            			

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalLinit.g:2332:3: (kw= 'FALSO' | this_FALSO_3= RULE_FALSO )
                    {
                    // InternalLinit.g:2332:3: (kw= 'FALSO' | this_FALSO_3= RULE_FALSO )
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==95) ) {
                        alt73=1;
                    }
                    else if ( (LA73_0==RULE_FALSO) ) {
                        alt73=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 0, input);

                        throw nvae;
                    }
                    switch (alt73) {
                        case 1 :
                            // InternalLinit.g:2333:4: kw= 'FALSO'
                            {
                            kw=(Token)match(input,95,FOLLOW_2); 

                            				current.merge(kw);
                            				newLeafNode(kw, grammarAccess.getLogicoAccess().getFALSOKeyword_1_0());
                            			

                            }
                            break;
                        case 2 :
                            // InternalLinit.g:2339:4: this_FALSO_3= RULE_FALSO
                            {
                            this_FALSO_3=(Token)match(input,RULE_FALSO,FOLLOW_2); 

                            				current.merge(this_FALSO_3);
                            			

                            				newLeafNode(this_FALSO_3, grammarAccess.getLogicoAccess().getFALSOTerminalRuleCall_1_1());
                            			

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelogico"


    // $ANTLR start "entryRulenumero"
    // InternalLinit.g:2351:1: entryRulenumero returns [String current=null] : iv_rulenumero= rulenumero EOF ;
    public final String entryRulenumero() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulenumero = null;


        try {
            // InternalLinit.g:2351:46: (iv_rulenumero= rulenumero EOF )
            // InternalLinit.g:2352:2: iv_rulenumero= rulenumero EOF
            {
             newCompositeNode(grammarAccess.getNumeroRule()); 
            pushFollow(FOLLOW_1);
            iv_rulenumero=rulenumero();

            state._fsp--;

             current =iv_rulenumero.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulenumero"


    // $ANTLR start "rulenumero"
    // InternalLinit.g:2358:1: rulenumero returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ENTERO_0= RULE_ENTERO | this_NREAL_1= RULE_NREAL ) ;
    public final AntlrDatatypeRuleToken rulenumero() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ENTERO_0=null;
        Token this_NREAL_1=null;


        	enterRule();

        try {
            // InternalLinit.g:2364:2: ( (this_ENTERO_0= RULE_ENTERO | this_NREAL_1= RULE_NREAL ) )
            // InternalLinit.g:2365:2: (this_ENTERO_0= RULE_ENTERO | this_NREAL_1= RULE_NREAL )
            {
            // InternalLinit.g:2365:2: (this_ENTERO_0= RULE_ENTERO | this_NREAL_1= RULE_NREAL )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_ENTERO) ) {
                alt75=1;
            }
            else if ( (LA75_0==RULE_NREAL) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalLinit.g:2366:3: this_ENTERO_0= RULE_ENTERO
                    {
                    this_ENTERO_0=(Token)match(input,RULE_ENTERO,FOLLOW_2); 

                    			current.merge(this_ENTERO_0);
                    		

                    			newLeafNode(this_ENTERO_0, grammarAccess.getNumeroAccess().getENTEROTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLinit.g:2374:3: this_NREAL_1= RULE_NREAL
                    {
                    this_NREAL_1=(Token)match(input,RULE_NREAL,FOLLOW_2); 

                    			current.merge(this_NREAL_1);
                    		

                    			newLeafNode(this_NREAL_1, grammarAccess.getNumeroAccess().getNREALTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulenumero"


    // $ANTLR start "entryRulelistaArreglo"
    // InternalLinit.g:2385:1: entryRulelistaArreglo returns [String current=null] : iv_rulelistaArreglo= rulelistaArreglo EOF ;
    public final String entryRulelistaArreglo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelistaArreglo = null;


        try {
            // InternalLinit.g:2385:52: (iv_rulelistaArreglo= rulelistaArreglo EOF )
            // InternalLinit.g:2386:2: iv_rulelistaArreglo= rulelistaArreglo EOF
            {
             newCompositeNode(grammarAccess.getListaArregloRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelistaArreglo=rulelistaArreglo();

            state._fsp--;

             current =iv_rulelistaArreglo.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelistaArreglo"


    // $ANTLR start "rulelistaArreglo"
    // InternalLinit.g:2392:1: rulelistaArreglo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ';' this_expresion_1= ruleexpresion this_listaArreglo_2= rulelistaArreglo )? ;
    public final AntlrDatatypeRuleToken rulelistaArreglo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expresion_1 = null;

        AntlrDatatypeRuleToken this_listaArreglo_2 = null;



        	enterRule();

        try {
            // InternalLinit.g:2398:2: ( (kw= ';' this_expresion_1= ruleexpresion this_listaArreglo_2= rulelistaArreglo )? )
            // InternalLinit.g:2399:2: (kw= ';' this_expresion_1= ruleexpresion this_listaArreglo_2= rulelistaArreglo )?
            {
            // InternalLinit.g:2399:2: (kw= ';' this_expresion_1= ruleexpresion this_listaArreglo_2= rulelistaArreglo )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==71) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalLinit.g:2400:3: kw= ';' this_expresion_1= ruleexpresion this_listaArreglo_2= rulelistaArreglo
                    {
                    kw=(Token)match(input,71,FOLLOW_21); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getListaArregloAccess().getSemicolonKeyword_0());
                    		

                    			newCompositeNode(grammarAccess.getListaArregloAccess().getExpresionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_15);
                    this_expresion_1=ruleexpresion();

                    state._fsp--;


                    			current.merge(this_expresion_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    			newCompositeNode(grammarAccess.getListaArregloAccess().getListaArregloParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_listaArreglo_2=rulelistaArreglo();

                    state._fsp--;


                    			current.merge(this_listaArreglo_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelistaArreglo"


    // $ANTLR start "entryRulelistaCondicional"
    // InternalLinit.g:2429:1: entryRulelistaCondicional returns [EObject current=null] : iv_rulelistaCondicional= rulelistaCondicional EOF ;
    public final EObject entryRulelistaCondicional() throws RecognitionException {
        EObject current = null;

        EObject iv_rulelistaCondicional = null;


        try {
            // InternalLinit.g:2429:57: (iv_rulelistaCondicional= rulelistaCondicional EOF )
            // InternalLinit.g:2430:2: iv_rulelistaCondicional= rulelistaCondicional EOF
            {
             newCompositeNode(grammarAccess.getListaCondicionalRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelistaCondicional=rulelistaCondicional();

            state._fsp--;

             current =iv_rulelistaCondicional; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelistaCondicional"


    // $ANTLR start "rulelistaCondicional"
    // InternalLinit.g:2436:1: rulelistaCondicional returns [EObject current=null] : ( () ( ( (otherlv_1= 'O SI' | this_SINO_2= RULE_SINO ) ruleexpresion otherlv_4= ':' ( (lv_i_5_0= ruleinstrucciones ) ) ( (lv_l_6_0= rulelistaCondicional ) ) ) | ( (otherlv_7= 'EN OTRO CASO' | this_OTROCASO_8= RULE_OTROCASO ) otherlv_9= ':' ( (lv_i_10_0= ruleinstrucciones ) ) ) )? ) ;
    public final EObject rulelistaCondicional() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_SINO_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token this_OTROCASO_8=null;
        Token otherlv_9=null;
        EObject lv_i_5_0 = null;

        EObject lv_l_6_0 = null;

        EObject lv_i_10_0 = null;



        	enterRule();

        try {
            // InternalLinit.g:2442:2: ( ( () ( ( (otherlv_1= 'O SI' | this_SINO_2= RULE_SINO ) ruleexpresion otherlv_4= ':' ( (lv_i_5_0= ruleinstrucciones ) ) ( (lv_l_6_0= rulelistaCondicional ) ) ) | ( (otherlv_7= 'EN OTRO CASO' | this_OTROCASO_8= RULE_OTROCASO ) otherlv_9= ':' ( (lv_i_10_0= ruleinstrucciones ) ) ) )? ) )
            // InternalLinit.g:2443:2: ( () ( ( (otherlv_1= 'O SI' | this_SINO_2= RULE_SINO ) ruleexpresion otherlv_4= ':' ( (lv_i_5_0= ruleinstrucciones ) ) ( (lv_l_6_0= rulelistaCondicional ) ) ) | ( (otherlv_7= 'EN OTRO CASO' | this_OTROCASO_8= RULE_OTROCASO ) otherlv_9= ':' ( (lv_i_10_0= ruleinstrucciones ) ) ) )? )
            {
            // InternalLinit.g:2443:2: ( () ( ( (otherlv_1= 'O SI' | this_SINO_2= RULE_SINO ) ruleexpresion otherlv_4= ':' ( (lv_i_5_0= ruleinstrucciones ) ) ( (lv_l_6_0= rulelistaCondicional ) ) ) | ( (otherlv_7= 'EN OTRO CASO' | this_OTROCASO_8= RULE_OTROCASO ) otherlv_9= ':' ( (lv_i_10_0= ruleinstrucciones ) ) ) )? )
            // InternalLinit.g:2444:3: () ( ( (otherlv_1= 'O SI' | this_SINO_2= RULE_SINO ) ruleexpresion otherlv_4= ':' ( (lv_i_5_0= ruleinstrucciones ) ) ( (lv_l_6_0= rulelistaCondicional ) ) ) | ( (otherlv_7= 'EN OTRO CASO' | this_OTROCASO_8= RULE_OTROCASO ) otherlv_9= ':' ( (lv_i_10_0= ruleinstrucciones ) ) ) )?
            {
            // InternalLinit.g:2444:3: ()
            // InternalLinit.g:2445:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListaCondicionalAccess().getListaCondicionalAction_0(),
            					current);
            			

            }

            // InternalLinit.g:2451:3: ( ( (otherlv_1= 'O SI' | this_SINO_2= RULE_SINO ) ruleexpresion otherlv_4= ':' ( (lv_i_5_0= ruleinstrucciones ) ) ( (lv_l_6_0= rulelistaCondicional ) ) ) | ( (otherlv_7= 'EN OTRO CASO' | this_OTROCASO_8= RULE_OTROCASO ) otherlv_9= ':' ( (lv_i_10_0= ruleinstrucciones ) ) ) )?
            int alt79=3;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_SINO||LA79_0==96) ) {
                alt79=1;
            }
            else if ( (LA79_0==RULE_OTROCASO||LA79_0==97) ) {
                alt79=2;
            }
            switch (alt79) {
                case 1 :
                    // InternalLinit.g:2452:4: ( (otherlv_1= 'O SI' | this_SINO_2= RULE_SINO ) ruleexpresion otherlv_4= ':' ( (lv_i_5_0= ruleinstrucciones ) ) ( (lv_l_6_0= rulelistaCondicional ) ) )
                    {
                    // InternalLinit.g:2452:4: ( (otherlv_1= 'O SI' | this_SINO_2= RULE_SINO ) ruleexpresion otherlv_4= ':' ( (lv_i_5_0= ruleinstrucciones ) ) ( (lv_l_6_0= rulelistaCondicional ) ) )
                    // InternalLinit.g:2453:5: (otherlv_1= 'O SI' | this_SINO_2= RULE_SINO ) ruleexpresion otherlv_4= ':' ( (lv_i_5_0= ruleinstrucciones ) ) ( (lv_l_6_0= rulelistaCondicional ) )
                    {
                    // InternalLinit.g:2453:5: (otherlv_1= 'O SI' | this_SINO_2= RULE_SINO )
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==96) ) {
                        alt77=1;
                    }
                    else if ( (LA77_0==RULE_SINO) ) {
                        alt77=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 77, 0, input);

                        throw nvae;
                    }
                    switch (alt77) {
                        case 1 :
                            // InternalLinit.g:2454:6: otherlv_1= 'O SI'
                            {
                            otherlv_1=(Token)match(input,96,FOLLOW_21); 

                            						newLeafNode(otherlv_1, grammarAccess.getListaCondicionalAccess().getOSIKeyword_1_0_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalLinit.g:2459:6: this_SINO_2= RULE_SINO
                            {
                            this_SINO_2=(Token)match(input,RULE_SINO,FOLLOW_21); 

                            						newLeafNode(this_SINO_2, grammarAccess.getListaCondicionalAccess().getSINOTerminalRuleCall_1_0_0_1());
                            					

                            }
                            break;

                    }


                    					newCompositeNode(grammarAccess.getListaCondicionalAccess().getExpresionParserRuleCall_1_0_1());
                    				
                    pushFollow(FOLLOW_6);
                    ruleexpresion();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    otherlv_4=(Token)match(input,65,FOLLOW_39); 

                    					newLeafNode(otherlv_4, grammarAccess.getListaCondicionalAccess().getColonKeyword_1_0_2());
                    				
                    // InternalLinit.g:2475:5: ( (lv_i_5_0= ruleinstrucciones ) )
                    // InternalLinit.g:2476:6: (lv_i_5_0= ruleinstrucciones )
                    {
                    // InternalLinit.g:2476:6: (lv_i_5_0= ruleinstrucciones )
                    // InternalLinit.g:2477:7: lv_i_5_0= ruleinstrucciones
                    {

                    							newCompositeNode(grammarAccess.getListaCondicionalAccess().getIInstruccionesParserRuleCall_1_0_3_0());
                    						
                    pushFollow(FOLLOW_40);
                    lv_i_5_0=ruleinstrucciones();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getListaCondicionalRule());
                    							}
                    							set(
                    								current,
                    								"i",
                    								lv_i_5_0,
                    								"linit.Linit.instrucciones");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalLinit.g:2494:5: ( (lv_l_6_0= rulelistaCondicional ) )
                    // InternalLinit.g:2495:6: (lv_l_6_0= rulelistaCondicional )
                    {
                    // InternalLinit.g:2495:6: (lv_l_6_0= rulelistaCondicional )
                    // InternalLinit.g:2496:7: lv_l_6_0= rulelistaCondicional
                    {

                    							newCompositeNode(grammarAccess.getListaCondicionalAccess().getLListaCondicionalParserRuleCall_1_0_4_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_l_6_0=rulelistaCondicional();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getListaCondicionalRule());
                    							}
                    							set(
                    								current,
                    								"l",
                    								lv_l_6_0,
                    								"linit.Linit.listaCondicional");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLinit.g:2515:4: ( (otherlv_7= 'EN OTRO CASO' | this_OTROCASO_8= RULE_OTROCASO ) otherlv_9= ':' ( (lv_i_10_0= ruleinstrucciones ) ) )
                    {
                    // InternalLinit.g:2515:4: ( (otherlv_7= 'EN OTRO CASO' | this_OTROCASO_8= RULE_OTROCASO ) otherlv_9= ':' ( (lv_i_10_0= ruleinstrucciones ) ) )
                    // InternalLinit.g:2516:5: (otherlv_7= 'EN OTRO CASO' | this_OTROCASO_8= RULE_OTROCASO ) otherlv_9= ':' ( (lv_i_10_0= ruleinstrucciones ) )
                    {
                    // InternalLinit.g:2516:5: (otherlv_7= 'EN OTRO CASO' | this_OTROCASO_8= RULE_OTROCASO )
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==97) ) {
                        alt78=1;
                    }
                    else if ( (LA78_0==RULE_OTROCASO) ) {
                        alt78=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 78, 0, input);

                        throw nvae;
                    }
                    switch (alt78) {
                        case 1 :
                            // InternalLinit.g:2517:6: otherlv_7= 'EN OTRO CASO'
                            {
                            otherlv_7=(Token)match(input,97,FOLLOW_6); 

                            						newLeafNode(otherlv_7, grammarAccess.getListaCondicionalAccess().getENOTROCASOKeyword_1_1_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalLinit.g:2522:6: this_OTROCASO_8= RULE_OTROCASO
                            {
                            this_OTROCASO_8=(Token)match(input,RULE_OTROCASO,FOLLOW_6); 

                            						newLeafNode(this_OTROCASO_8, grammarAccess.getListaCondicionalAccess().getOTROCASOTerminalRuleCall_1_1_0_1());
                            					

                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,65,FOLLOW_3); 

                    					newLeafNode(otherlv_9, grammarAccess.getListaCondicionalAccess().getColonKeyword_1_1_1());
                    				
                    // InternalLinit.g:2531:5: ( (lv_i_10_0= ruleinstrucciones ) )
                    // InternalLinit.g:2532:6: (lv_i_10_0= ruleinstrucciones )
                    {
                    // InternalLinit.g:2532:6: (lv_i_10_0= ruleinstrucciones )
                    // InternalLinit.g:2533:7: lv_i_10_0= ruleinstrucciones
                    {

                    							newCompositeNode(grammarAccess.getListaCondicionalAccess().getIInstruccionesParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_i_10_0=ruleinstrucciones();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getListaCondicionalRule());
                    							}
                    							set(
                    								current,
                    								"i",
                    								lv_i_10_0,
                    								"linit.Linit.instrucciones");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelistaCondicional"


    // $ANTLR start "entryRulelistaImpresion"
    // InternalLinit.g:2556:1: entryRulelistaImpresion returns [String current=null] : iv_rulelistaImpresion= rulelistaImpresion EOF ;
    public final String entryRulelistaImpresion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelistaImpresion = null;


        try {
            // InternalLinit.g:2556:54: (iv_rulelistaImpresion= rulelistaImpresion EOF )
            // InternalLinit.g:2557:2: iv_rulelistaImpresion= rulelistaImpresion EOF
            {
             newCompositeNode(grammarAccess.getListaImpresionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulelistaImpresion=rulelistaImpresion();

            state._fsp--;

             current =iv_rulelistaImpresion.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelistaImpresion"


    // $ANTLR start "rulelistaImpresion"
    // InternalLinit.g:2563:1: rulelistaImpresion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ';' this_expresion_1= ruleexpresion this_listaImpresion_2= rulelistaImpresion )? ;
    public final AntlrDatatypeRuleToken rulelistaImpresion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_expresion_1 = null;

        AntlrDatatypeRuleToken this_listaImpresion_2 = null;



        	enterRule();

        try {
            // InternalLinit.g:2569:2: ( (kw= ';' this_expresion_1= ruleexpresion this_listaImpresion_2= rulelistaImpresion )? )
            // InternalLinit.g:2570:2: (kw= ';' this_expresion_1= ruleexpresion this_listaImpresion_2= rulelistaImpresion )?
            {
            // InternalLinit.g:2570:2: (kw= ';' this_expresion_1= ruleexpresion this_listaImpresion_2= rulelistaImpresion )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==71) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalLinit.g:2571:3: kw= ';' this_expresion_1= ruleexpresion this_listaImpresion_2= rulelistaImpresion
                    {
                    kw=(Token)match(input,71,FOLLOW_21); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getListaImpresionAccess().getSemicolonKeyword_0());
                    		

                    			newCompositeNode(grammarAccess.getListaImpresionAccess().getExpresionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_15);
                    this_expresion_1=ruleexpresion();

                    state._fsp--;


                    			current.merge(this_expresion_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    			newCompositeNode(grammarAccess.getListaImpresionAccess().getListaImpresionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_listaImpresion_2=rulelistaImpresion();

                    state._fsp--;


                    			current.merge(this_listaImpresion_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelistaImpresion"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000018CD20L,0x0000000000018F20L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000280L,0x0000000000000050L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000018CD60L,0x0000000000018F24L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000004L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000220L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001E00000L,0x00000000001E0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000200L,0x00000000000000C0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001E00800L,0x00000000001E0200L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000006000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000006000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000006001000L,0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x001F600000000020L,0x00000000E0000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000080L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000282L,0x0000000000000050L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x006000000018CD60L,0x0000000300018F24L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0060000000000040L,0x0000000300000004L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000010000L,0x0000000000001000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000020000L,0x0000000000002000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000040000L,0x0000000000004000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0006000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000018000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000007FE6000002L,0x000000001F200000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000E0000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x006000000018CD20L,0x0000000300018F20L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0060000000000000L,0x0000000300000000L});

}