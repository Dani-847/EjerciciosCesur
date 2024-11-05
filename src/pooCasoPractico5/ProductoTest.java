package pooCasoPractico5;

import pooCasoPractico4.Rectangulo;

public class ProductoTest {
    public static void main(String[] args) {
        Producto p1 = new Producto("Pelota",4,320);
        Producto p2 = new Producto("Caja",12.5,60);


        p2.setCantidadEnStock(402);
        p2.reabastecer(18);
        p2.venderProducto(419);

        p1.venderProducto(300);

        System.out.println("Del producto "+p1.getNombre()+", con un valor de "+p1.getPrecio()+"€ por unidad, nos quedan en stock, "+p1.getCantidadEnStock()+" unidades.");
        System.out.println("Del producto "+p2.getNombre()+", con un valor de "+p2.getPrecio()+"€ por unidad, nos quedan en stock, "+p2.getCantidadEnStock()+" unidades.");
    }
}
