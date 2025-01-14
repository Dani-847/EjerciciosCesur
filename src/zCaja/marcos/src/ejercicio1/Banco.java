package zCaja.marcos.src.ejercicio1;

public class Banco {
    CuentaBancaria[] cuentas;
    int capacidad;

    public Banco(int capacidad) {
        cuentas = new CuentaBancaria[capacidad];
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        boolean agregado = false;
        int i = 0;
        while (i< cuentas.length && !agregado) {
            if (cuentas[i] == null) {
                cuentas[i] = cuenta;
                agregado = true;
            }
            i++;
        }
    }

    public double totalDinero(){
        double total=0;
        for (int i = 0; i < cuentas.length; i++) {
            total += cuentas[i].getTotalDinero();
        }
        return total;
    }
}
