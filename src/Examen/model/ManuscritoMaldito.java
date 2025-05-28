package model;

public class ManuscritoMaldito extends Manuscrito{
    private boolean estaSellado;

    public ManuscritoMaldito(int id, String titulo, String autor, int anio, String nivelAcceso, boolean estaSellado) {
        super(id, titulo, autor, anio, nivelAcceso);
        this.estaSellado = estaSellado;
    }

    public boolean isEstaSellado() {
        return estaSellado;
    }

    public void setEstaSellado(boolean estaSellado) {
        this.estaSellado = estaSellado;
    }

    @Override
    public String getTipo() {
        return "Manuscrito Maldito";
    }

    @Override
    public String toString() {
        return "[Maldito]" + super.toString();
    }

    @Override
    public boolean esConsultable() {
        return estaSellado;
    }
}
