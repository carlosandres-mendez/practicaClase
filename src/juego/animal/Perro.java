    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego.animal;

/*Comentario nuevo :D*/

/**
 *
 * @author carlosandres.mendez
 */
public class Perro extends Animal{
    
    private boolean ladra;
    private boolean muerde;
    private Cola cola;
     
    public Perro(boolean ladra, boolean muerde, Cola cola,
          String color, String nombreArchivo, int posX, int posY, int direccionX, int direccionY, int velocidad) {
      
        this.ladra = ladra;
        this.muerde = muerde;
        this.cola = cola;
        
        //Inicializamos las propiedades que hereda de Animal
        this.color=color;
        this.nombreArchivo=nombreArchivo;
        this.posX=posX;
        this.posY=posY;
        this.direccionX=direccionX;
        this.direccionY=direccionY;
        this.velocidad =velocidad;
    }
    
    /**
     * Se sobreescribe la implementacion default de Animal
     * @param esPersona
     */
    @Override
    public void colisionar(boolean esPersona){
        if(esPersona){
            System.out.println("El Perro colisiono con persona");
            morder(true);
        }
        else{
            System.out.println("El Perro colisiono con animal");
            ladrar(false);
        }
    }
  
    private void morder(boolean esPersona){
        if(esPersona){
            System.out.println("Muerdo una persona");
            //Se puede agregar algo mas aqui
            
        }
        else{
            System.out.println("Muerdo un animal");
            //Se puede agregar algo mas aqui
            
        }
    }
    
    private void ladrar(boolean esPersona){
        if(esPersona){
            System.out.println("Ladra una persona");
            //Se puede agregar algo mas aqui
            
        }
        else{
            System.out.println("Ladra un animal");
            //Se puede agregar algo mas aqui
            
        }
    }

    public boolean isLadra() {
        return ladra;
    }

    public void setLadra(boolean ladra) {
        this.ladra = ladra;
    }

    public boolean isMuerde() {
        return muerde;
    }

    public void setMuerde(boolean muerde) {
        this.muerde = muerde;
    }

    public Cola getCola() {
        return cola;
    }

    public void setCola(Cola cola) {
        this.cola = cola;
    }
    
    
}
