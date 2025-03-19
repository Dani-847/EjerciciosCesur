package fpUD2CasoPractico2;

import java.util.Scanner;

public class Ej5DescuentoOctubre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Indica un mes: ");
        String mes = sc.nextLine();

        System.out.print("Indica un importe: ");
        double importe = sc.nextDouble();
        sc.close();

        if (mes.equalsIgnoreCase("octubre"))
            importe*=0.85;

        System.out.println("El precio final es: "+ importe);
    }
}
