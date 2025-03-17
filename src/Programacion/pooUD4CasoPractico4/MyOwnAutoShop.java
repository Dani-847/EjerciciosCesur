package pooUD4CasoPractico4;

public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(100, 10000, "Red", 22);
        Ford ford1 = new Ford(120, 15000, "Blue", 2010, 5000);
        Ford ford2 = new Ford(130, 20000, "Green", 2011, 6000);
        Car car = new Car(140, 25000, "Black");
        Truck truck = new Truck(150, 30000, "White", 2500);
        System.out.println("Sedan sale price: " + sedan.getSalePrice());
        System.out.println("Ford1 sale price: " + ford1.getSalePrice());
        System.out.println("Ford2 sale price: " + ford2.getSalePrice());
        System.out.println("Car sale price: " + car.getSalePrice());
        System.out.println("Truck sale price: " + truck.getSalePrice());
        System.out.println(sedan);
        System.out.println(ford1);
        System.out.println(ford2);
        System.out.println(car);
        System.out.println(truck);
    }
}
