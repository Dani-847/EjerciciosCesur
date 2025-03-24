package Programacion.Examenes.Examen16_01_2025.src.ejercicio1;

public class Carrito {
    private Producto[] productos;
    private final int capacidad;
    private int contador;

    public Carrito(int capacidad) {
        this.capacidad = capacidad;
        this.productos = new Producto[capacidad];
        this.contador = 0;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void agregarProducto(Producto producto) {
        if (contador < capacidad) {
            productos[contador] = producto;
            contador++;
        } else {
            System.out.println("No se pueden agregar más productos");
        }
    }

    public double mostrarCarrito() {
        double precioTotal = 0;
        for (int i = 0; i < contador; i++) {
            precioTotal += productos[i].getPrecio()*0.90;
            System.out.println(productos[i].getNombre() + " - Precio final: " + productos[i].getPrecio()*0.90);
        }
        System.out.println("Total: " + precioTotal);
        return precioTotal;
    }

    public String toString() {
        return "Carrito{" +
                "productos=" + productos +
                ", capacidad=" + capacidad +
                ", contador=" + contador +
                '}';
    }
}
