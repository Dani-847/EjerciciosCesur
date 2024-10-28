package casoPractico11.solucionesProfesor;

import java.util.Random;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int intentos;
        do {
            System.out.print("¿En cuántos intentos lo vas a adivinar? ");
            intentos = sc.nextInt();
        }while(intentos <= 0);

        int dado1 = rand.nextInt(6)+1;
        int dado2 = rand.nextInt(6)+1;
        int suma = dado1 + dado2;
        int sumaJug=0;
        int intentoJug=1;
        boolean acertado=false;
        while (!acertado && intentoJug<=intentos) {
            System.out.printf("Intento nº%d: ", intentoJug);
            sumaJug = sc.nextInt();
            if (sumaJug == suma) {
                acertado=true;
            } else if (sumaJug < suma) {
                System.out.println("La suma de los dados es mayor");
            } else {
                System.out.println("La suma de los dados es menor");
            }
            intentoJug++;
        }
        if (acertado) {
            System.out.println("Has acertado!!!! ENHORABUENA");
        } else {
            System.out.println("Ohhhhh!!!! No has acertado");
        }
        System.out.printf("Los números eran el %d y el %d - Suma=%d",dado1,dado2,suma);
        sc.close();
    }
}
