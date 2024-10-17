package casoPractico8.SolucionesProfesor;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        int numero=sc.nextInt();
        sc.close();
        boolean esPrimo = true;
        int divisor=2;
        int resto;
        while (esPrimo && divisor<numero){
            resto=numero%divisor;
            if (resto==0)
                esPrimo=false;
            divisor++;
        }
        if (esPrimo)
            System.out.println("El número "+numero+" es primo");
        else
            System.out.println("El número "+numero+" no es primo");
    }
}
