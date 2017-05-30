package classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

//
//import classes.GramaticaLexer;
//import classes.GramaticaParser;
//import classes.Visitor;
//import main.Imprimir;
//import main.MyArray;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PShape;

public class Linit extends PApplet {

	//public Visitor<Object> loader;
	//MyArray a = new MyArray( this );
	//Imprimir imp = new Imprimir( this);


	PShape square,square1,square3, square2,square4,square5,square6,square7,square8,square9, square10;
	PFont f;
	PFont f1,f2;
	float x,y;
	int contador=0;
	int cont=1;
	int intentos =0;
	ParseTree tree;
	// Variable to store text currently being typed
	String typing = "";
	// Variable to store saved text when return is hit
	String saved = "";
	public Visitor<Object> loader;

	public void setup(){


        //loader.run();
		background(0);
				square = createShape(RECT, 0, 0, 600, 625);
				square1 = createShape(RECT, 0, 0, 500, 450);
				square2 = createShape(RECT, 0, 0, 100, 35);
				square7 = createShape(RECT, 0, 0, 500, 35);
				square8 = createShape(RECT, 0, 0, 500, 35);
				square3 = createShape(RECT, 0, 0, 600, 25);
				square4 = createShape(RECT, 0, 0, 500, 25);
				square5 = createShape(RECT, 0, 0, 500, 25);
				square6 = createShape(RECT, 0, 0, 500, 180);
				square9 = createShape (RECT, 0,0, 100, 30);
				square10 = createShape (RECT, 0, 0, 1000, 605);
				square.setFill(color(255, 255, 255));


				//square.setStroke(204, 102, 0);
				square1.setFill(color(255,255, 255));
				square1.setStroke(false);
				square2.setFill(color(94,152,244));
				square7.setFill(color(94,152,244));
				square8.setFill(color(94,152,244));
				square3.setFill(color(94,152,244));
				square4.setFill(color(94,152,244));
				square5.setFill(color(94,152,244));
				square6.setFill(color(255,255,255));
				square9.setFill(color(0,0,0));
				square10.setFill(color(255,255,255));
				 f = createFont("Arial",25,true);  // Loading font
				 f1 = createFont("Consolas",15,false);  // Loading font
				 f2 = createFont("Times New Roman",15,false);  // Loading font
				 try {
						System.setIn( new FileInputStream( new File( "input.linit" ) ) );
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			        ANTLRInputStream input = null;
					try {
						input = new ANTLRInputStream( System.in );
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			        GramaticaLexer lexer = new GramaticaLexer( input );
			        CommonTokenStream tokens = new CommonTokenStream( lexer );
			        GramaticaParser parser = new GramaticaParser( tokens );
			        tree = parser.programa( );
			        loader = new Visitor<Object>(this);

	}



	public void draw(){
		// a.draw();
		 x = mouseX;
		 y = mouseY;
		fill(255);
		stroke(255);
		tint(100, 100);
		shape(square, 10, 10);
		shape(square1, 630, 10);
		shape(square3, 10,10);
		shape(square4, 630,10);
		shape(square5, 630,430);
		shape(square6, 630,455);

		textFont(f,60);
		fill(255, 255, 255);
		//text("PUTA VERGA", 1000, 620);
		text("Linit",1160,80);
		textFont(f1,20);

		//text("Speed",1100,100);
		text("The new",1170,115);
		text("programming",1155,145);
		text("language",1170,175);
		rect(1140,190,150,1);
		fill(0, 0, 0);
		textFont(f,18);
		text("Code", 250, 30);
		text("Visual Representation", 800, 30);
		text("Console",850,450);

		for (int i = 0; i<30; i++){
			fill(161,161,161);
			rect(589,35+(20*i),20,20);
		}

		for (int i = 0; i<28; i++){
			fill(0,0,0);
			textFont(f1,13);
			text(i+1,593,70+(20*i));
		}
		//contador++;
		textFont(f1,15);
		text("↑",595,50	);
		text("↓",595,630);
		//text(""+5,580,630);
		fill(0,0,0);
//		fill(255);
//		shape(square, 10, 10);
//		fill(155,55,46);
//		a.draw();
//		imp.draw();
		try {
			imprimir();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

	      ///System.out.println("CONTADOR" + cont);
		//System.out.println("X" + x + "Y" + y);
			if ((x >= 470 && x <= 480) && (y <=55 && y>=35)){
				print("entro");
				pintar();
			}

		try {
			textFont(f1,15);
			imprimir();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//recorrer();
		fill(255);

		reseteando();
		//cuadros();


	}

	public void reseteando(){
		visitar();
	}

	public void keyPressed(){
		redraw();
	}
	public void demora(){
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void pintar(){

		    //System.out.println("ENTRO HP");
			for (int i = 0; i<28+contador; i++){
				System.out.println("X" + x + "Y" + y);
				fill(0,0,0);
				rect(50,50*i,50,50);
				textFont(f1,13);
				text(i+1,475,70+(20*i));
			}


	}

	public void recorrer(){

		for (int i = 0; i<cont; i++){
			//text("Entro", 30, 200+10*2*i);
			//esperarXsegundos(1000/1000);
			fill(247,7,7);
			rect(20, 56+10*2*i, 445, 3);
			//demora();
			//fill(255,255,255);
			//rect(20, 56+10*2*i, 445, 3);

			//delay(1000);
			//this.esperarXsegundos(i);
			//fill(0);
			// Display everything
//			  text("Click in this sketch and type. \nHit return to save what you typed.", 20, 605);
//			  text(typing, 20, 600);
//			  text(saved, 20, 620);
		}
	}


   public void cuadros(){
//
//	   fill(100,25,45);
//		for (int i = 0; i< 8; i++){
//			rect(650+ (50*i), 50, 40, 40);
//			text(i+1, 650+ (50*i), 50);
//		}
//		for (int i = 0; i< 8; i++){
//			//fill(155,55,46);
//			rect(650+ (50*i), 150, 40, 40);
//			text(i+1, 650+ (50*i), 150);
//		}
//
//		for (int i = 0; i< 8; i++){
//			//fill(155,55,46);
//			rect(650+ (50*i), 300, 40, 40);
//			text(i+1, 650+ (50*i), 300);
//		}
	   contador++;
   }

   public void visitar()
   {

	   if(intentos==0){
		loader.visit( tree );
		intentos++;
	   }
   }

	public void settings(){
		size(1300, 645);
	}

	public void imprimir() throws IOException{
			 String cadena;
		     FileReader f;

			f = new FileReader("input.linit");
		     BufferedReader b = new BufferedReader(f);
		       int cont=1;
				while((cadena = b.readLine())!=null) {
				      text(cadena, 20, 55+20*cont);
				      cont++;

				  }


				b.close();

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(new String[]{"Linit"});

	}
}
