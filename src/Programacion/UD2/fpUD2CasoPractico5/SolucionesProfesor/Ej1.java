package Programacion.UD2.fpUD2CasoPractico5.SolucionesProfesor;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int sumaPares=0;
        int sumaImpares=0;
        int pares=0;
        int impares=0;
        for (int i = 1; i <= 10 ; i++) {
            System.out.print("Escribe el número "+i+": ");
            numero=sc.nextInt();
            //Si es par
            if (numero%2==0){
                pares++;
                sumaPares = sumaPares + numero; //sumaPares+=numero;
            } else { //Es impar
                impares++;
                sumaImpares = sumaImpares + numero; //sumaImpares+=numero;
            }
        }
        sc.close();
        System.out.println("Hay "+pares+" números pares");
        System.out.println("La suma de los pares es "+sumaPares);
        if (impares>0)
            System.out.println("El promedio de los números impares es "+(sumaImpares*1.0/impares));
        else
            System.out.println("No se ha escrito ningún número impar");
    }
}
