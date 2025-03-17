package pooUD3CasoPractico4;

public class RectanguloTest {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(0,4);
        Rectangulo r2 = new Rectangulo(2.5,12.5);


        System.out.println("Area 1 "+r1.calcularArea());
        System.out.println("Perimetro 1 "+r1.calcularPerimetro());
        System.out.println("Area 2 "+r2.calcularArea());
        System.out.println("Perimetro 2 "+r2.calcularPerimetro());
    }
}
