package pooUD7CasoPractico1;

public class ExcepcionDeDivisionPorCero extends Exception {
    public ExcepcionDeDivisionPorCero(double message) {
        super("Trata ExcepcionDeDivisionPorCero: / por "+message);
    }
}
