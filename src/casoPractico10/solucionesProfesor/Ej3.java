import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo;
        double pagoMesAnterior;
        double cantidadPendiente;
        double comprasRealizadas;
        do{
            System.out.print("Saldo anterior del cliente: ");
            saldo = sc.nextDouble();
        }while(saldo < 0);
        do{
            System.out.print("Pago del mes anterior: ");
            pagoMesAnterior = sc.nextDouble();
        }while(pagoMesAnterior > saldo || pagoMesAnterior < 0);
        do{
            System.out.print("Cantidad pendiente de las compras: ");
            cantidadPendiente = sc.nextDouble();
        }while(cantidadPendiente < 0);
        do{
            System.out.print("Compras realizadas este mes: ");
            comprasRealizadas = sc.nextDouble();
        }while(comprasRealizadas < 0);
        cantidadPendiente+=comprasRealizadas;
        double pagoMinimo=cantidadPendiente*0.15;
        double limiteNoIntereses=cantidadPendiente*0.85;
        System.out.printf("El pago mínimo que debe realizar es %.2f€\n",pagoMinimo);
        System.out.printf("El pago para no generar intereses es %.2f€\n",limiteNoIntereses);
        saldo-=pagoMesAnterior;
        double pagoMes;
        do{
            System.out.print("Pago que desea realizar este mes: ");
            pagoMes = sc.nextDouble();
        }while(pagoMes < 0 || pagoMes > cantidadPendiente || pagoMes > saldo);
        sc.close();
        if (pagoMes>=limiteNoIntereses){
            saldo-=pagoMes;
            cantidadPendiente-=pagoMes;
        } else if (pagoMes<limiteNoIntereses){
            saldo-=pagoMes;
            cantidadPendiente-=pagoMes;
            cantidadPendiente*=1.12;
        }
        if (pagoMes<pagoMinimo){
            cantidadPendiente+=200;
        }
        System.out.printf("Una vez realizado el pago su saldo actual es %.2f€\n",saldo);
        System.out.printf("La cantidad pendiente de pago de sus compras es %.2f€\n",cantidadPendiente);
    }
}
