package pooUD5CasoPractico6;

public class Ejemplar {
    private String titulo;
    private String autor;
    private int anyoPublicacion;
    public Ejemplar(String titulo, String autor, int anyoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anyoPublicacion = anyoPublicacion;
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
    public void mostrarInfo() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Año de publicación: " + anyoPublicacion);
    }
    public String toString() {
        return "Ejemplar [autor=" + autor + ", anyoPublicacion=" + anyoPublicacion + "]";
    }
}
