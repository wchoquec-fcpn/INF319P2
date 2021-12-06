// Calculadora Aritmetica Aplicando Lambda
// Para compilar utilizamos scalac : scalac .\calcuLambda.scala
// Para Ejecucion : scala calcuLambda.scala
object calculadora {
    //   Sintaxis :
    //> val lambda_exp = (variable:Type) => Transformation_Expression
    val suma = (a:Int,b:Int) => a+b
    val resta = (a:Int,b:Int) => a-b
    val multiplica = (a:Int,b:Int) => a*b
    val divide = (a:Int,b:Int) => a/b
      
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
            case '+'=> result=suma(num1,num1)
            case '-'=> result=resta(num1,num2)
            case '*'=> result=multiplica(num1,num2)
            case '/'=> result=divide(num1,num2)
            case _=>printf("Invalida operacion.\n")
        }
        println("Resultado: "+result);
    }
}  
