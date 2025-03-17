import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Altura del triángulo: ");
        int altura=sc.nextInt();
        sc.close();
        for (int fila = 1; fila <= altura ; fila++) {
            //Pintar espacios
            for (int i = 1; i <= (altura-fila) ; i++) {
                System.out.print(" ");
            }
            //Pintar asteriscos
            for (int i = 1; i <= fila ; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
