package Programacion.UD2.fpUD2CasoPractico7;

import java.util.Scanner;

public class Ej1PiramideEspaciada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero N (entero): ");
        int n = sc.nextInt();
        sc.close();
        int z = n;
        for(int i = 1;i<=n;i++){
            espacios(z);
            z--;
            for (int j = 1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public static void espacios(int n){
        for (int i = 1;i<=n;i++){
            System.out.print(" ");
        }
    }
}
