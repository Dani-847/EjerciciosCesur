package practica02ud06.vehiculos;

public class Coche extends Vehiculo {
    private int numPuertas;
    private boolean extras;

    public Coche(int numRuedas, String marca, double kilometraje, String color, String matricula, int numPuertas, boolean extras) {
        super(numRuedas, marca, kilometraje, color, matricula);
        this.numPuertas = numPuertas;
        this.extras = extras;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public boolean isExtras() {
        return extras;
    }

    public void setExtras(boolean extras) {
        this.extras = extras;
    }

    @Override
    public String toString() {
        return super.toString()+" - Coche{" +
                "numPuertas=" + numPuertas +
                ", extras=" + extras +
                '}';
    }
}
