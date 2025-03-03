package pooUD7CasoPractico2;

public class Mundo {
    private String nombre;
    private float diametro;
    private boolean habitable;

    public Mundo() {
        this.nombre = "";
        this.diametro = 0;
        this.habitable = false;
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

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public boolean isHabitable() {
        return habitable;
    }

    public void setHabitable(boolean habitable) {
        this.habitable = habitable;
    }

    public void mostrar() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Diametro: " + this.diametro);
        System.out.println("Habitable: " + this.habitable);
    }

    @Override
    public String toString() {
        return "Mundo{" +
                "nombre='" + nombre + '\'' +
                ", diametro=" + diametro +
                ", habitable=" + habitable +
                '}';
    }
}
