
import java.util.Scanner;

/**
 *
 * @author carlosandres.mendez
 */
public class Problema2Calculadora {

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

    //Metodo que suma dos numeros double
    public static double sumar(double a, double b) {
        double resultado;
        resultado = a + b;
        return resultado;
    }

    public static int promedio(int sumatoria, int n) {
        int resultado = 0;
        resultado = sumatoria / n;
        return resultado;
    }

    public static int promedio() {
        int resultado = 0;

        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Favor digite la cantidad de numeros: ");
        n = entrada.nextInt();

        int suma = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Favor digite numero " + i + ": ");
            int num = entrada.nextInt();
            //numeroUsuario += (""+num);
            //suma += num;
            suma = suma + num;
        }
        resultado = suma / n;
        return resultado;
    }

    //numeros es un arreglo ej: {2,5,7,11}
    public static int promedio(int[] numeros) {
        int resultado = 0;

        int suma = 0;
        for (int elem : numeros) {
            suma = sumar(suma, elem);
        }
        resultado = suma / numeros.length;
        return resultado;
    }

    public static int[] reordenarAleatorio(int[] numeros) {
        int[] resultado = new int[numeros.length];
        
        //el arreglo se inicializa con ceros
        for (int i = 0; i < numeros.length; i++) {
            resultado[i] = 0;
        }

        //asignamos aleatoriamente al arreglo resultado
        for (int i = 0; i < numeros.length; i++) {
            int pos = aleatorio(numeros.length);
            if (resultado[pos] == 0) { //si es cero significa q posicion no ha sido asignada
                resultado[pos] = numeros[i];
            }
            else{ //sino, la iteracion no cuenta, hay que volver a intentar
                i--;
            }
        }
        return resultado;
    }

    //retorna un numero entero entre 0 y n-1
    private static int aleatorio(int n) {
        int resultado = 0;
        double aleat = Math.random() * (n);
        resultado = (int) Math.floor(aleat);
        //resultado= (int) (Math.random() *(n) );
        return resultado;
    }

    //metodo main reordenar de forma aleatoria
    public static void main(String[] args) {
        int[] prueba = {1,2,3,4,5};
        int[] resultado;
        
        System.out.println("El arreglo reordenado es: ");
        resultado = reordenarAleatorio(prueba);
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i]+" ");
        }
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Math.floor(0.6)=" + Math.floor(0.6));
        System.out.println("Math.floor(0.8)=" + Math.floor(0.8));
        System.out.println("Math.floor(1.1)=" + Math.floor(1.1));
        System.out.println("Math.floor(1.4)=" + Math.floor(1.4));
        System.out.println("Math.floor(1.7)=" + Math.floor(1.7));
        System.out.println("Math.floor(2.7)=" + Math.floor(2.7));

        System.out.println(aleatorio(3));
        System.out.println(aleatorio(3));
        System.out.println(aleatorio(3));
        System.out.println(aleatorio(3));
        System.out.println(aleatorio(3));
        System.out.println(aleatorio(3));
        System.out.println(aleatorio(3));
        System.out.println(aleatorio(3));
        System.out.println(aleatorio(3));
        System.out.println(aleatorio(3));
    }

    //metodo main para calcular promedio con arreglos
    public static void mainPromedioConArreglos(String[] args) {
        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Favor digite la cantidad de numeros: ");
        n = entrada.nextInt();
        int[] pi = new int[n];
        //pi[0] = 2;

        for (int i = 0; i < n; i++) {
            System.out.println("Favor digite numero " + (i + 1) + ": ");
            pi[i] = entrada.nextInt();
        }
        int resultado = promedio(pi);
        System.out.println("El promedio es: " + resultado);
    }

    //metodo main para calcular promedio sin arreglos
    public static void mainPromedioSinArreglos(String[] args) {

        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Favor digite la cantidad de numeros: ");
        n = entrada.nextInt();

        int suma = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Favor digite numero " + i + ": ");
            int num = entrada.nextInt();
            //numeroUsuario += (""+num);
            //suma += num;
            suma = suma + num;
        }

        System.out.println("El promedio es: " + promedio(suma, n));

        //int resultado = promedio();
        //System.out.println("El promedio es: "+resultado);
        /* Calculadora calc = new Calculadora();
        int multiplicacion = calc.multiplicar(5, 4);
        System.out.println(multiplicacion);*/
    }
}
