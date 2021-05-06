package examenFinal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author ferna
 */
public class EquipoSonidoControlador {

    public void iniciar() {
        System.out.println("Iniciando Equipo de Sonido");
        EquipoSonido equipo = new EquipoSonido();
        Scanner entrada = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("Por Favor Seleccione una de las siguientes opciones");
            System.out.println("a: Reproducir la lista en orden.");
            System.out.println("b: Reproducir lista aleatorea.");
            System.out.println("c: Mostrar Lista Completa.");
            System.out.println("d: Agregar un nuevo audio.");
            System.out.println("e: Eliminar Audio.");
            System.out.println("f: Encender Radio.");
            System.out.println("g: Subir Volumen.");
            System.out.println("h: Bajar Volumne.");
            System.out.println("i: Prender Parlante.");
            System.out.println("j: Apagar Parlante.");
            System.out.println("k: Salir.");

            String opcionMenu = entrada.next();
            switch (opcionMenu) {
                case "a":
                    equipo.setModoRadio(false);
                    equipo.setAletoreo(false);
                    equipo.play();
                    break;
                case "b":
                    equipo.setModoRadio(false);
                    equipo.setAletoreo(true);
                    equipo.play();
                    break;
                case "c":
                    equipo.mostrarListaCompleta();
                    break;
                case "d":
                    System.out.println("Indique el audio en formato binario ej:10101");
                    String audio = entrada.next();
                    equipo.agregarAudio(audio);
                    break;
                case "e":
                    System.out.println("Indique la posicion del audio, si no la conoce digite -1 e ingrese la opcion c, para ver la lista");
                    int posicion = entrada.nextInt();
                    equipo.borrarAudio(posicion);
                    break;
                case "f":
                    equipo.setModoRadio(true);
                    equipo.play();
                    break;
                case "g":
                    System.out.println("Indique L, para subir los laterales");
                    System.out.println("Indique S, para subir los Subwoofer");
                    System.out.println("Indique un numero del 0 al 10, para subirl el volumen en los 3");
                    String volumen = entrada.next();
                    volumen = volumen.toLowerCase();
                    switch (volumen) {
                        case "l":
                            equipo.subirVolumenLaterales();
                            break;
                        case "s":
                            equipo.subirVolumenSubwoofer();
                            break;
                        default:
                            try {
                                int vol = Integer.parseInt(volumen);
                                equipo.ajustarVolumen(vol);
                            } catch (NumberFormatException e) {
                                System.out.println("Error al ingresar datos");
                            }
                    }
                    break;
                case "h":
                    System.out.println("Indique L, para bajar los laterales");
                    System.out.println("Indique S, para bajar los Subwoofer");
                    System.out.println("Indique un numero del 0 al 10, para subirl el volumen en los 3");
                    String volumenDown = entrada.next();
                    volumenDown = volumenDown.toLowerCase();
                    switch (volumenDown) {
                        case "l":
                            equipo.bajarVolumenLaterales();
                            break;
                        case "s":
                            equipo.bajarVolumenSubwoofer();
                            break;
                        default:
                            try {
                                int vol = Integer.parseInt(volumenDown);
                                equipo.ajustarVolumen(vol);
                            } catch (NumberFormatException e) {
                                System.out.println("Error al ingresar datos");
                            }
                    }
                    break;
                case "i":
                    System.out.println("Indique D para prender el derecho, I para prender el Izquierdo, S para prender el Subwoofer");
                    String prende = entrada.next();
                    prende = prende.toLowerCase();
                    switch (prende) {
                        case "d":
                            equipo.desabilitarParlante(0, false);
                            break;
                        case "i":
                            equipo.desabilitarParlante(1, false);
                            break;
                        case "s":
                            equipo.desabilitarParlante(2, false);
                            break;
                    }
                    break;
                case "j":
                    System.out.println("Indique D para apagar el derecho, I para apagar el Izquierdo, S para apagar el Subwoofer");
                    String apaga = entrada.next();
                    apaga = apaga.toLowerCase();
                    switch (apaga) {
                        case "d":
                            equipo.desabilitarParlante(0, true);
                            break;
                        case "i":
                            equipo.desabilitarParlante(1, true);
                            break;
                        case "s":
                            equipo.desabilitarParlante(2, true);
                            break;
                    }
                    break;
                case "k":
                    continuar = false;
                    break;
            }

            System.out.print("\n");
        }
    }

}
