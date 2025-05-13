package Programacion.UDB.pooUD11CasoPractico1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        boolean continuar = true;
        GestorTareas gestor = new GestorTareas();
        while(continuar) {
            System.out.println("\nGestión de tareas");
            System.out.println("=================");
            System.out.println("Seleccione una operación");
            System.out.println("1. Agregar Tarea");
            System.out.println("2. Eliminar Tarea");
            System.out.println("3. Mostrar Tarea");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1 ->{
                    try {
                        System.out.print("Introduzca el título: ");
                        String titulo = sc.nextLine();
                        System.out.print("Introduzca la descripción: ");
                        String desc = sc.nextLine();
                        System.out.print("Introduzca la fecha de vencimiento: ");
                        String fecha = sc.nextLine();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        LocalDate parsedDate = LocalDate.parse(fecha, formatter);
                        Tarea tarea = new Tarea(titulo, desc, parsedDate);
                        gestor.agregarTarea(tarea);
                    } catch (DateTimeParseException e) {
                        System.out.println("Formato de fecha incorrecta");
                    }
                }
                case 2 ->{
                    System.out.print("Título de la tarea a eliminar: ");
                    String titulo = sc.nextLine();
                    if (gestor.eliminarTarea(titulo)==null)
                        System.out.println("Tarea no encontrada");
                    else
                        System.out.println("Tarea eliminada correctamente");
                }
                case 3 ->{
                    gestor.mostrarTareas();
                }
                case 4 -> {
                    continuar = false;
                    System.out.println("¡Hasta luego!");
                }
                default -> System.out.println("Opción no valida");
            }
        }
        sc.close();
    }
}
