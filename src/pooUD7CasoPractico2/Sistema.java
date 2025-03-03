package pooUD7CasoPractico2;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args){
        int tamanyo = 10;
        Mundo[] planetas = new Mundo[tamanyo];
        for (int i = 0; i < tamanyo; i++) {
            planetas[i] = new Mundo();
        }

        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= tamanyo; i++) {
            try {
                System.out.println("Introduce el diametro del planeta numero " + i + ": ");
                planetas[i].setDiametro(Float.parseFloat(sc.nextLine()));
                if (planetas[i].getDiametro() < 0) {
                    throw new ValorNegativoException("El diametro no puede ser negativo");
                }
            } catch (NumberFormatException e) {
                System.out.println("El valor introducido no es un numero");
                i--;

            } catch (ValorNegativoException e) {
                System.out.println("Error: " + e.getMessage());
                i--;
            }
        }

        while (planetas[0].getDiametro()<=100){

        }
    }
}
