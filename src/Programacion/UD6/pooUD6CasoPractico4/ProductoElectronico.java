package Programacion.UD6.pooUD6CasoPractico4;

import java.util.Arrays;

public class ProductoElectronico extends Producto{
    private int garantia;

    public ProductoElectronico(String nombre, double precio, int garantia) {
        super(nombre, precio);
        this.garantia = garantia;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public void mostrarDetalles(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio actual: " + obtenerPrecioActual());
        System.out.println("Historial: " + Arrays.toString(super.obtenerPreciosHistoricos()));
    }

    @Override
    public String toString() {
        return super.toString() + "Garantía: " + garantia + " meses\n";
    }
}
