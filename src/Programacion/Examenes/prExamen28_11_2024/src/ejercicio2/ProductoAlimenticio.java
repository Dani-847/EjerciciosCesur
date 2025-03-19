package Programacion.Examenes.prExamen28_11_2024.src.ejercicio2;

public class ProductoAlimenticio extends Producto{
    private String fechaVencimiento;
    public ProductoAlimenticio(String nombre, double precio, int cantidadStock, String fechaVencimiento) {
        super(nombre, precio, cantidadStock);
        this.fechaVencimiento = fechaVencimiento;
    }
    public String getFechaCaducidad() {
        return fechaVencimiento;
    }
    public void setFechaCaducidad(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    @Override
    public double calcularPrecio() {
        return this.fechaVencimiento.equals("próximo mes") ? super.calcularPrecio() * 0.8 : super.calcularPrecio();
    }
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Fecha de caducidad: " + fechaVencimiento);
    }
    @Override
    public String toString() {
        return super.toString() + ", Fecha de caducidad: " + fechaVencimiento;
    }
}
