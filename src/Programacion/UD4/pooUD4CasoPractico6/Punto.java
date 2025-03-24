package Programacion.UD4.pooUD4CasoPractico6;

public class Punto {
    private float x;
    private float y;
    public Punto() {
    }
    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void trasladar(float dx, float dy) {
        x = dx;
        y = dy;
    }
    public void trasladar(Punto centro) {
        this.setX(centro.getX());
        this.setY(centro.getY());
    }
    public String toString() {
        return "Punto {x=" + x + ", y=" + y + "}";
    }
}