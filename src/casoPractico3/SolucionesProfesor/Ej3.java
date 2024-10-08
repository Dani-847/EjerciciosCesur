package casoPractico3.SolucionesProfesor;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del empleado: ");
        String nombre = sc.nextLine();
        System.out.print("Sueldo base: ");
        double base = sc.nextDouble();
        System.out.println("El empleado "+nombre+" tiene un sueldo líquido igual a "+(base*0.8));
    }
}
