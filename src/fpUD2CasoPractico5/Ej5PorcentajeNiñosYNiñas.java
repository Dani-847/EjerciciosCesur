package fpUD2CasoPractico5;

import java.util.Scanner;

public class Ej5PorcentajeNiñosYNiñas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el numero de niños: ");
        int cantidadNinyos=sc.nextInt();
        System.out.print("Introduce el numero de niñas: ");
        int cantidadNinyas=sc.nextInt();

        int totalNinyos=cantidadNinyos+cantidadNinyas;
        double porcentajeNinyos=(cantidadNinyos*100)/(cantidadNinyos+cantidadNinyas);
        double porcentajeNinyas=100-porcentajeNinyos;

        System.out.println("El porcentaje de niños es: "+porcentajeNinyos+" y el de niñas: "+ porcentajeNinyas);

    }
}
