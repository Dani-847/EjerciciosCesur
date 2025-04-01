package Programacion.UD8.pooUD8CasoPractico5;

import java.io.*;
import java.util.Scanner;

public class Comparador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primer archivo: ");
        String archivo1 = sc.nextLine();
        System.out.print("Primer archivo: ");
        String archivo2 = sc.nextLine();
        sc.close();
        BufferedReader br1 = null;
        BufferedReader br2 = null;
        try{
            br1 = new BufferedReader(new FileReader("src/Programacion/UD8/pooUD8CasoPractico5/files/"+archivo1));
            br2 = new BufferedReader(new FileReader("src/Programacion/UD8/pooUD8CasoPractico5/files/"+archivo2));
            String linea1 = br1.readLine();
            String linea2 = br2.readLine();
            int contador = 1;
            while (linea1 != null && linea2 != null) {
                //Comparar las líneas
                if (!linea1.equals(linea2)) {
                    System.out.println("Diferencia en la línea " + contador);
                    System.out.println("Archivo 1: "+linea1);
                    System.out.println("Archivo 2: "+linea2);
                }
                contador++;
                linea1 = br1.readLine();
                linea2 = br2.readLine();
            }
            if (linea1 != null) {
                System.out.println("El archivo 1 tiene un tamaño mayor");
            }
            if (linea2 != null) {
                System.out.println("El archivo 2 tiene un tamaño mayor");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error al leer del archivo");
        } finally {
            try{
                if (br1 != null)
                    br1.close();
                if (br2 != null)
                    br2.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo");
            }
        }
    }
}
