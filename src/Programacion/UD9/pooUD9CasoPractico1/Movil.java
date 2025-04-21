package Programacion.UD9.pooUD9CasoPractico1;

public class Movil extends TelefonoFijo{
    private String operador;

    public Movil(String numero, String marca, String modelo, String operador) {
        super(numero, marca, modelo);
        this.operador = operador;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    @Override
    public void llamarANumero(String num) {
        super.llamarANumero(num);
        System.out.println(" con el operador "+operador);
    }
}
