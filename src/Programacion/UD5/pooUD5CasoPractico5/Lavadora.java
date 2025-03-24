package Programacion.UD5.pooUD5CasoPractico5;

public class Lavadora extends Electrodomestico {
    private int carga;

    public Lavadora() {
        super();
        this.carga = 5;
    }
    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = 5;
    }
    public Lavadora(double precioBase, ColorElectrodomestico color, char consumoEnergetico, double peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }
    public int getCarga() {
        return carga;
    }
    public void setCarga(int carga) {
        this.carga = carga;
    }
    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if (carga > 30) {
            precioFinal += 50;
        }
        return precioFinal;
    }
    @Override
    public String toString() {
        return "Lavadora{" + "precioBase=" + super.getPrecioBase() + ", color=" + super.getColor() + ", consumoEnergetico=" + super.getConsumoEnergetico() + ", peso=" + super.getPeso() + ", carga=" + carga + '}';
    }
}
