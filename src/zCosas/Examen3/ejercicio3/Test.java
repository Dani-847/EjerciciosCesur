package ejercicio3;

public class Test {
    public static void main(String[] args) {
        Alquiler alquiler = new Alquiler(3);

        Cliente cliente1 = new Cliente("Juan Pérez", 5);
        Cliente cliente2 = new Cliente("Ana López", 2);

        Vehiculo vehiculo1 = new Vehiculo("ABC123", CategoriaVehiculo.ELECTRICO, 50.0);
        Vehiculo vehiculo2 = new Vehiculo("XYZ456", CategoriaVehiculo.SUV, 80.0);
        Vehiculo vehiculo3 = new Vehiculo("LMN789", CategoriaVehiculo.SEDAN, 60.0);

        alquiler.agregarVehiculo(0, vehiculo1);
        alquiler.agregarVehiculo(1, vehiculo2);
        alquiler.agregarVehiculo(2, vehiculo3);

        cliente1.agregarVehiculoAlquilado(vehiculo1);
        cliente1.agregarVehiculoAlquilado(vehiculo2);

        cliente2.agregarVehiculoAlquilado(vehiculo3);

        alquiler.mostrarDetallesAlquiler(cliente1, vehiculo1, 3);
        alquiler.mostrarDetallesAlquiler(cliente2, vehiculo3, 2);
    }
}

