/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author carlosandres.mendez
 */
public class EjElemMaxArreglo {
    
    //Se busca en el arreglo el elemento y la posicion del elemneto
    //que tenga el valor mayor
    public static void main(String[] args){
        
        int[] arreglo = {23,223,5,2,88};
        int posMax=0;
        
        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i]>arreglo[posMax]){
                posMax = i;
            }
        }
        
        System.out.println("Posicion: "+posMax);
        System.out.println("Valor elemento: "+arreglo[posMax]);
    }
}
