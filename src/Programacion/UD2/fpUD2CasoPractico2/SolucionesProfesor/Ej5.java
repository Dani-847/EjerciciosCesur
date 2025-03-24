package Programacion.UD2.fpUD2CasoPractico2.SolucionesProfesor;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe el importe: ");
        //Para evitar problemas al leer un número antes de una cadena de texto
        double importe = Double.parseDouble(sc.nextLine());
        System.out.print("Mes de la compra: ");
/*        int mes = sc.nextInt();
        System.out.print("Escribe el importe: ");
        double importe = sc.nextDouble();
        double total;
        if (mes==10)
            total = importe * 0.85;
         else
            total = importe;

        System.out.println("Importe total: "+total);*/

        String mes = sc.nextLine();

        sc.close();
        double total;
        // Podría usar mes.toLowerCase().equals("octubre")
        // Usamos equalsIgnoreCase("octubre") de forma que nos da igual si está el mes en mayúsculas, minúsculas...
        if (mes.equalsIgnoreCase("octubre"))
            total = importe * 0.85;
        else
            total = importe;
        System.out.println("Importe total: "+total);
    }
}
