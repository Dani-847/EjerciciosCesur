package Programacion.UD9.pooUD9CasoPractico3;

import Programacion.UD9.pooUD9CasoPractico3.criaturas.*;

public class Pruebas {
    public static void main(String[] args) throws InterruptedException {
        Criatura elfo = new Elfo("elfo");
        Criatura enano = new Enano("enano");
        Criatura marcos = new CriaturaCustom("marcos", 20, 1, Colores.PURPLE);
        Criatura jiaxin = new CriaturaCustom("jiaxin", 20, 1, Colores.PINK);

        Criatura jugador1 = marcos;
        Criatura jugador2 = jiaxin;

        System.out.println(jugador1);
        System.out.println(jugador2);

        System.out.println("\n--- Batalla ---");
        boolean turno = true;
        while (jugador1.getVidaActual() > 0 && jugador2.getVidaActual() > 0){
            if (turno) {
                jugador1.luchar(jugador2);
                jugador2.luchar(jugador1);
                turno = false;
            } else {
                jugador2.luchar(jugador1);
                jugador1.luchar(jugador2);
                turno = true;
            }
            Thread.sleep(1000); // Pausa de 1 segundo
            System.out.println("\n--- Estado tras el golpe ---");
            System.out.println(jugador1);
            System.out.println(jugador2);
        }
    }
}