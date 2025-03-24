package Programacion.UD2.fpUD2CasoPracticoB.solucionesProfesor;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe el número de segundos: ");
        int segundos = sc.nextInt();
        sc.close();
        int horas = segundos / 3600;
        segundos = segundos % 3600;
        int minutos = segundos / 60;
        segundos = segundos % 60;
        System.out.printf("Equivale a %d horas, %d minutos, %d segundos\n", horas, minutos, segundos);
    }
}
