package Programacion.UD9.pooUD9CasoPractico2;

public class Test {
    public static void main(String[] args) {
        SmartPhone miPhone = new SmartPhone();
        miPhone.conectarWifi();
        if (miPhone.estaConectado()){
            System.out.println("Conectado");
        } else
            System.out.println("Desconectado");
        miPhone.desconectarWifi();
        miPhone.hacerLlamada("654876543");

    }
}
