package pooUD7CasoPractico2;

public class ValorNegativoException extends Exception {
    public ValorNegativoException(double diametro) {
        super("Valor de diametro negativo: " + diametro);
    }
}
