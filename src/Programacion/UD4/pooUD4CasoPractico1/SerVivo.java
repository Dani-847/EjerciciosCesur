package Programacion.UD4.pooUD4CasoPractico1;

public class SerVivo {
    private byte edad;
    public SerVivo(byte edad) {
        this.edad = edad;
    }
    public byte getEdad() {
        return edad;
    }
    public void setEdad(byte edad) {
        this.edad = edad;
    }
    public boolean equals(SerVivo otro) {
        return this.edad == otro.edad;
    }

    @Override
    public String toString() {
        return "Edad: " + this.edad;
    }

    public SerVivo mayor(SerVivo otro) {
        return this.edad > otro.edad ? this : otro;
    }

}
