
import javax.swing.JOptionPane;

public class MiPrograma1 {

    public static void main(String args[]) {
        String flecha = "";
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero"));
        for (int i = 0; i < 3; i++) {
            for (int n = 0; n < numero; n++) {
                flecha += "-";
            }
            flecha += ">\n";
        }
        System.out.println(flecha);

        String figura = "";
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero"));
        for (int i = 0; i < numero; i++) {//contador de filas 

            for (int n = 0; n < numero; n++) {  //contador columnas
                if ((i == 0) || (i == n) || (i == numero - 1) || (n == 0) || (n == numero - 1) || (n == numero - i - 1)) {
                    figura += "*";
                } else {
                    figura += " ";
                }
            }
            figura += "\n";
        }
        System.out.println(figura);

        int nA = 5;

        for (int n = 0; n < nA; n++) {//cuenta lineas
            for (int j = 0; j < nA - n - 1; j++) {
                System.out.print(" ");
            }
            for (int i = 0; i <= n; i++) {//cuenta columnas
                if ((i == 0) || (n == nA - 1) || (i == n)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("_");
            }
            for (int h = 1; h <= n; h++) {
                if (h == 1 || i == n || h == n || i == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
