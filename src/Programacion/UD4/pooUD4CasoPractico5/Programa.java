package Programacion.UD4.pooUD4CasoPractico5;

public class Programa {
    public static void main(String[] args) {
        PuestoTrabajo puesto1 = new PuestoTrabajo("P1", "Consultor", 2000);
        PuestoTrabajo puesto2 = new PuestoTrabajo("P2", "Administrativo", 1500);
        Empleado consultor;
        Empleado administrativo;
        consultor = new Consultor("12345678A", "Juan", "Perez", "Calle Mayor 1", "28080", "Madrid", puesto1, "Senior");
        administrativo = new Administrativo("87654321B", "Maria", "Lopez", "Calle Menor 2", "28081", "Madrid", puesto2, "5 años");
        System.out.println(puesto1);
        System.out.println(puesto2);
        consultor.getAtributos();
        administrativo.getAtributos();
    }
}
