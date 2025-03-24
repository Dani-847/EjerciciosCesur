package Programacion.Examenes.prExamen28_11_2024.src.ejercicio2;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidadStock;
    public Producto(String nombre, double precio, int cantidadStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public int getCantidad() {
        return cantidadStock;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setCantidad(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }
    public double calcularPrecio() {
        return precio;
    }
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad en Stock: " + cantidadStock);
    }
    public void disponibilidad() {
        if (cantidadStock > 0) {
            System.out.println("El producto está disponible");
        } else {
            System.out.println("El producto no está disponible");
        }
    }
    public String toString() {
        return "Nombre: " + nombre + ", Precio: " + precio + ", Cantidad: " + cantidadStock;
    }
}
