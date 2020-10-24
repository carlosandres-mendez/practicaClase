
public class Triangulo {

    public static void main(String args[]) {
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
    }
}
