package casoPractico9.solucionesProfesor;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado;
        do {
            System.out.print("Lado del cuadrado? ");
            lado = sc.nextInt();
        }while (lado<=1);
        sc.close();
        // Lado de arriba
        for (int i = 1; i <= lado ; i++) {
            System.out.print("*");
        }
        System.out.println();
        // Lados intermedios
        for (int fila = 2; fila < lado ; fila++) {
            System.out.print("*");
            for (int i = 2; i < lado ; i++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        // Lado de abajo
        for (int i = 1; i <= lado ; i++) {
            System.out.print("*");
        }
        System.out.println();

    }
}
