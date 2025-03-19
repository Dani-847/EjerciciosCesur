package Ej4;

public class Ej4 {
    public static void main(String[] args) {
        int primoActual=0;
        int primoAnterior=0;
        for (int i = 1; i<=100;i++){
            boolean primo = true;

            if (i%2==0&&i!=2)
                primo=false;

            int j = 3;
            while (i>j&&primo){
                if (i%j==0)
                    primo=false;
                j+=2;
            }

            if (primo){
                primoActual=i;
            }

            if(primoActual-primoAnterior==2){
                System.out.println("("+primoAnterior+", "+primoActual+")");
            }
            primoAnterior=primoActual;
        }
    }
}
