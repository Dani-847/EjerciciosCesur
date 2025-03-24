package Programacion.UD5.pooUD5CasoPractico2;

import java.util.Random;

public class Urna {
    static private Random r = new Random();
    protected int blancas;
    protected int negras;
    public Urna(int blancas, int negras){
        this.blancas = blancas;
        this.negras = negras;
    }
    public int getBlancas() {
        return blancas;
    }
    public void setBlancas(int blancas) {
        this.blancas = blancas;
    }
    public int getNegras() {
        return negras;
    }
    public void setNegras(int negras) {
        this.negras = negras;
    }
    public void ponerBlanca(){
        blancas++;
    }
    public void ponerNegra(){
        negras++;
    }
    public int totalBolas(){
        return blancas + negras;
    }
    public ColorBola bola() {
        int aleatorio = r.nextInt(totalBolas()) + 1;
        ColorBola bola;
        if (aleatorio <= blancas) {
            blancas--;
            bola = ColorBola.blanco;
        } else {
            negras--;
            bola = ColorBola.negro;
        }
        return bola;
    }

    @Override
    public String toString() {
        return "Urna{" +
                "blancas=" + blancas +
                ", negras=" + negras +
                '}';
    }
}
