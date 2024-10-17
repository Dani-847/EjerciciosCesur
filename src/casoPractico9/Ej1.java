package casoPractico9;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el lado del cuadrado: ");
        int lado = sc.nextInt();
        sc.close();
        for (int i = 1;i<=lado;i++){
            for (int j = 1;j<=lado;j++){
                if (i==1||i==lado)
                    System.out.print("*");
                else if (j==1||j==lado)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
