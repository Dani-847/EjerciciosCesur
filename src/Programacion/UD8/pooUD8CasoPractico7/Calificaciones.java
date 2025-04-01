package Programacion.UD8.pooUD8CasoPractico7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Calificaciones extends JFrame {
    private JPanel panel1;
    private JTextField tfCalificacion;
    private JLabel lblTexto;
    private JTextField tfNombre;
    private JButton btnAgregar;
    private JButton btnGuardar;
    private JButton btnCargar;
    private JTextArea txtHCalificaciones;

    private String[] nombres = new String[30];
    private double[] notas = new double[30];
    private int count = 0;

    public Calificaciones() {
        setTitle("Gestión de Calificaciones");
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setResizable(false);

        btnAgregar.addActionListener(e -> agregarNota());

        btnGuardar.addActionListener(e -> guardarNotas());

        btnCargar.addActionListener(e -> cargarNotas());
    }

    private void agregarNota() {
        String nombre = tfNombre.getText().trim();
        String calificacionStr = tfCalificacion.getText().trim();
        boolean updated = false;

        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            double calificacion = -1;

            try {
                calificacion = Double.parseDouble(calificacionStr);
                if (calificacion < 0 || calificacion > 10) {
                    throw new LimiteNota("La calificación debe estar entre 0 y 10.");
                }
            } catch (NumberFormatException | LimiteNota e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

            if (calificacion >= 0) {
                for (int i = 0; i < count; i++) {
                    if (nombres[i].equalsIgnoreCase(nombre)) {
                        int respuesta = JOptionPane.showConfirmDialog(this, "El estudiante ya existe. ¿Desea modificar la nota?", "Modificar Nota", JOptionPane.YES_NO_OPTION);
                        if (respuesta == JOptionPane.YES_OPTION) {
                            notas[i] = calificacion;
                            JOptionPane.showMessageDialog(this, "Nota modificada.");
                            updated = true;
                        }
                        break;
                    }
                }

                if (!updated && count < 30) {
                    nombres[count] = nombre;
                    notas[count++] = calificacion;
                    JOptionPane.showMessageDialog(this, "Nota agregada.");
                } else if (!updated) {
                    JOptionPane.showMessageDialog(this, "No se pueden agregar más estudiantes.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        actualizarTextoArea();
    }

    private void guardarNotas() {
        String message = "Notas guardadas en calificaciones.txt.";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/Programacion/UD8/pooUD8CasoPractico7/files/calificaciones.txt"))) {
            for (int i = 0; i < count; i++) {
                writer.write(nombres[i] + " - " + notas[i]);
                writer.newLine();
            }
        } catch (IOException e) {
            message = "Error al guardar las notas: " + e.getMessage();
            JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, message);
    }

    private void cargarNotas() {
        String readerPath = "src/Programacion/UD8/pooUD8CasoPractico7/files/calificaciones.txt";
        String message = "Notas cargadas desde calificaciones.txt.";
        try (BufferedReader reader = new BufferedReader(new FileReader(readerPath))) {
            String line;
            count = 0; // Reset count before loading
            txtHCalificaciones.setText(""); // Clear the text area

            while ((line = reader.readLine()) != null && count < 30) {
                String[] parts = line.split(" - ");
                if (parts.length == 2) {
                    nombres[count] = parts[0].trim();
                    notas[count++] = Double.parseDouble(parts[1].trim());
                }
            }
        } catch (FileNotFoundException e) {
            message = "El archivo calificaciones.txt no se encontró.";
            JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } catch (IOException e) {
            message = "Error al cargar las notas: " + e.getMessage();
            JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } catch (NumberFormatException e) {
            message = "Error en el formato de las notas en el archivo.";
            JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, message);
        actualizarTextoArea();
    }

    private void actualizarTextoArea() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(nombres[i]).append(" - ").append(notas[i]).append("\n");
        }
        txtHCalificaciones.setText(sb.toString());
    }

    public static class LimiteNota extends Exception {
        public LimiteNota(String mensaje) {
            super(mensaje);
        }
    }
}