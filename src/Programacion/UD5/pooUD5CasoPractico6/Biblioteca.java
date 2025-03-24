package Programacion.UD5.pooUD5CasoPractico6;

public class Biblioteca {
    private Ejemplar[] ejemplares;

    public Biblioteca(int tamanyo) {
        ejemplares = new Ejemplar[tamanyo];
    }

    public void agregarEjemplar(Ejemplar ejemplar) {
        boolean lleno = false;
        int i = 0;

        while (i < ejemplares.length && !lleno) {
            if (ejemplares[i] == null) {
                ejemplares[i] = ejemplar;
                lleno = true;
            }
            i++;
        }

        if (!lleno) {
            System.out.println("No se pueden agregar más ejemplares");
        } else {
            System.out.println("Ejemplar agregado exitosamente");
        }
    }

    public void eliminarEjemplar(String titulo) {
        boolean eliminado = false;
        int i = 0;

        while (i < ejemplares.length && !eliminado) {
            if (ejemplares[i] != null && ejemplares[i].getAutor().equalsIgnoreCase(titulo)) {
                ejemplares[i] = null;
                eliminado = true;
            }
            i++;
        }

        if (!eliminado) {
            System.out.println("No se encuentra el ejemplar");
        } else {
            System.out.println("Ejemplar eliminado exitosamente");
        }
    }

    public void mostrarEjemplares() {
        for (int i = 0; i < ejemplares.length; i++) {
            if (ejemplares[i] != null) {
                ejemplares[i].mostrarInfo();
            }
        }
    }
}

