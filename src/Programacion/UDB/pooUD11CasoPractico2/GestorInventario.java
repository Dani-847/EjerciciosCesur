package Programacion.UDB.pooUD11CasoPractico2;

import java.util.*;

public class GestorInventario {
    private Set<Producto> productos;

    public GestorInventario() {
        this.productos = new TreeSet<Producto>();
    }

    public Set<Producto> getProductos() {
        return productos;
    }

    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "GestorInventario{" +
                "productos=" + productos +
                '}';
    }

    public boolean agregarProducto(Producto producto) {
        return this.productos.add(producto);
    }

    public boolean eliminarProducto(Producto producto) {
        return this.productos.remove(producto);
    }

    public void mostrarProductos() {
        if (this.productos.isEmpty()) {
            System.out.println("No hay productos");
        } else
            productos.forEach(System.out::println);
      /*  for (Producto producto : this.productos) {
            System.out.println(producto);
        }*/
    }

    public Producto buscarProducto(String codigo) {
       // return this.productos.stream().filter(producto -> producto.getCodigo().equals(codigo)).findFirst().orElse(null);
        Producto elProducto = null;
        for (Producto producto : this.productos) {
            if (producto.getCodigo().equals(codigo)) {
                elProducto = producto;
            }
        }
        return elProducto;
    }

    public List<Producto> filtrarProductos(double precioMin, double precioMax) {
        List<Producto> productos = new ArrayList();
        for (Producto producto : this.productos) {
            if (producto.getPrecio() >= precioMin && producto.getPrecio() <= precioMax) {
                productos.add(producto);
            }
        }
        return productos;
    }
}
