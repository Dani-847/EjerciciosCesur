package pooUD4CasoPractico7;

public class Pelicula {
    private String titulo;
    private String anhoEstreno;
    private String genero;
    private Actor actorPpal;
    private Director director;

    public Pelicula(String titulo, String anhoEstreno, String genero, Actor actorPpal, Director director) {
        this.titulo = titulo;
        this.anhoEstreno = anhoEstreno;
        this.genero = genero;
        this.actorPpal = actorPpal;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnhoEstreno() {
        return anhoEstreno;
    }

    public void setAnhoEstreno(String anhoEstreno) {
        this.anhoEstreno = anhoEstreno;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Actor getActorPpal() {
        return actorPpal;
    }

    public void setActorPpal(Actor actorPpal) {
        this.actorPpal = actorPpal;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", anhoEstreno='" + anhoEstreno + '\'' +
                ", genero='" + genero + '\'' +
                ", actorPpal=" + actorPpal +
                ", director=" + director +
                '}';
    }

    public void mostrarDetalles() {
        System.out.println(this);
    }
}
