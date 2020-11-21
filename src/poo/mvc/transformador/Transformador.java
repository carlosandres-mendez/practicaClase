package poo.mvc.transformador;

public class Transformador {

    int unidad;
    double valor;

    public void setUnidad(int u) {
        unidad = u;
    }

    public void setValor(double v) {
        valor = v;
    }

    public int getUnidad() {
        return unidad;
    }

    public double getValor() {
        return valor;
    }

    public double convierta() {
        double resultado = -37;

        switch (unidad) {
            case 1:
                resultado = valor * 453.592370;
                break;

            case 2:
                resultado = valor * 28.3495;
                break;

            case 3:
                resultado = valor * 4046.8564;
                break;

            case 4:
                resultado = valor * 20.000 * 30.48;
                break;

            case 5:
                resultado = valor * 55.5;
                break;

            case 6:
                resultado = valor * 30.48;
                break;

            case 7:
                resultado = valor * 0.47317650;
                break;

        }

        return resultado;
    }

}
