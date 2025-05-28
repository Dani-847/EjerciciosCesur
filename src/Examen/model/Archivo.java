package model;

import java.util.*;
import java.util.stream.Collectors;

public class Archivo {
    private Set<Manuscrito> manuscritos;

    public Archivo() {
        this.manuscritos = new LinkedHashSet<>();
    }

    public boolean altaManuscrito(Manuscrito m) {
        return manuscritos.add(m);
    }

    public boolean eliminarManuscrito(int id) {
        return manuscritos.removeIf(m -> m.getId() == id);
    }

    public List<Manuscrito> listarTodos() {
        return new ArrayList<>(manuscritos);
    }

    public List<Manuscrito> listarConsultables() {
        return manuscritos.stream()
                .filter(Manuscrito::esConsultable)
                .collect(Collectors.toList());
    }

    public List<Manuscrito> filtrarPorTipo(String tipo) {
        return manuscritos.stream()
                .filter(m -> m.getTipo().equalsIgnoreCase(tipo))
                .collect(Collectors.toList());
    }

    public boolean actualizarManuscrito(Manuscrito actualizado) {
        boolean actualizadoExitosamente = false;

        for (Manuscrito m : manuscritos) {
            if (m.getId() == actualizado.getId()) {
                m.setTitulo(actualizado.getTitulo());
                m.setAutor(actualizado.getAutor());
                m.setAnio(actualizado.getAnio());
                m.setNivelAcceso(actualizado.getNivelAcceso());
                actualizadoExitosamente = true;
            }
        }

        return actualizadoExitosamente;
    }
}