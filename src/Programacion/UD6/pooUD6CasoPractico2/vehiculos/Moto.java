package practica02ud06.vehiculos;

public class Moto extends Vehiculo {
    private double cilindrada;

    public Moto(int numRuedas, String marca, double kilometraje, String color, String matricula, double cilindrada) {
        super(numRuedas, marca, kilometraje, color, matricula);
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString()+" - Moto{" +
                "cilindrada=" + cilindrada +
                '}';
    }
}
