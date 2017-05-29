package classes;

import java.io.Console;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Math;


@SuppressWarnings("unchecked")
public class Visitor<T> extends GramaticaBaseVisitor<T>{

    private HashMap<String, Object> table = new HashMap<>( );
    private HashMap<String, Object> tableF = new HashMap<>( );
    private ArrayList<Object> parametros;

    @Override
    public T visitPrograma( GramaticaParser.ProgramaContext ctx ){

        if( ctx.declaraciones( ) != null ){
            visitDeclaraciones( ctx.declaraciones( ) );
            if( ctx.instrucciones( ) != null ){
                visitInstrucciones( ctx.instrucciones( ) );
            }
        }
        return null;

    }

    @Override
    public T visitDeclaraciones( GramaticaParser.DeclaracionesContext ctx ){

        if( ctx.PROCEDIMIENTO( ) != null ){
            String name = ctx.IDENTIFICADOR( ).getText( );
            if( tableF.get( name.toLowerCase( ) ) != null ){
                int line = ctx.IDENTIFICADOR( ).getSymbol( ).getLine( );
                int col = ctx.IDENTIFICADOR( ).getSymbol( ).getCharPositionInLine( ) + 1;
                error( line, col, " El procedimiento \"" + name + "\" ya ha sido declarado." );
            }else{
                visitParametros( ctx.parametros( ) );
                parametros.add( 0, ctx.instrucciones( ) );
                tableF.put( name.toLowerCase( ), parametros );
            }
            return visitDeclaraciones( ctx.declaraciones( ) );
        }
        return null;

    }

    @Override
    public T visitParametros( GramaticaParser.ParametrosContext ctx ){

        HashMap<String, Object> table2 = table;
        table = new HashMap<>( );
        parametros = new ArrayList<>( );
        ArrayList<Object> import_ = new ArrayList( );
        parametros.add( import_ );
        if( ctx.IMPORTA( ) != null ){
            if( ctx.arreglo( ) != null ){
                String name = ctx.arreglo( ).IDENTIFICADOR( ).getText( );
                ArrayList<T> aux = new ArrayList<>( );
                import_ = (ArrayList) parametros.remove( parametros.size( ) - 1 );
                import_.add( name.toLowerCase( ) );
                parametros.add( import_ );
                table.put( name.toLowerCase( ), aux );
            }else{
                String name = ctx.IDENTIFICADOR( ).getText( );
                Object aux = visitTipoVariable( ctx.tipoVariable( ) );
                import_ = (ArrayList) parametros.remove( parametros.size( ) - 1 );
                import_.add( name.toLowerCase( ) );
                parametros.add( import_ );
                table.put( name.toLowerCase( ), aux );
            }
            visitListaParametros( ctx.listaParametros( ) );
        }
        visitExporta( ctx.exporta( ) );
        parametros.add( 0, table );
        table = table2;
        return null;

    }

    @Override
    public T visitListaParametros( GramaticaParser.ListaParametrosContext ctx ){

        if( ctx.PYC( ) != null ){
            ArrayList<Object> param = (ArrayList) parametros.remove( parametros.size( ) - 1 );
            String name;
            if( ctx.arreglo( ) == null )
                name = ctx.IDENTIFICADOR( ).getText( );
            else
                name = ctx.arreglo( ).IDENTIFICADOR( ).getText( );
            if( table.get( name.toLowerCase( ) ) != null ){
                int line = ctx.PYC( ).getSymbol( ).getLine( );
                int col = ctx.PYC( ).getSymbol( ).getCharPositionInLine( ) + 2;
                error( line, col, " El parametro \"" + name + "\" ya ha sido declarado." );
            }else{
                if( ctx.tipoVariable( ) != null ){
                    Object aux = visitTipoVariable( ctx.tipoVariable( ) );
                    param.add( name.toLowerCase( ) );
                    table.put( name.toLowerCase( ), aux );
                    parametros.add( param );
                }else{
                    ArrayList<T> aux = new ArrayList<>( );
                    param.add( name.toLowerCase( ) );
                    table.put( name.toLowerCase( ), aux );
                    parametros.add( param );
                }
                visitListaParametros( ctx.listaParametros( ) );
            }
        }
        return null;

    }

    @Override
    public T visitExporta( GramaticaParser.ExportaContext ctx ){

        if( ctx.EXPORTA( ) != null ){
            ArrayList<Object> export = new ArrayList<>( );
            if( ctx.VARIABLE( ) != null ){
                String name = ctx.IDENTIFICADOR( ).getText( );
                if( table.get( name.toLowerCase( ) ) != null ){
                    int line = ctx.IDENTIFICADOR( ).getSymbol( ).getLine( );
                    int col = ctx.IDENTIFICADOR( ).getSymbol( ).getCharPositionInLine( ) + 1;
                    error( line, col, " El parametro \"" + name + "\" ya ha sido declarado." );
                }else{
                    Object aux = visitTipoVariable( ctx.tipoVariable( ) );
                    export.add( name.toLowerCase( ) );
                    table.put( name.toLowerCase( ), aux );
                    parametros.add( export );
                    visitListaParametros( ctx.listaParametros( ) );
                }
            }else{
                String name = ctx.arreglo( ).IDENTIFICADOR( ).getText( );
                if( table.get( name.toLowerCase( ) ) != null ){
                    int line = ctx.arreglo( ).IDENTIFICADOR( ).getSymbol( ).getLine( );
                    int col = ctx.arreglo( ).IDENTIFICADOR( ).getSymbol( ).getCharPositionInLine( ) + 1;
                    error( line, col, " El parametro \"" + name + "\" ya ha sido declarado." );
                }else{
                    ArrayList<T> aux = new ArrayList<>( );
                    export.add( name.toLowerCase( ) );
                    table.put( name.toLowerCase( ), aux );
                    parametros.add( export );
                    visitListaParametros( ctx.listaParametros( ) );
                }
            }
            return null;
        }
        parametros.add( new ArrayList( ) );
        return null;

    }

    @Override
    public T visitInstrucciones( GramaticaParser.InstruccionesContext ctx ){

        if( ctx.nominacion( ) != null ){
            visitNominacion( ctx.nominacion( ) );
        }else if( ctx.arreglo( ) != null ){
            visitArreglo( ctx.arreglo( ) );
        }else if( ctx.llamadaIdentificador( ) != null ){
            visitLlamadaIdentificador( ctx.llamadaIdentificador( ) );
        }else if( ctx.condicional( ) != null ){
            visitCondicional( ctx.condicional( ) );
        }else if( ctx.ciclo( ) != null ){
            visitCiclo( ctx.ciclo( ) );
        }else if( ctx.impresion( ) != null ){
            visitImpresion( ctx.impresion( ) );
        }else if( ctx.entrada( ) != null ){
            visitEntrada( ctx.entrada( ) );
        }else{
            return null;
        }
        return visitInstrucciones( ctx.instrucciones( ) );
    }

    @Override
    public T visitNominacion( GramaticaParser.NominacionContext ctx ){

        if( ctx.VARIABLE( ) != null ){
            String name = ctx.IDENTIFICADOR( ).getText( );
            if( table.get( name.toLowerCase( ) ) != null ){
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
                        String type = translateType( aux );
                        error( line, col, " El valor asignado a la variable \"" + name + "\" no es de tipo " + type + "." );
                    }
                }
                table.put( name.toLowerCase( ), aux );
            }
        }else{
            String name = ctx.IDENTIFICADOR( ).getText( );
            if( table.get( name.toLowerCase( ) ) != null ){
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
                    String type = translateType( aux );
                    error( line, col, " El valor asignado a la variable \"" + name + "\" no es de tipo " + type + "." );
                }
                final Object aux3 = aux2;
                table.put( name.toLowerCase( ), aux3 );
            }
        }
        return null;

    }

    @Override
    public T visitArreglo( GramaticaParser.ArregloContext ctx ){

        String name = ctx.IDENTIFICADOR( ).getText( );
        if( table.get( name.toLowerCase( ) ) != null ){
            int line = ctx.IDENTIFICADOR( ).getSymbol( ).getLine( );
            int col = ctx.IDENTIFICADOR( ).getSymbol( ).getCharPositionInLine( ) + 1;
            error( line, col, " La variable \"" + name + "\" ya ha sido declarada." );
        }else{
            ArrayList<T> aux = new ArrayList<>( );
            table.put( name.toLowerCase( ), aux );
        }
        return null;
    }

    @Override
    public T visitLlamadaIdentificador( GramaticaParser.LlamadaIdentificadorContext ctx ){

        if( ctx.igualdad( ) != null ){
            String name = ctx.IDENTIFICADOR( 0 ).getText( );
            if( ctx.CUADRADOI( ) != null ){
                if( table.get( name.toLowerCase( ) ) == null ){
                    int line = ctx.IDENTIFICADOR( 0 ).getSymbol( ).getLine( );
                    int col = ctx.IDENTIFICADOR( 0 ).getSymbol( ).getCharPositionInLine( ) + 1;
                    error( line, col, " El arreglo \"" + name + "\" aun no ha sido declarado." );
                }else{
                    Object aux = table.get( name.toLowerCase( ) );
                    if( aux instanceof ArrayList ){
                        aux = getNewArray( ctx, ctx.listaArreglo( ), visitExpresion( ctx.expresion( ) ),
                                (ArrayList) aux, ctx.igualdad( ).expresion( ), name + "[ " );
                        table.replace( name.toLowerCase( ), aux );
                    }else{
                        int line = ctx.IDENTIFICADOR( 0 ).getSymbol( ).getLine( );
                        int col = ctx.IDENTIFICADOR( 0 ).getSymbol( ).getCharPositionInLine( ) + 1;
                        error( line, col, " La variable \"" + name + "\" no es un ARREGLO." );
                    }
                }
            }else{
                if( table.get( name.toLowerCase( ) ) == null ){
                    int line = ctx.IDENTIFICADOR( 0 ).getSymbol( ).getLine( );
                    int col = ctx.IDENTIFICADOR( 0 ).getSymbol( ).getCharPositionInLine( ) + 1;
                    error( line, col, " La variable \"" + name + "\" aun no ha sido declarada." );
                }else{
                    Object aux = table.get( name.toLowerCase( ) );
                    Object aux2 = visitExpresion( ctx.igualdad( ).expresion( ) );
                    if( aux.getClass( ) == aux2.getClass( ) ){
                        table.replace( name.toLowerCase( ), aux2 );
                    }else{
                        int line = ctx.IDENTIFICADOR( 0 ).getSymbol( ).getLine( );
                        int col = ctx.IDENTIFICADOR( 0 ).getSymbol( ).getCharPositionInLine( ) + 1;
                        String type = translateType( aux );
                        error( line, col, " El valor asignado a la variable \"" + name + "\" no es de tipo " + type + "." );
                    }
                }
            }
        }else{
            String name = ctx.IDENTIFICADOR( 0 ).getText( );
            if( tableF.get( name.toLowerCase( ) ) == null ){
                int line = ctx.IDENTIFICADOR( 0 ).getSymbol( ).getLine( );
                int col = ctx.IDENTIFICADOR( 0 ).getSymbol( ).getCharPositionInLine( ) + 1;
                error( line, col, " El procedimiento \"" + name + "\" no ha sido declarado." );
            }else{
                ArrayList<Object> function = new ArrayList<>( (ArrayList) tableF.get( name.toLowerCase( ) ) );
                GramaticaParser.InstruccionesContext ctxF = (GramaticaParser.InstruccionesContext) function.get( 0 );
                HashMap<String, Object> table2 = new HashMap<>( (HashMap) function.get( 1 ) );
                ArrayList<Object> parameter = new ArrayList<>( (ArrayList) function.get( 2 ) );
                if( ctx.IMPORTA( ) != null && parameter.size( ) < 1 ){
                    int line = ctx.IMPORTA( ).getSymbol( ).getLine( );
                    int col = ctx.IMPORTA( ).getSymbol( ).getCharPositionInLine( ) + 1;
                    error( line, col, " El numero de parametros con el que es invocado el procedimiento \"" +
                           name + "\" no coincide con el numero de parametros que se definio." );
                }
                if( ctx.IMPORTA( ) != null ){
                    GramaticaParser.ListaArregloContext lac = ctx.listaArreglo( );
                    Object val = visitExpresion( ctx.expresion( ) );
                    for( Object var : parameter ){
                        if( val != null ){
                            if( table2.get( var ).getClass( ) == val.getClass( ) ){
                                table2.replace( (String) var, val );
                            }else{
                                int line = ctx.IMPORTA( ).getSymbol( ).getLine( );
                                int col = ctx.IMPORTA( ).getSymbol( ).getCharPositionInLine( ) + 1;
                                String aux1 = translateType( table2.get( var ) );
                                String aux2 = translateType( val );
                                error( line, col, " El valor asignado al parametro \"" + var + "\" no es de tipo " + aux1 + "\n"
                                        + aux1 + " = " + aux2);
                            }
                        }else{
                            int line = ctx.IDENTIFICADOR( 0 ).getSymbol( ).getLine( );
                            int col = ctx.IDENTIFICADOR( 0 ).getSymbol( ).getCharPositionInLine( ) + 1;
                            error( line, col, " El numero de parametros con el que es invocado el procedimiento \"" +
                                   name + "\" no coincide con el numero de parametros que se definio." );
                        }
                        val = visitListaArreglo( lac );
                        lac = lac.listaArreglo( );
                    }
                    if( val != null ){
                        int line = ctx.IMPORTA( ).getSymbol( ).getLine( );
                        int col = ctx.IMPORTA( ).getSymbol( ).getCharPositionInLine( ) + 1;
                        error( line, col, " El numero de parametros que importa el procedimiento \"" +
                               name + "\" no coincide con el numero de parametros que se definio." );
                    }
                }
                HashMap<String, String> map = new HashMap<>( );
                parameter = new ArrayList<>( (ArrayList) function.get( 3 ) );
                if( ctx.EXPORTA( ) != null ){
                    GramaticaParser.ListaIdentificadoresContext lac = ctx.listaIdentificadores( );
                    String val = ctx.IDENTIFICADOR( 1 ).getText( );
                    for( Object var : parameter ){
                        if( val != null ){
                            map.put( (String) var, val );
                        }else{
                            int line = ctx.EXPORTA( ).getSymbol( ).getLine( );
                            int col = ctx.EXPORTA( ).getSymbol( ).getCharPositionInLine( ) + 1;
                            error( line, col, " El numero de parametros con el que es invocado el procedimiento \"" +
                                   name + "\" no coincide con el numero de parametros que se define." );
                        }
                        val = (String) visitListaIdentificadores( lac );
                        lac = lac.listaIdentificadores( );
                    }
                    if( val != null ){
                        int line = ctx.EXPORTA( ).getSymbol( ).getLine( );
                        int col = ctx.EXPORTA( ).getSymbol( ).getCharPositionInLine( ) + 1;
                        error( line, col, " El numero de parametros que exporta el procedimiento \"" + name + "\"" +
                                          " no coincide con el numero de parametros que se define." );
                    }
                }
                HashMap<String, Object> table3 = table;
                table = table2;
                visitInstrucciones( ctxF );
                map.forEach( (val,var)->{
                    table3.replace( var, table.get( val ) );
                });
                table = table3;
            }
        }
        return null;
    }

    @Override
    public T visitListaIdentificadores( GramaticaParser.ListaIdentificadoresContext ctx ){

        if( ctx.PYC( ) != null){
            return (T) ctx.IDENTIFICADOR( ).getText( );
        }
        return (T) null;

    }

    @Override
    public T visitCondicional( GramaticaParser.CondicionalContext ctx ){

        HashMap<String, Object> table2 = table;
        table = (HashMap) table.clone( );
        Object exp = visitExpresion( ctx.expresion( ) );
        if( exp instanceof Boolean ){
            if( (Boolean) exp ){
                visitInstrucciones( ctx.instrucciones( ) );
                return null;
            }
            visitListaCondicional( ctx.listaCondicional( ) );
        }else{
            int line = ctx.SI( ).getSymbol( ).getLine( );
            int col = ctx.SI( ).getSymbol( ).getCharPositionInLine( ) + 1;
            String type = translateType( exp );
            error( line, col, " No se puede evaluar la expresion de tipo \"" + type +
              "\" como una expresion de tipo LOGICO." );
        }
        table = table2;
        return null;

    }

	  @Override
    public T visitCiclo( GramaticaParser.CicloContext ctx ){

        if( ctx.MIENTRAS( ) != null ){
            Object exp = visitExpresion( ctx.expresion( ) );
            if( exp instanceof Boolean ){
                Boolean value = (Boolean) exp;
                HashMap<String, Object> table2 = table;
                while( value.equals( (Boolean) visitLogico( ctx.logico( ) ) ) ){
                    table = (HashMap) table2.clone( );
                    visitInstrucciones( ctx.instrucciones( ) );
                    value = (Boolean) visitExpresion( ctx.expresion( ) );
                    for( String g : table2.keySet( ) ){
                        table2.replace( g, table.get( g ) );
                    }
                }
                table = table2;
            }else{
                int line = ctx.REPETIR( ).getSymbol( ).getLine( );
                int col = ctx.REPETIR( ).getSymbol( ).getCharPositionInLine( ) + 1;
                String type = translateType( exp );
                error( line, col, " No se puede evaluar la expresion de tipo \"" + type +
                  "\" como una expresion de tipo \"LOGICO\"." );
            }
        }else{
            Object exp = visitExpresion( ctx.expresion( ) );
            if( exp instanceof Integer ){
                Integer times = (Integer) exp;
                if( times.compareTo( 0 ) < 0 ){
                  int line = ctx.VECES( ).getSymbol( ).getLine( );
                  int col = ctx.VECES( ).getSymbol( ).getCharPositionInLine( ) + 1;
                  error( line, col, " No se puede iterar un numero negativo de veces.\n" +
                  "REPETIR " + times.toString( ) + " VECES:"  );
                }
                HashMap<String, Object> table2 = table;
                while( times.compareTo( 0 ) > 0 ){
                    table = (HashMap) table2.clone( );
                    visitInstrucciones( ctx.instrucciones( ) );
                    times--;
                    for( String g : table2.keySet( ) ){
                        table2.replace( g, table.get( g ) );
                    }
                }
                table = table2;
            }else{
                int line = ctx.REPETIR( ).getSymbol( ).getLine( );
                int col = ctx.REPETIR( ).getSymbol( ).getCharPositionInLine( ) + 1;
                String type = translateType( exp );
                error( line, col, " No se puede evaluar la expresion de tipo \"" + type +
                  "\" como una expresion de tipo \"ENTERO\"." );
            }
        }
        return null;

    }

    @Override
    public T visitImpresion( GramaticaParser.ImpresionContext ctx ){

        Object exp = visitExpresion( ctx.expresion( ) );
        imprimir( exp, ctx.IMPRIMIR( ).getSymbol( ).getLine( ),
          ctx.IMPRIMIR( ).getSymbol( ).getCharPositionInLine( ) + 1 );
        visitListaImpresion( ctx.listaImpresion( ) );
        System.out.println( );
        return null;

    }

    @Override
    public T visitListaImpresion( GramaticaParser.ListaImpresionContext ctx ){

        if( ctx.expresion( ) != null ){
            Object exp = visitExpresion( ctx.expresion( ) );
            imprimir( exp, ctx.PYC( ).getSymbol( ).getLine( ),
              ctx.PYC( ).getSymbol( ).getCharPositionInLine( ) + 1 );
            visitListaImpresion( ctx.listaImpresion( ) );
        }
        return null;

    }

    @Override
    public T visitEntrada( GramaticaParser.EntradaContext ctx ){

        String name = ctx.IDENTIFICADOR( ).getText( );
        Object data = table.get( name.toLowerCase( ) );
        if( data == null ){
            int line = ctx.IDENTIFICADOR( ).getSymbol( ).getLine( );
            int col = ctx.IDENTIFICADOR( ).getSymbol( ).getCharPositionInLine( ) + 1;
            error( line, col, " La variable \"" + name + "\" aun no ha sido declarada." );
        }else{
            String sc = System.console( ).readLine( );
            if( data instanceof Integer ){
                try{
                    table.replace( name.toLowerCase( ), new Integer( sc ) );
                }catch( Exception e ){
                    int line = ctx.IDENTIFICADOR( ).getSymbol( ).getLine( );
                    int col = ctx.IDENTIFICADOR( ).getSymbol( ).getCharPositionInLine( ) + 1;
                    error( line, col, " El dato ingresado por consola no es de tipo \"ENTERO\"." );
                }
            }else if( data instanceof Double ){
                try{
                    table.replace( name.toLowerCase( ), new Double( sc.replace(",", ".") ) );
                }catch( Exception e ){
                    int line = ctx.IDENTIFICADOR( ).getSymbol( ).getLine( );
                    int col = ctx.IDENTIFICADOR( ).getSymbol( ).getCharPositionInLine( ) + 1;
                    error( line, col, " El dato ingresado por consola no es de tipo \"REAL\"." );
                }
            }else if( data instanceof String ){
                try{
                    table.replace( name.toLowerCase( ), sc );
                }catch( Exception e ){
                    int line = ctx.IDENTIFICADOR( ).getSymbol( ).getLine( );
                    int col = ctx.IDENTIFICADOR( ).getSymbol( ).getCharPositionInLine( ) + 1;
                    error( line, col, " El dato ingresado por consola no es de tipo \"FRASE\"." );
                }
            }else if( data instanceof Boolean ){
                try{
                    Object value = sc.toUpperCase( );
                    if( value.equals( "VERDADERO" ) ){
                        table.replace( name.toLowerCase( ), (Boolean) true );
                    }else if( value.equals( "FALSO" ) ){
                        table.replace( name.toLowerCase( ), (Boolean) false );
                    }else{
                        table.replace( name.toLowerCase( ), (Boolean) value );
                    }
                }catch( Exception e ){
                    int line = ctx.IDENTIFICADOR( ).getSymbol( ).getLine( );
                    int col = ctx.IDENTIFICADOR( ).getSymbol( ).getCharPositionInLine( ) + 1;
                    error( line, col, " El dato ingresado por consola no es de tipo \"LOGICO\"." );
                }
            }
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
                    error( line, col, " El operador derecho no es de tipo logico." );
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
                error( line, col, " El operador izquierdo no es de tipo logico." );
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
            Object arit = visitAritmetica( ctx.aritmetica( ) );
            Object mult = visitMultiplicacion( ctx.multiplicacion( ) );
            if( arit instanceof Integer && mult instanceof Integer ){
                if( ctx.SUMA( ) != null ){
                    return (T) (Integer) ((Integer) arit + (Integer) mult);
                }
                return (T) (Integer) ((Integer) arit - (Integer) mult);
            }else if( arit instanceof Integer && mult instanceof Double ||
              arit instanceof Double && mult instanceof Integer ||
              arit instanceof Double && mult instanceof Double){
                if( ctx.SUMA( ) != null ){
                    return (T) (Double) ((new Double( arit.toString( ) )) + (new Double( mult.toString( ) )));
                }
                return (T) (Double) ((new Double( arit.toString( ) )) - (new Double( mult.toString( ) )));
            }else if( arit instanceof String && ctx.SUMA( ) != null ){
                return (T) ((String) arit + (String) mult);
            }else{
                int line = 0;
                int col = 0;
                String oper = "";
                if( ctx.SUMA( ) != null ){
                    line = ctx.SUMA( ).getSymbol( ).getLine( );
                    col = ctx.SUMA( ).getSymbol( ).getCharPositionInLine( ) + 1;
                    oper = "+";
                }else{
                    line = ctx.RESTA( ).getSymbol( ).getLine( );
                    col = ctx.RESTA( ).getSymbol( ).getCharPositionInLine( ) + 1;
                    oper = "-";
                }
                String type1 = translateType( arit );
                String type2 = translateType( mult );
                error( line, col, " Los tipos de datos no se pueden operar. \n"
                  + type1 + " " + oper + " " + type2 );
            }
            return null;
        }else{
            return visitMultiplicacion( ctx.multiplicacion( ) );
        }
    }

    @Override
    public T visitMultiplicacion( GramaticaParser.MultiplicacionContext ctx ){
        if( ctx.multiplicacion( ) != null ){
            Object mult = visitMultiplicacion( ctx.multiplicacion( ) );
            Object pot = visitPotenciacion( ctx.potenciacion( ) );
            if( mult instanceof Integer && pot instanceof Integer ){
                if( ctx.MULTIPLICACION( ) != null ){
                    return (T) (Integer) ((Integer) mult * (Integer) pot);
                }else if( ctx.DIVISION( ) != null ){
                    return (T) (Double) ((new Double(mult.toString( ))) / new Double(pot.toString( )));
                }
                return (T) (Integer) ((Integer) mult % (Integer) pot);
            }else if( (mult instanceof Integer && pot instanceof Double ||
              mult instanceof Double && pot instanceof Integer ||
              mult instanceof Double && pot instanceof Double) && ctx.MODULO( ) == null ){
                if( ctx.MULTIPLICACION( ) != null )
                    return (T) (Double) ((new Double( mult.toString( ) )) * (new Double( pot.toString( ) )));
                return (T) (Double) ((new Double( mult.toString( ) )) / (new Double( pot.toString( ) )));
            }else{
                int line = 0;
                int col = 0;
                String oper = "";
                if( ctx.MULTIPLICACION( ) != null ){
                    line = ctx.MULTIPLICACION( ).getSymbol( ).getLine( );
                    col = ctx.MULTIPLICACION( ).getSymbol( ).getCharPositionInLine( ) + 1;
                    oper = "*";
                }else if( ctx.DIVISION( ) != null ){
                    line = ctx.DIVISION( ).getSymbol( ).getLine( );
                    col = ctx.DIVISION( ).getSymbol( ).getCharPositionInLine( ) + 1;
                    oper = "/";
                }else{
                    line = ctx.MODULO( ).getSymbol( ).getLine( );
                    col = ctx.MODULO( ).getSymbol( ).getCharPositionInLine( ) + 1;
                    oper = "MODULO";
                }
                String type1 = translateType( mult );
                String type2 = translateType( pot );
                error( line, col, " Los tipos de datos no se pueden operar. \n"
                  + type1 + " " + oper + " " + type2 );
            }
            return null;
        }else{
            return visitPotenciacion( ctx.potenciacion( ) );
        }
    }

    @Override
    public T visitPotenciacion( GramaticaParser.PotenciacionContext ctx ){
        if( ctx.potenciacion( ) != null ){
            Object pot = visitPotenciacion( ctx.potenciacion( ) );
            Object neg = visitNegacion( ctx.negacion( ) );
            if( neg instanceof Integer && pot instanceof Integer ){
                return (T) (Integer) ((Double)Math.pow( (Integer) pot, (Integer) neg )).intValue( );
            }else if( neg instanceof Integer && pot instanceof Double ||
              neg instanceof Double && pot instanceof Integer ||
              neg instanceof Double && pot instanceof Double ){
                return (T) (Double) Math.pow( new Double( pot.toString( ) ), new Double( neg.toString( ) ) );
            }else{
                int line = 0;
                int col = 0;
                String oper = "";
                String type1 = translateType( pot );
                String type2 = translateType( neg );
                error( line, col, " Los tipos de datos no se pueden elevar. \n"
                  + type1 + " * " + type2 );
            }
            return null;
        }else{
            return visitNegacion( ctx.negacion( ) );
        }
    }

    @Override
    public T visitNegacion( GramaticaParser.NegacionContext ctx ){
        if( ctx.NO( ) != null ){
            Object neg;
            if( ctx.negacion( ) != null )
                neg = visitNegacion( ctx.negacion( ) );
            else
                neg = visitParentesis( ctx.parentesis( ) );
            if( neg instanceof Boolean ){
                return (T) (Boolean) !(Boolean) neg;
            }
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
            String name = ctx.IDENTIFICADOR( ).getText( );
            Object data = table.get( name.toLowerCase( ) );
            if( data == null ){
                int line = ctx.IDENTIFICADOR( ).getSymbol( ).getLine( );
                int col = ctx.IDENTIFICADOR( ).getSymbol( ).getCharPositionInLine( ) + 1;
                error( line, col, " La variable \"" + name + "\" aun no ha sido declarada." );
            }
            if( ctx.CUADRADOI( ) != null ){
                ArrayList<T> list = new ArrayList<>( );
                list.add( visitExpresion( ctx.expresion( ) ) );
                GramaticaParser.ListaArregloContext ctx2 = ctx.listaArreglo( );
                while( visitListaArreglo( ctx2 ) != null ){
                    list.add( visitListaArreglo( ctx2 ) );
                    ctx2 = ctx2.listaArreglo( );
                }
                for( Object item : list ){
                    if( item instanceof Integer ){
                        if( data instanceof ArrayList ){
                            data = ((ArrayList) data).get( (Integer) item - 1 );
                            if( data instanceof ArrayList )
                                data = new ArrayList( (ArrayList)data );
                        }else{
                            int line = ctx.IDENTIFICADOR( ).getSymbol( ).getLine( );
                            int col = ctx.IDENTIFICADOR( ).getSymbol( ).getCharPositionInLine( ) + 1;
                            error( line, col, " No se puede acceder a la variable \"" + name + "\".\n"
                              + "La variable \"" + name + "\" no posee la dimension especificada." );
                        }
                    }else{
                        int line = ctx.CUADRADOI( ).getSymbol( ).getLine( );
                        int col = ctx.CUADRADOI( ).getSymbol( ).getCharPositionInLine( ) + 1;
                        String type = translateType( item );
                        error( line, col, " No es posible acceder a una posicion de tipo "
                          + type + "." );
                    }
                }
                return (T) data;
            }else{
                return (T) data;
            }
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

        if( ctx.PYC( ) != null){
            return (T) visitExpresion( ctx.expresion( ) );
        }
        return (T) null;

    }

	  @Override
    public T visitListaCondicional( GramaticaParser.ListaCondicionalContext ctx ){

        if( ctx.SINO( ) != null ){
            Object exp = visitExpresion( ctx.expresion( ) );
            if( exp instanceof Boolean ){
                if( (Boolean) exp ){
                    visitInstrucciones( ctx.instrucciones( ) );
                    return null;
                }
                visitListaCondicional( ctx.listaCondicional( ) );
            }else{
                int line = ctx.SINO( ).getSymbol( ).getLine( );
                int col = ctx.SINO( ).getSymbol( ).getCharPositionInLine( ) + 1;
                String type = translateType( exp );
                error( line, col, " No se puede evaluar la expresion de tipo \"" + type +
                  "\" como una expresion de tipo LOGICO." );
            }
        }else if( ctx.OTROCASO( ) != null ){
            visitInstrucciones( ctx.instrucciones( ) );
        }
        return null;

    }

    private void error( int line, int col, String type){
        System.out.println(
          "<" + line + ":" + col + "> Error semantico:" + type );
        System.exit( -1 );
    }

    private String translateType( Object type ){
        if( type instanceof Integer ){
            return "ENTERO";
        }else if( type instanceof Double ){
            return "REAL";
        }else if( type instanceof Boolean ){
            return "LOGICO";
        }else if( type instanceof String ){
            return "CARACTERES";
        }else if( type instanceof ArrayList ){
            return "ARREGLO";
        }else{
            return "INDEFINIDO";
        }
    }

    private ArrayList getNewArray( Object ctx1, Object list1, Object index1, ArrayList array, Object exp1, String error ){

        GramaticaParser.LlamadaIdentificadorContext ctx  = (GramaticaParser.LlamadaIdentificadorContext) ctx1;
        GramaticaParser.ListaArregloContext list = (GramaticaParser.ListaArregloContext) list1;
        GramaticaParser.ExpresionContext exp  = (GramaticaParser.ExpresionContext) exp1;

        if( index1 instanceof Integer ){
            Integer index = (Integer) index1;
            if( index - 1 <= array.size( ) && index - 1 >= 0 ){
                if( index - 1 == array.size( ) ){
                    array.add( visitExpresion( exp ) );
                    return array;
                }else{
                    Object aux1 = array.get( index - 1 );
                    Object index2 = visitListaArreglo( list );
                    if( index2 != null ){
                        if( aux1 instanceof ArrayList ){
                            String type = translateType( index );
                            aux1 = getNewArray( ctx, list.listaArreglo( ), index2,
                              (ArrayList) aux1, exp, error + type + ", " );
                            array.set( index - 1, aux1 );
                            return array;
                        }else{
                            int line = ctx.IDENTIFICADOR( 0 ).getSymbol( ).getLine( );
                            int col = ctx.IDENTIFICADOR( 0 ).getSymbol( ).getCharPositionInLine( ) + 1;
                            error( line, col, " No es posible acceder a la dimension requerida del arreglo \""
                            + ctx.IDENTIFICADOR( 0 ).getText( ) + "\"." );
                        }
                    }else{
                        Object aux2 = visitExpresion( exp );
                        if( aux1.getClass( ) == aux2.getClass( ) ){
                            array = new ArrayList<>( array );
                            array.set( index - 1, aux2 );
                            return array;
                        }else{
                            int line = ctx.IDENTIFICADOR( 0 ).getSymbol( ).getLine( );
                            int col = ctx.IDENTIFICADOR( 0 ).getSymbol( ).getCharPositionInLine( ) + 1;
                            String type1 = translateType( aux1 );
                            String type2 = translateType( aux2 );
                            error( line, col, " El tipo de dato asignado es distinto al tipo de dato apuntado\n" +
                              "No es posible asignar un dato de tipo \"" + type2 + "\" a un dato de tipo \"" + type1 + "\"" );
                        }
                    }
                }
            }else{
                int line = ctx.IDENTIFICADOR( 0 ).getSymbol( ).getLine( );
                int col = ctx.IDENTIFICADOR( 0 ).getSymbol( ).getCharPositionInLine( ) + 1;
                error( line, col, " La posicion " + index.toString( ) + " del arreglo "
                  + ctx.IDENTIFICADOR( 0 ).getText( ) + " esta fuera de los limites.\n"
                  + "Intervalo [ 1, " + ((Integer) (array.size( ) + 1)).toString( ) + " ]" );
            }

        }else{
            int line = ctx.IDENTIFICADOR( 0 ).getSymbol( ).getLine( );
            int col = ctx.IDENTIFICADOR( 0 ).getSymbol( ).getCharPositionInLine( ) + 1;
            String type = translateType( exp );
            error( line, col, " No es posible acceder a una posicion no entera del arreglo \n"
              + error + type + " ]" );
        }
        return null;
    }

    private void imprimir( Object exp, int line, int col ){

        if( exp instanceof Integer ){
            System.out.print( exp );
            System.out.print( " " );
        }else if( exp instanceof String ){
            System.out.print( ((String) exp).replace( "\"", "" ) );
            System.out.print( " " );
        }else if( exp instanceof Double ){
            System.out.print( exp.toString( ).replace( ".", "," ) );
            System.out.print( " " );
        }else if( exp instanceof Boolean ){
            if( (Boolean) exp )
                System.out.print( "VERDADERO" );
            else
                System.out.print( "FALSO" );
            System.out.print( " " );
        }else if( exp instanceof ArrayList ){
            System.out.print( "[ " );
            for( Object item : (ArrayList) exp ){
                if( item instanceof ArrayList ){
                    imprimir( item, line, col );
                    System.out.print( " , " );
                }else
                    System.out.print( item.toString( ) + " , " );
            }
            System.out.print( " ]" );
        }else
            error( line, col, " No es posible imprimir el tipo de dato referido." );

        return;
    }

}
