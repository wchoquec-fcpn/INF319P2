// 4. Generar funciones de (orden superior) que permita 
//    realizar los solicitado en el punto 2. 

// Para compilar utilizamos :\orden_Superior> scalac ordenSuperior .\ordenSuperior.scala
// Para Ejecucion scala :\orden_Superior> scala ordenSuperior.scala
object ordenSuperior {

def suma(a:Int,b:Int):Int = a + b; 
def resta(a:Int,b:Int):Int=a-b
def multiplica(a:Int,b:Int):Int=a*b
def divide(a:Int,b:Int):Int=a/b
 //El parámetro de la función es la función
def fun(a:Int,b:Int,calcu:(Int,Int)=>Int)={
    calcu(a,b);
}


def main(args: Array[String]): Unit = {

     println( fun(8,2,suma));
     println( fun(8,2,resta));
     println( fun(8,2,multiplica));
     println( fun(8,2,divide));
}

}