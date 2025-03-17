package Programacion.pooUD8CasoPractico3;

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar rutas de los archivos de entrada
        System.out.print("Ingrese la ruta del primer archivo de texto: ");
        String firstFilePath = scanner.nextLine();
        System.out.print("Ingrese la ruta del segundo archivo de texto: ");
        String secondFilePath = scanner.nextLine();

        // Verificar que los archivos tengan extensión .txt
        if (!firstFilePath.endsWith(".txt") || !secondFilePath.endsWith(".txt")) {
            System.out.println("Error: Ambos archivos deben tener la extensión .txt");
            return;
        }

        // Verificar que los archivos existan
        File firstFile = new File(firstFilePath);
        File secondFile = new File(secondFilePath);
        if (!firstFile.exists() || !secondFile.exists()) {
            System.out.println("Error: Uno o ambos archivos no existen.");
            return;
        }

        // Solicitar ruta de destino
        System.out.print("Ingrese la ruta donde se guardará el archivo fusionado: ");
        String outputDirectory = scanner.nextLine();

        // Crear el nombre del archivo de salida
        String firstFileName = firstFile.getName().replace(".txt", "");
        String secondFileName = secondFile.getName().replace(".txt", "");
        String outputFileName = firstFileName + "_" + secondFileName + ".txt";
        String outputFilePath = outputDirectory + File.separator + outputFileName;

        File outputFile = new File(outputFilePath);

        // Verificar si el archivo de salida ya existe
        if (outputFile.exists()) {
            System.out.print("El archivo de salida ya existe. ¿Desea sobrescribirlo? (S/N): ");
            String overwrite = scanner.nextLine();
            if (!overwrite.equalsIgnoreCase("S")) {
                System.out.println("Operación cancelada.");
                return;
            }
        }

        // Fusionar el contenido de los archivos
        try (BufferedReader reader1 = new BufferedReader(new FileReader(firstFile));
             BufferedReader reader2 = new BufferedReader(new FileReader(secondFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            while ((line = reader2.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error al leer o escribir los archivos: " + e.getMessage());
        }
    }
}