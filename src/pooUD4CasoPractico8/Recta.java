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
        Recta ortogonal = new Recta(this.ortogonal(),p);
        Punto interseccion = this.interseccion(ortogonal);
        return p.distancia(interseccion);
    }
    public Punto interseccion(Recta r) {
        //R(V(vx,vy),P(px,py)) y R(V(ux,uy),P(qx,qy))
        //this.getX() this.getY() punto     y el otro es  v.getX() v.getY() recta
        Vector u = new Vector(this.ortogonal());
        double d = u.getY() * this.getY() - this.getY() * u.getX();
        double d1 = this.getY() * this.punto.getY() - this.getY() * this.punto.getX();
        double d2 = u.getX() * r.punto.getY() - u.getY() * r.punto.getX();
        double abscisa = (d1 * u.getX() - d2 * this.getX()) / d;
        double ordenada = (d1 * u.getY() - d2 * this.getY()) / d;
        return new Punto(abscisa, ordenada);
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
