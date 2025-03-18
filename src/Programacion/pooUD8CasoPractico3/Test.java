package Programacion.pooUD8CasoPractico3;

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del primer archivo: ");
        String nombre1 = sc.nextLine();
        System.out.print("Nombre del segundo archivo: ");
        String nombre2 = sc.nextLine();
        System.out.print("Nombre del directorio destino: ");
        String directorio = sc.nextLine();

        //Comprobamos la existencia de los archivos y el directorio
        File f1 = new File(nombre1);
        File f2 = new File(nombre2);
        File dir = new File(directorio);
        try {
            if (!f1.exists()) {
                throw new FileNotFoundException("El archivo 1 no existe");
            }
            if (!f2.exists()) {
                throw new FileNotFoundException("El archivo 2 no existe");
            }
            if (!dir.exists()) {
                throw new FileNotFoundException("El directorio destino no existe");
            }
            if (!f1.getName().toLowerCase().endsWith(".txt") ||
                    !f2.getName().toLowerCase().endsWith(".txt")) {
                throw new ArchivoNoValidoException("El archivo no es válido");
            }
            //Generamos el nombre del archivo de destino
            String[] nombreArchivo1 = f1.getName().split("\\.");
            String nombreDestino = directorio + "/" + nombreArchivo1[0] + "_" + f2.getName();
            File destino = new File(nombreDestino);
            String sobreescribir="S";
            if (destino.exists()) {
                System.out.println("El archivo destino ya existe. ¿Sobreescribir el archivo? (S/N) ");
                sobreescribir = sc.nextLine();
            }
            if (sobreescribir.equalsIgnoreCase("S")) {
                //Abrimos los flujos de entrada y el flujo de salida y copiamos
                BufferedReader br1 = null;
                BufferedReader br2 = null;
                PrintWriter pw1 = null;
                try {
                    br1 = new BufferedReader(new FileReader(f1));
                    br2 = new BufferedReader(new FileReader(f2));
                    pw1 = new PrintWriter(nombreDestino);
                    //Vamos leyendo el archivo 1 y escribiendo en el destino
                    String linea = br1.readLine();
                    while (linea != null) {
                        pw1.println(linea);
                        linea = br1.readLine();
                    }
                    linea = br2.readLine();
                    while (linea != null) {
                        pw1.println(linea);
                        linea = br2.readLine();
                    }
                } catch (IOException e) {
                    System.out.println("No se pudo abrir el archivo");
                } finally {
                    try {
                        if (br1 != null) {
                            br1.close();
                        }
                        if (br2 != null) {
                            br2.close();
                        }
                        if (pw1 != null) {
                            pw1.close();
                        }
                    } catch (IOException e) {
                        System.out.println("No se pudo cerrar el archivo");
                    }
                }
                System.out.println("El archivo destino se ha generado correctamente");
                System.out.println("Archivo generado: " + destino.getCanonicalPath());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (ArchivoNoValidoException e) {
            System.out.println("El archivo no tiene la extensión .txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }

}

