package practica02ud06.garaje;

import practica02ud06.vehiculos.Vehiculo;

import java.util.Arrays;

public class Garaje {
    private double precioRueda;
    private Vehiculo[] parking;

    public Garaje(double precioRueda, int capacidad) {
        this.precioRueda = precioRueda;
        parking = new Vehiculo[capacidad];
    }

    public double getPrecioRueda() {
        return precioRueda;
    }

    public void setPrecioRueda(double precioRueda) {
        this.precioRueda = precioRueda;
    }

    public Vehiculo[] getParking() {
        return parking;
    }

    public void setParking(Vehiculo[] parking) {
        this.parking = parking;
    }

    @Override
    public String toString() {
        return "Garaje{" +
                "precioRueda=" + precioRueda +
                ", parking=" + Arrays.toString(parking) +
                '}';
    }

    public void introducirVehiculo(Vehiculo vehiculo) {
        int indice=0;
        boolean encontrado=false;
        do{
            if (parking[indice]==null){
                parking[indice]=vehiculo;
                encontrado=true;
            } else
                indice++;
        } while (!encontrado && indice<parking.length);
        if (encontrado)
            System.out.println("Vehículo aparcado correctamente");
        else
            System.out.println("No se puede aparcar el vehículo");
    }

    public void retirarVehiculo(String matricula) {
        int indice=0;
        boolean encontrado=false;
        do{
            if (parking[indice]!=null && parking[indice].getMatricula().equalsIgnoreCase(matricula)){
                parking[indice]=null;
                encontrado=true;
            } else
                indice++;
        } while (!encontrado && indice<parking.length);
        if (encontrado)
            System.out.println("Vehículo retirado correctamente");
        else
            System.out.println("No se encuentra el vehículo");
    }

    public int numVehiculos(){
        int resultado=0;
        for(Vehiculo v: parking){
            if (v!=null)
                resultado++;
        }
 /*       for (int i=0; i<parking.length; i++){
            if (parking[i]!=null)
                resultado++;
        }*/
        return resultado;
    }

    public double precioRuedas(){
        double resultado=0;
        for(Vehiculo v: parking){
            if (v!=null)
                resultado+=v.getNumRuedas()*precioRueda;
            // if (v instanceof Coche)
        }
        return resultado;
    }

    public double kilometrajeMedio(){
        double resultado=0;
        int numVehiculos=0;
        for(Vehiculo v: parking){
            if (v!=null) {
                resultado += v.getKilometraje();
                numVehiculos++;
            }
        }
        return resultado/numVehiculos;
    }
}
