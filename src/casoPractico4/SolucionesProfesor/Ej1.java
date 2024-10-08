package casoPractico4.SolucionesProfesor;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        int num1 = sc.nextInt();
        System.out.print("Escribe otro número: ");
        int num2 = sc.nextInt();
        sc.close();
        double resultado;
        if (num1==num2)
            resultado=num1*num2;
        else if (num1>num2)
                resultado=num1-num2;
        else
            resultado=num1+num2;
        System.out.println("Resultado: "+resultado);
    }
}
