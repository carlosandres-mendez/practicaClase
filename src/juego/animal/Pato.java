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
public class Pato extends Animal {
    String colorPico;
    
    public Pato(String colorPico, 
          String color, String nombreArchivo, int posX, int posY, int direccionX, int direccionY, int velocidad) {
      
        this.colorPico = colorPico;
        
        //Inicializamos las propiedades que hereda de Animal
        this.color=color;
        this.nombreArchivo=nombreArchivo;
        this.posX=posX;
        this.posY=posY;
        this.direccionX=direccionX;
        this.direccionY=direccionY;
        this.velocidad =velocidad;
        //this.tamano =tamano//
    }
    
    /**
     * Se sobreescribe la implementacion default de Animal
     * @param esPersona
     */
    @Override
    public void colisionar(boolean esPersona){
        if(esPersona){
            System.out.println("El Pato colisiono con persona");
            picotear(true);
        }
        else{
            System.out.println("El Pato colisiono con animal");
            picotear(false);
        }
    }
  
    private void picotear(boolean esPersona){
        if(esPersona){
            System.out.println("Picotea una persona");
            //Se puede agregar algo mas aqui
            
        }
        else{
            System.out.println("Picotea un animal");
            //Se puede agregar algo mas aqui
            
        }
    }

    public String getColorPico() {
        return colorPico;
    }

    public void setColorPico(String colorPico) {
        this.colorPico = colorPico;
    }
    
    
}
