package Programacion.UDC.pooUD12CasoPractico3.model;

public class ProductoHigiene extends Producto {
    private boolean esDesinfectante;

    public ProductoHigiene(String codigo, String nombre, String tipo, double precio, boolean esDesinfectante) {
        super(codigo, nombre, tipo, precio);
        this.esDesinfectante = esDesinfectante;
    }

    public boolean isEsDesinfectante() {
        return esDesinfectante;
    }

    public void setEsDesinfectante(boolean esDesinfectante) {
        this.esDesinfectante = esDesinfectante;
    }

    @Override
    public String getTipo() {
        return "Higiene";
    }

    @Override
    public String toString() {
        return "ProductoHigiene{" + super.toString() + ", esDesinfectante=" + esDesinfectante + ", precio con IVA="+String.format("%.2f€",calcularPrecioFinal())+'}';
    }

    @Override
    public double calcularPrecioFinal() {
        double precioFinal;
        if (esDesinfectante) {
            precioFinal = getPrecio()*1.10;
        } else {
            precioFinal = getPrecio()*1.21;
        }
        return precioFinal;
    }
}
