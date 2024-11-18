package pooUD4CasoPractico2;

public class Persona {
    private String nombre;
    private String apellido;
    private int nTelefono;
    public Persona() {
    }
    public Persona(String nombre, String apellido, int nTelefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        setnTelefono(nTelefono);
    }
    public void setnTelefono(int nTelefono) {
        this.nTelefono = nTelefono>=100000000&&nTelefono<=999999999?nTelefono:0;
    }
    public int getnTelefono() {
        return nTelefono;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", nTelefono=" + nTelefono + '}';
    }
}
