import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad: ");
        int dinero=sc.nextInt();
        sc.close();
        int contador=0;
        while (dinero>=500){
            contador++;
            dinero-=500;
        }
        if (contador>0)
            System.out.println("Billetes de 500€: "+contador);
        contador=0;
        while (dinero>=200){
            contador++;
            dinero-=200;
        }
        if (contador>0)
            System.out.println("Billetes de 200€: "+contador);
        contador=0;
        while (dinero>=100){
            contador++;
            dinero-=100;
        }
        if (contador>0)
            System.out.println("Billetes de 100€: "+contador);
        contador=0;
        while (dinero>=50){
            contador++;
            dinero-=50;
        }
        if (contador>0)
            System.out.println("Billetes de 50€: "+contador);
        contador=0;
        while (dinero>=20){
            contador++;
            dinero-=20;
        }
        if (contador>0)
            System.out.println("Billetes de 20€: "+contador);
        contador=0;
        while (dinero>=10){
            contador++;
            dinero-=10;
        }
        if (contador>0)
            System.out.println("Billetes de 10€: "+contador);
        contador=0;
        while (dinero>=5){
            contador++;
            dinero-=5;
        }
        if (contador>0)
            System.out.println("Billetes de 5€: "+contador);
        contador=0;
        while (dinero>=2){
            contador++;
            dinero-=2;
        }
        if (contador>0)
            System.out.println("Monedas de 2€: "+contador);
        if (dinero>0)
            System.out.println("Monedas de 1€: "+dinero);
    }
}
