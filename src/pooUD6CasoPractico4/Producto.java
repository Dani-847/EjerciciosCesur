package pooUD6CasoPractico4;

import java.util.Arrays;

public class Producto {
    private String nombre;
    private double[] preciosHistoricos;
    private static int totalProductos = 0;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        preciosHistoricos = new double[10];
        preciosHistoricos[0] = precio;
        totalProductos++;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarPrecio(double precio) {
        int i = 0;
        while (preciosHistoricos[i] != 0)
            i++;
        preciosHistoricos[i] = precio;
    }

    public double[] obtenerPreciosHistoricos(){
        return preciosHistoricos;
    }

    public double obtenerPrecioActual(){
        int i = 0;
        while (preciosHistoricos[i] != 0)
            i++;
        return preciosHistoricos[i - 1];
    }

    public void mostrarDetalles(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio actual: " + obtenerPrecioActual());
        System.out.println("Historial: " + Arrays.toString(preciosHistoricos));
    }

    public static double obtenerTotalProductos(){
        return totalProductos;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", preciosHistoricos=" + Arrays.toString(preciosHistoricos) +
                '}';
    }
}
