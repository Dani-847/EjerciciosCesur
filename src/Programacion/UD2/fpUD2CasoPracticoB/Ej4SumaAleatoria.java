package Programacion.UD2.fpUD2CasoPracticoB;

import java.util.Random;
import java.util.Scanner;

public class Ej4SumaAleatoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Cuántos intentos necesitas para adivinar la suma de los dos dados? ");
        int veces = sc.nextInt();
        int dado1 = r.nextInt(6) + 1;
        int dado2 = r.nextInt(6) + 1;
        int suma = dado1+dado2;
        int numero = 0;
        int intentos = 1;
        do {
            System.out.print("Intento nº"+intentos+": ");
            numero = sc.nextInt();
            if (numero < suma)
                System.out.println("Tu suma es menor");
            if (numero > suma)
                System.out.println("Tu suma es mayor");
            intentos++;
        } while (numero!=suma && intentos<=veces);
        if (intentos<veces || numero == suma)
            System.out.println("Acertaste");
        else
            System.out.println("Los números eran el "+dado1+" y el "+dado2+" - Suma = "+suma);
    }
}
