package fpUD2CasoPractico6.SolucionesProfesor;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor para el lado del triángulo: ");
        int lado= sc.nextInt();
        sc.close();
        for (int fila = 1; fila <=lado ; fila++) {
            for (int numAsteriscos = 1; numAsteriscos <= fila; numAsteriscos++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
