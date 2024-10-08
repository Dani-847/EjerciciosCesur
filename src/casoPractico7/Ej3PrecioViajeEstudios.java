package casoPractico7;

import java.util.Scanner;

public class Ej3PrecioViajeEstudios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero de alumnos: ");
        int n = sc.nextInt();

        double total=n>100?65*n:n>=50&&n<=99?70*n:n>=30&&n<=49?95*n:n<30&&n>0?3000:0;
        if (total>0)
            System.out.println("El coste total es: "+total+"; y por alumno son: "+total/n);
        else
            System.out.println("La cantidad no puede ser menor a 0 alumnos.");


        /*
        if(n>100){
            System.out.println("El coste total es " + 65*n);
        } else if (n>=50&&n<=99){
            System.out.println("El coste total es " + 70*n);
        } else if (n>=30&&n<=49){
            System.out.println("El coste total es " + 95*n);
        } else if (n<30&&n>0){
            System.out.println("El coste total del bus 3000");
        } else {
            System.out.println("La cantidad no puede ser menor a 0 alumnos.");
        }
         */
    }
}
