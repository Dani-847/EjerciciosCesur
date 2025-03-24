package Programacion.UD2.fpUD2CasoPractico8;

import java.util.Scanner;

public class Ej3ConsultorioCobros {
    public static void main(String[] args) {
        System.out.print("Que cita es la actual? ");
        Scanner sc = new Scanner(System.in);
        int cantidad = sc.nextInt();
        int total=0;
        int uCita=0;

        for (int i = 1 ; i<=cantidad;i++){
            if (i<=3){
                total+=150;
                if (i==cantidad){
                    uCita=150;
                }
            }
            if (i>3&&i<=5){
                total+=100;
                if (i==cantidad){
                    uCita=100;
                }
            }
            if (i>5&&i<=8){
                total+=90;
                if (i==cantidad){
                    uCita=90;
                }
            }
            if (i>8){
                total+=50;
                if (i==cantidad){
                    uCita=50;
                }
            }
        }
        System.out.println("El total que el paciente ha pagado es: " + total + ", y la ultima cita: "+ uCita +".");
    }
}
