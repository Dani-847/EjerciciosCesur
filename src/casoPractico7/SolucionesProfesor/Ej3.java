import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de alumnos: ");
        int alumnos=sc.nextInt();
        sc.close();
        double costoAlumno;
        if (alumnos>=100){
            costoAlumno = 65;
        } else if (alumnos>=50) {
            costoAlumno = 70;
        } else if (alumnos>=30) {
            costoAlumno = 95;
        } else {
            costoAlumno = 3000.0 / alumnos;
        }
        System.out.println("El precio total es "+(alumnos*costoAlumno));
        System.out.printf("El precio por alumno es %.2f \n",costoAlumno);
        System.out.println("El precio por alumno es "+costoAlumno);
    }
}
