package Programacion.UD8.pooUD8CasoPractico9;

import Programacion.UD8.pooUD8CasoPractico8.Editor;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculadora calculadora = new Calculadora();
            calculadora.setVisible(true);
        });
    }
}
