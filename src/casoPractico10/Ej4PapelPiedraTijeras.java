package casoPractico10;

import java.util.Random;
import java.util.Scanner;

public class Ej4PapelPiedraTijeras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int puntosJugador = 0;
        int puntosPC= 0;

        int arma = 0;
        do {
            System.out.println("Elije tu arma (-1 para terminar el juego)");
            System.out.println("0.- Piedra");
            System.out.println("1.- Papel");
            System.out.println("2.- Tijeras");
            arma = sc.nextInt();
            int armaOrdenador = r.nextInt(2);
            System.out.println("Arma jugador: " + arma + " - Arma ordenador: " + armaOrdenador);
            int condVict = -1;

            if (arma == armaOrdenador)
                System.out.println("Empate");

            if (arma==0&&armaOrdenador==1){
                System.out.print("Gana el ordenador. ");
                condVict=0;
                puntosPC++;
            }
            if (arma==0&&armaOrdenador==2){
                System.out.print("Gana el jugador. ");
                condVict=2;
                puntosJugador++;
            }
            if (arma==1&&armaOrdenador==0){
                System.out.print("Gana el jugador. ");
                condVict=0;
                puntosJugador++;
            }
            if (arma==1&&armaOrdenador==2){
                System.out.print("Gana el ordenador. ");
                condVict=1;
                puntosPC++;
            }
            if (arma==2&&armaOrdenador==0){
                System.out.print("Gana el ordenador. ");
                condVict=2;
                puntosPC++;
            }
            if (arma==2&&armaOrdenador==1){
                System.out.print("Gana el jugador. ");
                condVict=1;
                puntosJugador++;
            }

            if (condVict == 0)
                System.out.println("Papel envuelve a Piedra");
            if (condVict == 1)
                System.out.println("Tijera corta Papel");
            if (condVict == 2)
                System.out.println("Piedra aplasta Tijeras");
            System.out.println("Marcador");
            System.out.println("========");
            System.out.println("Jugador: "+puntosJugador+" - Ordenador: "+puntosPC);
        }while(arma!=-1);

    }
}
