grammar gramatica;

programa
      : instrucciones EOF
      | EOF;
instrucciones
      : nominacion PUNTO instrucciones
      | AREGLO VARIABLE tipoVariable IDENTIFICADOR LONGITUD expresion listaArreglo PUNTO instrucciones
      | IDENTIFICADOR (CUADRADOI expresion listaArreglo CUADRADOD)? igualdad PUNTO instrucciones
      | SI expresion DP instrucciones listaCondicional FIN PUNTO instrucciones
      | ciclo PUNTO instrucciones
      | IMPRIMIR expresion listaImpresion PUNTO instrucciones
      | CAPTURAR IDENTIFICADOR PUNTO instrucciones
      | ;
nominacion
      : VARIABLE tipoVariable IDENTIFICADOR igualdad?
      | CONSTANTE tipoVariable IDENTIFICADOR igualdad;
tipoVariable
      : ENTERA
      | REAL
      | LOGICA
      | CARACTERES;
igualdad
      : IGUAL expresion
      | SIGNOIGUAL expresion;
expresion
      : operacionOY;
operacionOY
      : operacionOY ( Y | SIGNOY | O | SIGNOO ) comparacion | comparacion ;
comparacion
      : comparacion opcomparacion aritmetica | aritmetica ;
opcomparacion
      : (MENOR | SIGNOMENOR)
      | (MENORIGUAL | SIGNOMENORIGUAL)
      | (MAYOR | SIGNOMAYOR)
      | (MAYORIGUAL | SIGNOMAYORIGUAL)
      | (DIFERENTE | SIGNODIFERENTE)
      | (IGUAL | SIGNOIGUAL);
aritmetica
      : aritmetica ( SUMA | RESTA ) multiplicacion | multiplicacion ;
multiplicacion
      : multiplicacion ( MULTIPLICACION | DIVISION | MODULO ) potenciacion | potenciacion;
potenciacion
      : potenciacion POTENCIA negacion | negacion;
negacion
      : NO ( negacion | parentesis ) | parentesis;
parentesis
      : IZQUIERDO expresion DERECHO | dato;
dato
      : IDENTIFICADOR (CUADRADOI expresion listaArreglo CUADRADOD)? | numero | logico | FRASE ;
logico
      : VERDADERO
      | FALSO;
numero
      : ENTERO
      | NREAL ;
listaArreglo
      : PYC expresion listaArreglo
      | ;
listaCondicional
      : SINO expresion DP instrucciones listaCondicional
      | OTROCASO DP instrucciones
      | ;
ciclo
      : REPETIR expresion VECES DP instrucciones FIN
      | REPETIR MIENTRAS expresion SEA logico DP instrucciones FIN;
listaImpresion
      : PYC expresion listaImpresion
      | ;
LINE_COMMENT
      : '>>' ~[\r\n]* -> skip ;
WS    : [ \t\r\n]+ -> skip ;

VARIABLE
      : [V][Aa][Rr][Ii][Aa][Bb][Ll][Ee];
CONSTANTE
      : [C][Oo][Nn][Ss][Tt][Aa][Nn][Tt][Ee];
ENTERA
      : [E][Nn][Tt][Ee][Rr][Aa];
REAL
      : [R][Ee][Aa][Ll];
LOGICA
      : [L][Oo][Gg][Ii][Cc][Aa];
CARACTERES
      : [D][Ee][ ][C][Aa][Rr][Aa][Cc][Tt][Ee][Rr][Ee][Ss];
Y
      : [Y];
SIGNOY
      : '/\\';
O
      : [O];
SIGNOO
      : '\\/';
MENOR
      : [E][Ss][ ][M][Ee][Nn][Oo][Rr];
SIGNOMENOR
      : '<';
MENORIGUAL
      : [E][Ss][ ][M][Ee][Nn][Oo][Rr][ ][O][ ][I][Gg][Uu][Aa][Ll];
SIGNOMENORIGUAL
      : '<=';
MAYOR
      : [E][Ss][ ][M][Aa][Yy][Oo][Rr];
SIGNOMAYOR
      : '>';
MAYORIGUAL
      : [E][Ss][ ][M][Aa][Yy][Oo][Rr][ ][O][ ][I][Gg][Uu][Aa][Ll];
SIGNOMAYORIGUAL
      : '>=';
IGUAL
      : [E][Ss][ ][I][Gg][Uu][Aa][Ll][ ][A];
SIGNOIGUAL
      : '=';
DIFERENTE
      : [E][Ss][ ][D][Ii][Ff][Ee][Rr][Ee][Nn][Tt][Ee][ ][D][Ee];
SIGNODIFERENTE
      : '/=';
SUMA
      : '+';
RESTA
      : '-';
MULTIPLICACION
      : '*';
DIVISION
      : '/';
MODULO
      : [M][Oo][Dd][Uu][Ll][Oo];
POTENCIA
      : '**';
NO
      : [N][Oo][ ][S][Uu][Cc][Ee][Dd][Ee];
IZQUIERDO
      : '(';
DERECHO
      : ')';
ENTERO
      : '-'? [0-9]+;
NREAL
      : '-'? [0-9]+ ',' [0-9]+;
VERDADERO
      : [V][Ee][Rr][Dd][Aa][Dd][Ee][Rr][Oo];
FALSO
      : [F][Aa][Ll][Ss][Oo];
FRASE
      : '"' .*? '"' ;
PUNTO
      : '.';
AREGLO
      : [A][Rr][Rr][Ee][Gg][Ll][Oo];
LONGITUD
      : [D][Ee][ ][L][Oo][Nn][Gg][Ii][Tt][Uu][Dd];
CUADRADOI
      : '[';
CUADRADOD
      : ']';
PYC
      : ';';
SI
      : [S][Ii];
ES
      : [E][Ss];
DP
      : ':';
SINO
      : [O][ ][S][Ii];
OTROCASO
      : [E][Nn][ ][O][Tt][Rr][Oo][ ][C][Aa][Ss][Oo];
REPETIR
      : [R][Ee][Pp][Ee][Tt][Ii][Rr];
MIENTRAS
      : [M][Ii][Ee][Nn][Tt][Rr][Aa][Ss];
SEA
      : [S][Ee][Aa];
VECES
      : [V][Ee][Cc][Ee][Ss];
FIN
      : [F][Ii][Nn];
IMPRIMIR
      : [I][Mm][Pp][Rr][Ii][Mm][Ii][Rr][ ][E][Nn][ ][C][Oo][Nn][Ss][Oo][Ll][Aa];
CAPTURAR
      : [C][Aa][Pp][Tt][Uu][Rr][Aa][Rr][ ][D][Ee][ ][C][Oo][Nn][Ss][Oo][Ll][Aa];
IDENTIFICADOR
      : [a-z][a-zA-Z0-9]*;
