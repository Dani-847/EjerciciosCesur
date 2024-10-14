package casoPractico8;

import java.util.Scanner;

public class Ej4Febrero14 {
    public static void main(String[] args) {
        System.out.print("Introduce presupuesto: ");
        Scanner sc = new Scanner(System.in);
        int cantidad = sc.nextInt();
        sc.close();
        String regalo="";
        if (cantidad<=10){
            regalo="Tarjeta regalo";
        } else if(cantidad>10&&cantidad<20){
            regalo ="Tarjeta regalo o bombones";
        } else if(cantidad >=20 && cantidad <50){
            regalo ="Tarjeta regalo o bombones o flores";
        } else {
            regalo ="Tarjeta regalo o bombones o flores o anillos";
        }
        System.out.println("Le puedes regalar: " + regalo);
    }
}
