package poo.poligonoRegular;

/**
 *
 * @author carlosandres.mendez
 */
public class Poligono {

    //atributos
    private int numeroLados;
    private double medidaLado;
    private double radio;

    //constructor sin parámetros
    public Poligono() {
        numeroLados = 5;
        medidaLado = 1;
        radio = 1;
    }

    //constructor sobrecargado
    public Poligono(int pNumLados, double pMedidaLado, double pRadio) {
        this.numeroLados = pNumLados;
        this.medidaLado = pMedidaLado;
        this.radio = pRadio;
    }

    //métodos encapsulados
    /**
     * @return the numeroLados
     */
    public int getNumeroLados() {
        return numeroLados;
    }

    /**
     * @param numeroLados the numeroLados to set
     */
    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    /**
     * @return the medidaLado
     */
    public double getMedidaLado() {
        return medidaLado;
    }

    /**
     * @param medidaLado the medidaLado to set
     */
    public void setMedidaLado(double medidaLado) {
        this.medidaLado = medidaLado;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    //métodos de la clase
    private double perimetro() {
        return this.getMedidaLado() * this.getNumeroLados();
    }

    private double apotema() {
        return Math.sqrt(Math.pow(this.getRadio(), 2) - Math.pow(this.getMedidaLado() / 2, 2));
    }

    private double area() {
        return (this.perimetro() * this.apotema()) / 2;
    }

    @Override
    public String toString() {
        return "Número de lados: " + this.getNumeroLados() + "\n"
                + "Nombre del polígono: " + this.nombrePoligono() + "\n"
                + "Medidas: Lado: " + this.getMedidaLado() + "Radio: " + this.getRadio() + "\n"
                + "Perímetro: " + this.perimetro() + "\n"
                + "Área: " + this.area();
    }

    private String nombrePoligono() {
        String nombre = "";
        switch (this.getNumeroLados()) {
            case 5:
                nombre = "Pentágono";
                break;
            case 6:
                nombre = "Hexágono";
                break;
            case 7:
                nombre = "Heptágono";
                break;
            case 8:
                nombre = "Octágono";
                break;
            case 9:
                nombre = "Eneágono";
                break;
            case 10:
                nombre = "Decágono";
                break;
            case 11:
                nombre = "Endecágono";
                break;
            case 12:
                nombre = "Dodecágono";
                break;
        }
        return nombre;
    }
}
