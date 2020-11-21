package poo.poligonoRegular;

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
        //instancia de la clase Poligono
        Poligono p1 = new Poligono();
        int numeroLados = 0;
        double radio = 0;
        double medidaLado = 0;

        //solicitar el número de lados hasta que se ingrese un valor entre 5 y 12
        do {
            numeroLados = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de lados del polígono (entre 5 y 12)"));
        } while (numeroLados < 5 || numeroLados > 12);

        //solicitar la medida del lado hasta que se ingrese un valor mayor a 0
        do {
            medidaLado = Double.parseDouble(JOptionPane.showInputDialog("Digite la medida del lado del polígono"));
        } while (medidaLado <= 0);

        //solicitar la medida del radio hasta que se ingrese un valor mayor a 0
        do {
            radio = Double.parseDouble(JOptionPane.showInputDialog("Digite la medida del radio del polígono"));
        } while (radio <= 0);

        p1.setNumeroLados(numeroLados);
        p1.setMedidaLado(medidaLado);
        p1.setRadio(radio);

        JOptionPane.showMessageDialog(null, p1.toString(), "DATOS DEL POLÍGONO", 3);
    }

}
