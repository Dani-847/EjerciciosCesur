package casoPractico7;

import java.util.Scanner;

public class Ej3PrecioViajeEstudios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero de alumnos: ");
        int n = sc.nextInt();

        if(n>100){
            System.out.println("El coste es " + 65*n);
        } else if (n>=50&&n<=99){
            System.out.println("El coste es " + 70*n);
        } else if (n>=30&&n<=49){
            System.out.println("El coste es " + 95*n);
        } else if (n<30&&n>0){
            System.out.println("El coste es 3000");
        } else {
            System.out.println("La cantidad no puede ser menos a 0 alumnos.");
        }
    }
}
