package examenFinal;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ferna
 */
public class Reloj {

    int hora;
    int min;
    boolean flag;

    public void setAlarm(int horas, int minutos) {
        this.hora = horas;
        this.min = minutos;
        this.flag = true;
        while (flag) {
            if (1 == 1)//no le puse logica de fechas por que me parece que no se vio en clase si no nada mas comparar la hora y los minutos de la hora actual
            {
                EquipoSonido equipo = new EquipoSonido();
                equipo.sonarAlarma("10011001100110011001");
                this.flag = true;
            }
        }

    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

}
