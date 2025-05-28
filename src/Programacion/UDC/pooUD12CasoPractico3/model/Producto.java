package Programacion.UDC.pooUD12CasoPractico3.model;

public abstract class Producto implements Vendible, Comparable<Producto> {
    private String codigo;
    private String nombre;
    private String tipo;
    private double precio;

    public Producto(String codigo, String nombre, String tipo, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public abstract String getTipo();

    @Override
    public String toString() {
        return  ", codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + String.format("%.2f€",precio);
    }

    @Override
    public int compareTo(Producto o) {
        return this.getCodigo().compareTo(o.getCodigo());
    }
}
