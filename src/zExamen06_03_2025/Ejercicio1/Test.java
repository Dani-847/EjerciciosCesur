package zExamen06_03_2025.Ejercicio1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int valorBuscado = -1;
        // Generar el array de números aleatorios
        int[] numeros = BuscadorArray.generarArrayAleatorio();
        // Intentar buscar 5 números
        boolean encontrado = false;
        int intento=1;
        do{
            do {
                System.out.print("Escribe un numero (1-100): ");
                valorBuscado = sc.nextInt();
            }while(valorBuscado<1 || valorBuscado>100);
            System.out.println("Intento " + intento + ": Buscando el número " + valorBuscado);
            try {
                int indice = BuscadorArray.buscarElemento(numeros, valorBuscado);
                System.out.println("¡Éxito! El número " + valorBuscado + " se encuentra en el índice: " + indice);
                encontrado = true;
            } catch (ElementoNoEncontradoException e) {
                System.out.println("Excepción: " + e.getMessage());
            }
            intento++;
        }while (!encontrado && intento<=5);
        if (!encontrado) {
            System.out.println("No se encontró ninguno de los 5 números buscados.");
        }
        System.out.println("Números: "+Arrays.toString(numeros));
    }
}


