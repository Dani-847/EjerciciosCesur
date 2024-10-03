package casoPractico4;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        int[] listaEnteros = new int[10];

        System.out.println("Introduce 10 numeros naturales.");
        Scanner sc = new Scanner(System.in);
        System.out.println(listaEnteros.length);


        for (int i = 0;i < listaEnteros.length;i++){
            System.out.print("Introduce el nº"+ i + " numero: ");
            listaEnteros[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0;i<listaEnteros.length;i++){
            System.out.print("El numero " + listaEnteros[i] + " es: ");
            if (listaEnteros[i]%2==0){
                System.out.print("Par, ");
            } else {
                System.out.print("Impar, ");
            }
            if (listaEnteros[i]>=0){
                System.out.print("Positivo, ");
            } else {
                System.out.print("Negativo, ");
            }
            System.out.println();
        }
    }
} //3 4 -1 34 2 12 43 12 54 34
