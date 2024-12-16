package pooUD5CasoPractico6;

import java.util.Scanner;

public class TestBiblioteca {
    public static void main(String[] args) {
        Biblioteca Biblioteca = new Biblioteca(10);
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        while (menu != 5){
            System.out.println("-- Menú de Gestión de Biblioteca --");
            System.out.println("1. Agregar Ejemplar");
            System.out.println("2. Agregar Revista");
            System.out.println("3. Eliminar Ejemplar");
            System.out.println("4. Mostrar Ejemplares");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            menu = Integer.parseInt(sc.nextLine());
            switch (menu){
                case 1 -> {
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = sc.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = sc.nextLine();
                    System.out.print("Ingrese el año de publicación: ");
                    int anyoPublicacion = Integer.parseInt(sc.nextLine());
                    System.out.print("Ingrese el número de páginas: ");
                    int numPaginas = Integer.parseInt(sc.nextLine());
                    System.out.print("Ingrese el género del libro: ");
                    String genero = sc.nextLine();
                    Libro libro = new Libro(titulo, autor, anyoPublicacion, numPaginas, genero);
                    Biblioteca.agregarEjemplar(libro);

                }
                case 2 -> {
                    System.out.print("Ingrese el título del libro: ");
                    String tituloRevista = sc.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autorRevista = sc.nextLine();
                    System.out.print("Ingrese el año de publicación: ");
                    int anyoPublicacionRevista = Integer.parseInt(sc.nextLine());
                    System.out.print("Ingrese la edición: ");
                    int edicion = Integer.parseInt(sc.nextLine());
                    System.out.print("Ingrese la periodicidad: ");
                    String periodicidad = sc.nextLine();
                    Revista revista = new Revista(tituloRevista, autorRevista, anyoPublicacionRevista, edicion, periodicidad);
                    Biblioteca.agregarEjemplar(revista);
                }
                case 3 -> {
                    System.out.print("Título del ejemplar a eliminar: ");
                    String tituloEliminar = sc.nextLine();
                    Biblioteca.eliminarEjemplar(tituloEliminar);
                }
                case 4 -> {
                    Biblioteca.mostrarEjemplares();
                }
                case 5 -> {
                    System.out.println("Gracias por usar el sistema de gestión de biblioteca");
                }
                default -> {
                    System.out.println("Opción no válida");
                }
            }
        }
    }
}
