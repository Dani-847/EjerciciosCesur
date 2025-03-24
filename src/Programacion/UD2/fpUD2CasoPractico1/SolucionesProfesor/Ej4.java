package Programacion.UD2.fpUD2CasoPractico1.SolucionesProfesor;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        do{
            System.out.print("Introduce la nota:");
            nota = sc.nextDouble();
        } while (nota<0 || nota>10);
        if (nota >= 0 && nota < 4) {
            System.out.println("Insuficiente");
        } else if (nota >= 4 && nota < 6) {
            System.out.println("Regular");
        } else if (nota >= 6 && nota < 7) {
            System.out.println("Bien");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("Notable");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Sobresaliente");
        }
        sc.close();
    }
}
