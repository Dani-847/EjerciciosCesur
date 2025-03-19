package Programacion.Examen06_03_2025.Ejercicio2;

public class Test {
    public static void main(String[] args) {
        // Creación de dos cuentas bancarias
        CuentaBancaria cuenta1 = new CuentaBancaria("Ana García", 1000);
        CuentaBancaria cuenta2 = new CuentaBancaria("Luis Martínez", 500);
        try {
            // Realizar operaciones:
            cuenta1.depositar(300);          // Depósito de 300€ en la cuenta1
            cuenta1.reintegro(200);         // Reintegro de 200€ en la cuenta1
            cuenta1.transferir(cuenta2, 400);  // Transferencia de 400€ de cuenta1 a cuenta2

            // Probamos con valores inválidos para observar el manejo de excepciones:
            //cuenta1.depositar(0);
            //cuenta1.reintegro(-50);
            //cuenta1.reintegro(2000);
        } catch (DepositoInvalidoException | ReintegroInvalidoException | SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();
        System.out.printf("Saldo de %s : %.2f€%n", cuenta1.getTitular(),cuenta1.getSaldo());
        System.out.printf("Saldo de %s : %.2f€%n", cuenta2.getTitular(),cuenta2.getSaldo());
        System.out.println();
        // Mostrar el historial de transacciones de cada cuenta
        cuenta1.mostrarHistorial();
        System.out.println();
        cuenta2.mostrarHistorial();
    }
}
