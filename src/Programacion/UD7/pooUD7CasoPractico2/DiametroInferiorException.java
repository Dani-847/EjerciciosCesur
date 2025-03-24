package pooUD7CasoPractico2;

public class DiametroInferiorException extends Exception {
    public DiametroInferiorException(double diametro) {
        super("Diametro inferior a 20: " + diametro);
    }
}
