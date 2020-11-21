/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Arreglos a = new Arreglos();
        a.llenarArreglo();
        JOptionPane.showMessageDialog(null, a.imprimirArreglo());
         */

        ArreglosConPrimos ap = new ArreglosConPrimos();
        ap.solicitarDatosUsuario();
        JOptionPane.showMessageDialog(null, ap.imprimirArreglo());

    }

}
