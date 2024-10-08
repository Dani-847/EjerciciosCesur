package casoPractico2.SolucionesProfesor;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Altura del triángulo ");
        double altura = sc.nextDouble();
        System.out.print("Base del triángulo ");
        double base = sc.nextDouble();
        double area = base*altura/2;
        System.out.println("El área del triángulo es "+area);
        sc.close();
    }
}
