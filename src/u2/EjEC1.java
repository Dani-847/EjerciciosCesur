package u2;

import java.util.Scanner;

public class EjEC1 {
    public static void main(String[] args) {
        int edad = 0;
        int peso = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una edad: ");
        edad = sc.nextInt();
        System.out.print("Introduce un peso: ");
        peso = sc.nextInt();
        System.out.println("Edad "+edad+" peso "+peso);
    }
}
