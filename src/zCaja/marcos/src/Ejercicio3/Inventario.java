package Ejercicio3;

import java.util.Arrays;

public class Inventario {
    String[] productos = new String[0];
    String [] lotes = new String[0];
    private static double COSTO_OPERATIVO;

    public Inventario(String[] productos, String[] lotes) {
        this.productos = productos;
        this.lotes = lotes;
    }

    public Inventario(int i, int i1) {
    }

    public String[] getProductos() {
        return productos;
    }

    public void setProductos(String[] productos) {
        this.productos = productos;
    }

    public String[] getLotes() {
        return lotes;
    }

    public void setLotes(String[] lotes) {
        this.lotes = lotes;
    }

    public static double getCostoOperativo() {
        return COSTO_OPERATIVO;
    }

    public static void setCostoOperativo(double costoOperativo) {
        COSTO_OPERATIVO = costoOperativo;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "productos=" + Arrays.toString(productos) +
                ", lotes=" + Arrays.toString(lotes) +
                '}';
    }

    public void agregarProducto(int i, Productos producto1) {
    }

    public void agregarLote(int i, Lote lote1) {
    }

    public void mostrarInventario() {
    }
}

