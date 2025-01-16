package zCosas.marcos.src.Ejercicio3;


public class Productos {
    private String nombre;
    private CategoriaProductos categoria;
    private double precioUnirtario;

    public Productos(String nombre, CategoriaProductos categoria, double precioUnirtario) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precioUnirtario = precioUnirtario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CategoriaProductos getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProductos categoria) {
        this.categoria = categoria;
    }

    public double getPrecioUnirtario() {
        return precioUnirtario;
    }

    public void setPrecioUnirtario(double precioUnirtario) {
        this.precioUnirtario = precioUnirtario;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "nombre='" + nombre + '\'' +
                ", categoria=" + categoria +
                ", precioUnirtario=" + precioUnirtario +
                '}';
    }
    public void valorTotal(){

    }
}
