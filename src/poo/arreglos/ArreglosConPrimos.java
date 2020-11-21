/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author carlosandres.mendez
 */
public class ArreglosConPrimos {

    private int tamanho = 0;
    private int[] array;

    /**
     * @return the tamano
     */
    public int getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    private void llenarArregloConPrimos(int min, int max) {
        int i = 0;
        int numero = 0;
        while (i < array.length) {
            numero = (int) (Math.random() * (min - max) + max);
            if (esPrimo(numero)) {
                array[i] = numero;
                i++;
            }
        }
    }

    private boolean esPrimo(int numero) {
        if (numero < 1) {
            return false;
        } else {
            int contador = 0;
            int raizC = 0;
            raizC = (int) Math.sqrt(numero);
            for (; raizC > 1; raizC--) {
                if (numero % raizC == 0) {
                    contador += 1;
                }
            }
            return contador < 1;
        }
    }

    public void solicitarDatosUsuario() {
        int maximo = 0;
        int minimo = 0;
        do {
            this.setTamanho(Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del arreglo "
                    + "entre 1 y 30 posiciones")));
        } while (!(this.getTamanho() >= 1 && this.getTamanho() <= 30));
        array = new int[this.getTamanho()];

        do {
            minimo = Integer.parseInt(JOptionPane.showInputDialog("Digite el número mínimo para los "
                    + "valores aleatorios (el minimo debe ser menor q max)"));
            maximo = Integer.parseInt(JOptionPane.showInputDialog("Digite el número máximo para los "
                    + "valores aleatorios (el minimo debe ser menor q max)"));
        } while (!(minimo < maximo && minimo > 0));

        this.llenarArregloConPrimos(minimo, maximo);
    }

    public String imprimirArreglo() {
        String imprimir = "DATOS DEL ARREGLO \n";
        for (int i = 0; i <= array.length - 1; i++) {
            imprimir += "Posición: " + i + ": " + array[i] + "\n";
        }
        return imprimir;
    }
}
