package casoPractico8;

import java.util.Scanner;

public class Ej5FabricaDePantalones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Precio de la tela(por metro)? ");
        double precio = 0;
        precio = Double.parseDouble(sc.nextLine());
        while (precio<=0){
            System.out.print("Precio invalido. Precio de la tela(por metro)? ");
            precio = Integer.parseInt(sc.nextLine());
        }
        System.out.print("Modelo pantalon? ");
        String modelo = sc.nextLine();
        while (!(modelo.equalsIgnoreCase("a"))&&!(modelo.equalsIgnoreCase("b"))) {
            System.out.print("Modelo invalido. Modelo pantalon? ");
            modelo = sc.nextLine();
        }
        System.out.print("Talla(30,32,36)? ");
        int talla = 0;
        talla = Integer.parseInt(sc.nextLine());
        while (talla!=30&&talla!=32&&talla!=36){
            System.out.print("Talla no valida. Talla(30,32,36)? ");
            talla = Integer.parseInt(sc.nextLine());
        }
        System.out.print("Cantidad? ");
        int cantidad = Integer.parseInt(sc.nextLine());
        while (cantidad<=0){
            System.out.print("Cantidad invalida. Cantidad? ");
            cantidad = Integer.parseInt(sc.nextLine());
        }


        double resultado = 0;
        if (modelo.equalsIgnoreCase("a")){
            resultado = (1.5*cantidad*precio*1.8);
        } else {
            resultado = (1.8*cantidad*precio*1.95);
        }

        if (talla==32||talla==36){
            resultado+= (resultado*1.04);
        }
        System.out.println("La ganancia es: "+(resultado*0.3));
        System.out.println("El precio total es: "+resultado*1.3);


    }
}
