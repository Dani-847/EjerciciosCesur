package casoPractico9.solucionesProfesor;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio;
        double total=0;
        char otro;
        do{
            System.out.print("Precio del artículo: ");
            precio = sc.nextDouble();
            if (precio>=200){
                precio*=0.85;
            } else if (precio>=100){
                precio*=0.88;
            } else {
                precio*=0.90;
            }
            total += precio;
            System.out.printf("El precio con descuento es %.2f€\n", precio);
            do{
                System.out.print("Otro artículo (s/n)? ");
                otro = sc.next().charAt(0);
            } while (otro!='s' && otro!='n');
        } while(otro!='n');
        sc.close();
        System.out.printf("El total a pagar es %.2f€\n", total);
    }
}
