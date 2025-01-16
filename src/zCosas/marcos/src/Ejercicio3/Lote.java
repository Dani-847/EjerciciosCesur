package zCosas.marcos.src.Ejercicio3;

public class Lote {
    private int fechaLlegada;
    private int cantidad;
    private int producto;

    public Lote(int fechaLlegada, int cantidad, int producto) {
        this.fechaLlegada = fechaLlegada;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public Lote(String s, int cantidad, Productos producto1) {
    }

    public int getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(int fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Lote{" +
                "fechaLlegada=" + fechaLlegada +
                ", cantidad=" + cantidad +
                ", producto=" + producto +
                '}';
    }

    public void precioTotalLote(){

    }
}
