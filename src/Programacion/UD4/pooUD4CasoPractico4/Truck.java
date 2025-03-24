package Programacion.UD4.pooUD4CasoPractico4;

public class Truck extends Car{
    private int weight;
    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }
    public double getSalePrice() {
        if (weight > 2000) {
            return super.getSalePrice() * 0.9;
        } else {
            return super.getSalePrice() * 0.8;
        }
    }
    @Override
    public String toString() {
        return super.toString() + "Truck{" +
                "weight=" + weight +
                '}';
    }
}
