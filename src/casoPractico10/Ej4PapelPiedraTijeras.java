package casoPractico10;

import java.util.Random;
import java.util.Scanner;

public class Ej4PapelPiedraTijeras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int puntosJugador = 0;
        int puntosPC = 0;
        int cnt = 0;

        do {
            System.out.println("Elije tu arma");
            System.out.println("0.- Piedra");
            System.out.println("1.- Papel");
            System.out.println("2.- Tijeras");
            int arma = sc.nextInt();
            int armaOrdenador = r.nextInt(2);
            System.out.println("Arma jugador: " + arma + " - Arma ordenador: " + armaOrdenador);
            if (arma == armaOrdenador)
                System.out.println("Empate");
            else if ((arma == 0 && armaOrdenador == 2) || (arma == 1 && armaOrdenador == 0) || (arma == 2 && armaOrdenador == 1)) {
                System.out.println("Gana el jugador.");
                puntosJugador++;
                if (arma == 0) System.out.println("Piedra aplasta Tijeras");
                if (arma == 1) System.out.println("Papel envuelve a Piedra");
                if (arma == 2) System.out.println("Tijera corta Papel");
            } else {
                System.out.println("Gana el ordenador.");
                puntosPC++;
                if (armaOrdenador == 0) System.out.println("Piedra aplasta Tijeras");
                if (armaOrdenador == 1) System.out.println("Papel envuelve a Piedra");
                if (armaOrdenador == 2) System.out.println("Tijera corta Papel");


                System.out.println("Marcador");
                System.out.println("========");
                System.out.println("Jugador: " + puntosJugador + " - Ordenador: " + puntosPC);
            }
            System.out.print("Desea continuar (si:1 no:0)? ");
            cnt=sc.nextInt();
            System.out.println("=============================");
        }while (cnt != -1);
    }
}