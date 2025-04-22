package Programacion.UD9.pooUD9CasoPractico3.criaturas;

public abstract class Criatura {
    private final int vidaMaxima;
    private int vidaActual;
    private final int fuerza;
    private final String nombre;

    public Criatura(String nombre, int vidaMaxima, int fuerza) {
        this.nombre = nombre;
        this.vidaMaxima = vidaMaxima;
        this.vidaActual = vidaMaxima;
        this.fuerza = fuerza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getVidaActual() {
        return vidaActual;
    }

    public void setVidaActual(int vidaActual) {
        this.vidaActual = Math.min(vidaActual, vidaMaxima);
    }

public void luchar(Criatura oponente) {
    boolean puedeLuchar = true;

    if (this.vidaActual <= 0) {
        System.out.println(this.nombre + " está muerto y no puede luchar.");
        puedeLuchar = false;
    } else if (oponente.getVidaActual() <= 0) {
        System.out.println(oponente.nombre + " está muerto y no puede ser atacado.");
        puedeLuchar = false;
    }

    if (puedeLuchar) {
        int golpe = (int) (Math.random() * this.fuerza) + 1;
        System.out.println(this.nombre + " ataca a " + oponente.nombre + " con fuerza " + this.fuerza + " y hace " + golpe + " de daño.");
        oponente.setVidaActual(oponente.getVidaActual() - golpe);

        if (oponente.getVidaActual() <= 0) {
            System.out.println(oponente.nombre + " ha muerto.");
        }
    }
}

    public void recuperar() {
        int cantidadRecuperada = (int) (Math.random() * (vidaMaxima)) + 1;
        if (this.vidaActual + cantidadRecuperada > vidaMaxima) {
            cantidadRecuperada = vidaMaxima - this.vidaActual;
        }
        setVidaActual(this.vidaActual + cantidadRecuperada);
        System.out.println(this.nombre + " ha recuperado " + cantidadRecuperada + " puntos de vida.");
    }

    public void descansar() {
        this.vidaActual = vidaMaxima;
        System.out.println(this.nombre + " ha descansado y recuperado toda su vida.");
    }

    @Override
    public String toString() {
        return "Criatura: " + nombre + " | Vida: " + vidaActual + "/" + vidaMaxima + " | Fuerza: " + fuerza;
    }
}