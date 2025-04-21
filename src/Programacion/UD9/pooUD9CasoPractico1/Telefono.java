public abstract class Telefono {
    private String numero;

    public Telefono(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void llamarANumero(String num){
        System.out.print("Llamando al teléfono "+num);
    }

    public void recibirLlamada(String num){
        System.out.print("Recibiendo llamada del teléfono "+num);
    }
}
