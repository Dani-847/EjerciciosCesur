package casoPractico8.SolucionesProfesor;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de cita? ");
        int cita = sc.nextInt();
        sc.close();
        int precio1=150;
        int precio2=100;
        int precio3=90;
        int precio4=50;
        int precioActual;
        int total=0;
        if (cita>=1 && cita<4){
            precioActual=precio1;
            for (int i = 1; i < cita ; i++) {
                total+=precio1;
            }
        } else if (cita>=4 && cita<6){
            precioActual=precio2;
            total+=(precio1*3);
            for (int i = 4; i < cita ; i++) {
                total+=precio2;
            }
        } else if (cita>=6 && cita<9){
            precioActual=precio3;
            total+=(precio1*3)+(precio2*2);
            for (int i = 6; i < cita ; i++) {
                total+=precio3;
            }
        } else {
            precioActual=precio4;
            total+=(precio1*3)+(precio2*2)+(precio3*3);
            for (int i = 9; i < cita ; i++) {
                total+=precio4;
            }
        }
        System.out.println("Precio de la cita actual: "+precioActual);
        System.out.println("Lleva gastados "+total+"€");
    }
}
