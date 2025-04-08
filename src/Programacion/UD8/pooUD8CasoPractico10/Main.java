package Programacion.UD8.pooUD8CasoPractico10;

import Programacion.UD8.pooUD8CasoPractico9.Calculadora;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ListaDeContactos listaDeContactos = new ListaDeContactos();
            listaDeContactos.setVisible(true);
        });
    }
}
