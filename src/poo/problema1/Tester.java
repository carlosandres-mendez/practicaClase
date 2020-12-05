/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.problema1;

import java.util.Scanner;

/**
 *
 * @author Andres
 */
public class Tester {
    public static void main(String[] args){
        //CONFIGURAR MONEDAS
         Moneda mColon = new Moneda("Colon", 1);
         Moneda mDolar = new Moneda("Dolar", 500);
         Moneda mEuro = new Moneda("Euro", 765);
         
        //INICIA 
        Scanner s = new Scanner(System.in);
        MaqConvertidora maq = new MaqConvertidora(mColon,mDolar,mEuro);
        //maq.setMonedaColon(mColon);
        //maq.setMonedaDolar(mDolar);
        //maq.setMonedaEuro(mEuro);
        
        while(true){
            System.out.println("Digite la moneda de origen 1=Colon 2=Dolar 3=Euro");
            int numMonedaOrigen = s.nextInt();
            System.out.println("Digite la moneda de salida 1=Colon 2=Dolar 3=Euro");
            int numMonedaSalida = s.nextInt();
            System.out.println("Digite la cantidad");
            int cantidad = s.nextInt();

            if(numMonedaOrigen==1){//Colon
                if(numMonedaSalida==1){//Colon
                    System.out.println("El valor equivalente es: "+maq.convertir(mColon, mColon, cantidad));
                }
                else if(numMonedaSalida==2){ //Dolar
                    System.out.println("El valor equivalente es: "+maq.convertir(mColon, mDolar, cantidad)); 
                }
                else { //euro
                    System.out.println("El valor equivalente es: "+maq.convertir(mColon, mEuro, cantidad)); 
                }
            }
            else if(numMonedaOrigen==2){//Dolar
                if(numMonedaSalida==1){//Colon
                    System.out.println("El valor equivalente es: "+maq.convertir(mDolar, mColon, cantidad));
                }
                else if(numMonedaSalida==2){ //Dolar
                    System.out.println("El valor equivalente es: "+maq.convertir(mDolar, mDolar, cantidad)); 
                }
                else { //euro
                    System.out.println("El valor equivalente es: "+maq.convertir(mDolar, mEuro, cantidad)); 
                }
            }
            else{ //Euro
                if(numMonedaSalida==1){//Colon
                    System.out.println("El valor equivalente es: "+maq.convertir(mEuro, mColon, cantidad));
                }
                else if(numMonedaSalida==2){ //Dolar
                    System.out.println("El valor equivalente es: "+maq.convertir(mEuro, mDolar, cantidad)); 
                }
                else { //euro
                    System.out.println("El valor equivalente es: "+maq.convertir(mEuro, mEuro, cantidad)); 
                }
            }
        }
    }
}
