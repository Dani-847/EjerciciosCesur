import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor del lado 1: ");
        double A = sc.nextDouble();
        System.out.print("Valor del lado 2: ");
        double B = sc.nextDouble();
        System.out.print("Valor del lado 3: ");
        double C = sc.nextDouble();
        sc.close();
        boolean pitagoras = A*A+B*B==C*C;
        if (pitagoras){
            System.out.println("El triángulo es rectángulo");
        } else if (A==B && B==C){
            System.out.println("El triángulo es equilátero");
        } else if (A==C || B==A || C==B){
            System.out.println("El triángulo es isósceles");
        } else {
            System.out.println("El triángulo es escaleno");
        }
    }
}
