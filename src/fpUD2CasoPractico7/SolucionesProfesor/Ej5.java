import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        int numero = sc.nextInt();
        sc.close();
        int copia = numero;
        String resultado="";
        int resto;
       while (numero>0){
           resto = numero % 2;
           resultado = resto + resultado;
           numero = numero / 2;
       }
       System.out.println("El número "+copia+" en binario es "+resultado);
       numero=copia;
       resultado="";
        while (numero>0){
            resto = numero % 8;
            resultado = resto + resultado;
            numero = numero / 8;
        }
        System.out.println("El número "+copia+" en octal es "+resultado);
        numero=copia;
        resultado="";
        while (numero>0){
            resto = numero % 16;
            numero = numero / 16;
            switch (resto){
                case 0,1,2,3,4,5,6,7,8,9 -> resultado = resto + resultado;
                case 10 -> resultado = "A"+resultado;
                case 11 -> resultado = "B"+resultado;
                case 12 -> resultado = "C"+resultado;
                case 13 -> resultado = "D"+resultado;
                case 14 -> resultado = "E"+resultado;
                case 15 -> resultado = "F"+resultado;
            }
        }
        System.out.println("El número "+copia+" en hexadecimal es "+resultado);

    }
}
