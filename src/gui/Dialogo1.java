package gui;

// Fig. 3.12: Dialogo1.java
// Uso de JOptionPane para mostrar varias líneas en un cuadro de diálogo.

import javax.swing.JOptionPane;

public class Dialogo1 {

    public static void main(String[] args) {
        // muestra un diálogo con un mensaje
        JOptionPane.showMessageDialog(null, "Bienvenido a Java");
        
        String texto  = JOptionPane.showInputDialog(null, "Digite un texto");
        
        JOptionPane.showMessageDialog(null, "El texto es: "+texto);
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un número entero"));
    
        JOptionPane.showMessageDialog(null, "El número es: "+numero);
    }
} // fin de la clase Dialogo1
