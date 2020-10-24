/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andres
 */
public class Figuras {

    public static void main(String[] args) {
        /*
        AAA           
        AAA           
        AAA  
         */
        int n = 7;
        /*
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (i == (n - 1)) {
                    System.out.print("*");
                }
                else if(j==(n-i)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
         */

        /*
        for (int i = 0; i < n; i++) {
            System.out.println("A" + i);
            System.out.println("B" + i);
            System.out.println("C" + i);
            System.out.println("D" + i);
            System.out.println("E" + i);
            if (i > 3) {
                break;
            }
        }*/
        
        /*
        int num1 = 2;
        int num2 = 2445;
        if(num1==num2)
            System.out.println("Los numeros son iguales");
        else 
            System.out.println("Los numeros no son iguales");
        
        String cedula = "1-1234-1435";
        String nombre0 = "";
        String nombre1 = "Maria";
        String nombre2 = "Valeria";
        
        System.out.println(nombre1.length());     
        System.out.println(nombre2.length());
        if(nombre1.contains("M")){
            System.out.println("Si contiene la letra M");
        }
        System.out.println("La posicion de la i es: "  + nombre1.indexOf("i"));
        if(nombre0.isEmpty()){
            System.out.println("La variable esta vacia");
        }
        int statCedulas1 = 0;
        String[] subCadenas = cedula.split("-");
        System.out.println(subCadenas[0] + " " +  subCadenas[1]+ " " +  subCadenas[2]);
        if(subCadenas[0].equals("1")){
           statCedulas1++; 
        }
        System.out.println("Estadisticas cedulas 1: "+statCedulas1);
        
        if(nombre1.equals(nombre2)){
            System.out.println("Los nombres son iguales");
        }
        else{
            System.out.println("Los nombres no son iguales");
        }
        */
        
        /*
        int miNumero = 0;
        
        switch(miNumero){
            case 0:{
                System.out.println("A");
                break;
            }
            case 1:{
                System.out.println("B");
                break;
            }
            case 2:{
                System.out.println("C");
                break;
            }
            default:{
                System.out.println("D");
            }
        }
        
        String nombre = "Maria";
        System.out.println(nombre.substring(0, 1));
       
        
        switch(nombre.substring(0, 1)){
            case "A":{
                System.out.println("AAAA");
                break;
            }
            case "B":{
                System.out.println("BBB");
                break;
            }
            case "M":{
                System.out.println("MMMM");
                break;
            }
            default:{
                System.out.println("DDDD");
            }
        }  
*/
/*        
        int numTiquete = 12;
        double otra = 341324324324233.22;
        //conversion automatica
        otra = numTiquete;
        
        //conversion manual -casting-
        numTiquete = (int) otra;
*/

/*
    double resultado = Math.max(22.3, 56.7);
    System.out.println(resultado);
    System.out.println(Math.random());
    int resul = (int) Math.pow(2, 3);
    System.out.println("2 elevado 3 = "+resul);
*/


    }
}
