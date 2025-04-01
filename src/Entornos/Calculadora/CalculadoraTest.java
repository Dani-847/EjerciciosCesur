package Entornos.Calculadora;

import java.util.Scanner;

public class CalculadoraTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("=== Calculadora ===");
            System.out.println("Selecciona la operación a realizar:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Salir");
            System.out.print("Opción: ");

            int opcion = sc.nextInt();
            System.out.println();

            // Salir del programa
            if (opcion == 6) {
                System.out.println("Saliendo de la calculadora. ¡Hasta luego!");
                salir = true;
                continue;
            }


            // Solicitamos los operandos
            System.out.print("Ingresa el primer número: ");
            double num1 = sc.nextDouble();
            System.out.print("Ingresa el segundo número: ");
            double num2 = sc.nextDouble();
            System.out.println();

            // Se crea la instancia de Calculadora que almacena los operandos
            Calculadora calc = new Calculadora(num1, num2);
            double resultado = 0;

            // Seleccionamos la operación solicitada
            switch (opcion) {
                case 1:
                    resultado = OperacionesCalculadora.suma(calc.getNumero1(), calc.getNumero2());
                    break;
                case 2:
                    resultado = OperacionesCalculadora.resta(calc.getNumero1(), calc.getNumero2());
                    break;
                case 3:
                    resultado = OperacionesCalculadora.multiplicacion(calc.getNumero1(), calc.getNumero2());
                    break;
                case 4:
                    resultado = OperacionesCalculadora.division(calc.getNumero1(), calc.getNumero2());
                    break;
                case 5:
                    resultado = OperacionesCalculadora.potencia(calc.getNumero1(), calc.getNumero2());
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 6.");
                    continue;
            }

            // Muestra del resultado
            System.out.println("El resultado es: " + resultado);
            System.out.println();
        }

        sc.close();
    }
}
