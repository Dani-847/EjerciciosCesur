package pooUD4CasoPractico7;

public class Test {
    public static void main(String[] args) {
        Actor a1 = new Actor("Pepito",20);
        Actor a2 = new Actor("Juanita",25);
        Director d1 = new Director("P. Grillo",53);
        Director d2 = new Director("J. Ricardo",45);
        Pelicula p1 = new Pelicula("Mi peli favorita","2023","Comedia",a1,d1);
        Pelicula p2 = new Pelicula("La peor peli del mundo","2024","Drama",a2,d2);
        a1.mostrarActor();
        a2.mostrarActor();
        d1.mostrarDirector();
        d2.mostrarDirector();
        p1.mostrarDetalles();
        p2.mostrarDetalles();
    }
}
