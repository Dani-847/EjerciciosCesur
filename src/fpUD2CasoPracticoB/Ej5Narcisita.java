package fpUD2CasoPracticoB;

import java.util.Scanner;

public class Ej5Narcisita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        int n = sc.nextInt();

        int digitos = 0;
        int aux = n;
        while (aux != 0) {
            aux = aux / 10;
            digitos++;
        }

        int sumaElevada = 0;
        aux = n;
        while (aux > 0) {
            int digito = aux % 10;
            sumaElevada += Math.pow(digito, digitos);
            aux /= 10;
        }

        if (sumaElevada == n)
            System.out.println(n + " es un número narcisista.");
        else
            System.out.println(n + " no es un número narcisista.");
    }
}
