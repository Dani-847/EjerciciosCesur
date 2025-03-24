package Programacion.UD5.pooUD5CasoPractico1;

import java.util.Scanner;

public class PersonaTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nombre:");
        String nombre = sc.nextLine();
        System.out.println("Introduce una edad:");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce un sexo (H/M):");
        char sexo = sc.nextLine().charAt(0);
        System.out.println("Introduce un peso:");
        double peso = Double.parseDouble(sc.nextLine());
        System.out.println("Introduce una altura:");
        double altura = Double.parseDouble(sc.nextLine());
        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();
        System.out.println("Persona 1 tiene IMC: " + persona1.calcularIMC());
        System.out.println("Persona 2 tiene IMC: " + persona2.calcularIMC());
        System.out.println("Persona 3 tiene IMC: " + persona3.calcularIMC());
        System.out.println("Persona 1 es mayor de edad: " + persona1.esMayorDeEdad());
        System.out.println("Persona 2 es mayor de edad: " + persona2.esMayorDeEdad());
        System.out.println("Persona 3 es mayor de edad: " + persona3.esMayorDeEdad());
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
    }
}
