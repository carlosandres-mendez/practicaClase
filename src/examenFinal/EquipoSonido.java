package examenFinal;

import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ferna
 */
public class EquipoSonido {

    Parlante[] parlantes = new Parlante[3];
    String[] listaAudios = new String[1000];
    String[] listaAleatorea = new String[1000];
    boolean modoRadio;
    boolean aletoreo;

    public EquipoSonido() {
        iniciarlizarArreglo();
        Parlante parlanteDerecho = new Parlante("Derecho");
        Parlante parlanteIzquierdo = new Parlante("Izquierdo");
        Parlante parlanteSubwoofer = new Parlante("Subwoofer");
        this.parlantes[0] = parlanteDerecho;
        this.parlantes[1] = parlanteIzquierdo;
        this.parlantes[2] = parlanteSubwoofer;
        this.modoRadio = false;
        this.aletoreo = false;
    }

    private void iniciarlizarArreglo() {
        for (int i = 0; i < this.listaAudios.length; i++) {
            listaAudios[i] = "";
        }
    }

    public void sonarAlarma(String audio) {
        sonarParlantes(audio);
    }

    public Parlante[] getParlantes() {
        return parlantes;
    }

    public void setParlantes(Parlante[] parlantes) {
        this.parlantes = parlantes;
    }

    public String[] getListaAudios() {
        return listaAudios;
    }

    public void setListaAudios(String[] listaAudios) {
        this.listaAudios = listaAudios;
    }

    public boolean isModoRadio() {
        return modoRadio;
    }

    public void setModoRadio(boolean modoRadio) {
        this.modoRadio = modoRadio;
    }

    public void setAletoreo(boolean aletoreo) {
        this.aletoreo = aletoreo;
        if (aletoreo) {
            listaAleatorea();
        }

    }

    public boolean isAletoreo() {
        return aletoreo;
    }

    public void mostrarListaCompleta() {
        for (int i = 0; i < 1000; i++) {
            if (listaAudios[i].equals("") == false) {
                System.out.println("pista #" + i + ": " + listaAudios[i]);
            }
        }
    }

    public void borrarAudio(int posicion) {
        if (posicion != -1) {
            listaAudios[posicion] = "";
        }
    }

    public void play() {
        if (this.modoRadio) {
            sonarParlantes("Radio: 100100100100100100100100100100100100100100100100");
        } else {
            if (this.aletoreo) {
                for (int i = 0; i < listaAudios.length; i++) {
                    if (listaAudios[i].equals("") == false) {
                        sonarParlantes(listaAleatorea[i]);
                    }
                }

            } else {
                for (int i = 0; i < listaAudios.length; i++) {
                    if (listaAudios[i].equals("") == false) {
                        sonarParlantes(listaAudios[i]);
                    }
                }
            }

        }
    }

    public void ajustarVolumen(int volumen) {
        for (int i = 0; i < this.parlantes.length; i++) {
            parlantes[i].setVolumenParlante(volumen);
        }
    }

    public void subirVolumenLaterales() {
        parlantes[0].subirVolumen();
        parlantes[1].subirVolumen();
    }

    public void bajarVolumenLaterales() {
        parlantes[0].bajarVolumen();
        parlantes[1].bajarVolumen();
    }

    public void subirVolumenSubwoofer() {
        parlantes[2].subirVolumen();
    }

    public void bajarVolumenSubwoofer() {
        parlantes[2].bajarVolumen();
    }

    ///0 Derecho, 1 Izquierdo, 2 Subwoofer
    public void desabilitarParlante(int parlante, boolean estado) {
        parlantes[parlante].setDashabilitado(estado);
    }

    public String agregarAudio(String audio) {
        String flag = "";
        for (int i = 0; i < this.listaAudios.length; i++) {
            if (this.listaAudios[i] == "") {
                this.listaAudios[i] = audio;
                flag = "Agregado con Exito";
                break;
            }
        }
        return flag;
    }
    
    public void autoStart(int hora, int minuto)
    {
        Reloj reloj = new Reloj();
        reloj.setAlarm(hora, minuto);
        System.out.println("El equipo se autoencendera a las " + hora + ":" + minuto);
    }

    ///Privados
    private void sonarParlantes(String audio) {
        for (int i = 0; i < this.parlantes.length; i++) {
            parlantes[i].sonar(audio);
        }
    }

    private void listaAleatorea() {
        int[] randomArray = new int[1000];
        for (int e = 0; e < randomArray.length; e++) {
            randomArray[e] = obtenerRandom(randomArray);
        }

        for (int e = 0; e < listaAleatorea.length; e++) {
            int randPos = randomArray[e] - 1;
            listaAleatorea[e] = listaAudios[randPos];
        }
    }

    private static int obtenerRandom(int[] newArray) {
        Random rand = new Random();
        int value = newArray.length;
        int random = -1;
        boolean findRand = true;
        while (findRand) {
            random = rand.nextInt(value) + 1;
            for (int i = 0; i < newArray.length; i++) {
                if (random == newArray[i]) {
                    random = -1;
                    break;
                }
            }
            if (random > -1) {
                findRand = false;
            }
        }
        return random;
    }

}
