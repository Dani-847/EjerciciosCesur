package Programacion.Examenes.prExamen28_11_2024.src.ejercicio2;

public class ProductoRopa extends Producto{
    public String tamanyo;
    public ProductoRopa(String nombre, double precio, int cantidadStock, String tamanyo) {
        super(nombre, precio, cantidadStock);
        this.tamanyo = tamanyo;
    }
    public String getTamanyo() {
        return tamanyo;
    }
    public void setTamanyo(String tamanyo) {
        this.tamanyo = tamanyo;
    }
    @Override
    public double calcularPrecio() {
        double res = super.calcularPrecio();
        if (tamanyo.equals("L")||tamanyo.equals("XL")) {
            res *= 1.1;
        }
        return res;
    }
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tamaño: " + tamanyo);
    }
    @Override
    public String toString() {
        return super.toString() + ", Tamaño: " + tamanyo;
    }
}
