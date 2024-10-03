package casoPractico4;

import java.util.Scanner;

public class Ej4CalculosParaAyB {
    public static void main(String[] args) {
        System.out.print("Introduzca dos valores(A, B): ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(), n2 = sc.nextInt();
        sc.close();
        int statement = n1 > n2 ? 1 : n1 == n2 ? 2 : 3;



        if (statement == 1) {
            double total = 0;
            for (int i = 100; i <= 1000; i++) {
                if ((i * (i + 1) / 5) % 5 == 0) {
                    total += i;
                }
            }
            System.out.println("Resultado: " + total);
        }



        if (statement == 2) {
            double total = 0;
            for (int i = 1; i <= 45; i += 4) {
                total += i / n1;
            }
            System.out.println("Resultado: " + total);
        }



        if (statement == 3) {
            long total = 0;
            int x = 0;
            int y = 0;
            for (int i = 1; i <= 10; i++) {
                x += 2;
                y += 3;
                total += (long) Math.pow(x, y);
                System.out.println(total);
            }
            System.out.println("Resultado: " + total * (n2 - n1));
        }
    }
}
