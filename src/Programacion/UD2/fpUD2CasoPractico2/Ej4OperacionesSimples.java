package Programacion.UD2.fpUD2CasoPractico2;

import java.util.Scanner;

public class Ej4OperacionesSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce dos numeros: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        sc.close();
        if (n1==0&&n2==0){
            System.out.println("0 entre 0");
        } else if (n1==0||n2==0){
            System.out.println("un numero entre 0 es 0");
        } else {
            double res = n1>n2 ? n1/n2 : n2/n1;
            System.out.println(res);
        }
    }
}
