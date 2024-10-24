package casoPractico11;

import java.util.Random;
import java.util.Scanner;

public class Ej2LanzamientoDado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("¿Cuántas veces lazo el dado? ");
        int veces = sc.nextInt();
        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0;
        for (int i = 1; i <= veces; i++) {
            int aleatorio = r.nextInt(6) + 1;
            switch (aleatorio) {
                case 1 -> n1++;
                case 2 -> n2++;
                case 3 -> n3++;
                case 4 -> n4++;
                case 5 -> n5++;
                case 6 -> n6++;
            }
        }
        System.out.println("Ha salido el 1, " + n1 + " veces");
        System.out.println("Ha salido el 2, " + n2 + " veces");
        System.out.println("Ha salido el 3, " + n3 + " veces");
        System.out.println("Ha salido el 4, " + n4 + " veces");
        System.out.println("Ha salido el 5, " + n5 + " veces");
        System.out.println("Ha salido el 6, " + n6 + " veces");
    }
}
