package pooUD7CasoPractico1;

public class ExcepcionDeDivisionPorCero extends Exception {
    public ExcepcionDeDivisionPorCero(int mensaje) {
        super("trata de division: cero / " + mensaje);
    }
}
