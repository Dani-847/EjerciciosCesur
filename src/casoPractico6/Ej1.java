package casoPractico6;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        System.out.print("Introduce un numero que definira el tamaño de la lista: ");
        Scanner sc = new Scanner(System.in);
        int tamanyo=sc.nextInt();
        double[] listaNumeros = new double[tamanyo];

        System.out.println("Introduce "+listaNumeros.length+" numeros.");

        for (int i = 0;i < listaNumeros.length;i++){
            System.out.print("Introduce el nº"+ (i+1) + " numero: ");
            listaNumeros[i] = sc.nextInt();
        }
        sc.close();




        double mayor=listaNumeros[0];
        double menor=listaNumeros[0];
        double sumaTotalPar=0;
        int cntPar=0;

        for (int i = 0;i<listaNumeros.length;i++){
            if(listaNumeros[i]%2==0){
                cntPar++;
                sumaTotalPar+=listaNumeros[i];
            }
            if(listaNumeros[i]>mayor){
                mayor=listaNumeros[i];
            }
            if(listaNumeros[i]<menor){
                menor=listaNumeros[i];
            }
        }
        System.out.println("El mayor de todos los numeros es: "+mayor);
        System.out.println("El menor de todos los numeros es: "+menor);
        System.out.println("La media de los numeros pares introducidos es: "+sumaTotalPar/cntPar);
    }
}
