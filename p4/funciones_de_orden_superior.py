#  Funciones de orden superior
# Ejecutar: \.spyder-py3>py funciones_de_orden_superior.py
def suma(x,y):
    return x + y
def resta(x,y):
    return x - y
def multiplica(x,y):
    return x * y
def dividir(x,y):
   return x/y


def calculadora(x,y,fun): # function as an argument
    result = fun(x,y)
    print(result)

if __name__ == "__main__":
    calculadora(8,2,suma) # output 10
    calculadora(8,2,resta) # output 6
    calculadora(8,2,multiplica) # output 16
    calculadora(8,2,dividir) # output 4

    
    