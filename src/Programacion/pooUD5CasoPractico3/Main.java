package pooUD5CasoPractico3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de alumnos: ");
        int numAlumnos = Integer.parseInt(sc.nextLine());

        double[] notas = new double[numAlumnos];
        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Ingrese la nota del alumno " + (i + 1) + ": ");
            notas[i] = Double.parseDouble(sc.nextLine());
        }

        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }

        double media = suma / numAlumnos;
        System.out.println("La nota media del grupo es: " + media);

        System.out.println("Alumnos con notas superiores a la media:");
        for (int i = 0; i < numAlumnos; i++) {
            if (notas[i] > media) {
                System.out.println("Alumno " + (i + 1) + " con nota: " + notas[i]);
            }
        }
    }
}
