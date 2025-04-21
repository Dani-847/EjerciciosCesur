public class MovilCamara extends Movil implements Camara{
    public MovilCamara(String numero, String marca, String modelo, String operador) {
        super(numero, marca, modelo, operador);
    }

    @Override
    public void realizarFoto(String resolucion) {
        System.out.println("Realizando foto con una resolución de "+resolucion);
    }
}
