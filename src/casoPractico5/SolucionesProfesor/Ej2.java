package casoPractico5.SolucionesProfesor;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un día de la semana: ");
        String dia = sc.nextLine();
        sc.close();
        switch (dia.toLowerCase()){
            case "lunes","martes","miercoles","miércoles","jueves","viernes" -> System.out.println("Es laborable");
            case "sábado","sabado","domingo" -> System.out.println("Es festivo");
            default -> System.out.println("No es un día válido");
        }
    }
}
