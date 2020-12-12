package poo.mvc.nota;

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class NotaVista {

    Nota nota;
    boolean modoGrafico;

    public NotaVista(Nota notaInstanciada, boolean modoGrafico) {
        this.nota = notaInstanciada;
        this.modoGrafico = modoGrafico;
    }

    public void leaNota() {
        double notaDigitada;
        
        if (modoGrafico) {
            notaDigitada = Double.parseDouble(JOptionPane.showInputDialog("Nota?"));
        } else {
            Scanner s = new Scanner(System.in);
            notaDigitada = s.nextDouble();
        }
        nota.agregarNota(notaDigitada);
    }

    public void muestreNotas() {
        JTextArea jt = new JTextArea();
        for (int i = 0; i < nota.getIndex(); i++) {
            jt.append(nota.getNota(i) + "\n");
        }
        JOptionPane.showMessageDialog(null, jt);
    }

    public int getOpcion() {
        int r = 0;
        try {
            r = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar nota\n2. Mostrar Notas\n3.Salir"));
            if ((r < 1) || (r > 3)) {
                throw new Exception("# de opcion  es inválido");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return r;
    }
}
