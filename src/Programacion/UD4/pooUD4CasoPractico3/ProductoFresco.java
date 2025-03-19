package pooUD4CasoPractico3;

public class ProductoFresco extends Producto{
    private String fechaEnvasado;
    private String paisOrigen;
    public ProductoFresco(String fechaCaducidad, int numeroLote) {
        super(fechaCaducidad, numeroLote);
    }
    public String getFechaEnvasado() {
        return fechaEnvasado;
    }
    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }
    public String getPaisOrigen() {
        return paisOrigen;
    }
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    @Override
    public String toString() {
        return "ProductoFresco [fechaEnvasado=" + fechaEnvasado + ", paisOrigen=" + paisOrigen + ", FechaCaducidad="
                + getFechaCaducidad() + ", NumeroLote=" + getNumeroLote() + "]";
    }
}
