package Programacion.Examenes.prExamen28_11_2024.src.ejercicio2;

public class Main {
    public static void main(String[] args) {
        // Crear productos
        Producto producto1 = new ProductoElectronico("Televisor", 300.0, 10, 3);
        Producto producto2 = new ProductoRopa("Camiseta", 20.0, 15, "L");
        Producto producto3 = new ProductoAlimenticio("Leche", 2.5, 50, "próximo mes");

        // Mostrar detalles y calcular precios
        System.out.println("Detalles del Producto 1 (Electrónico):");
        producto1.mostrarDetalles();
        System.out.println("Precio final: $" + producto1.calcularPrecio());
        producto1.disponibilidad();

        System.out.println("\nDetalles del Producto 2 (Ropa):");
        producto2.mostrarDetalles();
        System.out.println("Precio final: $" + producto2.calcularPrecio());
        producto2.disponibilidad();

        System.out.println("\nDetalles del Producto 3 (Alimenticio):");
        producto3.mostrarDetalles();
        System.out.println("Precio final: $" + producto3.calcularPrecio());
        producto3.disponibilidad();
    }
}
