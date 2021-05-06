package examenFinal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ferna
 */
public class Parlante {

    String tipoParlante;
    int volumenParlante;
    boolean dashabilitado;

    public Parlante(String tipoParlante) {
        this.tipoParlante = tipoParlante;
        this.dashabilitado = false;
        this.volumenParlante = 5;
    }

    public void sonar(String audio) {
        if(!this.dashabilitado)
        {
            System.out.println("Sonando parlante " + tipoParlante + " el audio " + audio + "a volumen " + this.volumenParlante + "");
        }
    }

    public void subirVolumen() {
        int valumen = this.volumenParlante;
        if (valumen < 10) {
            this.volumenParlante++;
        }
    }

    public void bajarVolumen() {
        int valumen = this.volumenParlante;
        if (valumen > 0) {
            this.volumenParlante--;
        }
    }

    public String getTipoParlante() {
        return tipoParlante;
    }

    public void setTipoParlante(String tipoParlante) {
        this.tipoParlante = tipoParlante;
    }

    public int getVolumenParlante() {
        return volumenParlante;
    }

    public void setVolumenParlante(int volumen) {
        if (volumen >= 10) {
            volumen = 10;
            System.out.println("Volumen maximo 10");
        }
        if (volumen < 0) {
            volumen = 0;
            System.out.println("Volumen maximo 10");
        }
        this.volumenParlante = volumen;
    }

    public boolean isDashabilitado() {
        return dashabilitado;
    }

    public void setDashabilitado(boolean dashabilitado) {
        this.dashabilitado = dashabilitado;
    }

}
