package Programacion.UD2.fpUD2CasoPractico5;

import java.util.Scanner;

public class Ej3CuadradoYCubo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int n = sc.nextInt();

        for (int i = n;i<n+5;i++){
            System.out.println("Cuadrado de "+i+" = "+Math.pow(i,2)+": Cubo de "+i+" = "+Math.pow(i,3));
        }
    }
}
