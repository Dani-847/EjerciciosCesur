package pooCasoPractico2;

public class CuentaBancariaTest {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria("pepito");
        CuentaBancaria c2 = new CuentaBancaria("alonso");
        c1.depositar(122);
        c1.retirar(1.2);
        c2.depositar(122);
        c2.retirar(1.2);
        c1.mostrarSaldo();
        c2.mostrarSaldo();
    }
}
