package Programacion.UD9.pooUD9CasoPractico2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dispositivo dispositivo = null;

        System.out.println("Seleccione el tipo de dispositivo:");
        System.out.println("1. Smartphone");
        System.out.println("2. SmartTV");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese el modelo del dispositivo: ");
        String modelo = scanner.nextLine();
        System.out.print("Ingrese la marca del dispositivo: ");
        String marca = scanner.nextLine();

        if (opcion == 1) {
            dispositivo = new Smartphone(modelo, marca);
        } else if (opcion == 2) {
            dispositivo = new SmartTV(modelo, marca);
        } else {
            System.out.println("Opción no válida.");
            return;
        }

        boolean salir = false;
        while (!salir) {
            System.out.println("\nSeleccione una acción:");
            System.out.println("1. Conectar a WiFi");
            System.out.println("2. Desconectar de WiFi");
            System.out.println("3. Mostrar información del dispositivo");
            if (dispositivo instanceof Smartphone) {
                System.out.println("4. Hacer una llamada");
            } else if (dispositivo instanceof SmartTV) {
                System.out.println("4. Reproducir un video");
            }
            System.out.println("5. Salir");
            int accion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (accion) {
                case 1:
                    dispositivo.conectarWifi();
                    break;
                case 2:
                    dispositivo.desconectarWifi();
                    break;
                case 3:
                    dispositivo.mostrarInfo();
                    break;
                case 4:
                    if (dispositivo instanceof Smartphone) {
                        System.out.print("Ingrese el número a llamar: ");
                        String numero = scanner.nextLine();
                        ((Smartphone) dispositivo).hacerLlamada(numero);
                    } else if (dispositivo instanceof SmartTV) {
                        System.out.print("Ingrese el nombre del video: ");
                        String video = scanner.nextLine();
                        ((SmartTV) dispositivo).reproducirVideo(video);
                    }
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}