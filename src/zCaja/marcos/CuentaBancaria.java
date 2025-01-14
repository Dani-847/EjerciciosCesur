package zCaja.marcos;

public class CuentaBancaria {
    private final String titular;
    private final double saldo;
    private TipoCuenta tipoCuenta;

    public CuentaBancaria(String titular, double saldo, TipoCuenta tipoCuenta) {
        this.titular = titular;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }


}
