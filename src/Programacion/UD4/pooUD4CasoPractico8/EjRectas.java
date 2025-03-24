package Programacion.UD4.pooUD4CasoPractico8;

public class EjRectas {
    public static void main(String[] args) {
// Calcular el área del triángulo
// definido por sus tres vértices
        Punto p1 = new Punto(0,0);
        Punto p2 = new Punto(4,0);
        Punto p3 = new Punto(2,3);
// Se calcula la distancia entre p1 y p2
        double base = p1.distancia(p2);
// Se calcula la recta que pasa por p1 y p2
        Recta r1 = new Recta(p1,p2);
// se calcula la distancia entre p3 y r1
        double altura = r1.distancia(p3);
// El area es base*altura/2
        double area = base*altura/2;
        System.out.println("Puntos: "+p1+","+p2+","+p3);
        System.out.println("Área = "+area);
    }
}
