package casoPractico10;

import java.util.Scanner;

public class Ej3AvaroBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Saldo anterior? ");
        int precio = Integer.parseInt(sc.nextLine());
        while (precio <= 1) {
            System.out.print("Precio invalido. Precio al kilo de uva? ");
            precio = Integer.parseInt(sc.nextLine());
        }
        System.out.print("Monto? ");
        int monto= Integer.parseInt(sc.nextLine());
        while (monto<= 1) {
            System.out.print("Tipo invalido. Tipo(A, B)? ");
            monto = Integer.parseInt(sc.nextLine());
        }
        System.out.print("Pago anterior? ");
        int pA = Integer.parseInt(sc.nextLine());
        while (pA<= 1) {
            System.out.print("Tamanyo invalido. Tamanyo(1, 2)? ");
            pA = Integer.parseInt(sc.nextLine());
        }

    }
}
