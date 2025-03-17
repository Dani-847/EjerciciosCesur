package fpUD2CasoPractico4;

import java.util.Scanner;

public class Ej1DosNumeros_Condicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        double n1 = sc.nextDouble();
        System.out.print("Introduce el segundo numero: ");
        double n2 = sc.nextDouble();
        sc.close();
        double res = n1==n2?n1*n2:n1>n2?n1-n2:n1+n2;
        System.out.println("El resultado es: " + res);
    }
}
