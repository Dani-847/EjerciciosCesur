package fpUD2CasoPractico3.SolucionesProfesor;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Importe neto: ");
        double neto = sc.nextDouble();
        double iva = neto* 0.21;
        System.out.println("IVA: "+iva);
        System.out.println("Total de la factura: "+(neto+iva));
        sc.close();
    }
}
