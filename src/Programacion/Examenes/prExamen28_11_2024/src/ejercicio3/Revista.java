package Programacion.Examenes.prExamen28_11_2024.src.ejercicio3;

public class Revista extends MaterialBibliografico{
    private int numeroEdicion;
    private String mesPublicacion;
    public Revista(String titulo, String autor, int anyoPublicacion, boolean disponible, int numeroEdicion, String mesPublicacion) {
        super(titulo, autor, anyoPublicacion, disponible);
        this.numeroEdicion = numeroEdicion;
        this.mesPublicacion = mesPublicacion;
    }
    public int getNumeroEdicion() {
        return numeroEdicion;
    }
    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }
    public String getMesPublicacion() {
        return mesPublicacion;
    }
    public void setMesPublicacion(String mesPublicacion) {
        this.mesPublicacion = mesPublicacion;
    }

    @Override
    public void prestar() {
        if (isDisponible()) {
            setDisponible(false);
        } else {
            System.out.println("Esta revista solo es para consulta interna.");
        }
    }

    @Override
    public void prestar(int dias) {
        if (dias <= 7) {
            if (!this.isDisponible()){
                System.out.println("Esta revista solo es para consulta interna.");
            } else {
                super.prestar();
            }
        }
    }
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Número de Edición: " + numeroEdicion);
        System.out.println("Mes de Publicación: " + mesPublicacion);
    }
    @Override
    public String toString() {
        return "Revista{" + "numeroEdicion=" + numeroEdicion + ", mesPublicacion=" + mesPublicacion + '}';
    }
}
