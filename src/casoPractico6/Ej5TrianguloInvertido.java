package casoPractico6;

import java.util.Scanner;

public class Ej5TrianguloInvertido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el lado del triangulo: ");
        int n = sc.nextInt();
        sc.close();

        for(int i = 0 ; i <= n ; i++){
            for (int j = i ; j <= n ; j++){
                System.out.print(j+",");
            }
            System.out.println();

        }
    }
}
