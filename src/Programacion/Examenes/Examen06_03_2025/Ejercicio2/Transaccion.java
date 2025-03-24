package Programacion.Examen06_03_2025.Ejercicio2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaccion {
    private String tipo;
    private double cantidad;
    private LocalDateTime fechaHora;

    public Transaccion(String tipo, double cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.fechaHora = LocalDateTime.now();
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return fechaHora.format(formatter) + " - " + tipo + " de " + String.format("%.2f€", cantidad);
    }
}
