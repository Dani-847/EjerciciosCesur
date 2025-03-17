package pooUD4CasoPractico6;

public class Cilindro extends Circulo {
    private float altura;
    public Cilindro() {
    }
    public Cilindro(Circulo base, float altura) {
        super(base.getCentro(), base.getRadio());
        this.altura = altura;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void setBase(Circulo base) {
        this.setX(base.getX());
        this.setY(base.getY());
        this.setRadio(base.getRadio());
    }
    public void trasladar(Punto centro) {
        this.setX(centro.getX());
        this.setY(centro.getY());
    }
    @Override
    public String toString() {
        return "Cilindro {base=" + super.toString() + ", altura=" + altura + "}";
    }
}