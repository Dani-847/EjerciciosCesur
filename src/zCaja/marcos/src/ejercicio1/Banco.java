package zCaja.marcos.src.ejercicio1;

public class Banco {
    CuentaBancaria[] cuentas;
    int capacidad;

    public Banco(int capacidad) {
        cuentas = new CuentaBancaria[capacidad];
    }

    public void agregarCuenta(CuentaBancaria cuenta) {

    }

    public double totalDinero(){
        double total=0;
        for (int i = 0; i < cuentas.length; i++) {
            total += cuentas[i].getTotalDinero();
        }
        return total;
    }
}
