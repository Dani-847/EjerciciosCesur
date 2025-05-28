package Programacion.UDB.pooUD11CasoPractico3;

public class Libro implements Comparable<Libro>{
    private String isbn;
    private String titulo;
    private String autor;
    private String codigo;
    private boolean estado;
    int copia=0;

    public Libro(String isbn, String titulo, String autor, boolean estado) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.estado = estado;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", codigo='" + codigo + '\'' +
                ", estado=" + estado +
                '}';
    }

    @Override
    public int compareTo(Libro o) {
        return this.codigo.compareTo(o.getCodigo());
    }
}
