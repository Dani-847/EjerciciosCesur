package model;

public class Grimorio extends Manuscrito{
    private String nivelPeligro;

    public Grimorio(int id, String titulo, String autor, int anio, String nivelAcceso, String nivelPeligro) {
        super(id, titulo, autor, anio, nivelAcceso);
        this.nivelPeligro = nivelPeligro;
    }

    public String getNivelPeligro() {
        return nivelPeligro;
    }

    public void setNivelPeligro(String nivelPeligro) {
        this.nivelPeligro = nivelPeligro;
    }

    @Override
    public String getTipo() {
        return "Grimorio";
    }

    @Override
    public String toString() {
        return "[Grimorio]" + super.toString();
    }

    @Override
    public boolean esConsultable() {
        return getNivelPeligro().equalsIgnoreCase("bajo");
    }
}
