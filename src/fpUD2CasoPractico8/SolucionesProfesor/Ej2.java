package fpUD2CasoPractico8.SolucionesProfesor;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tipo de hamburguesa (sencilla/doble/triple): ");
        String tipo = sc.nextLine();
        System.out.print("¿Cuántas hamburguesas? ");
        int cantidad = Integer.parseInt(sc.nextLine());
        System.out.print("¿Pago con tarjeta? (si/no) ");
        String pago = sc.nextLine();
        sc.close();
        double precio = 0;
        switch (tipo.toLowerCase()) {
            case "sencilla" -> precio = 5;
            case "doble" -> precio = 8;
            case "triple" -> precio = 12;
            default -> precio=0;
        }
        double total = precio * cantidad;
        if (pago.equalsIgnoreCase("si")){
            total = total * 1.05;
        }
        System.out.println("Precio total: "+total);
    }
}
