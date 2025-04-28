package Programacion.UD9.pooUD9CasoPractico3.criaturas;

import Programacion.UD9.pooUD9CasoPractico3.Colores;

public abstract class Criatura {
    private final int vidaMaxima;
    private int vidaActual;
    private final int fuerza;
    private final String nombre;
    private int probabilidadEsquivar = 30;
    private int probabilidadCritico = 30;
    private int multiplicadorCritico = 2;
    private int probabilidadRecuperar = 2;
    private String color;

    public Criatura(String nombre, int vidaMaxima, int fuerza, String color) {
        this.nombre = nombre;
        this.vidaMaxima = vidaMaxima;
        this.vidaActual = vidaMaxima;
        this.fuerza = fuerza;
        this.color = color;
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

    if (this.vidaActual < 0) {
        System.out.println(Colores.color(this.color,this.nombre) + " está muerto y no puede luchar.");
        puedeLuchar = false;
    } else if (oponente.getVidaActual() < 0) {
        System.out.println(Colores.color(oponente.color,oponente.nombre) + " está muerto y no puede ser atacado.");
        puedeLuchar = false;
    }

    if (puedeLuchar) {
        int critico = (int) (Math.random() * this.probabilidadCritico)+1;
        int esquivar = (int) (Math.random() * this.probabilidadEsquivar)+1;
        int recuperar = (int) (Math.random() * this.probabilidadRecuperar)+1;
        int golpe = (int) (Math.random() * this.fuerza) + 1;
        int KO = (int) (Math.random() * this.vidaMaxima*76) + 1;
        int esquivarGolpe = 0;
        if (critico == this.probabilidadCritico) {
            golpe *= this.multiplicadorCritico;
            System.out.print("Criatura: " + Colores.color(this.color,this.nombre) + " -> " + Colores.color(oponente.color,oponente.nombre) + " [ " + golpe + " ]" + " " + Colores.color(Colores.DARK_RED,"¡CRITICO!"));
        } else if (esquivar == this.probabilidadEsquivar) {
            System.out.print("Criatura: " + Colores.color(this.color,this.nombre) + " -> " + Colores.color(oponente.color,oponente.nombre) + " [ " + 0 + " ]" + " " + Colores.color(Colores.LIGHT_GREEN,"¡ESQUIVA!"));
            esquivarGolpe = 1;
        } else if (KO == this.vidaMaxima*76) {
            System.out.print("Criatura: " + Colores.color(this.color,this.nombre) + " -> " + Colores.color(oponente.color,oponente.nombre) + " [ " + golpe + " ]" + " " + Colores.color(Colores.DARK_PURPLE,"¡KO!"));
            oponente.setVidaActual(0);
        } else {
            System.out.print("Criatura: " + Colores.color(this.color,this.nombre) + " -> " + Colores.color(oponente.color,oponente.nombre) + " [ " + golpe + " ]");
        }

        if (esquivarGolpe == 0) {
            oponente.setVidaActual(oponente.getVidaActual() - golpe);
        }

        if (oponente.getVidaActual() < 0) {
            System.out.println(Colores.color(oponente.color,oponente.nombre) + " ha muerto.");
        }

        if (recuperar == this.probabilidadRecuperar) {
            recuperar();
        } else {
            System.out.println();
        }
    }
}

    public void recuperar() {
        int cantidadRecuperada = (int) (Math.random() * ((vidaMaxima)) + 1)/2;

        if (cantidadRecuperada != 0) {
            if (this.vidaActual + cantidadRecuperada > vidaMaxima) {
                cantidadRecuperada = vidaMaxima - this.vidaActual;
            }
            setVidaActual(this.vidaActual + cantidadRecuperada);
            System.out.println(" " + Colores.color(this.color,this.nombre) + " " + Colores.color(Colores.LIGHT_GREEN,"HP")+ " +[ " + Colores.color(Colores.LIGHT_GREEN, String.valueOf(cantidadRecuperada)) + " ]");
        }
    }

    public void descansar() {
        this.vidaActual = vidaMaxima;
        System.out.println(Colores.color(this.color,this.nombre) + " ha descansado y recuperado toda su vida.");
    }

    @Override
    public String toString() {
        return "Criatura: " + nombre + " | Vida: " + vidaActual + "/" + vidaMaxima + " | Fuerza: " + fuerza;
    }
}