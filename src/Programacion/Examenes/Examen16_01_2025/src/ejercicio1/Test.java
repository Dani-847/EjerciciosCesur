package ejercicio1;

public class Test {
    public static void main(String[] args) {
        Carrito carrito = new Carrito(3);

        carrito.agregarProducto(new Producto("Laptop", 1200.0, CategoriaProducto.ELECTRONICA));
        carrito.agregarProducto(new Producto("Camiseta", 20.0, CategoriaProducto.ROPA));
        carrito.agregarProducto(new Producto("Manzanas", 2.5, CategoriaProducto.ALIMENTACION));

        carrito.mostrarCarrito();
    }
}

