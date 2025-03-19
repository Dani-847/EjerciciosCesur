package ejercicio3;

public class Tesis extends MaterialBibliografico{
    private String universidad;
    private String campoEstudio;
    public Tesis(String titulo, String autor, int anyoPublicacion, boolean disponible, String universidad, String campoEstudio) {
        super(titulo, autor, anyoPublicacion, disponible);
        this.universidad = universidad;
        this.campoEstudio = campoEstudio;
    }
    public String getUniversidad() {
        return universidad;
    }
    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }
    public String getCampoEstudio() {
        return campoEstudio;
    }
    public void setCampoEstudio(String campoEstudio) {
        this.campoEstudio = campoEstudio;
    }
    public void prestar(Boolean tienePermiso) {
        if (tienePermiso) {
            System.out.println("Tesis prestada exitosamente.");
            super.prestar();
        } else {
            System.out.println("El préstamo de esta tesis requiere permisos especiales.");
        }
    }
    @Override
    public void prestar(int dias){
        if (isDisponible()) {
            setDisponible(false);
            System.out.println("Tesis prestada por " + dias + " días.");
        } else {
            System.out.println("Material no disponible para préstamo");
        }
    }

    public void prestar(String usuario){
        if (isDisponible()) {
            setDisponible(false);
            System.out.println("Tesis prestada a " + usuario);
        } else {
            System.out.println("Material no disponible para préstamo");
        }
    }
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Universidad: " + universidad);
        System.out.println("Campo de Estudio: " + campoEstudio);
    }
    @Override
    public String toString() {
        return "Tesis{" + "universidad=" + universidad + ", campoEstudio=" + campoEstudio + '}';
    }
}
