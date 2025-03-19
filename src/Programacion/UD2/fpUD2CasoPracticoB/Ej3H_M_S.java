package fpUD2CasoPracticoB;

import java.util.Scanner;

public class Ej3H_M_S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe el número de segundos: ");
        int seg = sc.nextInt();
        int horas = seg/3600;
        seg-=horas*3600;
        int min =  seg/60;
        seg-=min*60;
        System.out.println("Equivale a "+ horas + " horas, "+min+" minutos y "+seg+" segundos");
    }
}
