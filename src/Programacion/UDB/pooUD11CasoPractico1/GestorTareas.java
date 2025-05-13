package Programacion.UDB.pooUD11CasoPractico1;

import java.util.ArrayList;
import java.util.List;

public class GestorTareas {
    private List<Tarea> tareas;

    public GestorTareas() {
        tareas = new ArrayList<Tarea>();
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
        System.out.println("Tarea agregada correctamente");
    }

    public Tarea eliminarTarea(String titulo) {
        //  tareas.removeIf(tarea -> titulo.equals(tarea.getTitulo()));
        Tarea resultado = null;
        List<Tarea> listaAux = new ArrayList<>();
        listaAux.addAll(tareas);
        for (Tarea tarea : tareas) {
            if (resultado==null && titulo.equals(tarea.getTitulo())) {
                resultado = tarea;
                listaAux.remove(tarea);
            }
        }
        tareas = listaAux;
        return resultado;
    }

    public void mostrarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas");
        } else {
            for (Tarea tarea : tareas) {
                System.out.println(tarea);
            }
        }
    }
}
