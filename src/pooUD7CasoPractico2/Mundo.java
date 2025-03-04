package pooUD7CasoPractico2;

public class Mundo {
    private String nombre;
    private double diametro;
    private boolean habitable;

    public Mundo() {
        nombre = "";
        diametro = 0;
        habitable = false;
    }

    public Mundo(String nombre, float diametro, boolean habitable) {
        this.nombre = nombre;
        this.diametro = diametro;
        this.habitable = habitable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public boolean isHabitable() {
        return habitable;
    }

    public void setHabitable(boolean habitable) {
        this.habitable = habitable;
    }
}
