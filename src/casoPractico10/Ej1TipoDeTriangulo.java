package casoPractico10;

import java.util.Scanner;

public class Ej1TipoDeTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca A: ");
        double A = sc.nextDouble();
        System.out.print("Introduzca B: ");
        double B = sc.nextDouble();
        System.out.print("Introduzca C: ");
        double C = sc.nextDouble();
        sc.close();

        double menor = Math.min(Math.min(A, B), C);
        double mayor = Math.max(Math.max(A, B), C);
        double medio = A+B+C-menor-mayor;

        if ((Math.pow(menor,2)+Math.pow(medio,2))==Math.pow(mayor,2))
            System.out.println("Triangulo rectangulo");
        else if (menor==medio&&medio!=mayor)
            System.out.println("Triangulo rectangulo");
        else if (menor==medio&&medio==mayor)
            System.out.println("Triangulo equilatero");
        else
            System.out.println("Triangulo escaleno");
    }
}
