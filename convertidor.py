import sys

def convertidor( palabra ):
    resultado = ""
    for i in palabra:
        resultado += "[" + i + chr( ord( i ) + 32 ) + "]"
    print( resultado + ";" )

l = sys.stdin.readline( ).strip( )
convertidor( l )
