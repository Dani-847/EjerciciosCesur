package Programacion.UD6.pooUD6CasoPractico1;

public class Test {
    public static void main(String[] args) {
        Persona p1 = new Persona("Pepito");
        System.out.println(p1);
        Persona p2 = new Persona("Pedro");
        System.out.println(p2);
        Persona p3 = new Persona("Antonio");
        System.out.println(p3);
        System.out.println("Contador personas: "+Persona.getContadorPersonas());
    }
}
