package classes;


public class Visitor<T> extends GramaticaBaseVisitor<T>{

    private HashMap<String, Object> table = new HashMap<>( );

    @Override
    public T visitPrograma( GramaticaParser.ProgramaContext ctx ){
        if( ctx.declaraciones( ) != null ){
            // ...
        }else if ( ctx.instrucciones( ) != null ){
            visitInstrucciones( ctx.instrucciones( ) );
        }
        return visitChildren( ctx );
    }

    @Override
    public T visitParametros( GramaticaParser.ParametrosContext ctx ){
        return visitChildren( ctx );
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
            // ...
        }else if( ctx.entrada( ) != null ){
            // ...
        }
        return visitChildren( ctx );
    }

    @Override
    public T visitNominacion( GramaticaParser.NominacionContext ctx ){
        if( ctx.VARIABLE( ) != null ){

            String name = ctx.IDENTIFICADOR( ).getText( );
            if( table.get( name ) != null ){

                int line = ctx.IDENTIFICADOR( ).getSymbol( ).getLine( );
                int col = ctx.IDENTIFICADOR( ).getSymbol( ).getCharPositionInLine( ) + 1;
                error( line, col, " La variable con nombre: \"" + name + "\" ya ha sido declarada." );

            }else{

                if( ctx.tipoVariable( ).ENTERA( ) =! null ){

                    Integer aux;
                    if( ctx.igualdad( ) != null ){
                        try{
                            aux = visitExpresion( ctx.igualdad( ).expresion( ) );
                        }catch( Exception e ){
                            int line = ctx.IDENTIFICADOR( ).getSymbol( ).getLine( );
                            int col = ctx.IDENTIFICADOR( ).getSymbol( ).getCharPositionInLine( ) + 1;
                            error( line, col, " El valor asignado a la variable \"" + name + "\" no es de tipo Entero" );
                        }

                    }

                }else if( ctx.tipoVariable( ).REAL( ) =! null ){

                    Double aux;
                    if( ctx.igualdad( ) != null ){
                        try{
                            aux = visitExpresion( ctx.igualdad( ).expresion( ) );
                        }catch( Exception e ){
                            int line = ctx.IDENTIFICADOR( ).getSymbol( ).getLine( );
                            int col = ctx.IDENTIFICADOR( ).getSymbol( ).getCharPositionInLine( ) + 1;
                            error( line, col, " El valor asignado a la variable \"" + name + "\" no es de tipo Real" );
                        }
                    }

                }else if( ctx.tipoVariable( ).LOGICA( ) =! null ){

                    Boolean aux;
                    if( ctx.igualdad( ) != null ){
                        try{
                            aux = visitExpresion( ctx.igualdad( ).expresion( ) );
                        }catch( Exception e ){
                            int line = ctx.IDENTIFICADOR( ).getSymbol( ).getLine( );
                            int col = ctx.IDENTIFICADOR( ).getSymbol( ).getCharPositionInLine( ) + 1;
                            error( line, col, " El valor asignado a la variable \"" + name + "\" no es de tipo Lógico" );
                        }
                    }

                }else if( ctx.tipoVariable( ).CARACTERES( ) =! null ){

                    String aux;
                    if( ctx.igualdad( ) != null ){
                        try{
                            aux = visitExpresion( ctx.igualdad( ).expresion( ) );
                        }catch( Exception e ){
                            int line = ctx.IDENTIFICADOR( ).getSymbol( ).getLine( );
                            int col = ctx.IDENTIFICADOR( ).getSymbol( ).getCharPositionInLine( ) + 1;
                            error( line, col, " El valor asignado a la variable \"" + name + "\" no es de tipo Caracteres" );
                        }
                    }

                }
                table.put( name, aux );
            }

        }else{
            // ...
        }
        return visitChildren( ctx );
    }

    private void error( int line, int col, String tipo){
        System.err.println(
          "<%d:%d> Error semantico:" + tipo,
          line, col );
        System.exit( -1 );
    }
}
