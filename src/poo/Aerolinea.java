/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Scanner;

/**
 *
 * @author Andres
 */
public class Aerolinea {
    public static void main(String args[]){
        /*
        Scanner escaner = new Scanner(System.in);

        System.out.println("Digite el nombre:");
        String nombre = escaner.nextLine();

        System.out.println("Digite los apellidos:");
        String apellidos = escaner.nextLine();
        */
        
        Persona p1 = new Persona();
        p1.setNombre("Carlos");
        p1.setApellidos("Mendez R");
        p1.setLugarNacionalidad("SJ");
        
        Persona p2 = new Persona();
        p2.setNombre("Laura");
        p2.setApellidos("Gutierrez");
        p2.setLugarNacionalidad("Cartago");
        
        //imprimir nombre completo de las personas 
        p1.imprimirNombreCompleto();
        System.out.println(p1.getLugarNacionalidad());
        
        p2.imprimirNombreCompleto();
        System.out.println(p2.getLugarNacionalidad());
    }
}
