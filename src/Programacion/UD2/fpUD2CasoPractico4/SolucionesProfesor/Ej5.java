package Programacion.UD2.fpUD2CasoPractico4.SolucionesProfesor;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int numero;
        int mayor=-1;
        do{
            System.out.print("Escribe un número: ");
            numero = sc.nextInt();
            if (numero<0){
                System.out.println("No puede ser negativo");
            } else if (numero>mayor){
                mayor=numero;
            }
        } while (numero!=0);
        sc.close();
        System.out.println("El mayor es: "+mayor);*/

        // SOLUCIÓN 2 : Con bucle while

        Scanner sc = new Scanner(System.in);
        int numero;
        int mayor;
        System.out.print("Escribe un número: ");
        numero=sc.nextInt();
        mayor=numero;
        if (numero<0){
            System.out.println("No puede ser negativo");
        }
        while (numero!=0){
            System.out.print("Escribe un número: ");
            numero=sc.nextInt();
            if (numero<0){
                System.out.println("No puede ser negativo");
            } else if (numero>mayor){
                mayor=numero;
            }
        }
        sc.close();
        System.out.println("El mayor es: "+mayor);
    }
}
