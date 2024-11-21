package fpUD2CasoPractico7;

import java.util.Scanner;

public class Ej4ConversorBilletes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero total a convertir: ");
        int n = sc.nextInt();
        int b500=0;
        while (n>=500){
            n-=500;
            b500++;
        }
        if (b500>0)
            System.out.println("Billetes de 500€: " + b500);

        int b200=0;
        while (n>=200){
            n-=200;
            b200++;
        }
        if (b200>0)
            System.out.println("Billetes de 200€: " + b200);

        int b100=0;
        while (n>=100){
            n-=100;
            b100++;
        }
        if (b100>0)
            System.out.println("Billetes de 100€: " + b100);

        int b50=0;
        while (n>=50){
            n-=50;
            b50++;
        }
        if (b50>0)
            System.out.println("Billetes de 50€: " + b50);

        int b20=0;
        while (n>=20){
            n-=20;
            b20++;
        }
        if (b20>0)
            System.out.println("Billetes de 20€: " + b20);

        int b10=0;
        while (n>=10){
            n-=10;
            b10++;
        }
        if (b10>0)
            System.out.println("Billetes de 10€: " + b10);

        int b5=0;
        while (n>=5){
            n-=5;
            b5++;
        }
        if (b5>0)
            System.out.println("Billetes de 5€: " + b5);

        int b2=0;
        while (n>=2){
            n-=2;
            b2++;
        }
        if (b2>0)
            System.out.println("Monedas de 2€: " + b2);

        int b1=0;
        while (n>=1){
            n-=1;
            b1++;
        }
        if (b1>0)
            System.out.println("Monedas de 1€: " + b1);
    }
}