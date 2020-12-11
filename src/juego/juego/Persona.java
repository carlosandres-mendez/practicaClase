/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego.juego;

/**
 *
 * @author Laboratorio
 */
public class Persona  {
    private int numVidas;
    private String nombreArchivo;
    private int posX;
    private int posY;
    private int velocidad;  //cantidad de pasos que se mueve (cantidad de pixeles en panel)
    private int direccionX;  
    private int direccionY;

    public Persona(int numVidas, String nombreArchivo, int posX, int posY, int direccionX, int direccionY, int velocidad) {
        this.numVidas = numVidas;
        this.nombreArchivo = nombreArchivo;
        this.posX = posX;
        this.posY = posY;
        this.direccionX=direccionX;
        this.direccionY=direccionY;
        this.velocidad =velocidad;
    }
    
    /** TAREA IMPLEMENTAR */
    public void colisionarToro(){
    
    }
    
    /** TAREA IMPLEMENTAR */
    public void colisionarPato(){
    
    }   
    
    /** TAREA IMPLEMENTAR */
    public void colisionarPerro(){
    
    }    

    public int getNumVidas() {
        return numVidas;
    }

    public void setNumVidas(int numVidas) {
        this.numVidas = numVidas;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getDireccionX() {
        return direccionX;
    }

    public void setDireccionX(int direccionX) {
        this.direccionX = direccionX;
    }

    public int getDireccionY() {
        return direccionY;
    }

    public void setDireccionY(int direccionY) {
        this.direccionY = direccionY;
    }

}
