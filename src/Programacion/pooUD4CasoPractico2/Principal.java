package pooUD4CasoPractico2;

public class Principal {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", "Perez", 123456789);
        Persona p2 = new Persona("Ana", "Lopez", 987654321);
        Cuenta c1 = new Cuenta("123456", 1000, p1);
        Cuenta c2 = new Cuenta("654321", 2000, p2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(p2);
        System.out.println(p1);
        c1.transaccion(782136, "ingreso");
    }
}
