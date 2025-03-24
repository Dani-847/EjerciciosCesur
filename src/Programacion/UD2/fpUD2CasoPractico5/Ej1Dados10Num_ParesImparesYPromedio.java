package Programacion.UD2.fpUD2CasoPractico5;

import java.util.Scanner;

public class Ej1Dados10Num_ParesImparesYPromedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidadNinyos=0;
        System.out.print("Introduce una cantidad de niños: ");

        System.out.print("Introduce una cantidad de niñas: ");
        int[] listaEnteros = new int[10];
        System.out.println("Introduce 10 numeros naturales.");
        for (int i = 0; i < listaEnteros.length; i++) {
            System.out.print("Introduce el nº" + (i + 1) + " numero: ");
            listaEnteros[i] = sc.nextInt();
        }
        sc.close();
        double sumaPar = 0;
        double sumaImpar = 0;
        int contadorImpares = 0;
        for (int i = 0; i < listaEnteros.length; i++) {
            System.out.print("El numero " + listaEnteros[i] + " es: ");
            if (listaEnteros[i] % 2 == 0) {
                System.out.print("Par");
                sumaPar += listaEnteros[i];
            } else {
                System.out.print("Impar");
                contadorImpares++;
                sumaImpar += listaEnteros[i];
            }
            System.out.println();
        }
        System.out.println("Los pares suman: " + sumaPar);
        System.out.println("El promedio de los impares es: " + sumaImpar / contadorImpares);
    }
}
