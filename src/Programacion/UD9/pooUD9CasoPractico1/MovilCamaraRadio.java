package Programacion.UD9.pooUD9CasoPractico1;

public class MovilCamaraRadio extends MovilCamara implements Radio{
    public MovilCamaraRadio(String numero, String marca, String modelo, String operador) {
        super(numero, marca, modelo, operador);
    }

    @Override
    public void escucharSintonia(String sintonia) {
        System.out.println("Escuchando la sintonía "+sintonia);
    }
}
