package casoPractico9;

import java.util.Random;
import java.util.Scanner;

public class Ej4JuegoAdivinar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero maximo (1...al?): ");
        int n = sc.nextInt();
        System.out.print("En cuantos intentos? ");
        int intentos = sc.nextInt();
        Random r = new Random();
        int aleatorio = r.nextInt(n)+1;
        int respuesta=0;
        boolean ganar = false;
        int i = 1;
        while (i<=intentos&&!ganar){
            System.out.println("Intento nº"+i+":Adivina el numero");
            respuesta = sc.nextInt();
            if (respuesta<aleatorio)
                System.out.println("El numero es mayor");
            if (respuesta>aleatorio)
                System.out.println("El numero es menor");
            if (respuesta==aleatorio)
                ganar=true;
            i++;
        }
        if (ganar){
            System.out.println("Enhorabuena!! Has acertado");
        } else {
            System.out.println("No lo has acertado");
        }
    }
}
