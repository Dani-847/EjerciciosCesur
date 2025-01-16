package ejercicio2;

public class Proyecto {
    private String nombre;
    private EstadoProyecto estado;
    private static double presupuestoTotal;
    private Tarea[] tareas;

    public Proyecto(String nombre, EstadoProyecto estado, int numTareas) {
        this.nombre = nombre;
        this.estado = estado;
        this.tareas = new Tarea[numTareas];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public EstadoProyecto getEstado() {
        return estado;
    }

    public void setEstado(EstadoProyecto estado) {
        this.estado = estado;
    }

    public static void setPresupuesto(double presupuesto) {

    }

    public Tarea[] getTareas() {
        return tareas;
    }

    public void agregarTarea(int posicion, Tarea tarea) {
        this.tareas[posicion] = tarea;
        actualizarPresupuestoTotal(tarea);
    }

    public void actualizarPresupuestoTotal(Tarea tarea) {
        presupuestoTotal += tarea.getCosto();
    }

    public double calcularPresupuesto() {
        double presupuesto = 0;
        for (Tarea tarea : tareas) {
            presupuesto += tarea.getCosto();
        }
        return presupuesto;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Estado: " + estado);
        System.out.println("Presupuesto final: " + calcularPresupuesto());
    }

    public String toString() {
        return "Proyecto{" +
                "nombre='" + nombre + '\'' +
                ", estado=" + estado +
                ", presupuesto=" + calcularPresupuesto() +
                ", tareas=" + tareas +
                '}';
    }
}
