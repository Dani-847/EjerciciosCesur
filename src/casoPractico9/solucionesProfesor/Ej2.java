package casoPractico9.solucionesProfesor;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas;
        do{
            System.out.print("Horas trabajadas: ");
            horas = sc.nextInt();
        } while((horas<0) || (horas>24));
        String turno;
        do{
            System.out.print("Turno: ");
            turno = sc.next();
        }while (!turno.equalsIgnoreCase("diurno")
                && !turno.equalsIgnoreCase("nocturno"));
        String tipo;
        do{
            System.out.print("Festivo o Laborable: ");
            tipo = sc.next();
        }while (!tipo.equalsIgnoreCase("festivo")
                && !tipo.equalsIgnoreCase("laborable"));
        sc.close();
        double jornal;
        if (turno.equalsIgnoreCase("diurno")){
            jornal=10*horas;
            if (tipo.equalsIgnoreCase("festivo")){
                jornal*=1.1;
            }
        } else {
            jornal=horas*13.5; if (tipo.equalsIgnoreCase("festivo")){
                jornal*=1.15;
            }
        }
        System.out.printf("Jornal: %.2f€\n", jornal);
    }
}
