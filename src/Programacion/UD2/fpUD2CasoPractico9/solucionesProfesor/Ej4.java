package Programacion.UD2.fpUD2CasoPractico9.solucionesProfesor;

import java.util.Random;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Escribe el valor superior del rango (de 1 a ...): ");
        int rango = sc.nextInt();
        int numSecreto = r.nextInt(rango)+1;
        System.out.print("Número de intentos? ");
        int intentos = sc.nextInt();
        int numIntento=1;
        int num;
        boolean encontrado=false;
        while (!encontrado && numIntento<=intentos) {
            System.out.print("Intento nº"+numIntento+": ");
            num=sc.nextInt();
            if (num==numSecreto){
                encontrado=true;
                System.out.println("Eres un crack!!!");
            } else if (num<numSecreto){
                System.out.println("El número secreto es mayor");
            } else {
                System.out.println("El número secreto es menor");
            }
            numIntento++;
        }
        if (!encontrado){
            System.out.println("Ohhhhh!!! El número era el "+numSecreto);
        }
        sc.close();
    }
}
