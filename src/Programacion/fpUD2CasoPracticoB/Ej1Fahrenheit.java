package Programacion.fpUD2CasoPracticoB;

public class Ej1Fahrenheit {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i += 5) {
            System.out.println(i + "ºF -> " + ((double) (i - 32) * 5 / 9) + "ºC");
        }
    }
}//double C = (i - 32)*5/9)