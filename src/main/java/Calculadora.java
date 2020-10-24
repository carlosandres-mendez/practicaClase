public class Calculadora{

	String color= "FFFFFF";
	String nombre;
	int tamaño;

	public int sumar(int var1, int var2, String temp){       
                nombre = "Mi Calc basica";
		int resultado; 
		resultado = var1 + var2;
		return resultado;
	}
        
	public int sumar(String nombre, int var1, int var2){
		int resultado; 
		resultado = var1 + var2;
		return resultado;
	}  
        
	public int sumar(int var1, int var2){
		int resultado; 
		resultado = var1 + var2;
		return resultado;
	}
        
	public double sumar(double var1, double var2){
		double resultado; 
		resultado = var1 + var2;
		return resultado;
	}        

	public int multiplicar(int var1, int var2){
               
		int resultado; 
		resultado = var1 * var2;
		return resultado;
	}
        
        public String calcularEstadisticas(String[] pCedulas){
            int statCed1=0;
            int statCed2=0;
            int statCed3=0;
            int statCed4=0;
            for(int i=0;i<pCedulas.length;i++){
                String cedula = pCedulas[i];
                String[] subCadenas = cedula.split("-");
                //subCedenas 2 2356 6432
                if(subCadenas[0].equals("1")){
                    statCed1++;
                }
                else if(subCadenas[0].equals("2")){
                    statCed2++;
                }
                else if(subCadenas[0].equals("3")){
                    statCed3++;
                }
                else{
                    statCed4++;
                }
            }
            
            //Crear texto para imprimir y retornar
            String resultFinal = "Estadísticas cedula 1: "+statCed1 +"\n"
                    + "Estadísticas cedula 2: "+statCed2 +"\n"
                    + "Estadísticas cedula 3: "+statCed3 +"\n"
                    + "Estadísticas cedula 4: "+statCed4 +"\n";
            
            return resultFinal;
        }

        public static void main(String[] args) {
            //int suma = sumar(2,3);
            //System.out.println(suma);
            
            int numero1 = 234;
            int numero2 = 324;
            
            Calculadora hkgjy = new Calculadora();
            int suma = hkgjy.sumar(numero1, numero2);
            System.out.println(suma);
            
            String[] cedulas = {"2-2356-6432","2-3344-5222",
            "4-1122-3345","1-2244-5567"};
            String stats = hkgjy.calcularEstadisticas(cedulas);
            System.out.println(stats);
        }
}
