package zCaja.marcos.src.ejercicio1;

public class CuentaBancaria {
    private final String titular;
    private final double sueldo;
    private double gettotalDinero;
    private TipoCuenta tipoCuenta;

    public CuentaBancaria(String titular, double sueldo, double gettotalDinero, TipoCuenta tipoCuenta) {
        this.titular = titular;
        this.sueldo = sueldo;
        this.gettotalDinero = gettotalDinero;
        this.tipoCuenta = tipoCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSueldo() {
        return sueldo;
    }

    public double getGettotalDinero() {
        return gettotalDinero;
    }

    public void setGettotalDinero(double gettotalDinero) {
        this.gettotalDinero = gettotalDinero;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public void realizarTransaccion(double monto, int tipoTransaccion) {
        if (tipoTransaccion == 1) { //agregar
            this.gettotalDinero += monto;
        } else if (tipoTransaccion == 2) { //retirar
            this.gettotalDinero -= monto;
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
