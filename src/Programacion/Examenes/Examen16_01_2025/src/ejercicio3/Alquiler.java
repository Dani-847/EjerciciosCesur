package Programacion.Examenes.Examen16_01_2025.src.ejercicio3;

import java.util.Arrays;

public class Alquiler {
    private Vehiculo[] vehiculos;
    private int cantidadVehiculos;

    public Alquiler(int cantidadVehiculos) {
        this.cantidadVehiculos = cantidadVehiculos;
        this.vehiculos = new Vehiculo[cantidadVehiculos];
    }

    public Vehiculo[] getVehiculos() {
        return vehiculos;
    }

    public int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public void setCantidadVehiculos(int cantidadVehiculos) {
        this.cantidadVehiculos = cantidadVehiculos;
    }

    public void agregarVehiculo(int posicion, Vehiculo vehiculo) {
        if (posicion >= 0 && posicion < vehiculos.length) {
            vehiculos[posicion] = vehiculo;
        }
    }

    public static void mostrarDetallesAlquiler(Cliente cliente, Vehiculo vehiculo, int dias) {
        double precio = vehiculo.calcularPrecioAlquiler(dias);
        double descuento = cliente.calcularDescuentoCliente();
        double precioFinal = precio * descuento;
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Vehículo: " + vehiculo.getMatricula() + " - " + vehiculo.getCategoria());
        System.out.println("Precio final por " + dias + " días: " + precioFinal);
    }

    public String toString() {
        return "Alquiler{" +
                "vehiculos=" + Arrays.toString(vehiculos) +
                ", cantidadVehiculos=" + cantidadVehiculos +
                '}';
    }
}
