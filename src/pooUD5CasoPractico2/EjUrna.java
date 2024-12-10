package pooUD5CasoPractico2;

public class EjUrna {
    public static void main(String[] args) {
        Urna urna = new Urna(100, 100);

        while (urna.totalBolas() > 1) {
            ColorBola bola1 = urna.bola();
            ColorBola bola2 = urna.bola();

            if (bola1 == bola2) {
                urna.ponerBlanca();
            } else {
                urna.ponerNegra();
            }
        }

        ColorBola bolaFinal = urna.bola();
        System.out.println("El color de la última bola es: " + bolaFinal);
    }
}
