/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego.juego;

/*Useless comement*/
import juego.animal.Cola;
import juego.animal.Pato;
import juego.animal.Perro;
import juego.animal.Toro;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import static juego.juego.Vista.generateRandomIntIntRange;

/**
 *
 * @author Prof. Carlos Andres Mendez
 * Controller
 */
public class Juego {

    /**
     */
    public void iniciar() {
        // TODO code application logic here
        
        //INICIALIZAMOS PERSONA
        //Persona posicion actual
        int personaPosX = generateRandomIntIntRange(0,500);
        int personaPosY = generateRandomIntIntRange(0,500);
        Persona persona = new Persona(3,"palyer1.png", personaPosX, personaPosY, 4, 4, 1);
        
        //INICIALIZAMOS PATO
        //Pato posicion actual
        int patoPosX = generateRandomIntIntRange(0,500);
        int patoPosY = generateRandomIntIntRange(0,500);
        Pato pato = new Pato("Amarillo","Verde","pato.png", patoPosX, patoPosY, 4, 4, 1);
        
        //INICIALIZAMOS PERRO
        //Perro posicion actual
        int perroPosX = generateRandomIntIntRange(0,500);
        int perroPosY = generateRandomIntIntRange(0,500);
        Cola cola = new Cola("Amarilla",5);
        Perro perro = new Perro(true,true,cola,"Amarillo","perro.png", perroPosX, perroPosY, 4, 4, 1);
        
        //INICIALIZAMOS TORO
        //TORO posicion actual
        int toroPosX = generateRandomIntIntRange(0,500);
        int toroPosY = generateRandomIntIntRange(0,500);
        Toro toro = new Toro("Super cuerno",true,"azul","toro.png", toroPosX, toroPosY, 4, 4, 1);
        
        JFrame ventana = new JFrame("Juego");
        Vista vista = new Vista(persona,toro,pato,perro);
        
        ventana.add(vista);
        ventana.setDefaultCloseOperation(3);
        ventana.setSize(500,500);
        ventana.setVisible(true);
        
        while(true){
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            //MOVER ANIMALES
            
            //TORO posicion nueva 
            toro.setDireccionX(sortearNuevaDireccion(toro.getDireccionX())); 
            toro.setDireccionY(sortearNuevaDireccion(toro.getDireccionY()));
            toro.setPosX(toro.getPosX() + toro.getVelocidad()*toro.getDireccionX());
            toro.setPosY(toro.getPosY() + toro.getVelocidad()*toro.getDireccionY());
            if(toro.getPosX()<0 || toro.getPosX()>400) toro.setPosX(generateRandomIntIntRange(0,400));
            if(toro.getPosY()<0 || toro.getPosY()>400) toro.setPosY(generateRandomIntIntRange(0,400));
            
            //PATO posicion nueva 
            pato.setDireccionX(sortearNuevaDireccion(pato.getDireccionX())); 
            pato.setDireccionY(sortearNuevaDireccion(pato.getDireccionY()));
            pato.setPosX(pato.getPosX() + pato.getVelocidad()*pato.getDireccionX());
            pato.setPosY(pato.getPosY() + pato.getVelocidad()*pato.getDireccionY());
            if(pato.getPosX()<0 || pato.getPosX()>400) pato.setPosX(generateRandomIntIntRange(0,400));
            if(pato.getPosX()<0 || pato.getPosY()>400) pato.setPosY(generateRandomIntIntRange(0,400));
            
            //PERRO posicion nueva 
            perro.setDireccionX(sortearNuevaDireccion(perro.getDireccionX())); 
            perro.setDireccionY(sortearNuevaDireccion(perro.getDireccionY()));
            perro.setPosX(perro.getPosX() + perro.getVelocidad()*perro.getDireccionX());
            perro.setPosY(perro.getPosY() + perro.getVelocidad()*perro.getDireccionY());
            if(perro.getPosX()<0 || perro.getPosX()>400) perro.setPosX(generateRandomIntIntRange(0,400));
            if(perro.getPosX()<0 || perro.getPosY()>400) perro.setPosY(generateRandomIntIntRange(0,400));
            
            //Establecemos las nuevas posiciones en los objetos
            vista.getLabel2().setLocation(toro.getPosX(), toro.getPosY());
            vista.getLabel3().setLocation(pato.getPosX(), pato.getPosY());
            vista.getLabel4().setLocation(perro.getPosX(), perro.getPosY());
            
            
            /** LO SIGUIENTE ES TAREA VER ABAJO METODOS QUE HAY Q IMPLEMENTAR 
             *  Tambien, el metodo colisionar deben revisar e implementar mejor
             **/
            
            //DETECTAR COLISION TORO
            
            //Si colisiona toro con persona
            if(colisionToroPersona()){
                toro.colisionar(true);
                persona.colisionarToro(); //este funcion debe reducir vidas
            }
            //Si colisiona toro con animal
            else if(colisionToroAnimal()){
                toro.colisionar(false);
            }
            
            //DETECTAR COLISION PATO
            
            //Si colisiona toro con persona
            if(colisionPatoPersona()){
                pato.colisionar(true);
                persona.colisionarPato(); //este funcion debe reducir vidas
            }
            //Si colisiona toro con animal
            else if(colisionPatoAnimal()){
                pato.colisionar(false);
            }
            
            //DETECTAR COLISION PERRO
            
            //Si colisiona perro con persona
            if(colisionPerroPersona()){
                perro.colisionar(true);
                persona.colisionarPerro(); //este funcion debe reducir vidas
            }
            //Si colisiona perro con animal
            else if(colisionPerroAnimal()){
                perro.colisionar(false);
            }
            
        }
        
    }
    
    /*
    * TAREA IMPLEMENTAR
    */
    private boolean colisionToroAnimal(){
        
        return false;
    }
    
    /*
    * TAREA IMPLEMENTAR
    */
    private boolean colisionToroPersona(){
        
        return false;
    }
    
    /*
    * TAREA IMPLEMENTAR
    */
    private boolean colisionPatoAnimal(){
        
        return false;
    }    
    
    /*
    * TAREA IMPLEMENTAR
    */
    private boolean colisionPatoPersona(){
        
        return false;
    } 
    
    /*
    * TAREA IMPLEMENTAR
    */
    private boolean colisionPerroAnimal(){
        
        return false;
    }    
    
    /*
    * TAREA IMPLEMENTAR
    */
    private boolean colisionPerroPersona(){
        
        return false;
    } 
    
    private int sortearNuevaDireccion(int direccion){
        
        int tmp = generateRandomIntIntRange(0,20);
        if(tmp==1)
            direccion= direccion*-1; //cambiamos la direccion 
                                   //cuando numero es positivo se mueve hacia adelante, cuando es negativo hacia atras
        return direccion;
    }
    
    
}
