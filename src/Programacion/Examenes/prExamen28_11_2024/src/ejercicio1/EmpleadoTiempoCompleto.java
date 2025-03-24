package Programacion.Examenes.prExamen28_11_2024.src.ejercicio1;

public class EmpleadoTiempoCompleto extends Empleado{
    public EmpleadoTiempoCompleto(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return this.getSalarioBase()+500;
    }

    @Override
    public void trabajar() {
        System.out.println("El empleado de tiempo completo está trabajando en un horario regular.");
    }

    @Override
    public String toString() {
        return super.toString() + "EmpleadoTiempoCompleto{}";
    }
}
