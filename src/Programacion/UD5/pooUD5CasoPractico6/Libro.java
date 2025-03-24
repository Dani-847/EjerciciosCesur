package Programacion.UD5.pooUD5CasoPractico6;

public class Libro extends Ejemplar{
    private int numPaginas;
    private String genero;
    public Libro(String titulo, String autor, int anyoPublicacion, int numPaginas, String genero) {
        super(titulo, autor, anyoPublicacion);
        this.numPaginas = numPaginas;
        this.genero = genero;
    }
    public int getNumPaginas() {
        return numPaginas;
    }
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    @Override
    public void mostrarInfo() {
        System.out.print("Libro: " + "Número de páginas: " + numPaginas + "Género: " + genero);
        super.mostrarInfo();
    }
    @Override
    public String toString() {
        return "Libro [numPaginas=" + numPaginas + ", genero=" + genero + ", getAutor()=" + getAutor()
                + ", getAnyoPublicacion()=" + getAnyoPublicacion() + "]";
    }
}
