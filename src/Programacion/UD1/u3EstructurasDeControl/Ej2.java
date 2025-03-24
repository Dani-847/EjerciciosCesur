package Programacion.UD1.u3EstructurasDeControl;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        System.out.print("Indica el total de la factura: ");
        double total = leer();
        System.out.println(total);
        System.out.println("El total +21% de IVA es: " + (total+total*0.21) + ".");
    }
    public static double leer(){
        Scanner sc = new Scanner(System.in);
        double total = sc.nextDouble();
        sc.close();
        System.out.println(total);
        return total;
    }
}
