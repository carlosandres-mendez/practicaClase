/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.aerolinea;

/**
 *
 * @author carlosandres.mendez
 */
public class Tiquete {
    //propiedades
    boolean claseAlta;
    int numeroTiquete;
    String numeroAsiento;
    float precio;
    int numeroComprobante;

    public Tiquete(){
    }
    
    public Tiquete(boolean claseAlta, int numeroTiquete, String numeroAsiento, float precio, int numeroComprobante) {
        this.claseAlta = claseAlta;
        this.numeroTiquete = numeroTiquete;
        this.numeroAsiento = numeroAsiento;
        this.precio = precio;
        this.numeroComprobante = numeroComprobante;
    }

    public boolean isClaseAlta() {
        return claseAlta;
    }

    public void setClaseAlta(boolean claseAlta) {
        this.claseAlta = claseAlta;
    }

    public int getNumeroTiquete() {
        return numeroTiquete;
    }

    public void setNumeroTiquete(int numeroTiquete) {
        this.numeroTiquete = numeroTiquete;
    }

    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getNumeroComprobante() {
        return numeroComprobante;
    }

    public void setNumeroComprobante(int numeroComprobante) {
        this.numeroComprobante = numeroComprobante;
    }

    
    
    //metodos
    @Override
    public String toString() {
        return "Tiquete{" + "claseAlta=" + claseAlta + ", numeroTiquete=" + numeroTiquete + ", numeroAsiento=" + numeroAsiento + ", precio=" + precio + ", numeroComprobante=" + numeroComprobante + '}';
    }
    
}
