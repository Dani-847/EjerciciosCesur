package Programacion.UDB.pooUD11CasoPractico3;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 10;
        GestionBiblioteca biblioteca = new GestionBiblioteca();
        do{
            try {
                System.out.println("=== MENÚ BIBLIOTECA ===");
                System.out.println("=======================");
                System.out.println("1. Mostrar usuarios");
                System.out.println("2. Mostrar libros disponibles");
                System.out.println("3. Mostrar préstamos activos");
                System.out.println("4. Añadir usuario");
                System.out.println("5. Añadir libro");
                System.out.println("6. Buscar usuario");
                System.out.println("7. Buscar libro");
                System.out.println("8. Crear préstamo");
                System.out.println("9. Devolver libro");
                System.out.println("0. Salir");
                System.out.print("Seleccione un opción: ");
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1 -> {
                        biblioteca.mostrarUsuarios();
                    }
                    case 2 -> {
                        biblioteca.mostrarLibrosDisponibles();
                    }
                    case 3 -> {
                        biblioteca.mostrarPrestamosActivos();
                    }
                    case 4 -> {
                        System.out.print("DNI: ");
                        String dni = sc.nextLine();
                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();
                        System.out.print("Email: ");
                        String email = sc.nextLine();
                        Usuario u = new Usuario(dni, nombre, email);
                        if (biblioteca.agregarUsuario(u))
                            System.out.println("Usuario agregado correctamente");
                        else System.out.println("Usuario ya existente");

                    }
                    case 5 -> {
                        System.out.print("ISBN: ");
                        String isbn = sc.nextLine();
                        System.out.print("Título: ");
                        String titulo = sc.nextLine();
                        System.out.print("Autor: ");
                        String autor = sc.nextLine();
                        Libro l = new Libro(isbn, titulo, autor, true);
                        biblioteca.agregarLibro(l);
                    }
                    case 6 -> {
                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();
                        Usuario usr = biblioteca.buscarUsuario(nombre);
                        if (usr != null)
                            System.out.println(usr);
                        else
                            System.out.println("Usuario no encontrado");
                    }
                    case 7 -> {
                        System.out.print("Título: ");
                        String titulo = sc.nextLine();
                        List<Libro> lista = biblioteca.buscarLibro(titulo);
                        if (lista.isEmpty())
                            System.out.println("Libro no encontrado");
                        else {
                            for (Libro l : lista)
                                System.out.println(l);
                        }
                    }
                    case 8 -> {
                        System.out.print("Usuario: ");
                        String nombre = sc.nextLine();
                        System.out.print("Título del libro: ");
                        String titulo = sc.nextLine();
                        biblioteca.agregarPrestamo(nombre, titulo);
                    }
                    case 9 -> {
                        System.out.print("Nombre del usuario: ");
                        String nombre = sc.nextLine();
                        System.out.print("Título del libro: ");
                        String titulo = sc.nextLine();
                        biblioteca.devolverPrestamo(nombre, titulo);
                    }
                    case 0 -> {
                        System.out.println("Saliendo del sistema...");
                        System.out.println("Gracias por usar el sistema de gestión de biblioteca.");
                    }
                }
            }catch (Exception e) {
                System.out.println("Opción no válida");
            }
        } while (opcion!=0);
        sc.close();
    }
}
