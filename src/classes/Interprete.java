package classes;

import java.io.File;
import java.io.FileInputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Interprete
{

    public static void main( String [] args ) throws Exception{

    	System.out.println( );
        System.setIn( new FileInputStream( new File( args[0] ) ) );
        ANTLRInputStream input = new ANTLRInputStream( System.in );
        GramaticaLexer lexer = new GramaticaLexer( input );
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        GramaticaParser parser = new GramaticaParser( tokens );
        ParseTree tree = parser.programa( );

        Visitor<Object> loader = new Visitor<>( );
        loader.visit( tree );
        System.out.println( );

    }

}
