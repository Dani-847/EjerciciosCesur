package cp1EstructurasDeControl;

import java.util.Scanner;

public class Ej3IntroduceNumsHastaQueSeaPositivo {
    public static void main(String[] args) {
        int n=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        n = sc.nextInt();
        while (n<1){
            System.out.print("Numero no valido, introduce otro: ");
            n = sc.nextInt();
        }
        sc.close();
        System.out.print("Funciona, numero fue: "+n);
    }
}
