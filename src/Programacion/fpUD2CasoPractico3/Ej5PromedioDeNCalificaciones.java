package fpUD2CasoPractico3;

import java.util.Scanner;

public class Ej5PromedioDeNCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce las notas de los alumnos (0 para terminar): ");
        double n = sc.nextDouble();
        double total = n;
        int cnt = 1;
        while (n!=-1){
            n = sc.nextDouble();
            total+=n;
            if (n!=-1)
                cnt++;
        }
        sc.close();
        System.out.println("El promedio es " + total/cnt);




    }
}


