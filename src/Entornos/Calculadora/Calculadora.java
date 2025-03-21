package Entornos.Calculadora;

public class Calculadora {
    private double numero1;
    private double numero2;

    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Métodos "getter" para obtener los valores
    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    // Opcional: Métodos "setter" en caso de que necesites cambiar los valores
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
}
