package casoPractico7;

import java.util.Scanner;

public class Ej2Bisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un año para saber si es bisiesto: ");
        int n = sc.nextInt();
        sc.close();
        if(n%4==0&&(n%100!=0)){
            System.out.println("Es bisiesto");
        } else if (n%100==0&&n%400==0){
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No bisiesto");
        }
    }
}
