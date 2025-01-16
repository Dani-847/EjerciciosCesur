package zCosas.masCosas;

import java.util.Random;
import java.util.Scanner;

public class adas {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Crear un objeto Random para generar números aleatorios
        Random random = new Random();

        // Generar dos números aleatorios entre 1 y 6
        //int dado1 = random.nextInt(6) + 1;
        //int dado2 = random.nextInt(6) + 1;
        int dado1 = 2;
        int dado2 = 4;
        int suma = dado1 + dado2;

        // Preguntar al usuario cuántos intentos necesita
        System.out.print("¿Cuántos intentos necesitas para adivinar la suma de los dos dados? ");
        int intentos = scanner.nextInt();

        // Dar al usuario varias oportunidades para adivinar la suma
        for (int i = 1; i <= intentos; i++) {
            System.out.print("Intento n° " + i + ": ");
            int adivinanza = scanner.nextInt();

            // Comparar la adivinanza con la suma real
            if (adivinanza < suma) {
                System.out.println("Tu suma es menor");
            } else if (adivinanza > suma) {
                System.out.println("Tu suma es mayor");
            } else {
                System.out.println("¡Correcto! Has adivinado la suma.");
                break; //EL TERROR DE CUALQUIER PROGRAMADOR
            }
        }

        // Mostrar los números y la suma al final
        System.out.printf("Los números eran " + dado1 + " y el " + dado2 + " la suma de estos da " + suma);

        // Cerrar el scanner
        scanner.close();
    }
}
