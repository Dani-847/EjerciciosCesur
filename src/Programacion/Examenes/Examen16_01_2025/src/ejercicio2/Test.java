package ejercicio2;

public class Test {
    public static void main(String[] args) {
        Empresa empresa = new Empresa(3);

        Proyecto proyecto1 = new Proyecto("Proyecto A", EstadoProyecto.EN_PROCESO, 3);
        proyecto1.agregarTarea(0, new Tarea("Tarea 1", PrioridadTarea.ALTA, 1500));
        proyecto1.agregarTarea(1, new Tarea("Tarea 2", PrioridadTarea.MEDIA, 800));
        proyecto1.agregarTarea(2, new Tarea("Tarea 3", PrioridadTarea.BAJA, 300));

        Proyecto proyecto2 = new Proyecto("Proyecto B", EstadoProyecto.FINALIZADO, 2);
        proyecto2.agregarTarea(0, new Tarea("Tarea 1", PrioridadTarea.MEDIA, 500));
        proyecto2.agregarTarea(1, new Tarea("Tarea 2", PrioridadTarea.ALTA, 1200));

        Proyecto proyecto3 = new Proyecto("Proyecto C", EstadoProyecto.EN_PROCESO, 4);
        proyecto3.agregarTarea(0, new Tarea("Tarea 1", PrioridadTarea.ALTA, 2000));
        proyecto3.agregarTarea(1, new Tarea("Tarea 2", PrioridadTarea.BAJA, 400));
        proyecto3.agregarTarea(2, new Tarea("Tarea 3", PrioridadTarea.MEDIA, 600));
        proyecto3.agregarTarea(3, new Tarea("Tarea 4", PrioridadTarea.MEDIA, 900));

        empresa.agregarProyecto(0, proyecto1);
        empresa.agregarProyecto(1, proyecto2);
        empresa.agregarProyecto(2, proyecto3);

        empresa.mostrarProyectos();
        System.out.printf("Presupuesto total de proyectos en proceso: %.2f€%n",empresa.calcularPresupuestoTotal());
    }
}
