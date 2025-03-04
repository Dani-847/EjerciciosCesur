package pooUD7CasoPractico3;

public class DemasiadoFrio extends Exception {
    public DemasiadoFrio(double temperatura) {
        super("Demasiado frio: " + temperatura);
    }
}
