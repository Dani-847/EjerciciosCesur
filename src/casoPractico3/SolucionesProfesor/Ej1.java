package casoPractico3.SolucionesProfesor;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Año actual? ");
        int actual = sc.nextInt();
        System.out.print("Año de nacimiento? ");
        int nacimiento = sc.nextInt();
        System.out.println("Tienes "+(actual-nacimiento)+" años");
        sc.close();
    }
}