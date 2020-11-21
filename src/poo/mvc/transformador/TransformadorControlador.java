package poo.mvc.transformador;

public class TransformadorControlador {

    public void iniciar() {
        Transformador t = new Transformador();
        TransformadorVisualizador v = new TransformadorVisualizador(t);

        v.introduzcaTipo();
        v.introduzcaValor();
        v.deResultado();
    }
    
}
