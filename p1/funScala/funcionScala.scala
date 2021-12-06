// Calculadora Aritmética Con Scala Aplicando Funciones
// Para compilar utilizamos scalac :\funScala> scalac .\funcionScala.scala
// Para Ejecucion scala :\funScala> scala funcionScala.scala
object funcionScala {
    //    Una declaración de función de Scala tiene la siguiente forma:
    //---> def functionName ([list of parameters]) : [return type]
    def suma(a:Int,b:Int):Int=a+b
    def resta(a:Int,b:Int):Int=a-b
    def multiplica(a:Int,b:Int):Int=a*b
    def divide(a:Int,b:Int):Int=a/b

    def main(args: Array[String]) {  
        var ch:Char=0
        var num1:Int=0
        var num2:Int=0
        var result:Int=0
        
        
        print("Elija la operación a realizar (+,-,*,/): ")
        ch=scala.io.StdIn.readChar()
        
        print("Ingresa el primer número: ")
        num1=scala.io.StdIn.readInt()
        
        print("Ingresa el segundo número: ")
        num2=scala.io.StdIn.readInt()
        
        ch match{
            case '+'=> result=suma(num1,num2)
            case '-'=> result=resta(num1,num2)
            case '*'=> result=multiplica(num1,num2)
            case '/'=> result=divide(num1,num2)
            case _=>printf("Invalida operacion.\n")
        }
        println("Resultado: "+result);
    }
}  
