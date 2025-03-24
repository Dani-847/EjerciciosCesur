package Programacion.UD8.pooUD8CasoPractico1;

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        File carpeta = new File("misArchivos");
        if (!carpeta.exists()) {
            carpeta.mkdir();
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un nombre (fin para terminar): ");
        String palabra = sc.nextLine();
        PrintWriter pw = null;
        try{
            pw = new PrintWriter("misArchivos/log.txt");
            while (!palabra.equalsIgnoreCase("fin")){
                pw.println(palabra);
                System.out.print("Introduzca un nombre (fin para terminar): ");
                palabra = sc.nextLine();
            }
        } catch (FileNotFoundException e){
            System.out.println("No se encuentra el archivo");
        } finally {
            sc.close();
            if (pw!=null)
                pw.close();
        }

        FileReader fr = null;
        BufferedReader br = null;
        try{
            fr = new FileReader("misArchivos/log.txt");
            br = new BufferedReader(fr);
            String linea = br.readLine();
            while (linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }
        }catch (FileNotFoundException e){
            System.out.println("No se encuentra el archivo");
        }catch (IOException e){
            System.out.println("Error al leer el archivo");
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo");
            }
        }
    }
}
