
// 3. Dada una frase cualquiera descomponer la misma en palabras 
// y otra en letras, utilizar funciones en SCALA.
// Para compilar utilizamos scalac :\desPalCarS> scalac .\descomponePalChar.scala
// Para Ejecucion scala :\desPalCarS> scala descomponePalChar.scala 
object Descomponiedo {
    val cadena="descomponer palabras y letras"
    // Main method 
    def main(args:Array[String]) 
    { 
        cadena.split(" ").foreach(println) 
        // Applying toCharArray method 
        cadena.toCharArray().foreach(println)  
        
    }    
}
