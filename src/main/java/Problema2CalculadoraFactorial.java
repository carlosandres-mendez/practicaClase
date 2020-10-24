
import java.util.Scanner;

/**
 *
 * @author carlosandres.mendez
 */
public class Problema2CalculadoraFactorial {

    //Metodo que resta dos numeros enteros (Ej: 5-3=2)
    public static int restar(int a, int b) {
        int resultado;
        resultado = a - b;
        return resultado;
    }

    //Metodo que suma dos numeros enteros
    public static int sumar(int a, int b) {
        int resultado;
        resultado = a + b;
        return resultado;
    }

    //Metodo que calcula el factorial de un numero de forma iterativa
    public static int calcularFactorial(int n) {
        int result = 1, i = 1;
        while (i <= n) {
            result = result * i;
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        int resultado = calcularFactorial(5);
        System.out.println(resultado);
    }
}
