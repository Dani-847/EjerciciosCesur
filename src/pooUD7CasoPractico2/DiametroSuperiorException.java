package pooUD7CasoPractico2;

public class DiametroSuperiorException extends Exception {
    public DiametroSuperiorException(double diametro) {
        super("El diámetro del planeta es superior a 100: " + diametro);
    }
}
