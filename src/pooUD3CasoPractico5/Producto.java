package pooUD3CasoPractico5;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidadEnStock;
    public Producto (String nombre, double precio, int cantidadEnStock){
        this.nombre=nombre;
        this.precio=precio;
        this.cantidadEnStock=cantidadEnStock;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public double getPrecio() {return precio;}
    public void setPrecio(double precio) {this.precio = precio;}
    public int getCantidadEnStock() {return cantidadEnStock;}
    public void setCantidadEnStock(int cantidadEnStock) {this.cantidadEnStock = cantidadEnStock;}
    public void venderProducto(int cantidad){
        if (cantidadEnStock>=cantidad)
            cantidadEnStock-=cantidad;
    }
    public void reabastecer(int cantidad){
        cantidadEnStock+=cantidad;
    }
}
