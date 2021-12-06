package modelo;

public class Calcular {
private	String cad="";
	private String nombre;

    
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
				
		this.nombre = envioFibonacci(Integer.parseInt(nombre));
	}


 
    public String envioFibonacci(int n) {
    	
    	for(int i = 0; i<n; i++){
    		 cad=cad+ funcionFibonacci(i)+",";
       }
       
    	return cad;
    }

   
    public  int funcionFibonacci(int num){
        if(num == 0 || num==1)
             return num;
        else
             return funcionFibonacci(num-1) + funcionFibonacci(num-2);
   }

    
 

}
