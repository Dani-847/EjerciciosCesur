package casoPractico8;

import java.util.Scanner;

public class Ej1EsPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero: ");
        int n = sc.nextInt();

        boolean es = true;
        for(int i = 3;n>i&&es;i++){
            if (n%i==0)
                es=false;
        }
        if (es)
            System.out.println("Es primo");
        else
            System.out.println("No es primo");
    }
}
