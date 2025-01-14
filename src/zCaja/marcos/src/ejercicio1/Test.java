package zCaja.marcos.src.ejercicio1;

    public class Test {
        public static <Banco> void main(String[] args) {
            Banco banco = (Banco) new CuentaBancaria[3];

            CuentaBancaria.cuenta(new CuentaBancaria("Juan Pérez", 5000.0, TipoCuenta.AHORRO));
            CuentaBancaria.cuenta(new CuentaBancaria("Ana López", 3000.0, TipoCuenta.CORRIENTE));
            CuentaBancaria.cuenta(new CuentaBancaria("Carlos García", 10000.0, TipoCuenta.EMPRESARIAL));
            System.out.println();
        }
    }

