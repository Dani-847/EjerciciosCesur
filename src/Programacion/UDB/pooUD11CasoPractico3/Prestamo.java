package Programacion.UDB.pooUD11CasoPractico3;

import java.time.LocalDate;

public class Prestamo {
    private String dni;
    private String codigo;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Prestamo(String dni, String codigo) {
        this.dni = dni;
        this.codigo = codigo;
        fechaPrestamo = LocalDate.now();
        fechaDevolucion = fechaPrestamo.plusDays(14);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
        fechaDevolucion = this.fechaPrestamo.plusDays(14);
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "dni='" + dni + '\'' +
                ", codigo='" + codigo + '\'' +
                ", fechaPrestamo=" + fechaPrestamo +
                ", fechaDevolucion=" + fechaDevolucion +
                '}';
    }
}
