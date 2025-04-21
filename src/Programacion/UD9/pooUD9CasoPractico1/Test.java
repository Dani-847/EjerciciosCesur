package Programacion.UD9.pooUD9CasoPractico1;

public class Test {
    public static void main(String[] args) {
        MovilCamaraRadio miMovil = new MovilCamaraRadio("678543210","MSE","7712","Movifone");
        miMovil.escucharSintonia("Cadena Sercero");
        miMovil.llamarANumero("678543210");
        miMovil.realizarFoto("1200x640");
        miMovil.recibirLlamada("698765432");
    }
}
