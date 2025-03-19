package ejercicio1;

public class EmpleadoFreelancer extends Empleado{
    private int numeroDeProyectos;
    public EmpleadoFreelancer(String nombre, int numeroDeProyectos) {
        super(nombre, 0);
        this.numeroDeProyectos = numeroDeProyectos;
    }

    public int getNumeroDeProyectos() {
        return numeroDeProyectos;
    }

    public void setNumeroDeProyectos(int numeroDeProyectos) {
        this.numeroDeProyectos = numeroDeProyectos;
    }

    @Override
    public double calcularSalario() {
        return super.getSalarioBase() + numeroDeProyectos * 200;
    }

    @Override
    public void trabajar() {
        System.out.println("El freelancer está trabajando en proyectos específicos.");
    }

    @Override
    public String toString() {
        return super.toString() + "EmpleadoFreelancer{" +
                "numeroDeProyectos=" + numeroDeProyectos +
                '}';
    }
}
