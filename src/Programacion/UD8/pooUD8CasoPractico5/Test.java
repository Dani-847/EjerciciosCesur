package Programacion.UD8.pooUD8CasoPractico5;

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del primer archivo: ");
        String archivo1 = sc.nextLine();
        System.out.println("Introduce el nombre del segundo archivo: ");
        String archivo2 = sc.nextLine();
        sc.close();
        BufferedReader br1 = null;
        BufferedReader br2 = null;

        try {
            br1 = new BufferedReader(new FileReader("src/Programacion/UD8/pooUD8CasoPractico5/files/"+archivo1));
            br2 = new BufferedReader(new FileReader("src/Programacion/UD8/pooUD8CasoPractico5/files/"+archivo2));

            String linea1 = br1.readLine();
            String linea2 = br2.readLine();
            int numeroLinea = 1;

            while (linea1 != null || linea2 != null) {
                if (linea1 == null) {
                    System.out.println("El archivo " + archivo2 + " tiene más líneas que el archivo " + archivo1);
                    break;
                } else if (linea2 == null) {
                    System.out.println("El archivo " + archivo1 + " tiene más líneas que el archivo " + archivo2);
                    break;
                } else if (!linea1.equals(linea2)) {
                    System.out.println("Diferencia en la línea " + numeroLinea + ":");
                    System.out.println(archivo1 + ": " + linea1);
                    System.out.println(archivo2 + ": " + linea2);
                }

                linea1 = br1.readLine();
                linea2 = br2.readLine();
                numeroLinea++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("Uno de los archivos no existe: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al leer los archivos: " + e.getMessage());
        } finally {
            try {
                if (br1 != null) br1.close();
                if (br2 != null) br2.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar los archivos: " + e.getMessage());
            }
        }
    }
}