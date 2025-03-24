package Programacion.UD2.fpUD2CasoPractico3.SolucionesProfesor;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de alumnos: ");
        int alumnos = sc.nextInt();
        double media = 0;
        double nota;
        for (int i = 1; i <= alumnos ; i++) {
            System.out.print("Nota del alumno "+i+": ");
            nota = sc.nextDouble();
            media = media + nota;
        }
        sc.close();
        System.out.println("El promedio es "+(media/alumnos));
    }
}
