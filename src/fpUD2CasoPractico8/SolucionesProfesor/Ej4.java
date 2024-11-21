package fpUD2CasoPractico8.SolucionesProfesor;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuánto te quires gastar? ");
        int cantidad = sc.nextInt();
        sc.close();
        String regalo="";
        if (cantidad<=10){
            regalo="Tarjeta regalo";
        } else if (cantidad>10 && cantidad<20){
            regalo = "Tarjeta regalo o bombones";
        } else if (cantidad>=20 && cantidad<50) {
            regalo = "Tarjeta regalo o bombones o flores";
        } else {
            regalo = "Tarjeta regalo o bombones o flores o anillo";
        }
        System.out.println("Le puedes regalar: "+regalo);
    }
}
