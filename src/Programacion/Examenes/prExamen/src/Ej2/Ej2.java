package Ej2;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        int digitos = 0;
        int aux = num;
        while(aux > 0){
            aux = aux / 10;
            digitos++;
        }
        System.out.println("El número " + num + " tiene " + digitos + " dígitos.");
    }
}
