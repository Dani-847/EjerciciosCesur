package zCosas.marcos.src.Ejercicio3;

public class Test {
    public static void main(String[] args) {
        Inventario inventario = new Inventario(3,2);

        Productos producto1 = new Productos("Manzana", CategoriaProductos.ALIMENTACION, 1.0);
        Productos producto2 = new Productos("Camiseta", CategoriaProductos.ROPA, 20.0);
        Productos producto3 = new Productos("Laptop", CategoriaProductos.ELECTRONICA, 500.0);

        Lote lote1 = new Lote("20/12/24", 100, producto1);
        Lote lote2 = new Lote("08/01/25", 50, producto2);
        Lote lote3 = new Lote("27/12/24", 20, producto3);

        inventario.agregarProducto(0, producto1);
        inventario.agregarProducto(1, producto2);
        inventario.agregarProducto(2, producto3);

        inventario.agregarLote(0, lote1);
        inventario.agregarLote(1, lote2);
        inventario.agregarLote(2, lote3);

        inventario.mostrarInventario();
    }
}