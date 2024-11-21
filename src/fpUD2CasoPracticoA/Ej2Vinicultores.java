package fpUD2CasoPracticoA;

import java.util.Scanner;

public class Ej2Vinicultores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Precio al kilo de uva? ");
        int precio = Integer.parseInt(sc.nextLine());
        while (precio <= 1) {
            System.out.print("Precio invalido. Precio al kilo de uva? ");
            precio = Integer.parseInt(sc.nextLine());
        }
        System.out.print("Tipo? ");
        String tipo = sc.nextLine();
        while (!(tipo.equalsIgnoreCase("a")) && !(tipo.equalsIgnoreCase("b"))) {
            System.out.print("Tipo invalido. Tipo(A, B)? ");
            tipo = sc.nextLine();
        }
        System.out.print("Tamanyo? ");
        int tam = Integer.parseInt(sc.nextLine());
        while (tam != 1 && tam != 2) {
            System.out.print("Tamanyo invalido. Tamanyo(1, 2)? ");
            tam = Integer.parseInt(sc.nextLine());
        }
        System.out.print("Kilos? ");
        int k = Integer.parseInt(sc.nextLine());
        while (k <= 0) {
            System.out.print("Kilos invalidos. Kilos(>0)? ");
            k = Integer.parseInt(sc.nextLine());
        }

        if (tipo.equalsIgnoreCase("a")){
            if (tam == 1)
                precio += 0.20;
            else
                precio += 0.30;
        }
        if (tipo.equalsIgnoreCase("b")) {
            if (tam == 1)
                precio -= 0.20;
            else
                precio -= 0.30;
        }
        double total = k*precio;
        System.out.println("Total ganancia: "+total);
    }
}
