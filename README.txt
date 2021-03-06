--------------------------------------------------------------------------------
                                      LINIT
--------------------------------------------------------------------------------

PRE-REQUISITOS.
  Tener instalado el JDK y el JRE de Java 1.8

--------------------------------------------------------------------------------

Para ejecutar el siguiente lenguaje existen  distintas vias para el uso del pro-
yecto. A continuación se describe los archivos encontrados.

ARBOL DEL PROYECTO

- proyecto
    |
    - src
        |
        - classes (package)
            |
            - ...
            |
            - Interprete.class
        |
        - input1.txt
        |
        - input2.txt
        |
        - input3.txt
        |
        - input4.txt
        |
        - input5.txt
        |
        - input6.txt
    |
    - xtext
        |
        - Linit.xtext
    |
    - Gramatica.g4
    |
    - README.txt


El proyecto consta del directorio raíz (la carpeta con nombre proyecto). En ésta
carpeta se encuentran los siguientes archivos:
 - Gramatica.g4 : Archivo que contiene la gramática del lenguaje LINIT en sinta-
   xis de ANTLR4.
 - README.txt : Archivo con la secuencia de pasos necesarios para su ejecución.

En la carpeta de proyecto/src se encuentran una serie de archivos nombrados como
input<X>.linit, donde el X es  un número entre 1 y 6, y que poseen una extensión
.linit, lo cual nos brinda una ayuda visual para el uso del lenguaje en eclipse.
Cada uno de estos archivos posee un ejemplo  de implementación, desde lo más bá-
sico hasta ejemplos "avanzados" para un curso de programación básica.

La carpeta proyecto/src/classes es un package de tipo java, que posee el archivo
Interprete.class, el cual contiene el método principal encargado de ejecutar nu-
estro archivo ".linit".

La carpeta proyecto/xtext posee el archivo necesario para generar la ayuda visu-
al.

**********************************
CONSOLA.

 Para ejecutar desde consola nuestro archivo .linit, es necesario ubicarse en la
 carpeta proyect/src.
    En windows, ejecutamos la tecla Windows + R y escribimos en el espacio "cmd"
    Una vez abierto el terminal, escribimos la dirección completa donde se encu-
    entra el archivo. Por ejemplo, "cd C:\Users\Sebas\Documents\proyecto\src".
 Luego de entontrarnos en el  directorio  especificado, y teniendo allí mismo el
 archivo de tipo .linit, escribimos el siguiente comando:
    java classes.Interprete <nombreDelArchivo>.linit
 Por ejemplo, si poseemos archivo tiene por nombre "suma", escribiríamos:
    java classes.Interprete suma.linit
 Y así, podemos codificar y hacer uso del lenguaje de programación LINIT.

*********************************
ECLIPSE

 Para hacer uso de este IDE, es necesario:
  1. Tener instalado Eclipse, para java.
  2. Descargar el plugin de xtext, versión 2.12.0

 Luego de cumplir los requisitos, crear un proyecto xtext con los siguientes ar-
 gumentos:
    Project name: linit
            name: linit.Linit
      extensions: linit
 Una vez generado  el proyecto, copíar  la gramática  en el  archivo Linit.xtext
 (el archivo que se abre al finalizar el proyecto).
 Luego, guardar los cambios y pulsar  click derecho sobre  el mismo archivo, dar
 click sobre Run As > Generate Xtext Artifacts.

 Luego de generar los artefactos necesarios por Xtext, en el Project Explorer de
 Eclipse, sobre la carpeta linit, pulsar click derecho sobre la carpeta, dar cli-
 ck sobre Run As > Eclipse Application.

 Al abrir la nueva ventana de Eclipse, crear un nuevo proyecto como Java project.
 Colocar el nombre deseado al proyecto.
 En la carpeta src que viene por defecto, pegar los archivos que están dentro de
 nuestro proyecto LINIT (Especialmente el package classes).
 Luego de esto, nos percatamos de que nos aparece  un error en nuestro proyecto,
 para solucionarlo damos click derecho sobre nuestro nuevo proyecto y selecciona-
 mos Build Path > Configure Build Path...
 En Java Build Path, en la pestaña  libraries, nos debe  aparecer la opción "Add
 External JASs...". Allí buscamos y seleccionamos el .jar de ANTLR4 y le damos en
 OK

 En este punto, ya podemos abrir el ambiente de desarrollo LINIT.
 Los archivos deben ser generados dentro del proyecto nuevo.
 Para ejecutar la aplicación con eclipse, damos click derecho en el archivo .linit
 y seleccionamos Run As > Run Configurations...
 Allí debe aparecer el screen de configuraciones de la ejecución.
 Creamos un Java  Application (doble click derecho  sobre este) y completamos lo
 siguiente:
    En la pestaña main.
        Project: Seleccionamos nuestro proyecto.
        Main class: classes.Interprete
    En la pestaña Arguments.
        Program arguments: ${file_prompt}
 Dar click en Run.

 ¡Listo! La adecuación del entorno de desarrollo quedó completa.
 Ahora siempre que se ejecute un archivo de tipo .linit, se hará mediante la con-
 figuración que realizamos.

*********************************
PROCESSING
 
