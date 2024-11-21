import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un año: ");
        int anho=sc.nextInt();
        sc.close();

        boolean bisiesto = (((anho%4==0) && !(anho%100==0)) || ((anho%100==0))&&(anho%400==0));

        if (bisiesto){
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }
    }
}
