package linit.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLinitLexer extends Lexer {
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

    public InternalLinitLexer() {;} 
    public InternalLinitLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalLinitLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalLinit.g"; }

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:11:7: ( 'PROCEDIMIENTO' )
            // InternalLinit.g:11:9: 'PROCEDIMIENTO'
            {
            match("PROCEDIMIENTO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:12:7: ( ':' )
            // InternalLinit.g:12:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:13:7: ( 'FIN' )
            // InternalLinit.g:13:9: 'FIN'
            {
            match("FIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:14:7: ( '.' )
            // InternalLinit.g:14:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:15:7: ( 'IMPORTA' )
            // InternalLinit.g:15:9: 'IMPORTA'
            {
            match("IMPORTA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:16:7: ( 'VARIABLE' )
            // InternalLinit.g:16:9: 'VARIABLE'
            {
            match("VARIABLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:17:7: ( 'EXPORTA' )
            // InternalLinit.g:17:9: 'EXPORTA'
            {
            match("EXPORTA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:18:7: ( ';' )
            // InternalLinit.g:18:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:19:7: ( 'CONSTANTE' )
            // InternalLinit.g:19:9: 'CONSTANTE'
            {
            match("CONSTANTE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:20:7: ( 'ARREGLO' )
            // InternalLinit.g:20:9: 'ARREGLO'
            {
            match("ARREGLO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:21:7: ( 'SI' )
            // InternalLinit.g:21:9: 'SI'
            {
            match("SI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:22:7: ( 'REPETIR' )
            // InternalLinit.g:22:9: 'REPETIR'
            {
            match("REPETIR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:23:7: ( 'VECES' )
            // InternalLinit.g:23:9: 'VECES'
            {
            match("VECES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:24:7: ( 'MIENTRAS' )
            // InternalLinit.g:24:9: 'MIENTRAS'
            {
            match("MIENTRAS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:25:7: ( 'SEA' )
            // InternalLinit.g:25:9: 'SEA'
            {
            match("SEA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:26:7: ( 'IMPRIMIR EN CONSOLA' )
            // InternalLinit.g:26:9: 'IMPRIMIR EN CONSOLA'
            {
            match("IMPRIMIR EN CONSOLA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:27:7: ( 'CAPTURAR DE CONSOLA' )
            // InternalLinit.g:27:9: 'CAPTURAR DE CONSOLA'
            {
            match("CAPTURAR DE CONSOLA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:28:7: ( 'ENTERA' )
            // InternalLinit.g:28:9: 'ENTERA'
            {
            match("ENTERA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:29:7: ( 'REAL' )
            // InternalLinit.g:29:9: 'REAL'
            {
            match("REAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:30:7: ( 'LOGICA' )
            // InternalLinit.g:30:9: 'LOGICA'
            {
            match("LOGICA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:31:7: ( 'DE CARACTERES' )
            // InternalLinit.g:31:9: 'DE CARACTERES'
            {
            match("DE CARACTERES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:32:7: ( 'ES IGUAL A' )
            // InternalLinit.g:32:9: 'ES IGUAL A'
            {
            match("ES IGUAL A"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:33:7: ( 'Y' )
            // InternalLinit.g:33:9: 'Y'
            {
            match('Y'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:34:7: ( 'O' )
            // InternalLinit.g:34:9: 'O'
            {
            match('O'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:35:7: ( 'ES MENOR A' )
            // InternalLinit.g:35:9: 'ES MENOR A'
            {
            match("ES MENOR A"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:36:7: ( 'ES MENOR O IGUAL A' )
            // InternalLinit.g:36:9: 'ES MENOR O IGUAL A'
            {
            match("ES MENOR O IGUAL A"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:37:7: ( 'ES MAYOR A' )
            // InternalLinit.g:37:9: 'ES MAYOR A'
            {
            match("ES MAYOR A"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:38:7: ( 'ES MAYOR O IGUAL A' )
            // InternalLinit.g:38:9: 'ES MAYOR O IGUAL A'
            {
            match("ES MAYOR O IGUAL A"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:39:7: ( 'ES DIFERENTE DE A' )
            // InternalLinit.g:39:9: 'ES DIFERENTE DE A'
            {
            match("ES DIFERENTE DE A"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:40:7: ( 'NO' )
            // InternalLinit.g:40:9: 'NO'
            {
            match("NO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:41:7: ( 'O SI' )
            // InternalLinit.g:41:9: 'O SI'
            {
            match("O SI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:42:7: ( 'EN OTRO CASO' )
            // InternalLinit.g:42:9: 'EN OTRO CASO'
            {
            match("EN OTRO CASO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "RULE_LINE_COMMENT"
    public final void mRULE_LINE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2583:19: ( '>>' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalLinit.g:2583:21: '>>' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match(">>"); 

            // InternalLinit.g:2583:26: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLinit.g:2583:26: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalLinit.g:2583:42: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalLinit.g:2583:43: ( '\\r' )? '\\n'
                    {
                    // InternalLinit.g:2583:43: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalLinit.g:2583:43: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LINE_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2585:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalLinit.g:2585:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalLinit.g:2585:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\t' && LA4_0<='\n')||LA4_0=='\r'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLinit.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_PROCEDIMIENTO"
    public final void mRULE_PROCEDIMIENTO() throws RecognitionException {
        try {
            int _type = RULE_PROCEDIMIENTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2587:20: ( 'P' ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' ) )
            // InternalLinit.g:2587:22: 'P' ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' )
            {
            match('P'); 
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PROCEDIMIENTO"

    // $ANTLR start "RULE_IMPORTA"
    public final void mRULE_IMPORTA() throws RecognitionException {
        try {
            int _type = RULE_IMPORTA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2589:14: ( 'I' ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'A' | 'a' ) )
            // InternalLinit.g:2589:16: 'I' ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'A' | 'a' )
            {
            match('I'); 
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IMPORTA"

    // $ANTLR start "RULE_EXPORTA"
    public final void mRULE_EXPORTA() throws RecognitionException {
        try {
            int _type = RULE_EXPORTA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2591:14: ( 'E' ( 'X' | 'x' ) ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'A' | 'a' ) )
            // InternalLinit.g:2591:16: 'E' ( 'X' | 'x' ) ( 'P' | 'p' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'A' | 'a' )
            {
            match('E'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPORTA"

    // $ANTLR start "RULE_VARIABLE"
    public final void mRULE_VARIABLE() throws RecognitionException {
        try {
            int _type = RULE_VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2593:15: ( 'V' ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // InternalLinit.g:2593:17: 'V' ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' )
            {
            match('V'); 
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VARIABLE"

    // $ANTLR start "RULE_CONSTANTE"
    public final void mRULE_CONSTANTE() throws RecognitionException {
        try {
            int _type = RULE_CONSTANTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2595:16: ( 'C' ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // InternalLinit.g:2595:18: 'C' ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            match('C'); 
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CONSTANTE"

    // $ANTLR start "RULE_ENTERA"
    public final void mRULE_ENTERA() throws RecognitionException {
        try {
            int _type = RULE_ENTERA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2597:13: ( 'E' ( 'N' | 'n' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'A' | 'a' ) )
            // InternalLinit.g:2597:15: 'E' ( 'N' | 'n' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'A' | 'a' )
            {
            match('E'); 
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ENTERA"

    // $ANTLR start "RULE_REAL"
    public final void mRULE_REAL() throws RecognitionException {
        try {
            int _type = RULE_REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2599:11: ( 'R' ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // InternalLinit.g:2599:13: 'R' ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            match('R'); 
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REAL"

    // $ANTLR start "RULE_LOGICA"
    public final void mRULE_LOGICA() throws RecognitionException {
        try {
            int _type = RULE_LOGICA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2601:13: ( 'L' ( 'O' | 'o' ) ( 'G' | 'g' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'A' | 'a' ) )
            // InternalLinit.g:2601:15: 'L' ( 'O' | 'o' ) ( 'G' | 'g' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'A' | 'a' )
            {
            match('L'); 
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LOGICA"

    // $ANTLR start "RULE_CARACTERES"
    public final void mRULE_CARACTERES() throws RecognitionException {
        try {
            int _type = RULE_CARACTERES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2603:17: ( 'D' ( 'E' | 'e' ) ' ' 'C' ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // InternalLinit.g:2603:19: 'D' ( 'E' | 'e' ) ' ' 'C' ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'S' | 's' )
            {
            match('D'); 
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match(' '); 
            match('C'); 
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CARACTERES"

    // $ANTLR start "RULE_SIGNOY"
    public final void mRULE_SIGNOY() throws RecognitionException {
        try {
            int _type = RULE_SIGNOY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2605:13: ( '/\\\\' )
            // InternalLinit.g:2605:15: '/\\\\'
            {
            match("/\\"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGNOY"

    // $ANTLR start "RULE_SIGNOO"
    public final void mRULE_SIGNOO() throws RecognitionException {
        try {
            int _type = RULE_SIGNOO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2607:13: ( '\\\\/' )
            // InternalLinit.g:2607:15: '\\\\/'
            {
            match("\\/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGNOO"

    // $ANTLR start "RULE_MENOR"
    public final void mRULE_MENOR() throws RecognitionException {
        try {
            int _type = RULE_MENOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2609:12: ( 'E' ( 'S' | 's' ) ' ' 'M' ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // InternalLinit.g:2609:14: 'E' ( 'S' | 's' ) ' ' 'M' ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            match('E'); 
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match(' '); 
            match('M'); 
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MENOR"

    // $ANTLR start "RULE_SIGNOMENOR"
    public final void mRULE_SIGNOMENOR() throws RecognitionException {
        try {
            int _type = RULE_SIGNOMENOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2611:17: ( '<' )
            // InternalLinit.g:2611:19: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGNOMENOR"

    // $ANTLR start "RULE_MENORIGUAL"
    public final void mRULE_MENORIGUAL() throws RecognitionException {
        try {
            int _type = RULE_MENORIGUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2613:17: ( 'E' ( 'S' | 's' ) ' ' 'M' ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ' ' 'O' ' ' 'I' ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // InternalLinit.g:2613:19: 'E' ( 'S' | 's' ) ' ' 'M' ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ' ' 'O' ' ' 'I' ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            match('E'); 
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match(' '); 
            match('M'); 
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match(' '); 
            match('O'); 
            match(' '); 
            match('I'); 
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MENORIGUAL"

    // $ANTLR start "RULE_SIGNOMENORIGUAL"
    public final void mRULE_SIGNOMENORIGUAL() throws RecognitionException {
        try {
            int _type = RULE_SIGNOMENORIGUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2615:22: ( '<=' )
            // InternalLinit.g:2615:24: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGNOMENORIGUAL"

    // $ANTLR start "RULE_MAYOR"
    public final void mRULE_MAYOR() throws RecognitionException {
        try {
            int _type = RULE_MAYOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2617:12: ( 'E' ( 'S' | 's' ) ' ' 'M' ( 'A' | 'a' ) ( 'Y' | 'y' ) ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // InternalLinit.g:2617:14: 'E' ( 'S' | 's' ) ' ' 'M' ( 'A' | 'a' ) ( 'Y' | 'y' ) ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            match('E'); 
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match(' '); 
            match('M'); 
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MAYOR"

    // $ANTLR start "RULE_SIGNOMAYOR"
    public final void mRULE_SIGNOMAYOR() throws RecognitionException {
        try {
            int _type = RULE_SIGNOMAYOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2619:17: ( '>' )
            // InternalLinit.g:2619:19: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGNOMAYOR"

    // $ANTLR start "RULE_MAYORIGUAL"
    public final void mRULE_MAYORIGUAL() throws RecognitionException {
        try {
            int _type = RULE_MAYORIGUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2621:17: ( 'E' ( 'S' | 's' ) ' ' 'M' ( 'A' | 'a' ) ( 'Y' | 'y' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ' ' 'O' ' ' 'I' ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // InternalLinit.g:2621:19: 'E' ( 'S' | 's' ) ' ' 'M' ( 'A' | 'a' ) ( 'Y' | 'y' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ' ' 'O' ' ' 'I' ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            match('E'); 
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match(' '); 
            match('M'); 
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match(' '); 
            match('O'); 
            match(' '); 
            match('I'); 
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MAYORIGUAL"

    // $ANTLR start "RULE_SIGNOMAYORIGUAL"
    public final void mRULE_SIGNOMAYORIGUAL() throws RecognitionException {
        try {
            int _type = RULE_SIGNOMAYORIGUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2623:22: ( '>=' )
            // InternalLinit.g:2623:24: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGNOMAYORIGUAL"

    // $ANTLR start "RULE_IGUAL"
    public final void mRULE_IGUAL() throws RecognitionException {
        try {
            int _type = RULE_IGUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2625:12: ( 'E' ( 'S' | 's' ) ' ' 'I' ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ' ' 'A' )
            // InternalLinit.g:2625:14: 'E' ( 'S' | 's' ) ' ' 'I' ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ' ' 'A'
            {
            match('E'); 
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match(' '); 
            match('I'); 
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match(' '); 
            match('A'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IGUAL"

    // $ANTLR start "RULE_SIGNOIGUAL"
    public final void mRULE_SIGNOIGUAL() throws RecognitionException {
        try {
            int _type = RULE_SIGNOIGUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2627:17: ( '=' )
            // InternalLinit.g:2627:19: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGNOIGUAL"

    // $ANTLR start "RULE_DIFERENTE"
    public final void mRULE_DIFERENTE() throws RecognitionException {
        try {
            int _type = RULE_DIFERENTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2629:16: ( 'E' ( 'S' | 's' ) ' ' 'D' ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'E' | 'e' ) ' ' 'D' ( 'E' | 'e' ) )
            // InternalLinit.g:2629:18: 'E' ( 'S' | 's' ) ' ' 'D' ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'E' | 'e' ) ' ' 'D' ( 'E' | 'e' )
            {
            match('E'); 
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match(' '); 
            match('D'); 
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match(' '); 
            match('D'); 
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIFERENTE"

    // $ANTLR start "RULE_SIGNODIFERENTE"
    public final void mRULE_SIGNODIFERENTE() throws RecognitionException {
        try {
            int _type = RULE_SIGNODIFERENTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2631:21: ( '/=' )
            // InternalLinit.g:2631:23: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGNODIFERENTE"

    // $ANTLR start "RULE_SUMA"
    public final void mRULE_SUMA() throws RecognitionException {
        try {
            int _type = RULE_SUMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2633:11: ( '+' )
            // InternalLinit.g:2633:13: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SUMA"

    // $ANTLR start "RULE_RESTA"
    public final void mRULE_RESTA() throws RecognitionException {
        try {
            int _type = RULE_RESTA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2635:12: ( '-' )
            // InternalLinit.g:2635:14: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RESTA"

    // $ANTLR start "RULE_MULTIPLICACION"
    public final void mRULE_MULTIPLICACION() throws RecognitionException {
        try {
            int _type = RULE_MULTIPLICACION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2637:21: ( '*' )
            // InternalLinit.g:2637:23: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MULTIPLICACION"

    // $ANTLR start "RULE_DIVISION"
    public final void mRULE_DIVISION() throws RecognitionException {
        try {
            int _type = RULE_DIVISION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2639:15: ( '/' )
            // InternalLinit.g:2639:17: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIVISION"

    // $ANTLR start "RULE_MODULO"
    public final void mRULE_MODULO() throws RecognitionException {
        try {
            int _type = RULE_MODULO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2641:13: ( 'M' ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'O' | 'o' ) )
            // InternalLinit.g:2641:15: 'M' ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'O' | 'o' )
            {
            match('M'); 
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MODULO"

    // $ANTLR start "RULE_POTENCIA"
    public final void mRULE_POTENCIA() throws RecognitionException {
        try {
            int _type = RULE_POTENCIA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2643:15: ( '**' )
            // InternalLinit.g:2643:17: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_POTENCIA"

    // $ANTLR start "RULE_NO"
    public final void mRULE_NO() throws RecognitionException {
        try {
            int _type = RULE_NO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2645:9: ( 'N' ( 'O' | 'o' ) ' ' 'S' ( 'U' | 'u' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'E' | 'e' ) )
            // InternalLinit.g:2645:11: 'N' ( 'O' | 'o' ) ' ' 'S' ( 'U' | 'u' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'E' | 'e' )
            {
            match('N'); 
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match(' '); 
            match('S'); 
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NO"

    // $ANTLR start "RULE_IZQUIERDO"
    public final void mRULE_IZQUIERDO() throws RecognitionException {
        try {
            int _type = RULE_IZQUIERDO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2647:16: ( '(' )
            // InternalLinit.g:2647:18: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IZQUIERDO"

    // $ANTLR start "RULE_DERECHO"
    public final void mRULE_DERECHO() throws RecognitionException {
        try {
            int _type = RULE_DERECHO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2649:14: ( ')' )
            // InternalLinit.g:2649:16: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DERECHO"

    // $ANTLR start "RULE_ENTERO"
    public final void mRULE_ENTERO() throws RecognitionException {
        try {
            int _type = RULE_ENTERO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2651:13: ( RULE_INT )
            // InternalLinit.g:2651:15: RULE_INT
            {
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ENTERO"

    // $ANTLR start "RULE_NREAL"
    public final void mRULE_NREAL() throws RecognitionException {
        try {
            int _type = RULE_NREAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2653:12: ( ( '-' )? ( '0' .. '9' )+ ',' ( '0' .. '9' )+ )
            // InternalLinit.g:2653:14: ( '-' )? ( '0' .. '9' )+ ',' ( '0' .. '9' )+
            {
            // InternalLinit.g:2653:14: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalLinit.g:2653:14: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // InternalLinit.g:2653:19: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLinit.g:2653:20: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            match(','); 
            // InternalLinit.g:2653:35: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLinit.g:2653:36: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NREAL"

    // $ANTLR start "RULE_VERDADERO"
    public final void mRULE_VERDADERO() throws RecognitionException {
        try {
            int _type = RULE_VERDADERO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2655:16: ( 'V' ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'O' | 'o' ) )
            // InternalLinit.g:2655:18: 'V' ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'O' | 'o' )
            {
            match('V'); 
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VERDADERO"

    // $ANTLR start "RULE_FALSO"
    public final void mRULE_FALSO() throws RecognitionException {
        try {
            int _type = RULE_FALSO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2657:12: ( 'F' ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'O' | 'o' ) )
            // InternalLinit.g:2657:14: 'F' ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'O' | 'o' )
            {
            match('F'); 
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FALSO"

    // $ANTLR start "RULE_FRASE"
    public final void mRULE_FRASE() throws RecognitionException {
        try {
            int _type = RULE_FRASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2659:12: ( '\"' ( . )* '\"' )
            // InternalLinit.g:2659:14: '\"' ( . )* '\"'
            {
            match('\"'); 
            // InternalLinit.g:2659:18: ( . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\"') ) {
                    alt8=2;
                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLinit.g:2659:18: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FRASE"

    // $ANTLR start "RULE_AREGLO"
    public final void mRULE_AREGLO() throws RecognitionException {
        try {
            int _type = RULE_AREGLO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2661:13: ( 'A' ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'L' | 'l' ) ( 'O' | 'o' ) )
            // InternalLinit.g:2661:15: 'A' ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'L' | 'l' ) ( 'O' | 'o' )
            {
            match('A'); 
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AREGLO"

    // $ANTLR start "RULE_CUADRADOI"
    public final void mRULE_CUADRADOI() throws RecognitionException {
        try {
            int _type = RULE_CUADRADOI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2663:16: ( '[' )
            // InternalLinit.g:2663:18: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CUADRADOI"

    // $ANTLR start "RULE_CUADRADOD"
    public final void mRULE_CUADRADOD() throws RecognitionException {
        try {
            int _type = RULE_CUADRADOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2665:16: ( ']' )
            // InternalLinit.g:2665:18: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CUADRADOD"

    // $ANTLR start "RULE_SI"
    public final void mRULE_SI() throws RecognitionException {
        try {
            int _type = RULE_SI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2667:9: ( 'S' ( 'I' | 'i' ) )
            // InternalLinit.g:2667:11: 'S' ( 'I' | 'i' )
            {
            match('S'); 
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SI"

    // $ANTLR start "RULE_ES"
    public final void mRULE_ES() throws RecognitionException {
        try {
            int _type = RULE_ES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2669:9: ( 'E' ( 'S' | 's' ) )
            // InternalLinit.g:2669:11: 'E' ( 'S' | 's' )
            {
            match('E'); 
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ES"

    // $ANTLR start "RULE_SINO"
    public final void mRULE_SINO() throws RecognitionException {
        try {
            int _type = RULE_SINO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2671:11: ( 'O' ' ' 'S' ( 'I' | 'i' ) )
            // InternalLinit.g:2671:13: 'O' ' ' 'S' ( 'I' | 'i' )
            {
            match('O'); 
            match(' '); 
            match('S'); 
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SINO"

    // $ANTLR start "RULE_OTROCASO"
    public final void mRULE_OTROCASO() throws RecognitionException {
        try {
            int _type = RULE_OTROCASO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2673:15: ( 'E' ( 'N' | 'n' ) ' ' 'O' ( 'T' | 't' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ' ' 'C' ( 'A' | 'a' ) ( 'S' | 's' ) ( 'O' | 'o' ) )
            // InternalLinit.g:2673:17: 'E' ( 'N' | 'n' ) ' ' 'O' ( 'T' | 't' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ' ' 'C' ( 'A' | 'a' ) ( 'S' | 's' ) ( 'O' | 'o' )
            {
            match('E'); 
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match(' '); 
            match('O'); 
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match(' '); 
            match('C'); 
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OTROCASO"

    // $ANTLR start "RULE_REPETIR"
    public final void mRULE_REPETIR() throws RecognitionException {
        try {
            int _type = RULE_REPETIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2675:14: ( 'R' ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'R' | 'r' ) )
            // InternalLinit.g:2675:16: 'R' ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'R' | 'r' )
            {
            match('R'); 
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REPETIR"

    // $ANTLR start "RULE_MIENTRAS"
    public final void mRULE_MIENTRAS() throws RecognitionException {
        try {
            int _type = RULE_MIENTRAS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2677:15: ( 'M' ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'S' | 's' ) )
            // InternalLinit.g:2677:17: 'M' ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'S' | 's' )
            {
            match('M'); 
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MIENTRAS"

    // $ANTLR start "RULE_SEA"
    public final void mRULE_SEA() throws RecognitionException {
        try {
            int _type = RULE_SEA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2679:10: ( 'S' ( 'E' | 'e' ) ( 'A' | 'a' ) )
            // InternalLinit.g:2679:12: 'S' ( 'E' | 'e' ) ( 'A' | 'a' )
            {
            match('S'); 
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEA"

    // $ANTLR start "RULE_VECES"
    public final void mRULE_VECES() throws RecognitionException {
        try {
            int _type = RULE_VECES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2681:12: ( 'V' ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // InternalLinit.g:2681:14: 'V' ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'S' | 's' )
            {
            match('V'); 
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VECES"

    // $ANTLR start "RULE_FIN"
    public final void mRULE_FIN() throws RecognitionException {
        try {
            int _type = RULE_FIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2683:10: ( 'F' ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // InternalLinit.g:2683:12: 'F' ( 'I' | 'i' ) ( 'N' | 'n' )
            {
            match('F'); 
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FIN"

    // $ANTLR start "RULE_IMPRIMIR"
    public final void mRULE_IMPRIMIR() throws RecognitionException {
        try {
            int _type = RULE_IMPRIMIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2685:15: ( 'I' ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'R' | 'r' ) ( ' ' )+ 'E' ( 'N' | 'n' ) ' ' 'C' ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'A' | 'a' ) )
            // InternalLinit.g:2685:17: 'I' ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'R' | 'r' ) ( ' ' )+ 'E' ( 'N' | 'n' ) ' ' 'C' ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'A' | 'a' )
            {
            match('I'); 
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalLinit.g:2685:91: ( ' ' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLinit.g:2685:91: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            match('E'); 
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match(' '); 
            match('C'); 
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IMPRIMIR"

    // $ANTLR start "RULE_CAPTURAR"
    public final void mRULE_CAPTURAR() throws RecognitionException {
        try {
            int _type = RULE_CAPTURAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2687:15: ( 'C' ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ' ' 'D' ( 'E' | 'e' )+ ' ' 'C' ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'A' | 'a' ) )
            // InternalLinit.g:2687:17: 'C' ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ' ' 'D' ( 'E' | 'e' )+ ' ' 'C' ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ( 'A' | 'a' )
            {
            match('C'); 
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match(' '); 
            match('D'); 
            // InternalLinit.g:2687:99: ( 'E' | 'e' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='E'||LA10_0=='e') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLinit.g:
            	    {
            	    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            match(' '); 
            match('C'); 
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CAPTURAR"

    // $ANTLR start "RULE_IDENTIFICADOR"
    public final void mRULE_IDENTIFICADOR() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFICADOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2689:20: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // InternalLinit.g:2689:22: 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            matchRange('a','z'); 
            // InternalLinit.g:2689:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLinit.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENTIFICADOR"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2691:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalLinit.g:2691:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalLinit.g:2691:11: ( '^' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='^') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalLinit.g:2691:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalLinit.g:2691:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalLinit.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalLinit.g:2693:19: ( ( '0' .. '9' )+ )
            // InternalLinit.g:2693:21: ( '0' .. '9' )+
            {
            // InternalLinit.g:2693:21: ( '0' .. '9' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalLinit.g:2693:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2695:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalLinit.g:2695:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalLinit.g:2695:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\"') ) {
                alt17=1;
            }
            else if ( (LA17_0=='\'') ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalLinit.g:2695:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalLinit.g:2695:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='!')||(LA15_0>='#' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalLinit.g:2695:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLinit.g:2695:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalLinit.g:2695:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalLinit.g:2695:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop16:
                    do {
                        int alt16=3;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='\\') ) {
                            alt16=1;
                        }
                        else if ( ((LA16_0>='\u0000' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFF')) ) {
                            alt16=2;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalLinit.g:2695:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLinit.g:2695:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2697:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalLinit.g:2697:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalLinit.g:2697:24: ( options {greedy=false; } : . )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='*') ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1=='/') ) {
                        alt18=2;
                    }
                    else if ( ((LA18_1>='\u0000' && LA18_1<='.')||(LA18_1>='0' && LA18_1<='\uFFFF')) ) {
                        alt18=1;
                    }


                }
                else if ( ((LA18_0>='\u0000' && LA18_0<=')')||(LA18_0>='+' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalLinit.g:2697:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2699:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalLinit.g:2699:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalLinit.g:2699:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\u0000' && LA19_0<='\t')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalLinit.g:2699:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalLinit.g:2699:40: ( ( '\\r' )? '\\n' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\n'||LA21_0=='\r') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalLinit.g:2699:41: ( '\\r' )? '\\n'
                    {
                    // InternalLinit.g:2699:41: ( '\\r' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='\r') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalLinit.g:2699:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLinit.g:2701:16: ( . )
            // InternalLinit.g:2701:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalLinit.g:1:8: ( T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | RULE_LINE_COMMENT | RULE_WS | RULE_PROCEDIMIENTO | RULE_IMPORTA | RULE_EXPORTA | RULE_VARIABLE | RULE_CONSTANTE | RULE_ENTERA | RULE_REAL | RULE_LOGICA | RULE_CARACTERES | RULE_SIGNOY | RULE_SIGNOO | RULE_MENOR | RULE_SIGNOMENOR | RULE_MENORIGUAL | RULE_SIGNOMENORIGUAL | RULE_MAYOR | RULE_SIGNOMAYOR | RULE_MAYORIGUAL | RULE_SIGNOMAYORIGUAL | RULE_IGUAL | RULE_SIGNOIGUAL | RULE_DIFERENTE | RULE_SIGNODIFERENTE | RULE_SUMA | RULE_RESTA | RULE_MULTIPLICACION | RULE_DIVISION | RULE_MODULO | RULE_POTENCIA | RULE_NO | RULE_IZQUIERDO | RULE_DERECHO | RULE_ENTERO | RULE_NREAL | RULE_VERDADERO | RULE_FALSO | RULE_FRASE | RULE_AREGLO | RULE_CUADRADOI | RULE_CUADRADOD | RULE_SI | RULE_ES | RULE_SINO | RULE_OTROCASO | RULE_REPETIR | RULE_MIENTRAS | RULE_SEA | RULE_VECES | RULE_FIN | RULE_IMPRIMIR | RULE_CAPTURAR | RULE_IDENTIFICADOR | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER )
        int alt22=91;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // InternalLinit.g:1:10: T__64
                {
                mT__64(); 

                }
                break;
            case 2 :
                // InternalLinit.g:1:16: T__65
                {
                mT__65(); 

                }
                break;
            case 3 :
                // InternalLinit.g:1:22: T__66
                {
                mT__66(); 

                }
                break;
            case 4 :
                // InternalLinit.g:1:28: T__67
                {
                mT__67(); 

                }
                break;
            case 5 :
                // InternalLinit.g:1:34: T__68
                {
                mT__68(); 

                }
                break;
            case 6 :
                // InternalLinit.g:1:40: T__69
                {
                mT__69(); 

                }
                break;
            case 7 :
                // InternalLinit.g:1:46: T__70
                {
                mT__70(); 

                }
                break;
            case 8 :
                // InternalLinit.g:1:52: T__71
                {
                mT__71(); 

                }
                break;
            case 9 :
                // InternalLinit.g:1:58: T__72
                {
                mT__72(); 

                }
                break;
            case 10 :
                // InternalLinit.g:1:64: T__73
                {
                mT__73(); 

                }
                break;
            case 11 :
                // InternalLinit.g:1:70: T__74
                {
                mT__74(); 

                }
                break;
            case 12 :
                // InternalLinit.g:1:76: T__75
                {
                mT__75(); 

                }
                break;
            case 13 :
                // InternalLinit.g:1:82: T__76
                {
                mT__76(); 

                }
                break;
            case 14 :
                // InternalLinit.g:1:88: T__77
                {
                mT__77(); 

                }
                break;
            case 15 :
                // InternalLinit.g:1:94: T__78
                {
                mT__78(); 

                }
                break;
            case 16 :
                // InternalLinit.g:1:100: T__79
                {
                mT__79(); 

                }
                break;
            case 17 :
                // InternalLinit.g:1:106: T__80
                {
                mT__80(); 

                }
                break;
            case 18 :
                // InternalLinit.g:1:112: T__81
                {
                mT__81(); 

                }
                break;
            case 19 :
                // InternalLinit.g:1:118: T__82
                {
                mT__82(); 

                }
                break;
            case 20 :
                // InternalLinit.g:1:124: T__83
                {
                mT__83(); 

                }
                break;
            case 21 :
                // InternalLinit.g:1:130: T__84
                {
                mT__84(); 

                }
                break;
            case 22 :
                // InternalLinit.g:1:136: T__85
                {
                mT__85(); 

                }
                break;
            case 23 :
                // InternalLinit.g:1:142: T__86
                {
                mT__86(); 

                }
                break;
            case 24 :
                // InternalLinit.g:1:148: T__87
                {
                mT__87(); 

                }
                break;
            case 25 :
                // InternalLinit.g:1:154: T__88
                {
                mT__88(); 

                }
                break;
            case 26 :
                // InternalLinit.g:1:160: T__89
                {
                mT__89(); 

                }
                break;
            case 27 :
                // InternalLinit.g:1:166: T__90
                {
                mT__90(); 

                }
                break;
            case 28 :
                // InternalLinit.g:1:172: T__91
                {
                mT__91(); 

                }
                break;
            case 29 :
                // InternalLinit.g:1:178: T__92
                {
                mT__92(); 

                }
                break;
            case 30 :
                // InternalLinit.g:1:184: T__93
                {
                mT__93(); 

                }
                break;
            case 31 :
                // InternalLinit.g:1:190: T__94
                {
                mT__94(); 

                }
                break;
            case 32 :
                // InternalLinit.g:1:196: T__95
                {
                mT__95(); 

                }
                break;
            case 33 :
                // InternalLinit.g:1:202: RULE_LINE_COMMENT
                {
                mRULE_LINE_COMMENT(); 

                }
                break;
            case 34 :
                // InternalLinit.g:1:220: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 35 :
                // InternalLinit.g:1:228: RULE_PROCEDIMIENTO
                {
                mRULE_PROCEDIMIENTO(); 

                }
                break;
            case 36 :
                // InternalLinit.g:1:247: RULE_IMPORTA
                {
                mRULE_IMPORTA(); 

                }
                break;
            case 37 :
                // InternalLinit.g:1:260: RULE_EXPORTA
                {
                mRULE_EXPORTA(); 

                }
                break;
            case 38 :
                // InternalLinit.g:1:273: RULE_VARIABLE
                {
                mRULE_VARIABLE(); 

                }
                break;
            case 39 :
                // InternalLinit.g:1:287: RULE_CONSTANTE
                {
                mRULE_CONSTANTE(); 

                }
                break;
            case 40 :
                // InternalLinit.g:1:302: RULE_ENTERA
                {
                mRULE_ENTERA(); 

                }
                break;
            case 41 :
                // InternalLinit.g:1:314: RULE_REAL
                {
                mRULE_REAL(); 

                }
                break;
            case 42 :
                // InternalLinit.g:1:324: RULE_LOGICA
                {
                mRULE_LOGICA(); 

                }
                break;
            case 43 :
                // InternalLinit.g:1:336: RULE_CARACTERES
                {
                mRULE_CARACTERES(); 

                }
                break;
            case 44 :
                // InternalLinit.g:1:352: RULE_SIGNOY
                {
                mRULE_SIGNOY(); 

                }
                break;
            case 45 :
                // InternalLinit.g:1:364: RULE_SIGNOO
                {
                mRULE_SIGNOO(); 

                }
                break;
            case 46 :
                // InternalLinit.g:1:376: RULE_MENOR
                {
                mRULE_MENOR(); 

                }
                break;
            case 47 :
                // InternalLinit.g:1:387: RULE_SIGNOMENOR
                {
                mRULE_SIGNOMENOR(); 

                }
                break;
            case 48 :
                // InternalLinit.g:1:403: RULE_MENORIGUAL
                {
                mRULE_MENORIGUAL(); 

                }
                break;
            case 49 :
                // InternalLinit.g:1:419: RULE_SIGNOMENORIGUAL
                {
                mRULE_SIGNOMENORIGUAL(); 

                }
                break;
            case 50 :
                // InternalLinit.g:1:440: RULE_MAYOR
                {
                mRULE_MAYOR(); 

                }
                break;
            case 51 :
                // InternalLinit.g:1:451: RULE_SIGNOMAYOR
                {
                mRULE_SIGNOMAYOR(); 

                }
                break;
            case 52 :
                // InternalLinit.g:1:467: RULE_MAYORIGUAL
                {
                mRULE_MAYORIGUAL(); 

                }
                break;
            case 53 :
                // InternalLinit.g:1:483: RULE_SIGNOMAYORIGUAL
                {
                mRULE_SIGNOMAYORIGUAL(); 

                }
                break;
            case 54 :
                // InternalLinit.g:1:504: RULE_IGUAL
                {
                mRULE_IGUAL(); 

                }
                break;
            case 55 :
                // InternalLinit.g:1:515: RULE_SIGNOIGUAL
                {
                mRULE_SIGNOIGUAL(); 

                }
                break;
            case 56 :
                // InternalLinit.g:1:531: RULE_DIFERENTE
                {
                mRULE_DIFERENTE(); 

                }
                break;
            case 57 :
                // InternalLinit.g:1:546: RULE_SIGNODIFERENTE
                {
                mRULE_SIGNODIFERENTE(); 

                }
                break;
            case 58 :
                // InternalLinit.g:1:566: RULE_SUMA
                {
                mRULE_SUMA(); 

                }
                break;
            case 59 :
                // InternalLinit.g:1:576: RULE_RESTA
                {
                mRULE_RESTA(); 

                }
                break;
            case 60 :
                // InternalLinit.g:1:587: RULE_MULTIPLICACION
                {
                mRULE_MULTIPLICACION(); 

                }
                break;
            case 61 :
                // InternalLinit.g:1:607: RULE_DIVISION
                {
                mRULE_DIVISION(); 

                }
                break;
            case 62 :
                // InternalLinit.g:1:621: RULE_MODULO
                {
                mRULE_MODULO(); 

                }
                break;
            case 63 :
                // InternalLinit.g:1:633: RULE_POTENCIA
                {
                mRULE_POTENCIA(); 

                }
                break;
            case 64 :
                // InternalLinit.g:1:647: RULE_NO
                {
                mRULE_NO(); 

                }
                break;
            case 65 :
                // InternalLinit.g:1:655: RULE_IZQUIERDO
                {
                mRULE_IZQUIERDO(); 

                }
                break;
            case 66 :
                // InternalLinit.g:1:670: RULE_DERECHO
                {
                mRULE_DERECHO(); 

                }
                break;
            case 67 :
                // InternalLinit.g:1:683: RULE_ENTERO
                {
                mRULE_ENTERO(); 

                }
                break;
            case 68 :
                // InternalLinit.g:1:695: RULE_NREAL
                {
                mRULE_NREAL(); 

                }
                break;
            case 69 :
                // InternalLinit.g:1:706: RULE_VERDADERO
                {
                mRULE_VERDADERO(); 

                }
                break;
            case 70 :
                // InternalLinit.g:1:721: RULE_FALSO
                {
                mRULE_FALSO(); 

                }
                break;
            case 71 :
                // InternalLinit.g:1:732: RULE_FRASE
                {
                mRULE_FRASE(); 

                }
                break;
            case 72 :
                // InternalLinit.g:1:743: RULE_AREGLO
                {
                mRULE_AREGLO(); 

                }
                break;
            case 73 :
                // InternalLinit.g:1:755: RULE_CUADRADOI
                {
                mRULE_CUADRADOI(); 

                }
                break;
            case 74 :
                // InternalLinit.g:1:770: RULE_CUADRADOD
                {
                mRULE_CUADRADOD(); 

                }
                break;
            case 75 :
                // InternalLinit.g:1:785: RULE_SI
                {
                mRULE_SI(); 

                }
                break;
            case 76 :
                // InternalLinit.g:1:793: RULE_ES
                {
                mRULE_ES(); 

                }
                break;
            case 77 :
                // InternalLinit.g:1:801: RULE_SINO
                {
                mRULE_SINO(); 

                }
                break;
            case 78 :
                // InternalLinit.g:1:811: RULE_OTROCASO
                {
                mRULE_OTROCASO(); 

                }
                break;
            case 79 :
                // InternalLinit.g:1:825: RULE_REPETIR
                {
                mRULE_REPETIR(); 

                }
                break;
            case 80 :
                // InternalLinit.g:1:838: RULE_MIENTRAS
                {
                mRULE_MIENTRAS(); 

                }
                break;
            case 81 :
                // InternalLinit.g:1:852: RULE_SEA
                {
                mRULE_SEA(); 

                }
                break;
            case 82 :
                // InternalLinit.g:1:861: RULE_VECES
                {
                mRULE_VECES(); 

                }
                break;
            case 83 :
                // InternalLinit.g:1:872: RULE_FIN
                {
                mRULE_FIN(); 

                }
                break;
            case 84 :
                // InternalLinit.g:1:881: RULE_IMPRIMIR
                {
                mRULE_IMPRIMIR(); 

                }
                break;
            case 85 :
                // InternalLinit.g:1:895: RULE_CAPTURAR
                {
                mRULE_CAPTURAR(); 

                }
                break;
            case 86 :
                // InternalLinit.g:1:909: RULE_IDENTIFICADOR
                {
                mRULE_IDENTIFICADOR(); 

                }
                break;
            case 87 :
                // InternalLinit.g:1:928: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 88 :
                // InternalLinit.g:1:936: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 89 :
                // InternalLinit.g:1:948: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 90 :
                // InternalLinit.g:1:964: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 91 :
                // InternalLinit.g:1:980: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\1\uffff\1\51\1\uffff\1\51\1\uffff\3\51\1\uffff\7\51\1\117\1\121\1\51\1\126\1\uffff\1\134\1\46\1\137\2\uffff\1\142\1\145\2\uffff\1\151\1\46\2\uffff\1\157\1\46\1\uffff\1\46\1\uffff\2\51\2\uffff\3\51\1\uffff\10\51\1\u0084\2\51\1\u0084\1\uffff\6\51\1\u008d\1\51\1\u0090\12\51\3\uffff\1\u009e\1\51\24\uffff\1\151\7\uffff\1\157\1\uffff\2\51\1\u00a4\1\u00a5\13\51\1\uffff\1\51\4\uffff\6\51\1\uffff\1\u00c1\1\u00c2\1\uffff\11\51\5\uffff\1\u00a1\2\uffff\2\51\2\uffff\16\51\7\uffff\6\51\2\uffff\2\51\1\u00ee\1\u00ef\5\51\3\uffff\2\51\1\u00f9\6\51\1\u0100\1\u0101\5\51\7\uffff\10\51\2\uffff\5\51\2\uffff\2\51\1\uffff\6\51\2\uffff\3\51\1\u0127\1\u0128\7\uffff\12\51\1\u013a\1\u013b\1\u013c\1\uffff\2\51\1\u0140\1\u0141\5\51\1\u0147\1\u0148\11\uffff\4\51\1\u0154\1\u0155\1\u0156\1\u0157\2\51\4\uffff\2\51\2\uffff\2\51\1\u015f\1\u0160\1\51\4\uffff\2\u0165\2\u0168\1\uffff\4\51\4\uffff\1\u016f\1\u0170\1\uffff\2\51\4\uffff\1\u0175\11\uffff\1\u017d\1\u017e\5\uffff\2\51\15\uffff\2\51\10\uffff\2\51\7\uffff\1\u019d\1\u019e\22\uffff\1\u00ba\2\uffff\1\u0166\1\u0169\14\uffff";
    static final String DFA22_eofS =
        "\u01b9\uffff";
    static final String DFA22_minS =
        "\1\0\1\122\1\uffff\1\101\1\uffff\1\115\1\101\1\116\1\uffff\1\101\1\122\2\105\1\111\1\117\1\105\1\60\1\40\1\117\1\75\1\uffff\1\52\1\57\1\75\2\uffff\1\60\1\52\2\uffff\1\54\1\0\2\uffff\1\60\1\101\1\uffff\1\0\1\uffff\2\117\2\uffff\1\116\1\114\1\116\1\uffff\2\120\1\122\1\103\1\122\1\103\1\120\2\40\1\120\2\40\1\uffff\1\116\1\120\1\116\1\120\2\122\1\60\1\101\1\60\3\101\1\105\1\104\1\105\2\107\2\40\1\uffff\1\123\1\uffff\2\40\24\uffff\1\54\1\uffff\2\0\4\uffff\1\60\1\uffff\2\103\2\60\1\123\2\117\2\111\1\105\1\104\1\105\2\117\1\105\1\117\1\105\1\104\2\uffff\1\104\2\123\2\124\2\105\1\uffff\2\60\1\uffff\1\105\2\114\1\105\2\116\1\125\2\111\1\103\1\uffff\1\111\2\uffff\2\0\1\uffff\2\105\2\uffff\1\117\1\122\1\111\1\122\1\111\2\101\2\123\1\101\4\122\1\124\1\107\1\101\1\111\1\101\2\uffff\2\124\2\125\2\107\2\uffff\2\124\2\60\2\124\1\114\2\103\1\101\2\uffff\2\104\1\60\2\124\2\115\2\102\2\60\1\104\2\124\2\101\1\122\1\125\1\116\1\131\1\116\1\131\1\106\2\101\2\122\2\114\2\111\2\uffff\2\122\1\117\2\101\1\122\1\uffff\2\111\1\uffff\2\101\2\111\2\114\2\uffff\1\105\2\101\2\60\1\117\1\101\4\117\1\105\2\116\2\101\2\117\2\122\2\101\3\60\1\101\2\115\2\60\2\122\2\105\1\122\2\60\2\uffff\1\40\1\114\5\122\2\124\2\122\4\60\2\123\3\uffff\1\103\2\111\2\uffff\2\40\2\60\1\117\2\uffff\1\103\5\40\3\105\2\40\4\uffff\2\60\1\124\2\105\1\40\3\uffff\1\60\3\101\2\uffff\1\101\2\uffff\1\116\2\60\1\104\3\uffff\1\105\3\116\1\uffff\1\123\2\uffff\1\40\1\uffff\1\40\1\124\2\uffff\1\105\1\122\2\124\1\40\1\117\1\uffff\2\111\1\105\1\40\1\105\2\117\1\103\1\uffff\2\107\1\40\1\103\1\123\2\60\1\117\1\uffff\2\125\1\104\1\117\3\uffff\1\116\2\101\1\105\1\116\1\uffff\1\123\2\114\1\40\1\123\1\117\2\40\1\uffff\1\117\1\114\2\uffff\1\114\2\101\4\uffff";
    static final String DFA22_maxS =
        "\1\uffff\1\162\1\uffff\1\151\1\uffff\1\155\1\145\1\170\1\uffff\1\157\1\162\1\151\1\145\2\157\1\145\2\172\1\157\1\76\1\uffff\1\134\1\57\1\75\2\uffff\1\71\1\52\2\uffff\1\71\1\uffff\2\uffff\2\172\1\uffff\1\uffff\1\uffff\2\157\2\uffff\1\156\1\154\1\156\1\uffff\2\160\4\162\1\160\1\164\1\172\1\160\1\164\1\172\1\uffff\1\156\1\160\1\156\1\160\2\162\1\172\1\141\1\172\1\141\2\160\1\145\1\144\1\145\2\147\2\40\1\uffff\1\123\1\uffff\1\172\1\40\24\uffff\1\71\1\uffff\2\uffff\4\uffff\1\172\1\uffff\2\143\2\172\1\163\2\162\2\151\1\145\1\144\1\145\2\157\1\145\1\117\1\145\1\115\2\uffff\1\115\2\163\2\164\2\145\1\uffff\2\172\1\uffff\1\145\2\154\1\145\2\156\1\165\2\151\1\103\1\uffff\1\151\2\uffff\2\uffff\1\uffff\2\145\2\uffff\1\157\1\162\1\151\1\162\1\151\2\141\2\163\1\141\4\162\1\164\1\147\1\145\1\151\1\145\2\uffff\2\164\2\165\2\147\2\uffff\2\164\2\172\2\164\1\154\2\143\1\141\2\uffff\2\144\1\172\2\164\2\155\2\142\2\172\1\144\2\164\2\141\1\162\1\165\1\156\1\171\1\156\1\171\1\146\2\141\2\162\2\154\2\151\2\uffff\2\162\1\157\2\141\1\162\1\uffff\2\151\1\uffff\2\141\2\151\2\154\2\uffff\1\145\2\141\2\172\1\157\1\141\4\157\1\145\2\156\2\141\2\157\2\162\2\141\3\172\1\141\2\155\2\172\2\162\2\145\1\162\2\172\2\uffff\1\40\1\154\5\162\2\164\2\162\4\172\2\163\3\uffff\1\143\2\151\2\uffff\2\40\2\172\1\157\2\uffff\1\103\5\40\3\145\2\40\4\uffff\2\172\1\164\2\145\1\105\3\uffff\1\172\1\141\1\101\1\117\2\uffff\1\117\2\uffff\1\156\2\172\1\104\3\uffff\1\145\3\156\1\uffff\1\163\2\uffff\1\40\1\uffff\1\40\1\164\2\uffff\1\145\1\162\2\164\1\40\1\157\1\uffff\2\111\3\145\2\157\1\103\1\uffff\2\147\1\40\1\103\1\163\2\172\1\157\1\uffff\2\165\1\104\1\157\3\uffff\1\156\2\141\1\145\1\156\1\uffff\1\163\2\154\1\40\1\163\1\157\2\40\1\uffff\1\157\1\154\2\uffff\1\154\2\141\4\uffff";
    static final String DFA22_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\3\uffff\1\10\13\uffff\1\42\3\uffff\1\67\1\72\2\uffff\1\101\1\102\2\uffff\1\111\1\112\2\uffff\1\127\1\uffff\1\133\2\uffff\1\127\1\2\3\uffff\1\4\14\uffff\1\10\23\uffff\1\27\1\uffff\1\30\2\uffff\1\41\1\65\1\63\1\42\1\54\1\71\1\131\1\132\1\75\1\55\1\61\1\57\1\67\1\72\1\73\1\104\1\77\1\74\1\101\1\102\1\uffff\1\103\2\uffff\1\107\1\111\1\112\1\126\1\uffff\1\130\22\uffff\1\114\1\116\7\uffff\1\13\2\uffff\1\113\12\uffff\1\53\1\uffff\1\100\1\36\2\uffff\1\107\2\uffff\1\3\1\123\23\uffff\1\66\1\70\6\uffff\1\17\1\121\12\uffff\1\37\1\115\37\uffff\1\23\1\51\6\uffff\1\37\2\uffff\1\106\6\uffff\1\15\1\122\45\uffff\1\22\1\50\21\uffff\1\76\1\24\1\52\3\uffff\1\5\1\44\5\uffff\1\7\1\45\13\uffff\1\12\1\110\1\14\1\117\6\uffff\1\124\1\6\1\46\4\uffff\1\56\1\60\1\uffff\1\62\1\64\4\uffff\1\125\1\16\1\120\4\uffff\1\105\1\uffff\1\26\1\31\1\uffff\1\33\2\uffff\1\11\1\47\6\uffff\1\26\10\uffff\1\40\10\uffff\1\40\4\uffff\1\25\1\1\1\43\5\uffff\1\25\10\uffff\1\35\2\uffff\1\32\1\34\3\uffff\1\20\1\21\1\20\1\21";
    static final String DFA22_specialS =
        "\1\6\36\uffff\1\3\5\uffff\1\4\104\uffff\1\2\1\1\63\uffff\1\5\1\0\u0118\uffff}>";
    static final String[] DFA22_transitionS = {
            "\11\46\2\24\2\46\1\24\22\46\1\24\1\46\1\37\4\46\1\45\1\34\1\35\1\33\1\31\1\46\1\32\1\4\1\25\12\36\1\2\1\10\1\27\1\30\1\23\2\46\1\12\1\44\1\11\1\17\1\7\1\3\2\44\1\5\2\44\1\16\1\15\1\22\1\21\1\1\1\44\1\14\1\13\2\44\1\6\2\44\1\20\1\44\1\40\1\26\1\41\1\43\1\44\1\46\32\42\uff85\46",
            "\1\47\37\uffff\1\50",
            "",
            "\1\54\7\uffff\1\53\27\uffff\1\54\7\uffff\1\55",
            "",
            "\1\57\37\uffff\1\60",
            "\1\61\3\uffff\1\62\33\uffff\1\63\3\uffff\1\64",
            "\1\66\4\uffff\1\67\4\uffff\1\65\25\uffff\1\71\4\uffff\1\72\4\uffff\1\70",
            "",
            "\1\75\15\uffff\1\74\21\uffff\1\77\15\uffff\1\76",
            "\1\100\37\uffff\1\101",
            "\1\103\3\uffff\1\102\33\uffff\1\105\3\uffff\1\104",
            "\1\106\37\uffff\1\107",
            "\1\110\5\uffff\1\111\31\uffff\1\112\5\uffff\1\111",
            "\1\113\37\uffff\1\114",
            "\1\115\37\uffff\1\116",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\120\17\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\122\37\uffff\1\123",
            "\1\125\1\124",
            "",
            "\1\132\4\uffff\1\133\15\uffff\1\131\36\uffff\1\130",
            "\1\135",
            "\1\136",
            "",
            "",
            "\12\143",
            "\1\144",
            "",
            "",
            "\1\143\3\uffff\12\150",
            "\42\153\1\154\71\153\1\152\uffa3\153",
            "",
            "",
            "\12\160\7\uffff\32\160\4\uffff\1\160\1\uffff\32\160",
            "\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\0\161",
            "",
            "\1\162\37\uffff\1\163",
            "\1\163\37\uffff\1\163",
            "",
            "",
            "\1\164\37\uffff\1\165",
            "\1\166\37\uffff\1\166",
            "\1\165\37\uffff\1\165",
            "",
            "\1\167\37\uffff\1\170",
            "\1\170\37\uffff\1\170",
            "\1\171\37\uffff\1\172",
            "\1\173\16\uffff\1\174\20\uffff\1\175\16\uffff\1\174",
            "\1\172\37\uffff\1\172",
            "\1\175\16\uffff\1\174\20\uffff\1\175\16\uffff\1\174",
            "\1\176\37\uffff\1\177",
            "\1\u0081\63\uffff\1\u0080\37\uffff\1\u0082",
            "\1\u0083\17\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\177\37\uffff\1\177",
            "\1\u0085\63\uffff\1\u0082\37\uffff\1\u0082",
            "\1\u0086\17\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u0087\37\uffff\1\u0088",
            "\1\u0089\37\uffff\1\u008a",
            "\1\u0088\37\uffff\1\u0088",
            "\1\u008a\37\uffff\1\u008a",
            "\1\u008b\37\uffff\1\u008c",
            "\1\u008c\37\uffff\1\u008c",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u008e\37\uffff\1\u008f",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u008f\37\uffff\1\u008f",
            "\1\u0092\16\uffff\1\u0091\20\uffff\1\u0093\16\uffff\1\u0094",
            "\1\u0093\16\uffff\1\u0094\20\uffff\1\u0093\16\uffff\1\u0094",
            "\1\u0095\37\uffff\1\u0096",
            "\1\u0097\37\uffff\1\u0097",
            "\1\u0096\37\uffff\1\u0096",
            "\1\u0098\37\uffff\1\u0099",
            "\1\u0099\37\uffff\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "",
            "\1\u009c",
            "",
            "\1\u009d\17\uffff\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u009d",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\143\3\uffff\12\150",
            "",
            "\42\u00a0\1\u009f\uffdd\u00a0",
            "\42\153\1\154\71\153\1\152\uffa3\153",
            "",
            "",
            "",
            "",
            "\12\160\7\uffff\32\160\4\uffff\1\160\1\uffff\32\160",
            "",
            "\1\u00a2\37\uffff\1\u00a3",
            "\1\u00a3\37\uffff\1\u00a3",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00a6\37\uffff\1\u00a6",
            "\1\u00a7\2\uffff\1\u00a8\34\uffff\1\u00a9\2\uffff\1\u00aa",
            "\1\u00a9\2\uffff\1\u00aa\34\uffff\1\u00a9\2\uffff\1\u00aa",
            "\1\u00ab\37\uffff\1\u00ac",
            "\1\u00ac\37\uffff\1\u00ac",
            "\1\u00ad\37\uffff\1\u00ae",
            "\1\u00af\37\uffff\1\u00af",
            "\1\u00ae\37\uffff\1\u00ae",
            "\1\u00b0\37\uffff\1\u00b1",
            "\1\u00b1\37\uffff\1\u00b1",
            "\1\u00b2\37\uffff\1\u00b3",
            "\1\u00b4",
            "\1\u00b3\37\uffff\1\u00b3",
            "\1\u00b7\4\uffff\1\u00b5\3\uffff\1\u00b6",
            "",
            "",
            "\1\u00ba\4\uffff\1\u00b9\3\uffff\1\u00b8",
            "\1\u00bb\37\uffff\1\u00bc",
            "\1\u00bc\37\uffff\1\u00bc",
            "\1\u00bd\37\uffff\1\u00be",
            "\1\u00be\37\uffff\1\u00be",
            "\1\u00bf\37\uffff\1\u00c0",
            "\1\u00c0\37\uffff\1\u00c0",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u00c3\37\uffff\1\u00c4",
            "\1\u00c5\37\uffff\1\u00c6",
            "\1\u00c6\37\uffff\1\u00c6",
            "\1\u00c4\37\uffff\1\u00c4",
            "\1\u00c7\37\uffff\1\u00c8",
            "\1\u00c8\37\uffff\1\u00c8",
            "\1\u00c9\37\uffff\1\u00c9",
            "\1\u00ca\37\uffff\1\u00cb",
            "\1\u00cb\37\uffff\1\u00cb",
            "\1\u00cc",
            "",
            "\1\u00cd\37\uffff\1\u00ce",
            "",
            "",
            "\42\153\1\154\71\153\1\152\uffa3\153",
            "\42\153\1\154\71\153\1\152\uffa3\153",
            "",
            "\1\u00cf\37\uffff\1\u00d0",
            "\1\u00d0\37\uffff\1\u00d0",
            "",
            "",
            "\1\u00d1\37\uffff\1\u00d1",
            "\1\u00d2\37\uffff\1\u00d3",
            "\1\u00d4\37\uffff\1\u00d5",
            "\1\u00d3\37\uffff\1\u00d3",
            "\1\u00d5\37\uffff\1\u00d5",
            "\1\u00d6\37\uffff\1\u00d7",
            "\1\u00d7\37\uffff\1\u00d7",
            "\1\u00d8\37\uffff\1\u00d9",
            "\1\u00d9\37\uffff\1\u00d9",
            "\1\u00da\37\uffff\1\u00da",
            "\1\u00db\37\uffff\1\u00dc",
            "\1\u00dc\37\uffff\1\u00dc",
            "\1\u00dd\37\uffff\1\u00de",
            "\1\u00de\37\uffff\1\u00de",
            "\1\u00df\37\uffff\1\u0085",
            "\1\u00e0\37\uffff\1\u00b9",
            "\1\u00e2\3\uffff\1\u00e1\33\uffff\1\u00e4\3\uffff\1\u00e3",
            "\1\u00e5\37\uffff\1\u00ba",
            "\1\u00e4\3\uffff\1\u00e3\33\uffff\1\u00e4\3\uffff\1\u00e3",
            "",
            "",
            "\1\u00e6\37\uffff\1\u00e7",
            "\1\u00e7\37\uffff\1\u00e7",
            "\1\u00e8\37\uffff\1\u00e9",
            "\1\u00e9\37\uffff\1\u00e9",
            "\1\u00ea\37\uffff\1\u00eb",
            "\1\u00eb\37\uffff\1\u00eb",
            "",
            "",
            "\1\u00ec\37\uffff\1\u00ed",
            "\1\u00ed\37\uffff\1\u00ed",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00f0\37\uffff\1\u00f1",
            "\1\u00f1\37\uffff\1\u00f1",
            "\1\u00f2\37\uffff\1\u00f2",
            "\1\u00f3\37\uffff\1\u00f4",
            "\1\u00f4\37\uffff\1\u00f4",
            "\1\u00f5\37\uffff\1\u009b",
            "",
            "",
            "\1\u00f7\37\uffff\1\u00f8",
            "\1\u00f8\37\uffff\1\u00f8",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00fa\37\uffff\1\u00fb",
            "\1\u00fb\37\uffff\1\u00fb",
            "\1\u00fc\37\uffff\1\u00fd",
            "\1\u00fd\37\uffff\1\u00fd",
            "\1\u00fe\37\uffff\1\u00ff",
            "\1\u00ff\37\uffff\1\u00ff",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0102\37\uffff\1\u0102",
            "\1\u0103\37\uffff\1\u0104",
            "\1\u0104\37\uffff\1\u0104",
            "\1\u0105\37\uffff\1\u0106",
            "\1\u0106\37\uffff\1\u0106",
            "\1\u0107\37\uffff\1\u0085",
            "\1\u0108\37\uffff\1\u00b9",
            "\1\u0109\37\uffff\1\u010a",
            "\1\u010b\37\uffff\1\u010c",
            "\1\u010a\37\uffff\1\u010a",
            "\1\u010c\37\uffff\1\u010c",
            "\1\u010d\37\uffff\1\u00ba",
            "\1\u010e\37\uffff\1\u010f",
            "\1\u010f\37\uffff\1\u010f",
            "\1\u0110\37\uffff\1\u0111",
            "\1\u0111\37\uffff\1\u0111",
            "\1\u0112\37\uffff\1\u0113",
            "\1\u0113\37\uffff\1\u0113",
            "\1\u0114\37\uffff\1\u0115",
            "\1\u0115\37\uffff\1\u0115",
            "",
            "",
            "\1\u0116\37\uffff\1\u0117",
            "\1\u0117\37\uffff\1\u0117",
            "\1\u0118\37\uffff\1\u0118",
            "\1\u0119\37\uffff\1\u011a",
            "\1\u011a\37\uffff\1\u011a",
            "\1\u011b\37\uffff\1\u009b",
            "",
            "\1\u011c\37\uffff\1\u011d",
            "\1\u011d\37\uffff\1\u011d",
            "",
            "\1\u011e\37\uffff\1\u011f",
            "\1\u011f\37\uffff\1\u011f",
            "\1\u0120\37\uffff\1\u0121",
            "\1\u0121\37\uffff\1\u0121",
            "\1\u0122\37\uffff\1\u0123",
            "\1\u0123\37\uffff\1\u0123",
            "",
            "",
            "\1\u0124\37\uffff\1\u0124",
            "\1\u0125\37\uffff\1\u0126",
            "\1\u0126\37\uffff\1\u0126",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0129\37\uffff\1\u0085",
            "\1\u012a\37\uffff\1\u00b9",
            "\1\u012b\37\uffff\1\u012c",
            "\1\u012c\37\uffff\1\u012c",
            "\1\u012d\37\uffff\1\u012e",
            "\1\u012e\37\uffff\1\u012e",
            "\1\u012f\37\uffff\1\u00ba",
            "\1\u0130\37\uffff\1\u0131",
            "\1\u0131\37\uffff\1\u0131",
            "\1\u0132\37\uffff\1\u0133",
            "\1\u0133\37\uffff\1\u0133",
            "\1\u0134\37\uffff\1\u0135",
            "\1\u0135\37\uffff\1\u0135",
            "\1\u0136\37\uffff\1\u0137",
            "\1\u0137\37\uffff\1\u0137",
            "\1\u0138\37\uffff\1\u0139",
            "\1\u0139\37\uffff\1\u0139",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u013d\37\uffff\1\u009b",
            "\1\u013e\37\uffff\1\u013f",
            "\1\u013f\37\uffff\1\u013f",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0142\37\uffff\1\u0143",
            "\1\u0143\37\uffff\1\u0143",
            "\1\u0144\37\uffff\1\u0145",
            "\1\u0145\37\uffff\1\u0145",
            "\1\u0146\37\uffff\1\u0146",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "\1\u0149",
            "\1\u014a\37\uffff\1\u00b9",
            "\1\u014b\37\uffff\1\u014c",
            "\1\u014c\37\uffff\1\u014c",
            "\1\u014d\37\uffff\1\u014e",
            "\1\u014e\37\uffff\1\u014e",
            "\1\u014f\37\uffff\1\u00ba",
            "\1\u0150\37\uffff\1\u0151",
            "\1\u0151\37\uffff\1\u0151",
            "\1\u0152\37\uffff\1\u0153",
            "\1\u0153\37\uffff\1\u0153",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0158\37\uffff\1\u0159",
            "\1\u0159\37\uffff\1\u0159",
            "",
            "",
            "",
            "\1\u015a\37\uffff\1\u009b",
            "\1\u015b\37\uffff\1\u015c",
            "\1\u015c\37\uffff\1\u015c",
            "",
            "",
            "\1\u015d",
            "\1\u015e",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0161\37\uffff\1\u0161",
            "",
            "",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0166",
            "\1\u0167",
            "\1\u0169",
            "\1\u016a\37\uffff\1\u00ba",
            "\1\u016b\37\uffff\1\u016c",
            "\1\u016c\37\uffff\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0171\37\uffff\1\u009b",
            "\1\u0172\37\uffff\1\u0173",
            "\1\u0173\37\uffff\1\u0173",
            "\1\u015e\44\uffff\1\u0174",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0176\37\uffff\1\u0085",
            "\1\u0177",
            "\1\u0178\15\uffff\1\u0179",
            "",
            "",
            "\1\u017a\15\uffff\1\u017b",
            "",
            "",
            "\1\u017c\37\uffff\1\u00ba",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u017f",
            "",
            "",
            "",
            "\1\u0180\37\uffff\1\u009b",
            "\1\u0181\37\uffff\1\u0182",
            "\1\u0182\37\uffff\1\u0182",
            "\1\u0183\37\uffff\1\u015e",
            "",
            "\1\u0184\37\uffff\1\u0085",
            "",
            "",
            "\1\u0186",
            "",
            "\1\u0187",
            "\1\u0188\37\uffff\1\u00ba",
            "",
            "",
            "\1\u0189\37\uffff\1\u016e",
            "\1\u018a\37\uffff\1\u009b",
            "\1\u018b\37\uffff\1\u018c",
            "\1\u018c\37\uffff\1\u018c",
            "\1\u018d",
            "\1\u018e\37\uffff\1\u0085",
            "",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191\37\uffff\1\u00ba",
            "\1\u0192\44\uffff\1\u016e\37\uffff\1\u016e",
            "\1\u0193\37\uffff\1\u009b",
            "\1\u0194\37\uffff\1\u0195",
            "\1\u0195\37\uffff\1\u0195",
            "\1\u0196",
            "",
            "\1\u0198\37\uffff\1\u0166",
            "\1\u0199\37\uffff\1\u0169",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c\37\uffff\1\u009b",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u019f\37\uffff\1\u015e",
            "",
            "\1\u01a0\37\uffff\1\u0166",
            "\1\u01a1\37\uffff\1\u0169",
            "\1\u01a2",
            "\1\u01a3\37\uffff\1\u016e",
            "",
            "",
            "",
            "\1\u01a5\37\uffff\1\u015e",
            "\1\u01a6\37\uffff\1\u0166",
            "\1\u01a7\37\uffff\1\u0169",
            "\1\u01a8\37\uffff\1\u00ba",
            "\1\u01a9\37\uffff\1\u016e",
            "",
            "\1\u01aa\37\uffff\1\u015e",
            "\1\u01ab\37\uffff\1\u0166",
            "\1\u01ac\37\uffff\1\u0169",
            "\1\u01ad",
            "\1\u01ae\37\uffff\1\u016e",
            "\1\u01af\37\uffff\1\u015e",
            "\1\u01b0",
            "\1\u01b1",
            "",
            "\1\u01b2\37\uffff\1\u016e",
            "\1\u01b3\37\uffff\1\u015e",
            "",
            "",
            "\1\u01b4\37\uffff\1\u016e",
            "\1\u01b5\37\uffff\1\u015e",
            "\1\u01b6\37\uffff\1\u016e",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | RULE_LINE_COMMENT | RULE_WS | RULE_PROCEDIMIENTO | RULE_IMPORTA | RULE_EXPORTA | RULE_VARIABLE | RULE_CONSTANTE | RULE_ENTERA | RULE_REAL | RULE_LOGICA | RULE_CARACTERES | RULE_SIGNOY | RULE_SIGNOO | RULE_MENOR | RULE_SIGNOMENOR | RULE_MENORIGUAL | RULE_SIGNOMENORIGUAL | RULE_MAYOR | RULE_SIGNOMAYOR | RULE_MAYORIGUAL | RULE_SIGNOMAYORIGUAL | RULE_IGUAL | RULE_SIGNOIGUAL | RULE_DIFERENTE | RULE_SIGNODIFERENTE | RULE_SUMA | RULE_RESTA | RULE_MULTIPLICACION | RULE_DIVISION | RULE_MODULO | RULE_POTENCIA | RULE_NO | RULE_IZQUIERDO | RULE_DERECHO | RULE_ENTERO | RULE_NREAL | RULE_VERDADERO | RULE_FALSO | RULE_FRASE | RULE_AREGLO | RULE_CUADRADOI | RULE_CUADRADOD | RULE_SI | RULE_ES | RULE_SINO | RULE_OTROCASO | RULE_REPETIR | RULE_MIENTRAS | RULE_SEA | RULE_VECES | RULE_FIN | RULE_IMPRIMIR | RULE_CAPTURAR | RULE_IDENTIFICADOR | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_160 = input.LA(1);

                        s = -1;
                        if ( (LA22_160=='\"') ) {s = 108;}

                        else if ( (LA22_160=='\\') ) {s = 106;}

                        else if ( ((LA22_160>='\u0000' && LA22_160<='!')||(LA22_160>='#' && LA22_160<='[')||(LA22_160>=']' && LA22_160<='\uFFFF')) ) {s = 107;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_107 = input.LA(1);

                        s = -1;
                        if ( (LA22_107=='\"') ) {s = 108;}

                        else if ( (LA22_107=='\\') ) {s = 106;}

                        else if ( ((LA22_107>='\u0000' && LA22_107<='!')||(LA22_107>='#' && LA22_107<='[')||(LA22_107>=']' && LA22_107<='\uFFFF')) ) {s = 107;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_106 = input.LA(1);

                        s = -1;
                        if ( (LA22_106=='\"') ) {s = 159;}

                        else if ( ((LA22_106>='\u0000' && LA22_106<='!')||(LA22_106>='#' && LA22_106<='\uFFFF')) ) {s = 160;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA22_31 = input.LA(1);

                        s = -1;
                        if ( (LA22_31=='\\') ) {s = 106;}

                        else if ( ((LA22_31>='\u0000' && LA22_31<='!')||(LA22_31>='#' && LA22_31<='[')||(LA22_31>=']' && LA22_31<='\uFFFF')) ) {s = 107;}

                        else if ( (LA22_31=='\"') ) {s = 108;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA22_37 = input.LA(1);

                        s = -1;
                        if ( ((LA22_37>='\u0000' && LA22_37<='\uFFFF')) ) {s = 113;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA22_159 = input.LA(1);

                        s = -1;
                        if ( (LA22_159=='\"') ) {s = 108;}

                        else if ( (LA22_159=='\\') ) {s = 106;}

                        else if ( ((LA22_159>='\u0000' && LA22_159<='!')||(LA22_159>='#' && LA22_159<='[')||(LA22_159>=']' && LA22_159<='\uFFFF')) ) {s = 107;}

                        else s = 161;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA22_0 = input.LA(1);

                        s = -1;
                        if ( (LA22_0=='P') ) {s = 1;}

                        else if ( (LA22_0==':') ) {s = 2;}

                        else if ( (LA22_0=='F') ) {s = 3;}

                        else if ( (LA22_0=='.') ) {s = 4;}

                        else if ( (LA22_0=='I') ) {s = 5;}

                        else if ( (LA22_0=='V') ) {s = 6;}

                        else if ( (LA22_0=='E') ) {s = 7;}

                        else if ( (LA22_0==';') ) {s = 8;}

                        else if ( (LA22_0=='C') ) {s = 9;}

                        else if ( (LA22_0=='A') ) {s = 10;}

                        else if ( (LA22_0=='S') ) {s = 11;}

                        else if ( (LA22_0=='R') ) {s = 12;}

                        else if ( (LA22_0=='M') ) {s = 13;}

                        else if ( (LA22_0=='L') ) {s = 14;}

                        else if ( (LA22_0=='D') ) {s = 15;}

                        else if ( (LA22_0=='Y') ) {s = 16;}

                        else if ( (LA22_0=='O') ) {s = 17;}

                        else if ( (LA22_0=='N') ) {s = 18;}

                        else if ( (LA22_0=='>') ) {s = 19;}

                        else if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {s = 20;}

                        else if ( (LA22_0=='/') ) {s = 21;}

                        else if ( (LA22_0=='\\') ) {s = 22;}

                        else if ( (LA22_0=='<') ) {s = 23;}

                        else if ( (LA22_0=='=') ) {s = 24;}

                        else if ( (LA22_0=='+') ) {s = 25;}

                        else if ( (LA22_0=='-') ) {s = 26;}

                        else if ( (LA22_0=='*') ) {s = 27;}

                        else if ( (LA22_0=='(') ) {s = 28;}

                        else if ( (LA22_0==')') ) {s = 29;}

                        else if ( ((LA22_0>='0' && LA22_0<='9')) ) {s = 30;}

                        else if ( (LA22_0=='\"') ) {s = 31;}

                        else if ( (LA22_0=='[') ) {s = 32;}

                        else if ( (LA22_0==']') ) {s = 33;}

                        else if ( ((LA22_0>='a' && LA22_0<='z')) ) {s = 34;}

                        else if ( (LA22_0=='^') ) {s = 35;}

                        else if ( (LA22_0=='B'||(LA22_0>='G' && LA22_0<='H')||(LA22_0>='J' && LA22_0<='K')||LA22_0=='Q'||(LA22_0>='T' && LA22_0<='U')||(LA22_0>='W' && LA22_0<='X')||LA22_0=='Z'||LA22_0=='_') ) {s = 36;}

                        else if ( (LA22_0=='\'') ) {s = 37;}

                        else if ( ((LA22_0>='\u0000' && LA22_0<='\b')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\u001F')||LA22_0=='!'||(LA22_0>='#' && LA22_0<='&')||LA22_0==','||(LA22_0>='?' && LA22_0<='@')||LA22_0=='`'||(LA22_0>='{' && LA22_0<='\uFFFF')) ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}