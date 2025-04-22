package Programacion.UD9.pooUD9CasoPractico3;

import Programacion.UD9.pooUD9CasoPractico3.criaturas.*;

public class Pruebas {
    public static void main(String[] args) {
        Criatura elfo = new Elfo("elfo");
        Criatura enano = new Enano("enano");

        System.out.println(elfo);
        System.out.println(enano);

        System.out.println("\n--- Batalla ---");
        while (elfo.getVidaActual() > 0 && enano.getVidaActual() > 0){
            System.out.println("\n--- Recuperacion ---");
            elfo.recuperar();
            enano.recuperar();
            System.out.println("\n--- Golpe ---");
            elfo.luchar(enano);
            enano.luchar(elfo);
            System.out.println("\n--- Estado tras el golpe ---");
            System.out.println(elfo);
            System.out.println(enano);
        }

        System.out.println("\n--- Estado tras la batalla ---");
        System.out.println(elfo);
        System.out.println(enano);
    }
}