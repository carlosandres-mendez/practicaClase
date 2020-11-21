/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.arreglos;

/**
 *
 * @author carlosandres.mendez
 */
public class Arreglos {

    private int[] array = new int[10];

    public void llenarArreglo() {
        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = generarNumeroRandom();
        }
    }

    public int generarNumeroRandom() {
        return (int) (Math.random() * 25) + 1;
    }

    public int sumaArreglo() {
        int sumatoria = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            sumatoria += array[i];
        }
        return sumatoria;
    }

    public String imprimirArreglo() {
        String imprimir = "DATOS DEL ARREGLO \n";
        for (int i = 0; i <= array.length - 1; i++) {
            imprimir += "Posición: " + i + ": " + array[i] + "\n";
        }
        imprimir += "DATOS DE LA SUMATORIA \n"
                + sumaArreglo();

        return imprimir;
    }
}
