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
    
    public static void main(String[] args){
        String[] miArreglo = {"a","y","r","t"};
        
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
}
