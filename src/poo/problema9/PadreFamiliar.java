/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.problema9;

/**
 *
 * @author Andres
 */
public class PadreFamiliar {
    String nombre;
    String apellidos;
    
    //public PadreFamiliar(){
    //}

    public PadreFamiliar(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    // PadreFamiliar{nombre=Kiko, apellidos=Barrantes}
    @Override
    public String toString() {
        return "PadreFamiliar{" + "nombre=" + nombre + ", apellidos=" + apellidos + '}';
    }
    
    
}
