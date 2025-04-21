package Programacion.UD9.pooUD9CasoPractico2;

public class SmartTV extends Dispositivo {

    public SmartTV(String modelo, String marca) {
        super(modelo, marca);
    }

    public void reproducirVideo(String video) {
        System.out.println("Reproduciendo el video: " + video);
    }
}