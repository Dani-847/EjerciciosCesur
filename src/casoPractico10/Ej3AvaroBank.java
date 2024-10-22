package casoPractico10;

import java.util.Scanner;

public class Ej3AvaroBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Saldo anterior? ");
        double sA = Double.parseDouble(sc.nextLine());
        while (sA <= 1) {
            System.out.print("Saldo anterior? ");
            sA = Double.parseDouble(sc.nextLine());
        }
        System.out.print("Pago del mes anterior? ");
        double mA= Double.parseDouble(sc.nextLine());
        while (mA<= 1) {
            System.out.print("Pago del mes anterior? ");
            mA = Double.parseDouble(sc.nextLine());
        }
        System.out.print("Cantidad pendiente? ");
        double cP = Double.parseDouble(sc.nextLine());
        while (cP<= 1) {
            System.out.print("Cantidad pendiente? ");
            cP = Double.parseDouble(sc.nextLine());
        }
        System.out.print("Compras realizadas? ");
        double cR = Double.parseDouble(sc.nextLine());
        while (cR<= 1) {
            System.out.print("Compras realizadas? ");
            cR = Double.parseDouble(sc.nextLine());
        }
        double pagoMinimo = (cP+cR)*0.15;
        System.out.println("El pago minimo que debe realizar es "+pagoMinimo);
        double pagoNoInteres = (cP+cR)*0.85;
        System.out.println("El pago que debe realizar para no generar intereses es "+pagoNoInteres);


        System.out.print("Pago que se realiza este mes? ");
        int eM = Integer.parseInt(sc.nextLine());
        while (eM<= 1) {
            System.out.print("Pago que se realiza este mes? ");
            eM = Integer.parseInt(sc.nextLine());
        }
        cP=cP+cR-eM;
        if (eM<pagoNoInteres)
            cP = cP * 1.12;
        if (eM<pagoMinimo)
            cP+=200;

        System.out.println("Una vez realizado el pago, su saldo actual es "+(sA-mA-eM));
        System.out.println("La cantidad pendiente de pago de sus compras es " + cP);
    }
}
//4500 350 375 400 100