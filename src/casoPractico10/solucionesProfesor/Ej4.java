import java.util.Random;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        int puntosJugador=0;
        int puntosPC=0;
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int jugadaPC;
        int jugadaJugador;
        do{
            System.out.println("Elige tu arma: ");
            System.out.println("0.- Piedra");
            System.out.println("1.- Papel");
            System.out.println("2.- Tijeras");
            jugadaJugador = sc.nextInt();
            jugadaPC = r.nextInt(3);
            if ((jugadaJugador==2 && jugadaPC==0)
                    ||(jugadaJugador==2 && jugadaPC==1)
                    ||(jugadaJugador==1 && jugadaPC==0)){
                puntosJugador++;
                System.out.println("Ha ganado el jugador");
            } else if (jugadaJugador==jugadaPC){
                System.out.println("Empate");
            } else {
                System.out.println("Ha ganado el ordenador");
                puntosPC++;
            }
            String jJugador="";
            switch (jugadaJugador){
                case 0 -> jJugador="Piedra";
                case 1 -> jJugador="Papel";
                case 2 -> jJugador="Tijeras";
            }
            String jPC="";
            switch (jugadaPC){
                case 0 -> jPC="Piedra";
                case 1 -> jPC="Papel";
                case 2 -> jPC="Tijeras";
            }
            System.out.println("Jugador "+jJugador+" - PC "+jPC);
            System.out.println("MARCADOR");
            System.out.println("========");
            System.out.println("Jugador -> "+puntosJugador+" - PC -> "+puntosPC);
        } while (puntosJugador<3 && puntosPC<3);
        if (puntosJugador==3){
            System.out.println("HA GANADO EL JUGADOR!!");
        } else {
            System.out.println("HA GANADO EL ORDENADOR!!");
        }
        sc.close();
    }
}
