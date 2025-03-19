package ejercicio1;

public class EmpleadoPorHora extends Empleado{
    private int horasTrabajadas;
    private double precioHora;
    public EmpleadoPorHora(String nombre) {
        super(nombre, 0);
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }
    @Override
    public double calcularSalario() {
        return horasTrabajadas * precioHora;
    }
    public double calcularSalario(int horasTrabajadas, double precioHora) {
        return horasTrabajadas * precioHora;
    }
    @Override
    public void trabajar() {
        System.out.println("El empleado por hora está trabajando según las horas asignadas.");
    }

    @Override
    public String toString() {
        return super.toString() + "EmpleadoPorHora{" +
                "horasTrabajadas=" + horasTrabajadas +
                ", precioHora=" + precioHora +
                '}';
    }
}
