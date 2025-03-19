package u5CasoPractico;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el valor de A: ");
        double n1 = sc.nextDouble();
        System.out.print("Introduzca el valor de B: ");
        double n2 = sc.nextDouble();
        double aux = n1;
        n1=n2;
        n2=aux;
        System.out.println("Dsps ... valores: A: " + n1 +" B: "+n2);



    }
}
