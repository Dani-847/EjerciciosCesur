package fpUD2CasoPractico4.SolucionesProfesor;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un número: ");
        double A=sc.nextDouble();
        System.out.print("Escribe un número: ");
        double B=sc.nextDouble();
        double suma=0;
        if (A>B){
            for (int i = 100; i <=1000 ; i++) {
                if ((i*(i+1)/5)%5==0){
                    suma = suma + i; //suma+=i;
                }
            }
        } else if (A==B){
            for (int i = 1; i <=45 ; i=i+4) {
                suma=suma+(i/A); //suma+=i/A;
            }
        } else {
            // (2^3+4^6+6^9+…+20^30)
            int exponente=3;
            for (int base = 2; base <=20 ; base=base+2) {
                suma = suma + Math.pow(base,exponente); // suma+=Math.pow(base,exponente);
                exponente = exponente + 3;
            }
            suma = suma * (B-A);
        }
        System.out.println("Resultado: "+suma);
    }
}
