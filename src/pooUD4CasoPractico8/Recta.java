package pooUD4CasoPractico8;

public class Recta extends Vector{
    private Punto punto;

    public Recta (Punto p, Punto q) {
        super(q.getX() - p.getX(), q.getY() - p.getY());
        this.punto = p;
    }
    public Recta (Vector v, Punto p) {
        super(v.getX(), v.getY());
        this.punto = p;
    }
    public double distancia(Punto p) {
        return Math.abs(this.getX() * p.getY() - this.getY() * p.getX()) / this.modulo();
    }
    public Punto interseccion(Recta r) {
        double x = (this.getY() * r.getX() - this.getX() * r.getY()) / (this.getX() * r.componenteY() - this.getY() * r.componenteX());
        double y = (this.getX() * r.componenteY() - this.getY() * r.getX()) / (this.getX() * r.componenteY() - this.getY() * r.componenteX());
        return new Punto(x, y);
    }
    public Recta paralela(Punto p) {
        return new Recta(this, p);
    }
    public boolean paralelas(Recta r) {
        return this.getX() * r.componenteY() == this.getY() * r.componenteX();
    }
    public boolean pasa(Punto p) {
        return this.getX() * p.getY() == this.getY() * p.getX();
    }
    public Recta perpendicular(Punto p) {
        return new Recta(new Vector(-this.getY(), this.getX()), p);
    }
    @Override
    public String toString() {
        return "Recta: " + super.toString();
    }

}
