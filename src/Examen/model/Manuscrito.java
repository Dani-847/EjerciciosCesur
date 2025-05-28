package model;

public abstract class Manuscrito implements Consultable , Comparable<Manuscrito> {
    private int id;
    private String titulo;
    private String autor;
    private int anio;
    private String nivelAcceso;

    public Manuscrito(int id, String titulo, String autor, int anio, String nivelAcceso) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.nivelAcceso = nivelAcceso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(String nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    public abstract String getTipo();

    @Override
    public String toString() {
        return  " id:" + id + " '" + titulo + "' de " + autor + " (" + anio + "), acceso: " + nivelAcceso;
    }

    @Override
    public int compareTo(Manuscrito o) {
        return this.getId() - o.getId();
    }
}
