package Programacion.UDC.pooUD12CasoPractico3.model;

public class ProductoElectronico extends Producto {
    private int garantiaMeses;

    public ProductoElectronico(String codigo, String nombre, String tipo, double precio, int garantiaMeses) {
        super(codigo, nombre, tipo, precio);
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public String getTipo() {
        return "Electronico";
    }

    @Override
    public String toString() {
        return "ProductoElectronico{" + super.toString() + ", garantiaMeses=" + garantiaMeses + ", precio con IVA="+String.format("%.2f€",calcularPrecioFinal())+'}';
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio() * 1.21;
    }
}