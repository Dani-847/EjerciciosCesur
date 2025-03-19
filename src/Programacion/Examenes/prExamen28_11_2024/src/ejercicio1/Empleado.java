package ejercicio1;

public class Empleado {
    private String nombre;
    private double salarioBase;
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double calcularSalario() {
        return salarioBase;
    }
    public void trabajar() {
        System.out.println("El empleado está trabajando.");
    }
    public void infoEmpleado() {
        System.out.println("Información del empleado:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario base: " + salarioBase + "€");
    }
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
