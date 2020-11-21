package poo.mvc.transformador;

import javax.swing.JOptionPane;

public class TransformadorVisualizador extends JOptionPane {

    Transformador o;

    public TransformadorVisualizador(Transformador t) {
        o = t;
    }

    public void introduzcaTipo() {
        o.setUnidad(Integer.parseInt(this.showInputDialog("Introduzca tipo de medida \n1. Libra\n2. Onza\n3. Acre\n4. Legua\n5. Fanega\n6. Pie\n7. Pinta")));
    }

    public void introduzcaValor() {
        o.setValor(Double.parseDouble(this.showInputDialog("Introduzca Valor")));
    }

    public void deResultado() {
        this.showMessageDialog(null, "Su resultado es= " + o.convierta());
    }

}
