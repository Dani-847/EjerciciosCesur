package Programacion.UD9.pooUD9CasoPractico2;

public abstract class Dispositivo implements Conectable {
    private String modelo;
    private String marca;
    private boolean conectado;

    public Dispositivo(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
        this.conectado = false;
    }

    @Override
    public void conectarWifi() {
        if (!conectado) {
            conectado = true;
            System.out.println("El dispositivo se ha conectado a la red WiFi.");
        } else {
            System.out.println("El dispositivo ya está conectado.");
        }
    }

    @Override
    public void desconectarWifi() {
        if (conectado) {
            conectado = false;
            System.out.println("El dispositivo se ha desconectado de la red WiFi.");
        } else {
            System.out.println("El dispositivo ya está desconectado.");
        }
    }

    @Override
    public boolean estaConectado() {
        return conectado;
    }

    public void mostrarInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Estado de conexión: " + (conectado ? "Conectado" : "Desconectado"));
    }
}