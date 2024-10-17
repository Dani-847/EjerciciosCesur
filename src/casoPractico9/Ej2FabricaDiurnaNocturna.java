package casoPractico9;

import java.util.Scanner;

public class Ej2FabricaDiurnaNocturna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero de horas? ");
        int horas = 0;
        horas = Integer.parseInt(sc.nextLine());
        while (horas<=0){
            System.out.print("Horas invalidas. Numero de horas? ");
            horas = Integer.parseInt(sc.nextLine());
        }
        System.out.print("Turno? ");
        String turno = sc.nextLine();
        while (!(turno.equalsIgnoreCase("nocturno"))&&!(turno.equalsIgnoreCase("diurno"))) {
            System.out.print("Turno invalido. Turno(Nocturno, Diurno)? ");
            turno = sc.nextLine();
        }
        double tarifaTurno = turno.equals("diurno")? 10:13.5;
        System.out.print("Dia? ");
        String dia = sc.nextLine();
        while (!(dia.equalsIgnoreCase("festivo"))&&!(dia.equalsIgnoreCase("laborable"))) {
            System.out.print("Dia invalido. Dia(Festivo, Laborable)? ");
            turno = sc.nextLine();
        }
        double tarifaDia = turno.equalsIgnoreCase("festivo")? 1.10:1;
        if (turno.equalsIgnoreCase("nocturno")&&dia.equalsIgnoreCase("festivo"))
            tarifaDia=1.15;
        System.out.println("El sueldo del trabajador es: " + (horas*tarifaTurno*tarifaDia));
    }
}
