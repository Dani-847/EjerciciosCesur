package pooUD4CasoPractico2;

public class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private Persona propietario;
    public Cuenta() {
    }
    public Cuenta(String numeroCuenta, double saldo, Persona propietario) {
        this.numeroCuenta = numeroCuenta;
        setSaldo(saldo);
        this.propietario = propietario;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public Persona getPropietario() {
        return propietario;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo>=0?saldo:0;
    }
    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }
    public void transaccion(double cantidad, String tipoTransaccion) {
        if (tipoTransaccion.equalsIgnoreCase("ingreso")) {
            this.saldo+=cantidad;
        } else if (tipoTransaccion.equalsIgnoreCase("reintegro")) {
            if (this.saldo>=cantidad) {
                this.saldo-=cantidad;
            }
        }
        System.out.println("Transaccion de tipo: " + tipoTransaccion + ", Saldo actual: "+this.saldo);
    }
    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", propietario=[" + propietario.toString() + "]}";
    }
}
