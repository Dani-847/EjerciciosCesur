package Programacion.Examenes.prExamen28_11_2024.src.ejercicio3;

public class Libro extends MaterialBibliografico{
    private String genero;
    private int numPaginas;
    public Libro(String titulo, String autor, int anyoPublicacion, boolean disponible, String genero, int numPaginas) {
        super(titulo, autor, anyoPublicacion, disponible);
        this.genero = genero;
        this.numPaginas = numPaginas;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getNumPaginas() {
        return numPaginas;
    }
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public void prestar(int dias) {
        if (dias > 14) {
            System.out.println("El libro no puede ser prestado por más de 14 días.");
        } else {
            super.prestar(dias);
        }
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Genero: " + genero);
        System.out.println("Número de Páginas: " + numPaginas);
    }

    @Override
    public String toString() {
        return "Libro{" + "genero=" + genero + ", numPaginas=" + numPaginas + '}';
    }
}
