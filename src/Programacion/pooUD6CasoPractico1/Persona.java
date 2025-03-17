package pooUD6CasoPractico1;

public class Persona {
    private int idPersona;
    private String nombre;
    private static int contadorPersonas=0;

    public Persona(String nombre) {
        contadorPersonas++;
        this.idPersona = contadorPersonas;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    @Override
    public String toString() {
        return  "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                ", contadorPersonas="+contadorPersonas;
    }
}
