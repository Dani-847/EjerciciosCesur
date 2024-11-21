package zCaja;

import java.util.Scanner;

public class EjercicioDiscord {
    public static void main(String[] args) {
        int cap = 1;
        double[] listaNumeros = new double[cap];

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrada: ");
        int n = sc.nextInt();
        listaNumeros[0] = n;
        while (n != 0) {
            n = sc.nextInt();
            cap++;
            double[] listaAuxiliar = new double[cap];
            System.arraycopy(listaNumeros, 0, listaAuxiliar, 0, cap - 1);
            listaNumeros = listaAuxiliar;
            listaNumeros[cap - 1] = n;
        }
        sc.close();





        double total = 0;
        System.out.print("Salida:");
        for (double listaNumero : listaNumeros) {
            if (tamanyo(listaNumero) == suma(listaNumero)) {
                total += listaNumero;

                if (listaNumero == 1)
                    System.out.print(" " + (int) listaNumero);
                if (listaNumero != 1 && listaNumero != listaNumeros[cap - 1])
                    System.out.print(" + " + (int) listaNumero);
            }
        }
        System.out.println(" = " + (int) total);
    }

    public static int tamanyo(double n) {
        int cont = 0;
        while (n > 0.99999999999999) {
            n /= 10;
            cont++;
        }
        return cont;
    }

    public static int suma(double n) {
        int total = 0;
        while (n > 0.99999999999999) {
            total += (int) (n % 10);
            n /= 10;
        }
        return total;
    }
}

