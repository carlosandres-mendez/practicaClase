/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego.animal;

/**
 *
 * @author carlosandres.mendez
 */
public class Toro extends Animal {

   private String cuerno;
   private boolean cornea;  

   
  public Toro(String pCuerno, boolean cornea,
          String color, String nombreArchivo, int posX, int posY, int direccionX, int direccionY, int velocidad) {
      
        this.cuerno = pCuerno;
        this.cornea=cornea;
        
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
            System.out.println("El Toro colisiono con persona");
            cornear(true);
        }
        else{
            System.out.println("El Toro colisiono con animal");
            cornear(false);
        }
    }
  
    private void cornear(boolean esPersona){
        if(esPersona){
            System.out.println("Corneo una persona");
            //Se puede agregar algo mas aqui
            
        }
        else{
            System.out.println("Corneo un animal");
            //Se puede agregar algo mas aqui
            
        }
    }

    public String getCuerno() {
        return cuerno;
    }

    public void setCuerno(String cuerno) {
        this.cuerno = cuerno;
    }

    public boolean isCornea() {
        return cornea;
    }

    public void setCornea(boolean cornea) {
        this.cornea = cornea;
    }

}