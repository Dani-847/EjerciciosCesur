package Programacion.UD2.fpUD2CasoPractico6;

import java.util.Scanner;

public class Ej3PiramideAsteriscos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el lado del triangulo: ");
        int n = sc.nextInt();
        sc.close();


        for(int i = 1;i<=n;i++){
            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
