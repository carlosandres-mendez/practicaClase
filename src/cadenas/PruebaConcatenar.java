package cadenas;

import javax.swing.JOptionPane;

public class PruebaConcatenar {

    public static void main(String[] args) {

        String s = "";

        for (int i = 1; i <= 10; i++) {
            s += i + ". Opción" + i + "\n";
        }

        JOptionPane.showMessageDialog(null,s);
    }
}
