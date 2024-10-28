package casoPractico11.solucionesProfesor;

public class Ej1 {
    public static void main(String[] args) {
        // ºF = (ºC * 9/5) + 32
        // ºC = (ºF - 32) * 5/9
        double celsius;
        for (int fahrenheit = 0; fahrenheit <= 100 ; fahrenheit=fahrenheit+5) {
            celsius = (fahrenheit-32)*5.0/9;
            System.out.printf("%dºF -> %.2fºC\n",fahrenheit,celsius);
        }
    }
}
