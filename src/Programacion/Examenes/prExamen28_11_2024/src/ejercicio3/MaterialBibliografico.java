package Programacion.Examenes.prExamen28_11_2024.src.ejercicio3;

public class MaterialBibliografico {
    private String titulo;
    private String autor;
    private int anyoPublicacion;
    private boolean disponible;

    public MaterialBibliografico(String titulo, String autor, int anyoPublicacion, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.anyoPublicacion = anyoPublicacion;
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnyoPublicacion() {
        return anyoPublicacion;
    }

    public void setAnyoPublicacion(int anyoPublicacion) {
        this.anyoPublicacion = anyoPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("Material prestado exitosamente.");
        } else {
            System.out.println("Material no disponible para préstamo");
        }
    }

    public void prestar(int dias) {
        if (disponible) {
            disponible = false;
            System.out.println("Material prestado por " + dias + " días.");
        } else {
            System.out.println("Material no disponible para préstamo");
        }
    }

    public void devolver() {
        if (!disponible) {
            disponible = true;
            System.out.println("Material devuelto exitosamente.");
        }
    }

    public void mostrarDetalles() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicacion: " + anyoPublicacion);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }

    public void disponibilidad() {
        if (disponible) {
            System.out.println("Material disponible");
        } else {
            System.out.println("Material no disponible");
        }
    }

    public String toString() {
        return "MaterialBibliografico{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anyoPublicacion=" + anyoPublicacion +
                ", disponible=" + disponible +
                '}';
    }
}
