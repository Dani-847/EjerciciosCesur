package casoPractico2;

import java.util.Scanner;

public class EjEC2 {
    public static void main(String[] args) {
        int base = 0, altura = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una base: ");
        base = sc.nextInt();
        System.out.print("Y una altura: ");
        altura = sc.nextInt();
        System.out.println("El area es " + base * (altura / 2));
    }
}
