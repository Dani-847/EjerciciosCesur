package casoPractico2;

import java.util.Scanner;

public class Ej3AreaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un radio: ");
        int radio = sc.nextInt();
        System.out.println("El area es " + Math.PI * (radio * radio));
    }
}
