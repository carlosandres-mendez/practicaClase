/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.aerolinea;

/**
 *
 * @author Andres
 */
public class Tester {
    
    // function to generate a random string of length n 
    static String getAlphaNumericString(int n) 
    { 
  
        // chose a Character random from this String 
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 
  
        // create StringBuffer size of AlphaNumericString 
        StringBuilder sb = new StringBuilder(n); 
  
        for (int i = 0; i < n; i++) { 
  
            // generate a random number between 
            // 0 to AlphaNumericString variable length 
            int index 
                = (int)(AlphaNumericString.length() 
                        * Math.random()); 
  
            // add Character one by one in end of sb 
            sb.append(AlphaNumericString 
                          .charAt(index)); 
        } 
  
        return sb.toString(); 
    } 
    
    public static void main(String args[]){ 
        
        Persona[] clientes = new Persona[10];
        for(int i=0;i<clientes.length;i++){
            clientes[i]=new Persona(
                    getAlphaNumericString(7),
                    getAlphaNumericString(7),
                    30, 
                    true, 
                    "CR", 
                    null
            );  
        }
  
        Aerolinea a = new Aerolinea();
        a.clientes = clientes;
        
        a.vuelo = new Vuelo(
        
        );
        
        a.p1.setNombre("Carlos");
        a.p1.setApellidos("Mendez R");
        a.p1.setLugarNacionalidad("SJ");
        
  
        a.p2.setNombre("Laura");
        a.p2.setApellidos("Gutierrez");
        a.p2.setLugarNacionalidad("Cartago");
       
        
        a.p3.setNombre("Mario");
        a.p3.setApellidos("Rodriguez");
        a.p3.setLugarNacionalidad("Alajuela");  
        a.p3.setEdad(30);
        
        //imprimir nombre completo de las personas 
        a.getP1().imprimirNombreCompleto();
        System.out.println(a.getP1().getLugarNacionalidad());
        
        a.p2.imprimirNombreCompleto();
        System.out.println(a.p2.getLugarNacionalidad());
        
        a.p1.imprimirTodosDatos();
        a.p2.imprimirTodosDatos();
        a.p3.imprimirTodosDatos();
        
        //muestra mensaje persona 3 es de riesgo
        boolean valorRetornado = a.personaRiesgo(a.p3);
        if(valorRetornado==true){
            System.out.println(a.p3.getNombre()+" sí es de riesgo");
        }
        else{
            System.out.println(a.p3.getNombre()+" no es de riesgo");
        } 
        
        //Mostramos los nombres de los clientes de Aerolinea
        a.imprimirNombreClientes();
    }
}
