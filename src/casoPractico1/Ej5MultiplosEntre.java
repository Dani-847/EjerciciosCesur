package casoPractico1;

public class Ej5MultiplosEntre {
    public static void main(String[] args) {
        int m2 = 0;
        int m3 = 0;
        int cont = 0;
        for (int i = 1;i<=100;i++){
            if (i%2==0){
                System.out.print(i+"(2) ");
                m2++;
            }
            if (i%3==0){
                System.out.print(i+"(3) ");
                m3++;
            }
            if (i%2==0 || i%3==0){
                cont++;
            }
        }
        System.out.println();
        System.out.println("Hay "+m2+" multiplos de 2 y " + m3 + " multiplos de 3.");
        System.out.println("Hay "+cont+" multiplos totales.");
    }
}
