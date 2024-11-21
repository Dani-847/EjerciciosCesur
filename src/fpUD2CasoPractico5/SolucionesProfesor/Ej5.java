package fpUD2CasoPractico5.SolucionesProfesor;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántas niñas hay? ");
        double ninas = sc.nextDouble();
        System.out.print("¿Cuántos niños hay? ");
        double ninos = sc.nextDouble();
        sc.close();
        double porcNinas = ninas / (ninos+ninas) * 100;
        double porcNinos = 100 - porcNinas;
        System.out.println("Hay un "+porcNinas+"% de niñas y un "+porcNinos+"% de niños");
    }
}
