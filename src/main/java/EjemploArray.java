/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java;

/**
 *
 * @author carlosandres.mendez
 */
public class EjemploArray {
    
    static String miVarGlobal;
    
    public static void main(String[] args){
        //generarSubCadenas();
        generarSplit();
    }
    
    public static void generarSplit(){
        int resultado=0;
        String[] arreglo;
        String texto = "3+4";
        if(texto.contains("+")){
            arreglo = texto.split("\\+");
            int num1 = Integer.parseInt(arreglo[0]);
            int num2 = Integer.parseInt(arreglo[1]);
            resultado = num1 + num2;
        }
        else if(texto.contains("-")){
            arreglo = texto.split("-");
            int num1 = Integer.parseInt(arreglo[0]);
            int num2 = Integer.parseInt(arreglo[1]);
            resultado = num1 - num2;
        }
        else if(texto.contains("*")){
        
        }
        else{
        
        }
        
        System.out.println("Resultado: "+resultado);
    }
    
    
    //Este metodo descompone una cadena de texto, 
    //obtiene el operador que un usuario digito y
    //realiza la operacion que corresponda con un switch
    //e imprime el resultado.
    public static void generarSubCadenas(){
        String texto = "3+4";
        String num1 = texto.substring(0, 1);
        String oper = texto.substring(1, 2);
        String num2 = texto.substring(2, 3);
        
        System.out.println("Num1: "+num1);
        System.out.println("Oper: "+oper);
        System.out.println("Num2: "+num2);
        
        int numero1 = Integer.parseInt(num1);  
        int numero2 = Integer.parseInt(num2); 
        
        int resultado=0;
        switch(oper){
            case "+":{
                resultado = numero1 + numero2;
                break;
            }
            case "-":{
                resultado = numero1 - numero2;
                break; 
            }   
        }
        
        System.out.println("Resultado: "+resultado);
    }
    
    public static void prueba(int numEstudiantes){
        
        miVarGlobal="Curso progra I";
        System.out.println("Resultado: "+miVarGlobal);
    }
}
