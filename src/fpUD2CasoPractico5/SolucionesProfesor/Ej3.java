package fpUD2CasoPractico5.SolucionesProfesor;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        int numero=sc.nextInt();
        sc.close();
        for (int i = numero; i <= (numero+4) ; i++)
            System.out.println("El cuadrado de "+i+" = "+Math.pow(i,2)+" : Cubo de "+i+" = "+Math.pow(i,3));
    }
}
