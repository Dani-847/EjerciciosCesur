package pooUD4CasoPractico8;

public class Vector extends Punto{
    public Vector(Punto p, Punto q) {
        super(q.getX() - p.getX(), q.getY() - p.getY());
    }
    public Vector(double x, double y) {
        super(x, y);
    }
    public Vector(Punto p) {
        super(p.getX(), p.getY());
    }

    public boolean combinacionLineal(Vector v) {
        return this.getX() * v.getY() == this.getY() * v.getX();
    }

    public double componenteX() {
        return this.getX();
    }
    public double componenteY() {
        return this.getY();
    }

    public double modulo() {
        return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
    }
    public Vector ortogonal() {
        return new Vector(-this.getY(), this.getX());
    }
    @Override
    public String toString() {
        return "<" + getX() + ", " + getY() + ">";
    }
}
