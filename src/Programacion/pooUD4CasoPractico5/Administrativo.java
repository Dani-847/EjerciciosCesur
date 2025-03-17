package pooUD4CasoPractico5;

public class Administrativo extends Empleado{
    private String antiguedad;
    public Administrativo(String dni, String nombre, String apellidos, String domicilio, String codigoPostal, String ciudad, PuestoTrabajo puesto, String antiguedad) {
        super(dni, nombre, apellidos, domicilio, codigoPostal, ciudad, puesto);
        this.antiguedad = antiguedad;
    }
    public String getAntiguedad() {
        return antiguedad;
    }
    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }
    @Override
    public String toString() {
        return "Administrativo {antiguedad=" + antiguedad + ", " + super.toString() + "}";
    }
    @Override
    public void getAtributos() {
        super.getAtributos();
        System.out.println(" Administrativo{antiguedad=" + antiguedad + "}");
    }
}
