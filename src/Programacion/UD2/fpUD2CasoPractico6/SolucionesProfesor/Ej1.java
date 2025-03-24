package Programacion.UD2.fpUD2CasoPractico6.SolucionesProfesor;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int veces;
        do {
            System.out.print("Introduce el número de veces (mayor que 0): ");
            veces = sc.nextInt();
        } while(veces<=0);
        int numero;
        int pares=0;
        int suma=0;
        System.out.print("Introduce el número 1: ");
        numero=sc.nextInt();
        int mayor=numero;
        int menor=numero;
        if (numero%2==0 && numero!=0) {
            suma += numero; // suma = suma + numero;
            pares++;
        }
        for (int i = 2; i <= veces ; i++) {
            System.out.print("Introduce el número "+i+": ");
            numero=sc.nextInt();
            if (numero>mayor)
                mayor=numero;
            if (numero<menor)
                menor=numero;
            if (numero%2==0 && numero!=0){
                suma+=numero; // suma = suma + numero;
                pares++;
            }
        }
        System.out.println("El mayor es "+mayor);
        System.out.println("El menor es "+menor);
        if (pares>0)
            System.out.println("La media de los pares es "+(suma*1.0/pares));
        else
            System.out.println("No hay ningún número par");
        sc.close();
    }
}
