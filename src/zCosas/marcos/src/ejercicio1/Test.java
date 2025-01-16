package zCosas.marcos.src.ejercicio1;

public class Test {
    public static void main(String[] args) {
        Banco banco = new Banco(3);

        CuentaBancaria cuenta1 = new CuentaBancaria("Juan Pérez", 5000.0, 300, TipoCuenta.AHORRO);
        CuentaBancaria cuenta2 = new CuentaBancaria("Ana López", 3000.0, 32, TipoCuenta.CORRIENTE);
        CuentaBancaria cuenta3 = new CuentaBancaria("Carlos García", 10000.0, 12, TipoCuenta.EMPRESARIAL);
        banco.agregarCuenta(cuenta1);
        banco.agregarCuenta(cuenta2);
        banco.agregarCuenta(cuenta3);
        cuenta1.realizarTransaccion(1000, 1);
        cuenta2.realizarTransaccion(500, 2);
        cuenta3.realizarTransaccion(2000, 1);
        cuenta1.calcularInteres();
        cuenta2.calcularInteres();
        cuenta3.calcularInteres();
        System.out.println("Total dinero en el banco: " + banco.totalDinero());
    }
}

