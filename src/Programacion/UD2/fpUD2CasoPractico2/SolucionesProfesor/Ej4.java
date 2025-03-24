package Programacion.UD2.fpUD2CasoPractico2.SolucionesProfesor;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        double num1 = sc.nextDouble();
        System.out.print("Escribe otro número: ");
        double num2 = sc.nextDouble();
        sc.close();
        if (num1>num2){
            System.out.println("Resultado: "+(num1/num2));
        } else {
            System.out.println("Resultado: "+(num2/num1));
        }
    }
}
