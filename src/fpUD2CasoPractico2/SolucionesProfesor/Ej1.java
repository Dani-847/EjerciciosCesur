package fpUD2CasoPractico2.SolucionesProfesor;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuál es tu edad? ");
        int edad = sc.nextInt();
        System.out.print("Cuál es tu peso? ");
        double peso = sc.nextDouble();
        System.out.println("Tienes "+edad+" años y pesas "+peso+" kilos");
        sc.close();
    }
}