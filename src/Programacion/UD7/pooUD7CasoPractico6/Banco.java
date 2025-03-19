package Programacion.pooUD7CasoPractico6;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CuentaBancaria cuenta;
        int opcion=0;
        try {
            System.out.print("Introduzca el nombre del titular de la cuenta: ");
            String titular = scanner.nextLine();

            System.out.print("Introduzca el saldo inicial: ");
            double saldoInicial = Double.parseDouble(scanner.nextLine());

            cuenta = new CuentaBancaria(titular, saldoInicial);
            System.out.println("Cuenta creada exitosamente.");
        } catch (SaldoInvalidoException | NumberFormatException e) {
            System.out.println("Error al crear la cuenta: " + e.getMessage());
            return;
        }

        while (opcion!=4) {
            try {
                System.out.println("\nOpciones: 1) Depositar 2) Retirar 3) Mostrar saldo 4) Salir");
                System.out.print("Seleccione una opción: ");
                opcion = Integer.parseInt(scanner.nextLine());

                if (opcion == 4) {
                    System.out.println("Saliendo del sistema. ¡Gracias por usar nuestro banco!");
                } else {
                    switch (opcion) {
                        case 1:
                            System.out.print("Introduzca la cantidad a depositar: ");
                            double deposito = Double.parseDouble(scanner.nextLine());
                            cuenta.depositar(deposito);
                            break;
                        case 2:
                            System.out.print("Introduzca la cantidad a retirar: ");
                            double retiro = Double.parseDouble(scanner.nextLine());
                            cuenta.retirar(retiro);
                            break;
                        case 3:
                            cuenta.mostrarSaldo();
                            break;
                        default:
                            System.out.println("Opción no válida. Intente nuevamente.");
                    }
                }
            } catch (CantidadInvalidaException | FondosInsuficientesException e) {
                System.out.println("Error en la operación: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Error: Introduzca un valor numérico válido.");
            }
        }

        scanner.close();
    }
}
