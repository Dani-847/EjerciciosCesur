package Programacion.Examenes.prExamen28_11_2024.src.ejercicio3;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("El Quijote", "Miguel de Cervantes", 1605,
                                                    true, "Ficción", 1000);
        Revista revista = new Revista("National Geographic", "Varios", 2024,
                                                    false, 10, "Noviembre");
        Tesis tesis = new Tesis("Inteligencia Artificial", "Juan Pérez", 2020,
                                                    true, "MIT", "Computación");
        // Operaciones con el libro
        System.out.println("Detalles del material:");
        libro.mostrarDetalles();
        libro.prestar(14);
        libro.devolver();
        System.out.println();
        // Operaciones con la revista
        System.out.println("Detalles del material:");
        revista.mostrarDetalles();
        revista.prestar();
        System.out.println();
        // Operaciones con la tesis
        System.out.println("Detalles del material:");
        tesis.mostrarDetalles();
        tesis.prestar(false);
        tesis.prestar(true);
    }
}

