package fpUD2CasoPractico6.SolucionesProfesor;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Escribe un número entre 1 y 1000: ");
            num = sc.nextInt();
        } while (num < 1 || num > 1000);
        if (num == 1000) {
            System.out.print("M");
            num = num - 1000;
        }
        if (num>=900 && num<1000){
            System.out.print("CM");
            num = num - 900;
        }
        if (num>=500 && num<900){
            System.out.print("D");
            num = num - 500;
        }
        if (num>=400 && num<500){
            System.out.print("CD");
            num = num - 400;
        }
        if (num>=100 && num<400){
            int veces = num / 100;
            for (int i = 1; i <=veces ; i++) {
                System.out.print("C");
                num = num - 100;
            }
        }
        if (num>=90 && num<100){
            System.out.print("XC");
            num = num - 90;
        }
        if (num>=50 && num<90){
            System.out.print("L");
            num = num - 50;
        }
        if (num>=40 && num<50){
            System.out.print("XL");
            num = num - 40;
        }
        if (num>=10 && num<40){
            int veces = num / 10;
            for (int i = 1; i <=veces ; i++) {
                System.out.print("X");
                num = num - 10;
            }
        }
        switch(num){
            case 9 -> System.out.println("IX");
            case 8 -> System.out.println("VIII");
            case 7 -> System.out.println("VII");
            case 6 -> System.out.println("VI");
            case 5 -> System.out.println("V");
            case 4 -> System.out.println("IV");
            case 3 -> System.out.println("III");
            case 2 -> System.out.println("II");
            case 1 -> System.out.println("I");
        }
        sc.close();
    }
}
