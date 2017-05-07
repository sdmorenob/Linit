package classes;

import java.util.HashMap;

@SuppressWarnings("unchecked")
public class Visitor<T> extends GramaticaBaseVisitor<T>{

    private HashMap<String, Object> table = new HashMap<>( );

    @Override
    public T visitPrograma( GramaticaParser.ProgramaContext ctx ){

        if( ctx.declaraciones( ) != null ){
            visitDeclaraciones( ctx.declaraciones( ) );
            if ( ctx.instrucciones( ) != null ){
                visitInstrucciones( ctx.instrucciones( ) );
            }
        }
        return null;

    }

    @Override
    public T visitDeclaraciones( GramaticaParser.DeclaracionesContext ctx ){

        // ...
        return null;

    }

    @Override
    public T visitParametros( GramaticaParser.ParametrosContext ctx ){

        // ...
        return null;

    }

    @Override
    public T visitInstrucciones( GramaticaParser.InstruccionesContext ctx ){

        if( ctx.nominacion( ) != null ){
            visitNominacion( ctx.nominacion( ) );
        }else if( ctx.arreglo( ) != null ){
            // ...
        }else if( ctx.llamadaIdentificador( ) != null ){
            // ...
        }else if( ctx.condicional( ) != null ){
            // ...
        }else if( ctx.ciclo( ) != null ){
            // ...
        }else if( ctx.impresion( ) != null ){
            visitImpresion( ctx.impresion( ) );
        }else if( ctx.entrada( ) != null ){
            // ...
        }else{
            return null;
        }
        visitInstrucciones( ctx.instrucciones( ) );
        return null;
    }

    @Override
    public T visitNominacion( GramaticaParser.NominacionContext ctx ){

        if( ctx.VARIABLE( ) != null ){
            String name = ctx.IDENTIFICADOR( ).getText( );
            if( table.get( name ) != null ){
                int line = ctx.IDENTIFICADOR( ).getSymbol( ).getLine( );
                int col = ctx.IDENTIFICADOR( ).getSymbol( ).getCharPositionInLine( ) + 1;
                error( line, col, " La variable \"" + name + "\" ya ha sido declarada." );
            }else{
                Object aux = visitTipoVariable( ctx.tipoVariable( ) );
                if( ctx.igualdad( ) != null ){
                    Object aux2 = visitExpresion( ctx.igualdad( ).expresion( ) );
                    if( aux.getClass( ) == aux2.getClass( ) ){
                        aux = aux2;
                    }else{
                        int line = ctx.IDENTIFICADOR( ).getSymbol( ).getLine( );
                        int col = ctx.IDENTIFICADOR( ).getSymbol( ).getCharPositionInLine( ) + 1;
                        String type;
                        if( aux instanceof Integer ){
                            type = "entero.";
                        }else if( aux instanceof Double ){
                            type = "real.";
                        }else if(  aux instanceof Boolean ){
                            type = "lógico.";
                        }else{
                            type = "caracteres.";
                        }
                        error( line, col, " El valor asignado a la variable \"" + name + "\" no es de tipo " + type );
                    }
                }
                table.put( name, aux );
            }
        }else{
            String name = ctx.IDENTIFICADOR( ).getText( );
            if( table.get( name ) != null ){
                int line = ctx.IDENTIFICADOR( ).getSymbol( ).getLine( );
                int col = ctx.IDENTIFICADOR( ).getSymbol( ).getCharPositionInLine( ) + 1;
                error( line, col, " La variable \"" + name + "\" ya ha sido declarada." );
            }else{
                Object aux = visitTipoVariable( ctx.tipoVariable( ) );
                Object aux2 = visitExpresion( ctx.igualdad( ).expresion( ) );
                if( aux.getClass( ) == aux2.getClass( ) ){
                    aux = aux2;
                }else{
                    int line = ctx.IDENTIFICADOR( ).getSymbol( ).getLine( );
                    int col = ctx.IDENTIFICADOR( ).getSymbol( ).getCharPositionInLine( ) + 1;
                    String type;
                    if( aux instanceof Integer ){
                        type = "entero.";
                    }else if( aux instanceof Double ){
                        type = "real.";
                    }else if(  aux instanceof Boolean ){
                        type = "lógico.";
                    }else{
                        type = "caracteres.";
                    }
                    error( line, col, " El valor asignado a la variable \"" + name + "\" no es de tipo " + type );
                }
                final Object aux3 = aux2;
                table.put( name, aux3 );
            }
        }
        return null;

    }

    @Override
    public T visitImpresion( GramaticaParser.ImpresionContext ctx ){

        Object exp = visitExpresion( ctx.expresion( ) );
        if( exp instanceof Integer ){
            System.out.print( exp );
            System.out.print( " " );
        }else if( exp instanceof String ){
            System.out.print( ((String) exp).replace( "\"", "" ) );
            System.out.print( " " );
        }else if( exp instanceof Double ){
            System.out.print( exp.toString( ).replace( ".", "," ) );
            System.out.print( " " );
        }else{
            if( (Boolean) exp )
                System.out.print( "VERDADERO" );
            else
                System.out.print( "FALSO" );
            System.out.print( " " );
        }
        visitListaImpresion( ctx.listaImpresion( ) );
        System.out.println( );
        return null;

    }

    @Override
    public T visitListaImpresion( GramaticaParser.ListaImpresionContext ctx ){

        if( ctx.expresion( ) != null ){
            Object exp = visitExpresion( ctx.expresion( ) );
            if( exp instanceof Integer || exp instanceof Double || exp instanceof String ){
                System.out.print( exp );
                System.out.print( " " );
            }else{
                if( (Boolean) exp )
                    System.out.print( "VERDADERO" );
                else
                    System.out.print( "FALSO" );
                System.out.print( " " );
            }
            visitListaImpresion( ctx.listaImpresion( ) );
        }
        return null;

    }

    @Override
    public T visitTipoVariable( GramaticaParser.TipoVariableContext ctx ){

        if( ctx.ENTERA( ) != null ){
            return (T) (Integer) 0;
        }else if( ctx.REAL( ) != null ){
            return (T) (Double) 0.0;
        }else if( ctx.LOGICA( ) != null ){
            return (T) (Boolean) true;
        }else{
            return (T) (String) "";
        }

    }

    @Override
    public T visitIgualdad( GramaticaParser.IgualdadContext ctx ){

        return null;

    }

    @Override
    public T visitExpresion( GramaticaParser.ExpresionContext ctx ){

        return visitOperacionOY( ctx.operacionOY( ) );

    }

    @Override
    public T visitOperacionOY( GramaticaParser.OperacionOYContext ctx ){

        if( ctx.operacionOY( ) != null ){
            Object opYO = visitOperacionOY( ctx.operacionOY( ) );
            Object comp = visitComparacion( ctx.comparacion( ) );
            if( opYO instanceof Boolean){
                if( comp instanceof Boolean ){
                    if( ctx.Y( ) != null || ctx.SIGNOY( ) != null ){
                        return (T) (Boolean) ((Boolean)opYO && (Boolean)comp);
                    }else{
                        return (T) (Boolean) ((Boolean)opYO || (Boolean)comp);
                    }
                }else{
                    int line = 0;
                    int col = 0;
                    if( ctx.Y( ) != null ){
                        line = ctx.Y( ).getSymbol( ).getLine( );
                        col = ctx.Y( ).getSymbol( ).getCharPositionInLine( ) + 1;
                    }else if( ctx.SIGNOY( ) != null ){
                        line = ctx.SIGNOY( ).getSymbol( ).getLine( );
                        col = ctx.SIGNOY( ).getSymbol( ).getCharPositionInLine( ) + 1;
                    }else if( ctx.O( ) != null ){
                        line = ctx.O( ).getSymbol( ).getLine( );
                        col = ctx.O( ).getSymbol( ).getCharPositionInLine( ) + 1;
                    }else if( ctx.SIGNOO( ) != null ){
                        line = ctx.SIGNOO( ).getSymbol( ).getLine( );
                        col = ctx.SIGNOO( ).getSymbol( ).getCharPositionInLine( ) + 1;
                    }
                    error( line, col, " El operador derecho no es de tipo lógico." );
                }
            }else{
                int line = 0;
                int col = 0;
                if( ctx.Y( ) != null ){
                    line = ctx.Y( ).getSymbol( ).getLine( );
                    col = ctx.Y( ).getSymbol( ).getCharPositionInLine( ) + 1;
                }else if( ctx.SIGNOY( ) != null ){
                    line = ctx.SIGNOY( ).getSymbol( ).getLine( );
                    col = ctx.SIGNOY( ).getSymbol( ).getCharPositionInLine( ) + 1;
                }else if( ctx.O( ) != null ){
                    line = ctx.O( ).getSymbol( ).getLine( );
                    col = ctx.O( ).getSymbol( ).getCharPositionInLine( ) + 1;
                }else if( ctx.SIGNOO( ) != null ){
                    line = ctx.SIGNOO( ).getSymbol( ).getLine( );
                    col = ctx.SIGNOO( ).getSymbol( ).getCharPositionInLine( ) + 1;
                }
                error( line, col, " El operador izquierdo no es de tipo lógico." );
            }
            return null;
        }else{
            return visitComparacion( ctx.comparacion( ) );
        }

    }

    @Override
    public T visitComparacion( GramaticaParser.ComparacionContext ctx ){

        if( ctx.comparacion( ) != null ){
            Object comp = visitComparacion( ctx.comparacion( ) );
            Object arit = visitAritmetica( ctx.aritmetica( ) );
            if( comp.getClass( ) == arit.getClass( ) ){
                int ans = 0;
                if( comp instanceof Integer ){
                    ans = ((Integer) comp).compareTo( (Integer) arit );
                }else if( comp instanceof Double ){
                    ans = ((Double) comp).compareTo( (Double) arit );
                }else if( comp instanceof Boolean ){
                    ans = ((Boolean) comp).compareTo( (Boolean) arit );
                }else{
                    ans = ((String) comp).compareTo( (String) arit );
                }
                if( ctx.opcomparacion( ).MENOR( ) != null || ctx.opcomparacion( ).SIGNOMENOR( ) != null){
                    if( ans < 0 )
                        return (T) (Boolean) true;
                    else
                        return (T) (Boolean) false;
                }else if( ctx.opcomparacion( ).MENORIGUAL( ) != null || ctx.opcomparacion( ).SIGNOMENORIGUAL( ) != null ){
                    if( ans > 0 )
                        return (T) (Boolean) false;
                    else
                        return (T) (Boolean) true;
                }else if( ctx.opcomparacion( ).MAYOR( ) != null || ctx.opcomparacion( ).SIGNOMAYOR( ) != null ){
                    if( ans > 0 )
                        return (T) (Boolean) true;
                    else
                        return (T) (Boolean) false;
                }else if( ctx.opcomparacion( ).MAYORIGUAL( ) != null || ctx.opcomparacion( ).SIGNOMAYORIGUAL( ) != null ){
                    if( ans < 0 )
                        return (T) (Boolean) false;
                    else
                        return (T) (Boolean) true;
                }else if( ctx.opcomparacion( ).DIFERENTE( ) != null || ctx.opcomparacion( ).SIGNODIFERENTE( ) != null ){
                    if( ans == 0 )
                        return (T) (Boolean) false;
                    else
                        return (T) (Boolean) true;
                }else if( ctx.opcomparacion( ).IGUAL( ) != null || ctx.opcomparacion( ).SIGNOIGUAL( ) != null ){
                    if( ans == 0 )
                        return (T) (Boolean) true;
                    else
                        return (T) (Boolean) false;
                }
            }else{
                int line = 0;
                int col = 0;
                String oper = "";
                if( ctx.opcomparacion( ).MENOR( ) != null ){
                    line = ctx.opcomparacion( ).MENOR( ).getSymbol( ).getLine( );
                    col = ctx.opcomparacion( ).MENOR( ).getSymbol( ).getCharPositionInLine( ) + 1;
                    oper = ctx.opcomparacion( ).MENOR( ).getText( );
                }else if( ctx.opcomparacion( ).SIGNOMENOR( ) != null ){
                    line = ctx.opcomparacion( ).SIGNOMENOR( ).getSymbol( ).getLine( );
                    col = ctx.opcomparacion( ).SIGNOMENOR( ).getSymbol( ).getCharPositionInLine( ) + 1;
                    oper = ctx.opcomparacion( ).SIGNOMENOR( ).getText( );
                }else if( ctx.opcomparacion( ).MENORIGUAL( ) != null ){
                    line = ctx.opcomparacion( ).MENORIGUAL( ).getSymbol( ).getLine( );
                    col = ctx.opcomparacion( ).MENORIGUAL( ).getSymbol( ).getCharPositionInLine( ) + 1;
                    oper = ctx.opcomparacion( ).MENORIGUAL( ).getText( );
                }else if( ctx.opcomparacion( ).SIGNOMENORIGUAL( ) != null ){
                    line = ctx.opcomparacion( ).SIGNOMENORIGUAL( ).getSymbol( ).getLine( );
                    col = ctx.opcomparacion( ).SIGNOMENORIGUAL( ).getSymbol( ).getCharPositionInLine( ) + 1;
                    oper = ctx.opcomparacion( ).SIGNOMENORIGUAL( ).getText( );
                }else if( ctx.opcomparacion( ).MAYOR( ) != null ){
                    line = ctx.opcomparacion( ).MAYOR( ).getSymbol( ).getLine( );
                    col = ctx.opcomparacion( ).MAYOR( ).getSymbol( ).getCharPositionInLine( ) + 1;
                    oper = ctx.opcomparacion( ).MAYOR( ).getText( );
                }else if( ctx.opcomparacion( ).SIGNOMAYOR( ) != null ){
                    line = ctx.opcomparacion( ).SIGNOMAYOR( ).getSymbol( ).getLine( );
                    col = ctx.opcomparacion( ).SIGNOMAYOR( ).getSymbol( ).getCharPositionInLine( ) + 1;
                    oper = ctx.opcomparacion( ).SIGNOMAYOR( ).getText( );
                }else if( ctx.opcomparacion( ).MAYORIGUAL( ) != null ){
                    line = ctx.opcomparacion( ).MAYORIGUAL( ).getSymbol( ).getLine( );
                    col = ctx.opcomparacion( ).MAYORIGUAL( ).getSymbol( ).getCharPositionInLine( ) + 1;
                    oper = ctx.opcomparacion( ).MAYORIGUAL( ).getText( );
                }else if( ctx.opcomparacion( ).SIGNOMAYORIGUAL( ) != null ){
                    line = ctx.opcomparacion( ).SIGNOMAYORIGUAL( ).getSymbol( ).getLine( );
                    col = ctx.opcomparacion( ).SIGNOMAYORIGUAL( ).getSymbol( ).getCharPositionInLine( ) + 1;
                    oper = ctx.opcomparacion( ).SIGNOMAYORIGUAL( ).getText( );
                }else if( ctx.opcomparacion( ).DIFERENTE( ) != null ){
                    line = ctx.opcomparacion( ).DIFERENTE( ).getSymbol( ).getLine( );
                    col = ctx.opcomparacion( ).DIFERENTE( ).getSymbol( ).getCharPositionInLine( ) + 1;
                    oper = ctx.opcomparacion( ).DIFERENTE( ).getText( );
                }else if( ctx.opcomparacion( ).SIGNODIFERENTE( ) != null ){
                    line = ctx.opcomparacion( ).SIGNODIFERENTE( ).getSymbol( ).getLine( );
                    col = ctx.opcomparacion( ).SIGNODIFERENTE( ).getSymbol( ).getCharPositionInLine( ) + 1;
                    oper = ctx.opcomparacion( ).SIGNODIFERENTE( ).getText( );
                }else if( ctx.opcomparacion( ).IGUAL( ) != null ){
                    line = ctx.opcomparacion( ).IGUAL( ).getSymbol( ).getLine( );
                    col = ctx.opcomparacion( ).IGUAL( ).getSymbol( ).getCharPositionInLine( ) + 1;
                    oper = ctx.opcomparacion( ).IGUAL( ).getText( );
                }else if( ctx.opcomparacion( ).SIGNOIGUAL( ) != null ){
                    line = ctx.opcomparacion( ).SIGNOIGUAL( ).getSymbol( ).getLine( );
                    col = ctx.opcomparacion( ).SIGNOIGUAL( ).getSymbol( ).getCharPositionInLine( ) + 1;
                    oper = ctx.opcomparacion( ).SIGNOIGUAL( ).getText( );
                }
                String type1 = "";
                String type2 = "";
                if( comp instanceof Integer ){
                    type1 = "ENTERO";
                }else if( comp instanceof Double ){
                    type1 = "REAL";
                }else if( comp instanceof Boolean ){
                    type1 = "LOGICO";
                }else{
                    type1 = "CARACTERES";
                }
                if( arit instanceof Integer ){
                    type2 = "ENTERO";
                }else if( arit instanceof Double ){
                    type2 = "REAL";
                }else if( arit instanceof Boolean ){
                    type2 = "LOGICO";
                }else{
                    type2 = "CARACTERES";
                }
                error( line, col, " Las expresiones a comparar no son compatibles. \n"
                       + type1 + " " + oper + " " + type2 );
            }
            return null;
        }else{
            return visitAritmetica( ctx.aritmetica( ) );
        }

    }

  	@Override
    public T visitOpcomparacion( GramaticaParser.OpcomparacionContext ctx ){

        return null;

    }

  	@Override
    public T visitAritmetica( GramaticaParser.AritmeticaContext ctx ){
        if( ctx.aritmetica( ) != null ){
            // ...
            return null;
        }else{
            return visitMultiplicacion( ctx.multiplicacion( ) );
        }
    }

    @Override
    public T visitMultiplicacion( GramaticaParser.MultiplicacionContext ctx ){
        if( ctx.multiplicacion( ) != null ){
            // ...
            return null;
        }else{
            return visitPotenciacion( ctx.potenciacion( ) );
        }
    }

    @Override
    public T visitPotenciacion( GramaticaParser.PotenciacionContext ctx ){
        if( ctx.potenciacion( ) != null ){
            // ...
            return null;
        }else{
            return visitNegacion( ctx.negacion( ) );
        }
    }

    @Override
    public T visitNegacion( GramaticaParser.NegacionContext ctx ){
        if( ctx.NO( ) != null ){
            // ...
            return null;
        }else{
            return visitParentesis( ctx.parentesis( ) );
        }
    }

    @Override
    public T visitParentesis( GramaticaParser.ParentesisContext ctx ){
        if( ctx.expresion( ) != null ){
            return visitExpresion( ctx.expresion( ) );
        }else{
            return visitDato( ctx.dato( ) );
        }
    }

    @Override
    public T visitDato( GramaticaParser.DatoContext ctx ){
        if( ctx.IDENTIFICADOR( ) != null ){
            // ...
            return null;
        }else if( ctx.numero( ) != null ){
            return visitNumero( ctx.numero( ) );
        }else if( ctx.logico( ) != null ){
            return visitLogico( ctx.logico( ) );
        }else{
            return (T) (String) ctx.FRASE( ).getText( );
        }
    }

    @Override
    public T visitLogico( GramaticaParser.LogicoContext ctx ){
        if( ctx.VERDADERO( ) != null ){
            return (T) (Boolean) true;
        }else{
            return (T) (Boolean) false;
        }
    }

    @Override
    public T visitNumero( GramaticaParser.NumeroContext ctx ){
        if( ctx.ENTERO( ) != null ){
            return (T) (Integer) Integer.parseInt( ctx.ENTERO( ).getText( ) );
        }else{
            return (T) new Double( ctx.NREAL( ).getText( ).replace(",", ".") );
        }
    }

    @Override
    public T visitListaArreglo( GramaticaParser.ListaArregloContext ctx ){
        return null;
    }

    private void error( int line, int col, String type){
        System.out.println(
          "<" + line + ":" + col + "> Error semantico:" + type );
        System.exit( -1 );
    }
}
