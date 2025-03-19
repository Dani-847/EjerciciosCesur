package ejercicio2;

public class ProductoElectronico extends Producto{
    private int garantia;
    public ProductoElectronico(String nombre, double precio, int cantidadStock, int garantia) {
        super(nombre, precio, cantidadStock);
        this.garantia = garantia;
    }
    public int getGarantia() {
        return garantia;
    }
    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    @Override
    public double calcularPrecio() {
        return this.garantia > 2 ? super.calcularPrecio() * 0.9 : super.calcularPrecio();
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Garantía: " + garantia + " años");
    }

    @Override
    public String toString() {
        return super.toString() + ", Garantía: " + garantia + " años";
    }
}
