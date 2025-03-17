package pooUD4CasoPractico3;

public class ProductoCongelado extends Producto{
    private String temperaturaRecomendada;
    public ProductoCongelado(String fechaCaducidad, int numeroLote) {
        super(fechaCaducidad, numeroLote);
    }
    public String getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }
    public void setTemperaturaRecomendada(String temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }
    @Override
    public String toString() {
        return "ProductoCongelado [temperaturaRecomendada=" + temperaturaRecomendada + ", FechaCaducidad="
                + getFechaCaducidad() + ", NumeroLote=" + getNumeroLote() + "]";
    }
}
