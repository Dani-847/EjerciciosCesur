package Programacion.UD4.pooUD4CasoPractico6;

public class Circulo extends Punto {
    private float radio;
    public Circulo(){
    }
    public Circulo(Punto centro, float radio) {
        super(centro.getX(), centro.getY());
        this.radio = radio;
    }
    public float getRadio() {
        return radio;
    }
    public void setRadio(float radio) {
        this.radio = radio;
    }
    public Punto getCentro() {
        return new Punto(this.getX(), this.getY());
    }
    public void setCentro(Punto centro) {
        this.setX(centro.getX());
        this.setY(centro.getY());
    }
    public void trasladar(Punto centro) {
        this.setX(centro.getX());
        this.setY(centro.getY());
    }
    @Override
    public String toString() {
        return "Circulo [centro=" + super.toString() + ", radio=" + radio + "]";
    }
}
