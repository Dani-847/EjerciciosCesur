package casoPractico8.SolucionesProfesor;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precioMetro;
        do{
            System.out.print("Precio el metro de tela? ");
            precioMetro = sc.nextDouble();
        }while (precioMetro <= 0);
        char modelo;
        do{
            System.out.print("Modelo A o B? ");
            modelo = sc.next().toUpperCase().charAt(0);
        } while (!(modelo == 'A' || modelo == 'B'));
        // (modelo!='A' && modelo !='B')
        String talla;
        do{
            System.out.print("Talla (30/32/36)? ");
            talla = sc.next();
        }while (!(talla.equals("30") || talla.equals("32") || talla.equals("36")));
        int numPantalones;
        do{
            System.out.print("Número de Pantalones: ");
            numPantalones = sc.nextInt();
        }while (numPantalones <= 0);
        sc.close();
        double costoTela;
        double precioTotal=0;
        if (modelo=='A'){
            costoTela = 1.5 * precioMetro;
            precioTotal += costoTela*1.8;
        } else {
            costoTela = 1.8 * precioMetro;
            precioTotal += costoTela*1.95;
        }
        if (talla.equals("32") || talla.equals("36")){
            precioTotal *= 1.04;
        }
        precioTotal *= numPantalones;
        double ganancia = precioTotal*0.3;
        precioTotal += ganancia;
        System.out.printf("Ganancia de la tienda: %.2f€\n",ganancia);
        System.out.printf("Precio final: %.2f€\n",precioTotal);
    }
}
