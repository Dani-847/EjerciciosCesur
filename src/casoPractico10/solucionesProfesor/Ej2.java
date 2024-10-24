import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precioKilo;
        double kilos;
        char tipoUva;
        char tamanho;
        double total;
        do {
            System.out.print("Precio del kilo de uva? ");
            precioKilo = sc.nextDouble();
        }while (precioKilo<=0);
        do {
            System.out.print("Cuántos kilos? ");
            kilos = sc.nextDouble();
        }while (kilos<=0);
        do{
            System.out.print("Tipo de uva? ");
            tipoUva = sc.next().toLowerCase().charAt(0);
        }while (tipoUva!='a' && tipoUva!='b');
        do{
            System.out.print("Tamaño de la uva? ");
            tamanho = sc.next().charAt(0);
        } while (tamanho!='1' && tamanho!='2');
        sc.close();
        if (tipoUva=='a'){
            if (tamanho=='1'){
                precioKilo+=0.2;
            } else {
                precioKilo+=0.3;
            }
        } else {
            if (tamanho=='1'){
                precioKilo-=0.3;
            } else {
                precioKilo-=0.5;
            }
        }
        total = precioKilo*kilos;
        System.out.printf("El total es: %.2f€", total);
    }
}
