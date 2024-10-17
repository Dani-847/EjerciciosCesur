package casoPractico9;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ej3ArticulosEnPromocion {
    public static void main(String[] args) {
        System.out.print("Introduce el numero de articulos: ");
        Scanner sc = new Scanner(System.in);
        int tamanyo=sc.nextInt();
        double[] listaNumeros = new double[tamanyo];

        System.out.println("Introduce el precio de los "+listaNumeros.length+" articulos.");

        for (int i = 0;i < listaNumeros.length;i++){
            System.out.print("Articulo Nº"+ (i+1) + ": ");
            listaNumeros[i] = sc.nextInt();
        }
        sc.close();

        double precioTotal = 0;
        for (int i = 0;i<listaNumeros.length;i++){
            if (listaNumeros[i]>=200){
                precioTotal += listaNumeros[i]*0.85;
                System.out.println("El articulo Nº"+ (i+1) + " con precio, " + listaNumeros[i] + ", tuvo un descuento del 15%.");
            }
            if (listaNumeros[i]>100&&listaNumeros[i]<200){
                precioTotal += listaNumeros[i]*0.88;
                System.out.println("El articulo Nº"+ (i+1) + " con precio, " + listaNumeros[i] + ", tuvo un descuento del 12%.");
            }
            if (listaNumeros[i]<=100){
                precioTotal += listaNumeros[i]*0.9;
                System.out.println("El articulo Nº"+ (i+1) + " con precio, " + listaNumeros[i] + ", tuvo un descuento del 10%.");
            }
        }

        System.out.println("El total es: " + precioTotal + "€");
    }
}
