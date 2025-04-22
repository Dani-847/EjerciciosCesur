package Programacion.UD9.pooUD9CasoPractico2;

public abstract class Dispositivo implements Conectable{
    String modelo;
    String marca;
    boolean conectado;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    @Override
    public String toString() {
        return "Dispositivo{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", conectado=" + conectado +
                '}';
    }

    public void mostrarInfo(){
        System.out.println(this);
    }

    @Override
    public void conectarWifi() {
        conectado = true;
    }

    @Override
    public void desconectarWifi() {
        conectado = false;
    }

    @Override
    public boolean estaConectado() {
        return conectado;
    }
}
