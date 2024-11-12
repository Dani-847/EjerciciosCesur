package pooUD4CasoPractico1;

public class Humano extends SerVivo {
    private String nombre;
    public Humano(String nombre, byte edad) {
        super(edad);
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean equals(Humano otro) {
        return super.equals(otro)&&(this.nombre.equals(otro.getNombre()));
    }
    public SerVivo mayor(SerVivo otro) {
        return (this.nombre.length() > otro.getEdad())&&(this.getEdad() > otro.getEdad()) ? this : otro;
    }
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + ", " + super.toString() + " ";
    }
}
