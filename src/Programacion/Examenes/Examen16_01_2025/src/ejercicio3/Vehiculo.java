package Programacion.Examenes.Examen16_01_2025.src.ejercicio3;

public class Vehiculo {
    private String matricula;
    private CategoriaVehiculo categoria;
    private double precioDiario;

    public Vehiculo(String matricula, CategoriaVehiculo categoria, double precioDiario) {
        this.matricula = matricula;
        this.categoria = categoria;
        this.precioDiario = precioDiario;
    }

    public String getMatricula() {
        return matricula;
    }

    public CategoriaVehiculo getCategoria() {
        return categoria;
    }

    public double getPrecioDiario() {
        return precioDiario;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCategoria(CategoriaVehiculo categoria) {
        this.categoria = categoria;
    }

    public void setPrecioDiario(double precioDiario) {
        this.precioDiario = precioDiario;
    }

    public double calcularPrecioAlquiler(int dias) {
        double precio = 0;
        if (categoria == CategoriaVehiculo.ELECTRICO) {
            precio = precioDiario * dias * 0.85;
        } else if (categoria == CategoriaVehiculo.SUV) {
            precio = precioDiario * dias * 0.90;
        } else if (categoria == CategoriaVehiculo.SEDAN) {
            precio = precioDiario * dias;
        }
        return precio;
    }

    public String toString() {
        return "Matricula: " + matricula + ", Categoria: " + categoria + ", Precio diario: " + precioDiario;
    }
}
