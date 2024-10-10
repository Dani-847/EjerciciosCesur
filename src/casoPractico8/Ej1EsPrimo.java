package casoPractico8;

import java.util.Scanner;

public class Ej1EsPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero: ");
        int n = sc.nextInt();

        boolean es = true;
        int i = 3;
        if (n%2==0)
            es=false;
        while (n>i&&es){
            if (n%i==0)
                es=false;
            i+=2;
        }

        if (es)
            System.out.println("Es primo");
        else
            System.out.println("No es primo");
    }
}
