package Programacion.UD2.fpUD2CasoPractico3.SolucionesProfesor;

public class Ej4 {
    public static void main(String[] args) {
        int suma=0;
        for (int i = 50; i >=20 ; i=i-2) {
            suma = suma + i;
            // suma += i;
        }
        System.out.println("Resultado: "+suma);
    }
}
