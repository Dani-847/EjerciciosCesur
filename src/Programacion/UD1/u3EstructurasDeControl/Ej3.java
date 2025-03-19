package u3EstructurasDeControl;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Indica el nombre del empleado: ");
        String nombre = sc.nextLine();

        System.out.print("Indica el sueldo base del empleado: ");
        double salario = sc.nextDouble();
        sc.close();

        System.out.println("El sueldo liquido de " + nombre + " es " + salario * 0.80 + ".");
    }
}
