package pooUD7CasoPractico4;

public class Empleado {
    private String nombre;
    private double salarioBase;
    private double bonificacion;

    public Empleado(String nombre, double salarioBase) throws SalarioInvalidoException {
        if (salarioBase <= 0) {
            throw new SalarioInvalidoException("El salario base debe ser mayor a 0.");
        }
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.bonificacion = 0;
    }

    public void asignarBonificacion(double bonificacion) throws BonificacionInvalidaException {
        if (bonificacion < 0 || bonificacion > salarioBase * 0.5) {
            throw new BonificacionInvalidaException("La bonificación debe estar entre 0 y el 50% del salario base.");
        }
        this.bonificacion = bonificacion;
    }

    public double calcularSalarioTotal() {
        return salarioBase + bonificacion;
    }

    public void mostrarSalario() {
        System.out.println("Empleado: " + nombre);
        System.out.printf("Salario Base: %.2f€%n",salarioBase);
        System.out.printf("Bonificación: %.2f€%n",bonificacion);
        System.out.printf("Salario Total:%.2f€%n",calcularSalarioTotal());
    }
}
