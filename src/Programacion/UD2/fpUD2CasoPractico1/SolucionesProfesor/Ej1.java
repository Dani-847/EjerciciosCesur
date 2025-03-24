package Programacion.UD2.fpUD2CasoPractico1.SolucionesProfesor;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,z;
        System.out.print("Introduce un número: ");
        x = sc.nextInt();
        System.out.print("Introduce un número: ");
        y = sc.nextInt();
        System.out.print("Introduce un número: ");
        z = sc.nextInt();
        sc.close();
        if (x>y){
            if (x>z){
                System.out.println(("El mayor es "+x));
            } else {
                System.out.println("El mayor es "+z);
            }
        } else {
            if (y>z){
                System.out.println(("El mayor es "+y));
        } else {
            System.out.println("El mayor es "+z);
        }
        }
    }
}