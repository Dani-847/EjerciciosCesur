package Programacion.UD2.fpUD2CasoPracticoB.solucionesProfesor;

import java.util.Random;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántas veces lanzo el dado? ");
        int veces = sc.nextInt();
        sc.close();
        Random r = new Random();
        int dado;
        int uno=0;
        int dos=0;
        int tres=0;
        int cuatro=0;
        int cinco=0;
        int seis=0;
        for (int i = 1; i <= veces; i++) {
            dado = r.nextInt(6)+1;
            switch (dado) {
                case 1 -> uno++;
                case 2 -> dos++;
                case 3 -> tres++;
                case 4 -> cuatro++;
                case 5 -> cinco++;
                case 6 -> seis++;
            }
        }
        System.out.printf("El 1 ha salido %d veces\n",uno);
        System.out.printf("El 2 ha salido %d veces\n",dos);
        System.out.printf("El 3 ha salido %d veces\n",tres);
        System.out.printf("El 4 ha salido %d veces\n",cuatro);
        System.out.printf("El 5 ha salido %d veces\n",cinco);
        System.out.printf("El 6 ha salido %d veces\n",seis);
    }
}
