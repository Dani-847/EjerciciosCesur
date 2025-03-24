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
                if (linea1 != linea2){
                    throw new LineaException(String.valueOf(numeroLinea));
                }

                linea1 = br1.readLine();
                linea2 = br2.readLine();
                numeroLinea++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("Uno de los archivos no existe: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al leer los archivos: " + e.getMessage());
        } catch (LineaException e) {
            System.out.println("Error en la línea " + e.getMessage());
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