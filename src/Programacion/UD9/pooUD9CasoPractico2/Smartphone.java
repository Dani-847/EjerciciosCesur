package Programacion.UD9.pooUD9CasoPractico2;

public class Smartphone extends Dispositivo {

    public Smartphone(String modelo, String marca) {
        super(modelo, marca);
    }

    public void hacerLlamada(String numero) {
        System.out.println("Llamando al número: " + numero);
    }
}