package model;

public class TratadoAlquimico extends Manuscrito{
    private boolean estaCompleto;

    public TratadoAlquimico(int id, String titulo, String autor, int anio, String nivelAcceso, boolean estaCompleto) {
        super(id, titulo, autor, anio, nivelAcceso);
        this.estaCompleto = estaCompleto;
    }

    public boolean isEstaCompleto() {
        return estaCompleto;
    }

    public void setEstaCompleto(boolean estaCompleto) {
        this.estaCompleto = estaCompleto;
    }

    @Override
    public String getTipo() {
        return "Tratado Alquímico";
    }

    @Override
    public String toString() {
        return "[Tratado]" + super.toString();
    }

    @Override
    public boolean esConsultable() {
        return estaCompleto;
    }
}
