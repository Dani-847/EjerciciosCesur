package ejercicio3;

public class Cliente {
    private String nombre;
    private int numeroAlquileresPrevios;
    private Vehiculo[] vehiculosAlquilados;

    public Cliente(String nombre, int numeroAlquileresPrevios) {
        this.nombre = nombre;
        this.numeroAlquileresPrevios = numeroAlquileresPrevios;
        this.vehiculosAlquilados = new Vehiculo[10];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroAlquileresPrevios() {
        return numeroAlquileresPrevios;
    }

    public Vehiculo[] getVehiculosAlquilados() {
        return vehiculosAlquilados;
    }

    public void setNumeroAlquileresPrevios(int numeroAlquileresPrevios) {
        this.numeroAlquileresPrevios = numeroAlquileresPrevios;
    }

    public double calcularDescuentoCliente(){
        double descuento = 1;
        if(this.numeroAlquileresPrevios == 3 || this.numeroAlquileresPrevios == 4){
            descuento = 0.90;
        }else if(this.numeroAlquileresPrevios >= 5){
            descuento = 0.80;
        }
        return descuento;
    }

    public void agregarVehiculoAlquilado(Vehiculo vehiculo){
        boolean flag = false;
        int i = 0;
        while (i < vehiculosAlquilados.length && !flag) {
            if (vehiculosAlquilados[i] == null) {
                vehiculosAlquilados[i] = vehiculo;
                flag = true;
            }
            i++;
        }
    }

    public String toString() {
        return "Nombre: " + nombre + ", Número de alquileres previos: " + numeroAlquileresPrevios;
    }
}
