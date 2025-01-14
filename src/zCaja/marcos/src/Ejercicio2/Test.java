package Ejercicio2;

import Ejercicio2.Biblioteca;
import Ejercicio2.Libro;

public class Test {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(5);

        Libro libro1 = new Libro("Cien años de soledad", 20.0, CategoriaLibro.FICCION);
        Libro libro2 = new Libro("El origen de las especies", 30.0, CategoriaLibro.CIENCIA);
        Libro libro3 = new Libro("Historia de la Segunda Guerra Mundial", 25.0, CategoriaLibro.HISTORIA);

        biblioteca.agregarLibro(0, libro1);
        biblioteca.agregarLibro(1, libro2);
        biblioteca.agregarLibro(2, libro3);

        libro1.marcarPrestado(); // El libro 1 está prestado

        biblioteca.mostrarBiblioteca();
    }
}
