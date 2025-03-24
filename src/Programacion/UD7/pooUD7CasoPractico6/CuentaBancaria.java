package Programacion.pooUD7CasoPractico6;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) throws SaldoInvalidoException {
        if (saldoInicial < 0) {
            throw new SaldoInvalidoException("El saldo inicial no puede ser negativo.");
        }
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) throws CantidadInvalidaException {
        if (cantidad <= 0) {
            throw new CantidadInvalidaException("La cantidad a depositar debe ser mayor a cero.");
        }
        saldo += cantidad;
        System.out.printf("Depósito realizado. Nuevo saldo: %.2f€%n", saldo);
    }

    public void retirar(double cantidad) throws CantidadInvalidaException, FondosInsuficientesException {
        if (cantidad <= 0) {
            throw new CantidadInvalidaException("La cantidad a retirar debe ser mayor a cero.");
        }
        if (cantidad > saldo) {
            throw new FondosInsuficientesException("Fondos insuficientes. Saldo actual: "+saldo+"€");
        }
        saldo -= cantidad;
        System.out.printf("Retiro realizado. Nuevo saldo: %.2f€%n", saldo);
    }

    public void mostrarSaldo() {
        System.out.println("\nTitular: " + titular);
        System.out.printf("Saldo actual: %.2f€%n", saldo);
    }
}
