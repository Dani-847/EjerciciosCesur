package pooUD7CasoPractico3;

public class DemasiadoCalor extends Exception {
    public DemasiadoCalor(double temperatura) {
        super("Demasiado calor: " + temperatura);
    }
}
