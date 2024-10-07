package casoPractico6;

import java.util.Scanner;

public class Ej2ConversorRomano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        String solucion = "";

        if (numero < 1 || numero > 3999)
            System.out.println("Numero invalido para la conversion");
        else {
            while (numero >= 1000) {
                solucion += "M";
                numero -= 1000;
            }
            while (numero >= 900) {
                solucion += "CM";
                numero -= 900;
            }
            while (numero >= 500) {
                solucion += "D";
                numero -= 500;
            }
            while (numero >= 400) {
                solucion += "CD";
                numero -= 400;
            }
            while (numero >= 100) {
                solucion += "C";
                numero -= 100;
            }
            while (numero >= 90) {
                solucion += "XC";
                numero -= 90;
            }
            while (numero >= 50) {
                solucion += "L";
                numero -= 50;
            }
            while (numero >= 40) {
                solucion += "XL";
                numero -= 40;
            }
            while (numero >= 10) {
                solucion += "X";
                numero -= 10;
            }
            while (numero >= 9) {
                solucion += "IX";
                numero -= 9;
            }
            while (numero >= 5) {
                solucion += "V";
                numero -= 5;
            }
            while (numero >= 4) {
                solucion += "IV";
                numero -= 4;
            }
            while (numero >= 1) {
                solucion += "I";
                numero -= 1;
            }
        }
        System.out.print(solucion);
    }
}

