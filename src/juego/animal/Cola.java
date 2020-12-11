/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego.animal;


/**
 *
 * @author Laboratorio
 */
public class Cola {
    
    public String color;
    public int tamCola;
    
    /*Este es el metodo contructor */
    public Cola(String pcolor, int ptamCola){
        
        this.color= pcolor; 
        this.tamCola= ptamCola;
    
    } 

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTamCola() {
        return tamCola;
    }

    public void setTamCola(int tamCola) {
        this.tamCola = tamCola;
    }
    
}
