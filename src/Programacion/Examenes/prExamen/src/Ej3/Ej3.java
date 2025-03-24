package Programacion.Examenes.prExamen.src.Ej3;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        boolean esCapicua;
        int aux = num;
        String numInvertido = "";
        while (aux>0){
            numInvertido += aux%10;
            aux = aux / 10;
        }

        if (num==(Integer.parseInt(numInvertido))){
            esCapicua = true;
        } else {
            esCapicua = false;
        }

        if (esCapicua){
            System.out.println("El número es capicúa.");
        } else {
            System.out.println("El número no es capicúa.");
        }
    }
}
