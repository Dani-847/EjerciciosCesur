package Programacion.UD4.pooUD4CasoPractico4;

public class Ford extends Car{
    private int year;
    private int manufacturerDiscount;
    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }
    public double getSalePrice() {
        return super.getSalePrice() - manufacturerDiscount;
    }
    @Override
    public String toString() {
        return super.toString() + "Ford{" +
                "year=" + year +
                ", manufacturerDiscount=" + manufacturerDiscount +
                '}';
    }
}
