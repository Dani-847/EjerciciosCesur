package Programacion.Examen06_03_2025.Ejercicio2;

public class CuentaBancaria {
    private String titular;
    private double saldo;
    private Transaccion[] transacciones;
    private int numTransacciones = 0;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.transacciones = new Transaccion[100];
    }

    public void depositar(double cantidad) throws DepositoInvalidoException{
        if (cantidad <= 0) {
            throw new DepositoInvalidoException("La cantidad a depositar debe ser mayor que 0.");
        }
        saldo += cantidad;
        transacciones[numTransacciones] = new Transaccion("Depósito", cantidad);
        numTransacciones++;
        System.out.println("Depósito de " + String.format("%.2f€", cantidad) + " realizado con éxito.");
    }

    public void reintegro(double cantidad) throws ReintegroInvalidoException, SaldoInsuficienteException {
        if (cantidad <= 0) {
            throw new ReintegroInvalidoException("La cantidad a reintegrar debe ser mayor que 0.");
        }
        if (cantidad > this.saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente.");
        }
        saldo -= cantidad;
        transacciones[numTransacciones] = new Transaccion("Reintegro", cantidad);
        numTransacciones++;
        System.out.println("Reintegro de " + String.format("%.2f€", cantidad) + " realizado con éxito.");
    }

    public void transferir(CuentaBancaria cuentaDestino, double cantidad) throws ReintegroInvalidoException, SaldoInsuficienteException, DepositoInvalidoException {
        reintegro(cantidad);
        cuentaDestino.depositar(cantidad);
        transacciones[numTransacciones] = new Transaccion("Transferencia enviada", cantidad);
        cuentaDestino.transacciones[cuentaDestino.numTransacciones] = new Transaccion("Transferencia recibida", cantidad);
        numTransacciones++;
        cuentaDestino.setNumTransacciones(cuentaDestino.getNumTransacciones() + 1);
        System.out.println("Transferencia de " + String.format("%.2f€", cantidad) + " de " + titular + " a " + cuentaDestino.getTitular() + " realizada con éxito.");
    }

    public void mostrarHistorial() {
        System.out.println("Historial de transacciones de " + titular + ":");
        for (Transaccion transaccion : transacciones) {
            if (transaccion != null) {
                System.out.println(transaccion);
            }
        }
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumTransacciones() {
        return numTransacciones;
    }

    public void setNumTransacciones(int numTransacciones) {
        this.numTransacciones = numTransacciones;
    }

    @Override
    public String toString() {
        return titular + " - " + String.format("%.2f€", saldo);
    }
}
