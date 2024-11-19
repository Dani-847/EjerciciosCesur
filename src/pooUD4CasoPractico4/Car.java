package pooUD4CasoPractico4;

public class Car {
    private int speed;
    private double regularPrice;
    private String color;
    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }
    public double getSalePrice() {
        return regularPrice;
    }
}
