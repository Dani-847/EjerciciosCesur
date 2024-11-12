package ejerciciosSueltos;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        int j=0;
        while(j != -1){ //alto
            Random rand1 = new Random();
            int n = rand1.nextInt(200);
            for (int i=0;i!=n;i++){ //largo
                Random rand = new Random();
                int salida = rand.nextInt(2);
                System.out.print(salida);
            }
            System.out.println();
            //j++;
        }






        //SWITCH EN INTERVALO
        /*
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        switch ((1 <= num && num <= 5 ) ? 0 :
                (6 <= num && num <= 10) ? 1 : 2) {

            case 0:
                System.out.println("I'm between one and five inclusive.");
                break;
            case 1:
                System.out.println("I'm between 6 and 10 inclusive.");
                break;
            case 2:
                System.out.println("I'm not between one and five or 6 and 10 inclusive.");
                break;
        }
        */





        //SWITCH EJEMPLO
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero de un mes: ");
        int mes = sc.nextInt();
        sc.close();
        switch (mes){
            case 1, 2, 3 -> System.out.println("invierno");
            case 4, 5, 6 -> System.out.println("primavera");
            case 7, 8, 9 -> System.out.println("verano");
            case 10, 11, 12 -> System.out.println("otoño");
            default -> System.out.println("no valido");
        }*/




        //DIFERENCIA ENTRE X++ Y ++X
        /*
        int x = 0;
        int y = 0;
        y = ++x;
        System.out.println("++x");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println();
        x = 0;
        y = 0;
        y = x++;
        System.out.println("x++");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println();
        x = 0;
        y = 0;
        y = --x;
        System.out.println("--x");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println();
        x = 0;
        y = 0;
        y = x--;
        System.out.println("x--");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println();

        int t = 10;
        int k = 5;
        System.out.println((t>k)?t:k);*/















        //COSAS ALEATORIAS
        /*int n1 = 0;
        int n2 = 0;
        int j=0;
        while(j != 8){ //alto
            for (int i=0;i!=200;i++){ //largo
                String salida = "0";
                Random rand = new Random();

                int n = rand.nextInt(10);
                if ((n)%2==0)
                    salida = "2";
                System.out.print(salida);
                if (salida == "2")
                    n2++;
                else
                    n1++;
            }
            System.out.println();
            j++;
        }
        System.out.println("Veces que se repite el 0: " +n1);
        System.out.println("Veces que se repite el 2: " +n2);*/






        //EJEMPLO DE SCANNER
        /*
        int edad;
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola");
        System.out.print("Introduce tu nombre: ");
        nombre = sc.nextLine();
        System.out.print("Introduce tu edad: ");
        edad = sc.nextInt();
        System.out.println("Hola " + nombre + ", tienes " + edad + " años!");
        sc.close(); */

        /*commentary etc
        aaaa
         */
    }
}