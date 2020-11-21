/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.aerolinea;

import java.util.Date;

/**
 *
 * @author Andres
 */
public class Vuelo {
    //propiedades
    String[] asientosClaseAlta; // {A1,A2,A3,B1,B2,B3}
    String[] asientosClaseBaja; // {C1,C2,C3,D1,D2,D3}
    String lugarDestino;
    String lugarPartida;
    Date fechaSalida;
    Date fechaLlegada;
    
    public Vuelo(){
    }

    public Vuelo(String[] asientosClaseAlta, String[] asientosClaseBaja, String lugarDestino, String lugarPartida, Date fechaSalida, Date fechaLlegada) {
        this.asientosClaseAlta = asientosClaseAlta;
        this.asientosClaseBaja = asientosClaseBaja;
        this.lugarDestino = lugarDestino;
        this.lugarPartida = lugarPartida;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
    }

    public String[] getAsientosClaseAlta() {
        return asientosClaseAlta;
    }

    public void setAsientosClaseAlta(String[] asientosClaseAlta) {
        this.asientosClaseAlta = asientosClaseAlta;
    }

    public String[] getAsientosClaseBaja() {
        return asientosClaseBaja;
    }

    public void setAsientosClaseBaja(String[] asientosClaseBaja) {
        this.asientosClaseBaja = asientosClaseBaja;
    }

    public String getLugarDestino() {
        return lugarDestino;
    }

    public void setLugarDestino(String lugarDestino) {
        this.lugarDestino = lugarDestino;
    }

    public String getLugarPartida() {
        return lugarPartida;
    }

    public void setLugarPartida(String lugarPartida) {
        this.lugarPartida = lugarPartida;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "asientosClaseAlta=" + asientosClaseAlta + ", asientosClaseBaja=" + asientosClaseBaja + ", lugarDestino=" + lugarDestino + ", lugarPartida=" + lugarPartida + ", fechaSalida=" + fechaSalida + ", fechaLlegada=" + fechaLlegada + '}';
    }
 
}
