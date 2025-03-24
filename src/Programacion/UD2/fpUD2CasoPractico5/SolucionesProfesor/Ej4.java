package Programacion.UD2.fpUD2CasoPractico5.SolucionesProfesor;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número ");
        int num1 = sc.nextInt();
        System.out.print("Escribe otro número ");
        int num2 = sc.nextInt();
        sc.close();
        int aux = num1;
        num1 = num2;
        num2 = aux;
        System.out.println("La primera variable vale "+num1+" y la segunda "+num2);
    }
}
