/*
 * Esta clase es generica para todos los aniles
 */
package juego.animal;


//Juan Gutierrez test 123


/**
 *
 * @author 
 */
public class Animal {
   
    //Atributo
    protected String color;
    protected String nombreAnimal;
    protected String nombreArchivo;
    protected int posX;
    protected int posY;
    protected int velocidad;  //cantidad de pasos que se mueve (cantidad de pixeles en panel)
    protected int direccionX;  
    protected int direccionY;
    protected int numId;
  
    //Constructor
    public Animal() {
    }
    
    public Animal (String color,String nombreanimal, int posX, int posY, int direccionX, int direccionY, int velocidad) {
        this.color = color;
        this.nombreAnimal= nombreanimal;
        this.posX = posX;
        this.posY = posY;
        this.direccionX = direccionX;
        this.direccionY = direccionY;
        this.velocidad = velocidad;
    }
    
    /**
     * Implementacion default, cada hijo debe implementar este metodo
     * @param esPersona
     */
    public void colisionar(boolean esPersona){
        System.out.println("Este animal colisiono");
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
    
