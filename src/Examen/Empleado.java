package Examen;

public class Empleado {
    private String nombre;
    private double sueldo;
    private String departamento;

    public Empleado(String nombre, double sueldo, String departamento) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + '\n' +
                "Sueldo: " + sueldo + "€" + '\n' +
                "Departamento: " + departamento + '\n';
    }
}
