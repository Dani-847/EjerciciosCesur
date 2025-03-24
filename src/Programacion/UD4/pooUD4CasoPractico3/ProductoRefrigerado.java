package Programacion.UD4.pooUD4CasoPractico3;

public class ProductoRefrigerado extends Producto{
    private String codigoOrganismoSupervision;
    public ProductoRefrigerado(String fechaCaducidad, int numeroLote) {
        super(fechaCaducidad, numeroLote);
    }
    public String getCodigoOrganismoSupervision() {
        return codigoOrganismoSupervision;
    }
    public void setCodigoOrganismoSupervision(String codigoOrganismoSupervision) {
        this.codigoOrganismoSupervision = codigoOrganismoSupervision;
    }
    @Override
    public String toString() {
        return "ProductoRefrigerado [codigoOrganismoSupervision=" + codigoOrganismoSupervision + ", FechaCaducidad="
                + getFechaCaducidad() + ", NumeroLote=" + getNumeroLote() + "]";
    }
}
