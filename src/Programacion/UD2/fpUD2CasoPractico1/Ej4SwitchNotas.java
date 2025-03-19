package fpUD2CasoPractico1;

import java.util.Scanner;

public class Ej4SwitchNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        double n = sc.nextDouble();
        sc.close();
        int r = 0;
        if (0 <= n && n < 4) r = 1;
        if (4 <= n && n < 6) r = 2;
        if (6 <= n && n < 7) r = 3;
        if (7 <= n && n < 9) r = 4;
        if (9 <= n && n <= 10) r = 5;

        switch (r) {
            case 1 -> System.out.println("Insuficiente");
            case 2 -> System.out.println("Regular");
            case 3 -> System.out.println("Bien");
            case 4 -> System.out.println("Notable");
            case 5 -> System.out.println("Sobresaliente");
            default -> System.out.println("No computa");
        }
    }
}
