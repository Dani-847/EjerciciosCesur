package pooUD7CasoPractico2;

public class DiametroInferiorException extends Exception {
    public DiametroInferiorException(double diametro) {
        super("El diámetro del planeta es inferior a 20: " + diametro);
    }
}
