package zCaja.marcos.src.ejercicio1;

public class Banco {
    CuentaBancaria[] cuentas;
    int capacidad;

    public Banco(int capacidad) {
        cuentas = new CuentaBancaria[capacidad];
    }
}
