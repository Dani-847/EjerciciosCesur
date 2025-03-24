package Programacion.UD1.u4CasoPractico;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Introduce numeros (0 para terminar): ");
            double n = sc.nextDouble();
            double mayor = n;

            while (n!=0){
                n = sc.nextDouble();
                if (n>mayor)
                    mayor=n;
                if (n<0)
                    System.out.println("El ultimo '"+ n +"' numero fue negativo. ");
            }
            sc.close();
            System.out.println("El mayor es "+ mayor);
    }
}
