package model;

public class Profecia extends Manuscrito{
    private Boolean estaDescifrada;

    public Profecia(int id, String titulo, String autor, int anio, String nivelAcceso, boolean estaDescifrada) {
        super(id, titulo, autor, anio, nivelAcceso);
        this.estaDescifrada = estaDescifrada;
    }

    public Boolean getEstaDescifrada() {
        return estaDescifrada;
    }

    public void setEstaDescifrada(Boolean estaDescifrada) {
        this.estaDescifrada = estaDescifrada;
    }

    @Override
    public String getTipo() {
        return "Profecía";
    }

    @Override
    public String toString() {
        return "[Profecia]" + super.toString();
    }

    @Override
    public boolean esConsultable() {
        return estaDescifrada;
    }
}
