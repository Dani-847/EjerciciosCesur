package Programacion.pooUD8CasoPractico2;

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Archivo a copiar? ");
        String archivo = sc.nextLine();
        sc.close();
        File archivoF = new File(archivo);
        if (archivoF.exists()) {
            if (archivoF.isFile() && (
                    archivoF.getName().endsWith(".txt") || archivoF.getName().endsWith(".csv"))) {
                BufferedReader br = null;
                PrintWriter pw = null;
                try {
                    br = new BufferedReader(new FileReader(archivoF));
                    pw = new PrintWriter(archivo + ".bak");
                    String linea = br.readLine();
                    double bytescopiados = 0;
                    double tamanho = archivoF.length();
                    while (linea != null) {
                        double bytes = linea.getBytes().length;
                        bytescopiados += bytes;
                        double porcentaje = (bytescopiados / tamanho) * 100;
                        pw.println(linea);
                        System.out.printf("Copiado el %.2f%%%n", porcentaje);
                        linea = br.readLine();
                    }
                    System.out.println("Copiado el 100%");
                } catch (FileNotFoundException e) {
                    System.out.println("No se encontró el archivo");
                } catch (IOException e) {
                    System.out.println("Error al leer el archivo");
                } finally {
                    try {
                        if (br != null)
                            br.close();
                        if (pw != null)
                            pw.close();
                    } catch (IOException e) {
                        System.out.println("Error al cerrar el archivo");
                    }
                }
            } else {
                FileInputStream isr = null;
                FileOutputStream osw = null;
                try {
                    isr = new FileInputStream(archivoF);
                    osw = new FileOutputStream(archivo + ".bak");
                    double bytescopiados = 0;
                    double tamanho = archivoF.length();
                    byte[] bytes = new byte[1024];
                    int numero = isr.read(bytes,0,1024);
                    while (numero != -1) {
                        bytescopiados += numero;
                        double porcentaje = (bytescopiados / tamanho) * 100;
                        osw.write(bytes, 0, numero);
                        System.out.printf("Copiado el %.2f%%%n", porcentaje);
                        numero = isr.read(bytes, 0, 1024);
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("No se encontro el archivo");
                } catch (IOException e) {
                    System.out.println("Error al leer el archivo");
                } finally {
                    try {
                        if (isr != null)
                            isr.close();
                        if (osw != null)
                            osw.close();
                    } catch (IOException e) {
                        System.out.println("Error al cerrar el archivo");
                    }
                }
            }
        } else {
            System.out.println("No existe el archivo");
        }
    }
}
