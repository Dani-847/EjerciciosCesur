package Programacion.UDB.pooUD11CasoPractico2;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        boolean continuar = true;
        GestorInventario gestor = new GestorInventario();
        while (continuar) {
            try {
                System.out.println("\nGestión de Inventario de Productos");
                System.out.println("1. Añadir nuevo producto");
                System.out.println("2. Eliminar producto");
                System.out.println("3. Mostrar inventario");
                System.out.println("4. Buscar producto por código");
                System.out.println("5. Filtrar productos por rango de precios");
                System.out.println("6. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1 -> {
                        try {
                            System.out.print("Código del producto: ");
                            String codigo = sc.nextLine();
                            System.out.print("Nombre del producto: ");
                            String nombre = sc.nextLine();
                            System.out.print("Precio del producto: ");
                            double precio = Double.parseDouble(sc.nextLine());
                            if (gestor.agregarProducto(new Producto(codigo, nombre, precio)))
                                System.out.println("Producto creado correctamente");
                            else
                                System.out.println("El producto ya existe");
                        } catch (NumberFormatException e) {
                            System.out.println("El precio del producto debe ser un número");
                        }
                    }
                    case 2 -> {
                        System.out.print("Código del producto: ");
                        String codigo = sc.nextLine();
                        Producto producto = gestor.buscarProducto(codigo);
                        if (producto == null)
                            System.out.println("El producto no existe");
                        else if (gestor.eliminarProducto(producto))
                            System.out.println("Producto eliminado correctamente");
                    }
                    case 3 -> {
                        gestor.mostrarProductos();
                    }
                    case 4 -> {
                        System.out.print("Código del producto: ");
                        String codigo = sc.nextLine();
                        Producto producto = gestor.buscarProducto(codigo);
                        if (producto == null)
                            System.out.println("El producto no existe");
                        else
                            System.out.println(producto);
                    }
                    case 5 -> {
                        System.out.print("Precio mínimo: ");
                        double minimo = Double.parseDouble(sc.nextLine());
                        System.out.print("Precio máximo: ");
                        double maximo = Double.parseDouble(sc.nextLine());
                        List<Producto> lista = gestor.filtrarProductos(minimo, maximo);
                        if (lista.isEmpty())
                            System.out.println("No hay productos en ese rango");
                        else
                            for (Producto producto : lista) {
                                System.out.println(producto);
                            }
                    }
                    case 6 -> {
                        continuar = false;
                        System.out.println("Saliendo...");
                    }
                    default -> System.out.println("Opción no valida");
                }
            } catch (NumberFormatException e) {
                System.out.println("Debes introducir un número");
            }
        }
        sc.close();
    }
}
