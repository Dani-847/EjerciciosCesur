package ejercicio2;

public class Tarea {
    private String nombre;
    private PrioridadTarea prioridad;
    private double costo;

    public Tarea(String nombre, PrioridadTarea prioridad, double costo) {
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PrioridadTarea getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(PrioridadTarea prioridad) {
        this.prioridad = prioridad;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String toString() {
        return "Tarea{" + "nombre=" + nombre + ", prioridad=" + prioridad + ", costo=" + costo + '}';
    }
}
