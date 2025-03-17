package pooUD4CasoPractico1;

public class Main {
    public static void main(String[] args) {

        SerVivo x = new SerVivo((byte) 3);
        SerVivo y = new SerVivo((byte) 5);

        System.out.println(y.mayor(x));

        x = new Humano("Homero", (byte) 34);
        y = new Humano("Bart", (byte) 9);

        System.out.println(((Humano) x).mayor(((Humano) y)));
    }
}
