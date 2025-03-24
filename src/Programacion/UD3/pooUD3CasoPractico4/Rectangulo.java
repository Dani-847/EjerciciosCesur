package Programacion.UD3.pooUD3CasoPractico4;

public class Rectangulo {
    private double ancho = 0;
    private double alto = 0;
    public Rectangulo(double ancho, double alto){
        if (alto >= 0)
            this.alto = alto;
        if (ancho >= 0)
            this.ancho = ancho;
    }
    public double getAncho() {return ancho;}
    public void setAncho(double ancho) {this.ancho = ancho;}
    public double getAlto() {return alto;}
    public void setAlto(double alto) {this.alto = alto;}
    public double calcularArea(){return alto*ancho;}
    public double calcularPerimetro(){return (alto+ancho)*2;}

}
