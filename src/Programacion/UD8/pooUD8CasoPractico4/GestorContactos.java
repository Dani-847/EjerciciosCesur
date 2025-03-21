package Programacion.UD8.pooUD8CasoPractico4;

import java.io.*;
import java.util.Scanner;

public class GestorContactos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("--- Gestión de contactos ---");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Listar contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1 -> {
                    System.out.println("--- Agregar contacto ---");
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Teléfono: ");
                    String tfno = sc.nextLine();
                    System.out.print("Correo: ");
                    String correo = sc.nextLine();
                    agregarContacto(new Contacto(nombre, tfno, correo));
                }
                case 2 -> {
                    System.out.println("--- Listar contactos ---");
                    listarContactos();
                }
                case 3 -> {
                    System.out.println("--- Buscar contacto ---");
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    buscarContacto(nombre);
                }
                case 4 -> {
                    System.out.println("--- Eliminar contacto ---");
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    eliminarContacto(nombre);
                }
                case 5 -> System.out.println("Saliendo...");
            }
        } while (opcion != 5);

        sc.close();

    }

    private static void eliminarContacto(String nombre) {
        BufferedReader br = null;
        PrintWriter pw = null;
        File original = new File("contactos.txt");
        File copia = new File("contactosaux.txt");
        try {
            br = new BufferedReader(new FileReader(original));
            pw = new PrintWriter(copia);
            String linea = br.readLine();
            boolean encontrado = false;
            while (linea != null) {
                String[] datos = linea.split(",");
                if (!datos[0].equalsIgnoreCase(nombre)) {
                    pw.println(linea);
                    encontrado = true;
                }
                linea = br.readLine();
            }
            if (!encontrado) {
                System.out.println("Contacto no encontrado");
            } else {
                System.out.println("Contacto eliminado correctamente!");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        } finally {
            try {
                if (br != null)
                    br.close();
                if (pw != null)
                    pw.close();
                original.delete();
                copia.renameTo(original);
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo");
            }
        }
    }

    private static Contacto buscarContacto(String nombre) {
        BufferedReader br = null;
        Contacto contacto = null;
        try {
            br = new BufferedReader(new FileReader("contactos.txt"));
            String linea = br.readLine();
            boolean encontrado = false;
            while (linea != null && !encontrado) {
                String[] datos = linea.split(",");
                if (datos[0].equalsIgnoreCase(nombre)) {
                    encontrado = true;
                    System.out.println("Contacto encontrado");
                    System.out.println(linea);
                    contacto = new Contacto(datos[0], datos[1], datos[2]);
                } else
                    linea = br.readLine();
            }
            if (!encontrado) {
                System.out.println("Contacto no encontrado");
            }
        } catch (FileNotFoundException e) {
            System.out.println("No existe el archivo de contactos");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de contactos");
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo de contactos");
            }
        }
        return contacto;
    }

    private static void listarContactos() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("contactos.txt"));
            String linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo");
            }
        }
    }

    private static void agregarContacto(Contacto contacto) {
        Contacto elContacto = buscarContacto(contacto.getNombre());
        if (elContacto == null) {
            PrintWriter pw = null;
            try {
                pw = new PrintWriter(new FileWriter("contactos.txt", true));
                pw.println(contacto.getNombre() + "," + contacto.getTelefono() + "," + contacto.getCorreo());
                System.out.println("Contacto agregado correctamente!");
            } catch (FileNotFoundException e) {
                System.out.println("No se encuentra el archivo");
            } catch (IOException e) {
                System.out.println("Error al escribir en el archivo");
            } finally {
                if (pw != null)
                    pw.close();
            }
        } else {
            System.out.println("El contacto ya existe");
        }
    }

}
