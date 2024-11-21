package pooUD3CasoPractico2;

public class CuentaBancaria {
    private String nombre;
    private double saldo=0;
    public CuentaBancaria(){
    }
    public CuentaBancaria(String nombre){
        this.nombre = nombre;
    }
    public void depositar(double cantidad){
        saldo = saldo + cantidad;
    }
    public void retirar(double cantidad){
        if (saldo >= cantidad)
            saldo = saldo - cantidad;
    }
    public double mostrarSaldo(){
        return saldo;
    }
}
