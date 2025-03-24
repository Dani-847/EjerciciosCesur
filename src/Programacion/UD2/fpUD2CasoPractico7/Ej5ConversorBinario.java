package Programacion.UD2.fpUD2CasoPractico7;

import java.util.Scanner;

public class Ej5ConversorBinario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        double numero = sc.nextDouble();

        double binarioAux = numero;
        double octalAux = numero;
        double hexAux = numero;
        String binario = "";
        String octal = "";
        String hex = "";

        while (binarioAux > 0.9) {
            binario = (int) (binarioAux % 2) + binario;
            binarioAux /= 2;
        }
        while (octalAux > 0.9) {
            octal = (int) (octalAux % 8) + octal;
            octalAux /= 8;
        }

        String[] hexadecimal = {"A", "B", "C", "D", "E", "F"};
        while (hexAux > 0.9) {
            if (hexAux % 16 <= 9) hex = (int) (hexAux % 16) + hex;
            else hex = hexadecimal[(((int) (hexAux % 16)) - 10)] + hex;
            hexAux = (int) hexAux / 16;
        }

        System.out.println("El resultado es: " + binario + ", " + octal + ", " + hex);
    }

}
