package fpUD2CasoPractico6;

import java.util.Scanner;

public class Ej6TrianguloCondicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el lado del triangulo: ");
        int n = sc.nextInt();
        sc.close();
        for(int i = 0 ; i <= n ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + ",");
            }
            System.out.println();
        }
    }
}
