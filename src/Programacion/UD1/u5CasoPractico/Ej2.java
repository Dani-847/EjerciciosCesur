package Programacion.UD1.u5CasoPractico;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un dia de la semana: ");
        String dia = sc.nextLine();
        sc.close();

        switch (dia.toLowerCase()) {
            case "lunes","martes","miercoles","jueves","viernes" -> System.out.println("Laborable");
            case "sabado","domingo" -> System.out.println("No Laborable");
            default -> System.out.println("No computa");
        }
    }
}
