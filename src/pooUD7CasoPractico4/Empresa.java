package pooUD7CasoPractico4;

import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            try {
                System.out.print("\nIntroduzca el nombre del empleado (o 'FIN' para salir): ");
                String nombre = scanner.nextLine().trim();

                if (nombre.equalsIgnoreCase("FIN")) {
                    System.out.println("Finalizando la entrada de empleados.");
                    continuar = false;
                } else {
                    System.out.print("Introduzca el salario base: ");
                    double salarioBase = Double.parseDouble(scanner.nextLine());

                    Empleado empleado = new Empleado(nombre, salarioBase);

                    System.out.print("Introduzca la bonificación: ");
                    double bonificacion = Double.parseDouble(scanner.nextLine());

                    empleado.asignarBonificacion(bonificacion);
                    empleado.mostrarSalario();
                }
            } catch (SalarioInvalidoException | BonificacionInvalidaException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Introduzca los datos de nuevo");
            } catch (NumberFormatException e) {
                System.out.println("Error: introduzca un número válido.");
                System.out.println("Introduzca los datos de nuevo");
            }
        }

        scanner.close();
    }
}
