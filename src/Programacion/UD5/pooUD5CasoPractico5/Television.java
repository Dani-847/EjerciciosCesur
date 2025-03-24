package Programacion.UD5.pooUD5CasoPractico5;

public class Television extends Electrodomestico{
    private int resolucion;
    private boolean sintonizadorTDT;

    public Television() {
        super();
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }
    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }
    public Television(double precioBase, ColorElectrodomestico color, char consumoEnergetico, double peso, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }
    public int getResolucion() {
        return resolucion;
    }
    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }
    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }
    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if (resolucion > 40) {
            precioFinal += precioFinal * 0.3;
        }
        if (sintonizadorTDT) {
            precioFinal += 50;
        }
        return precioFinal;
    }
    @Override
    public String toString() {
        return "Television{" + "precioBase=" + super.getPrecioBase() + ", color=" + super.getColor() + ", consumoEnergetico=" + super.getConsumoEnergetico() + ", peso=" + super.getPeso() + ", resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + '}';
    }
}
