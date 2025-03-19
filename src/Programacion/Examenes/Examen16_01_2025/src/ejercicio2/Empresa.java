package ejercicio2;

public class Empresa {
    private Proyecto[] proyectos;

    public Empresa(int numProyectos) {
        this.proyectos = new Proyecto[numProyectos];
    }

    public Proyecto[] getProyectos() {
        return proyectos;
    }

    public void agregarProyecto(int posicion, Proyecto proyecto) {
        this.proyectos[posicion] = proyecto;
    }

    public void mostrarProyectos() {
        for (Proyecto proyecto : proyectos) {
            proyecto.mostrarInfo();
        }
    }

    public double calcularPresupuestoTotal() {
        double presupuestoTotal = 0;
        for (Proyecto proyecto : proyectos) {
            if (proyecto.getEstado() == EstadoProyecto.EN_PROCESO)
                presupuestoTotal += proyecto.calcularPresupuesto();
        }
        return presupuestoTotal;
    }

    public String toString() {
        return "Empresa{" +
                "proyectos=" + proyectos +
                '}';
    }
}
