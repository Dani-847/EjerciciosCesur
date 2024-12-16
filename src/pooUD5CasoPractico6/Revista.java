package pooUD5CasoPractico6;

public class Revista extends Ejemplar{
    private int edicion;
    private String periodicidad;
    public Revista(String titulo, String autor, int anyoPublicacion, int edicion, String periodicidad) {
        super(titulo, autor, anyoPublicacion);
        this.edicion = edicion;
        this.periodicidad = periodicidad;
    }
    public int getEdicion() {
        return edicion;
    }
    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }
    public String getPeriodicidad() {
        return periodicidad;
    }
    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }
    @Override
    public void mostrarInfo() {
        System.out.print("Revista: " + "Edición: " + edicion + "Periodicidad: " + periodicidad);
        super.mostrarInfo();
    }
    @Override
    public String toString() {
        return "Revista [edicion=" + edicion + ", periodicidad=" + periodicidad + ", getAutor()=" + getAutor()
                + ", getAnyoPublicacion()=" + getAnyoPublicacion() + "]";
    }
}
