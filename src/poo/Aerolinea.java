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
    
    int numClientes;
    Persona[] clientes;
    Persona p1;
    Persona p2;
    Persona p3;
    Vuelo vuelo;
    
    public Aerolinea(){
        numClientes=0;
        clientes = new Persona[10];
        for(int i=0;i<clientes.length;i++){
            clientes[i]=null;
        }
        p1 = new Persona();
        p2 = new Persona();
        p3 = new Persona();
        vuelo = new Vuelo();
    }
    
    public boolean personaRiesgo(Persona persona){
        boolean resultado=false;
        
        if(persona.getEdad()>50){
            resultado=true;
        }
        return resultado;
    }
    
    public void imprimirNombreClientes(){
        for(int i=0;i<clientes.length;i++){
            clientes[i].imprimirNombreCompleto();
        }
    }

    public Persona getP1() {
        return p1;
    }

    public void setP1(Persona p1) {
        this.p1 = p1;
    }

    public Persona getP2() {
        return p2;
    }

    public void setP2(Persona p2) {
        this.p2 = p2;
    }

    public Persona getP3() {
        return p3;
    }

    public void setP3(Persona p3) {
        this.p3 = p3;
    }
    
    
}
