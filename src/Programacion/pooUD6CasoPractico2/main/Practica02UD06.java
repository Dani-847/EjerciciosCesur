package practica02ud06.main;

import practica02ud06.garaje.Garaje;
import practica02ud06.vehiculos.Coche;
import practica02ud06.vehiculos.Moto;

public class Practica02UD06 {
    public static void main(String[] args) {
        Garaje miGaraje = new Garaje(50,3);
        Coche c1 = new Coche(4,"Ford",45362,"Blanco","2345GHF",4,true);
        Coche c2 = new Coche(4,"Renault",5636,"Amarillo","7654MHG",5,false);
        Moto m1 = new Moto(2,"BMW",2345,"Azul","9876KLM",2.5);
        Moto m2 = new Moto(2,"Honda",7363,"Gris","8761JJL",5);

        miGaraje.introducirVehiculo(c1);
        miGaraje.introducirVehiculo(c2);
        miGaraje.introducirVehiculo(m1);
        miGaraje.introducirVehiculo(m2);
        System.out.println(miGaraje);
        miGaraje.retirarVehiculo("2345GHF");
        System.out.println(miGaraje);
        miGaraje.introducirVehiculo(m2);
        System.out.println(miGaraje);
        System.out.printf("Precio de cambiar las ruedas: %.2f€%n",miGaraje.precioRuedas());
        System.out.printf("Kilometraje medio: %.2f%n kilómetros",miGaraje.kilometrajeMedio());
    }
}
