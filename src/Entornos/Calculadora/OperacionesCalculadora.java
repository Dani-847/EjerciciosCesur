package Entornos.Calculadora;

public class OperacionesCalculadora {
    // Suma
    public static double suma(double a, double b) {
        return a + b;
    }

    // Resta
    public static double resta(double a, double b) {
        return a - b;
    }

    // Multiplicación
    public static double multiplicacion(double a, double b) {
        return a * b;
    }

    // División (con control de división entre cero)
    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Error: División entre cero no permitida.");
            return 0;
        } else {
            return a / b;
        }
    }

    // Potencia: a elevado a b
    public static double potencia(double a, double b) {
        return Math.pow(a, b);
    }
}
