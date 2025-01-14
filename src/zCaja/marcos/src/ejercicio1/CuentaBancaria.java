package zCaja.marcos.src.ejercicio1;

public class CuentaBancaria {
    private final String titular;
    private final double sueldo;
    private double totalDinero;
    private TipoCuenta tipoCuenta;

    public CuentaBancaria(String titular, double sueldo, double totalDinero, TipoCuenta tipoCuenta) {
        this.titular = titular;
        this.sueldo = sueldo;
        this.totalDinero = totalDinero;
        this.tipoCuenta = tipoCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSueldo() {
        return sueldo;
    }

    public double getTotalDinero() {
        return totalDinero;
    }

    public void setTotalDinero(double totalDinero) {
        this.totalDinero = totalDinero;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public void realizarTransaccion(double monto, int tipoTransaccion) {
        if (tipoTransaccion == 1) { //agregar
            this.totalDinero += monto;
        } else if (tipoTransaccion == 2) { //retirar
            this.totalDinero -= monto;
        }
    }



    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", sueldo=" + sueldo +
                ", gettotalDinero=" + gettotalDinero +
                ", tipoCuenta=" + tipoCuenta +
                '}';
    }
}
