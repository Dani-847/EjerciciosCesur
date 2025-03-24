package Programacion.UD2.fpUD2CasoPractico8;

import java.util.Scanner;

public class Ej2Hamburger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Que tipo de hamburguesa? ");
        String tipoHam = sc.nextLine();
        System.out.print("Cuantas? ");
        int cantidad = Integer.parseInt(sc.nextLine());
        System.out.print("Con que quieres pagar? ");
        String tipoPago = sc.nextLine();

        int precioUD = 0;
        do {
            if (tipoHam.toLowerCase().equals("sencilla")) precioUD = 5;
            if (tipoHam.toLowerCase().equals("doble")) precioUD = 8;
            if (tipoHam.toLowerCase().equals("triple")) precioUD = 12;
            if (precioUD == 0) {
                System.out.print("Tipo invalido introduzcalo de nuevo (sencillas, dobles, medianas): ");
                tipoHam = sc.nextLine();
            }
        } while (precioUD == 0);

        double modPago = 0;
        do {
            if (tipoPago.toLowerCase().equals("tarjeta")) modPago = 1.05;
            if (tipoPago.toLowerCase().equals("efectivo")) modPago = 1;
            if (modPago == 0) {
                System.out.print("Tipo invalido introduzcalo de nuevo (efectivo, tarjeta): ");
                tipoPago = sc.nextLine();
            }
        } while (modPago == 0);

        System.out.println("El total serian: " + (precioUD * cantidad) * modPago);
    }
}
