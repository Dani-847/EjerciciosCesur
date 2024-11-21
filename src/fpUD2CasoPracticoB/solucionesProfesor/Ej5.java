package fpUD2CasoPracticoB.solucionesProfesor;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        int original=sc.nextInt();
        sc.close();
        //Contamos cuántas cifras tiene
        int numero=original;
        int cifras=0;
        while (numero>0) {
            numero = numero/10;
            cifras++;
        }
        numero=original;
        int num;
        double suma=0;
        while (numero>0) {
            num = numero%10;
            suma+=Math.pow(num,cifras);
            numero = numero/10;
        }
        if (suma==original) {
            System.out.println("El numero es narcisista");
        } else {
            System.out.println("El numero no es narcisista");
        }
    }
}
