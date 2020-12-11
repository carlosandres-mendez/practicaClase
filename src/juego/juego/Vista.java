/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego.juego;

import juego.animal.Pato;
import juego.animal.Perro;
import juego.animal.Toro;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author jesua
 */
public class Vista extends JPanel implements KeyListener{
    
    //PROPIEDADES PRIVADAS NO INTERESAN A NADIE
    private static final String DIRECTORIO_IMAGENES = "src\\juego\\images\\";
    private JLabel label2 = new JLabel();
    private JLabel label1 = new JLabel();
    private JLabel label3 = new JLabel();
    private JLabel label4 = new JLabel();
    private JLabel info = new JLabel("Presione las flechas para moverse.");
    
    public Vista(Persona persona,Toro toro, Pato pato, Perro perro) {
        
        addKeyListener(this);
        setFocusable(true);
        add(info);
        
        addKeyListener(this);
        setFocusable(true);
        label1.setLocation(persona.getPosX(), persona.getPosY());
        label1.setIcon(new ImageIcon(DIRECTORIO_IMAGENES+persona.getNombreArchivo()));
        add(label1);
        
        addKeyListener(this);
        setFocusable(true);
        label2.setLocation(toro.getPosX(), toro.getPosY());
        label2.setIcon(new ImageIcon(DIRECTORIO_IMAGENES+toro.getNombreArchivo()));
        add(label2);
        
        addKeyListener(this);
        setFocusable(true);
        label3.setLocation(pato.getPosX(), pato.getPosY());
        label3.setIcon(new ImageIcon(DIRECTORIO_IMAGENES+pato.getNombreArchivo()));
        add(label3);

        addKeyListener(this);
        setFocusable(true);
        label4.setLocation(perro.getPosX(), perro.getPosY());
        label4.setIcon(new ImageIcon(DIRECTORIO_IMAGENES+perro.getNombreArchivo()));
        add(label4);
    }
    
    public static int generateRandomIntIntRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        
        if (ke.getExtendedKeyCode() == KeyEvent.VK_UP) {
            label1.setLocation(label1.getX(), label1.getY() - 5);
        }
        if (ke.getExtendedKeyCode() == KeyEvent.VK_DOWN) {
            label1.setLocation(label1.getX(), label1.getY() + 5);
        }
        if (ke.getExtendedKeyCode() == KeyEvent.VK_LEFT) {
            label1.setLocation(label1.getX() - 5, label1.getY());
        }
        if (ke.getExtendedKeyCode() == KeyEvent.VK_RIGHT) {
            label1.setLocation(label1.getX() + 5, label1.getY());
        }    
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
    }

    public JLabel getLabel2() {
        return label2;
    }

    public void setLabel2(JLabel label2) {
        this.label2 = label2;
    }

    public JLabel getLabel1() {
        return label1;
    }

    public void setLabel1(JLabel label1) {
        this.label1 = label1;
    }

    public JLabel getLabel3() {
        return label3;
    }

    public void setLabel3(JLabel label3) {
        this.label3 = label3;
    }

    public JLabel getLabel4() {
        return label4;
    }

    public void setLabel4(JLabel label4) {
        this.label4 = label4;
    }

    public JLabel getInfo() {
        return info;
    }

    public void setInfo(JLabel info) {
        this.info = info;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
