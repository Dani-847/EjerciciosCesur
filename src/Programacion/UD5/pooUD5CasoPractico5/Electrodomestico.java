package Programacion.UD5.pooUD5CasoPractico5;

public class Electrodomestico {
    private double precioBase;
    private ColorElectrodomestico color;
    private char consumoEnergetico;
    private double peso;

    public Electrodomestico() {
        this.precioBase = 100;
        this.color = ColorElectrodomestico.BLANCO;
        this.consumoEnergetico = 'F';
        this.peso = 5;
    }
    public Electrodomestico (double precioBase, double peso) {
        this.precioBase = precioBase;
        this.color = ColorElectrodomestico.BLANCO;
        this.consumoEnergetico = 'F';
        this.peso = peso;
    }
    public Electrodomestico (double precioBase, ColorElectrodomestico color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }
    public double getPrecioBase() {
        return precioBase;
    }
    public ColorElectrodomestico getColor() {
        return color;
    }
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
    public double getPeso() {
        return peso;
    }
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    public void setColor(ColorElectrodomestico color) {
        this.color = comprobarColor(color);
    }
    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public char comprobarConsumoEnergetico(char letra) {
        char res;
        if (letra >= 'A' && letra <= 'F') {
            res = letra;
        } else {
            res = 'F';
        }
        return res;
    }
    public ColorElectrodomestico comprobarColor(ColorElectrodomestico color) {
        ColorElectrodomestico res;
        if (color == ColorElectrodomestico.AZUL || color == ColorElectrodomestico.BLANCO || color == ColorElectrodomestico.GRIS || color == ColorElectrodomestico.ROJO || color == ColorElectrodomestico.NEGRO) {
            res = color;
        } else {
            res = ColorElectrodomestico.BLANCO;
        }
        return res;
    }
    public double precioFinal(){
        double res = this.getPrecioBase();
        switch (this.getConsumoEnergetico()){
            case 'A' -> res+=100;
            case 'B' -> res+=100;
            case 'C' -> res+=100;
            case 'D' -> res+=100;
            case 'E' -> res+=100;
            case 'F' -> res+=100;
        }
        if (0 <= this.getPeso()&& this.getPeso() >= 19)
            res+=10;
        if (20 <= this.getPeso()&& this.getPeso() >= 49)
            res+=50;
        if (50 <= this.getPeso()&& this.getPeso() >= 79)
            res+=80;
        if (this.getPeso() >= 80)
            res+=100;
        return res;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase=" + precioBase +
                ", color=" + color +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}
