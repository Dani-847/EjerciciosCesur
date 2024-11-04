package pooCasoPractico3;

public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private int paginaActual = 0;
    public Libro(String titulo, String autor, int numeroPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    public void leerPagina(){
        if (numeroPaginas>paginaActual)
            paginaActual++;
    }
    public void retrocederPagina(){
        if (paginaActual>0)
            paginaActual--;
    }
    public String mostrarInfo(){
        return "Titulo: "+titulo+ ", Autor: " +autor+", Pagina actual: "+paginaActual;
    }
}
