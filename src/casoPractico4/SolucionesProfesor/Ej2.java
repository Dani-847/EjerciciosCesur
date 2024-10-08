package casoPractico4.SolucionesProfesor;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        int positivos=0;
        int negativos=0;
        int pares=0;
        int impares=0;
        int num;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <=10 ; i++) {
            System.out.print("Escribe un número: ");
            num = sc.nextInt();
            if (num!=0) {
                if (num % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
                if (num > 0) {
                    positivos++;
                } else {
                    negativos++;
                }
            }
        }
        System.out.println("Hay "+positivos+" números positivos");
        System.out.println("Hay "+negativos+" números negativos");
        System.out.println("Hay "+pares+" números pares");
        System.out.println("Hay "+impares+" números impares");
        sc.close();
    }
}
