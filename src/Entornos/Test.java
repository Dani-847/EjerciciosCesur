package Entornos;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " "); //Permite saber el paso del bucle
            if (i % 3 == 0) {
                System.out.println("Divisible entre 3");
            }
        }
    }
}
