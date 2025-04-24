package Examen.src;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LectorDeEmpleados extends JFrame{
    private JPanel panel1;
    private JButton btnCargarCSV;
    private JTextPane tpArchivo;
    private JLabel lbSueldoMedio;
    private JLabel lbSueldoMaximo;
    private JComboBox<String> cbDepartamento;
    Empleado[] empleados;
    private int numEmpleados;

    public LectorDeEmpleados() {
        setTitle("Gestor de Empleados");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setContentPane(panel1);
        setLocationRelativeTo(null);
        numEmpleados = 0;
        btnCargarCSV.addActionListener(e -> cargarArchivoCSV());

        cbDepartamento.addActionListener(e -> filtrarPorDepartamento());

    }

    private void cargarArchivoCSV() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            if (archivo.exists()) {
                BufferedReader br = null;
                try {
                    br = new BufferedReader(new FileReader(archivo));
                    String linea = br.readLine();
                    cbDepartamento.removeAllItems();
                    empleados = new Empleado[100];
                    cbDepartamento.addItem("Todos");

                    StringBuilder resultado = new StringBuilder();
                    while (linea != null) {
                        String[] datos = linea.split(",");
                        if (datos.length == 3) {
                            Empleado empleado = new Empleado(datos[0], Double.parseDouble(datos[1]), datos[2]);
                            empleados[numEmpleados] = empleado;
                            numEmpleados++;
                            resultado.append(empleado).append("\n");

                            if (((DefaultComboBoxModel<String>) cbDepartamento.getModel()).getIndexOf(datos[2]) == -1) {
                                cbDepartamento.addItem(datos[2]);
                            }
                            resultado.append(empleado).append("\n");
                        }
                        linea = br.readLine();
                    }
                    tpArchivo.setText(resultado.toString());
                    calcularEstadisticas();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(panel1, "Error al leer el archivo");
                } finally {
                    try {
                        if (br != null) br.close();
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(panel1, "Error al cerrar el archivo");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(panel1, "Archivo no encontrado");
            }
        }
    }

    private void filtrarPorDepartamento() {
        String departamentoSeleccionado = (String) cbDepartamento.getSelectedItem();
        if (departamentoSeleccionado != null) {
            StringBuilder sb = new StringBuilder();
            int empleadosFiltrados = 0;
            double sumaSueldos = 0.0;
            Empleado sueldoMasAlto = null;

            for (Empleado empleado : empleados) {
                if (empleado != null &&
                        (departamentoSeleccionado.equals("Todos") || empleado.getDepartamento().equals(departamentoSeleccionado))) {
                    sb.append(empleado).append("\n");
                    empleadosFiltrados++;
                    sumaSueldos += empleado.getSueldo();
                    if (sueldoMasAlto == null || empleado.getSueldo() > sueldoMasAlto.getSueldo()) {
                        sueldoMasAlto = empleado;
                    }
                }
            }

            tpArchivo.setText(sb.toString());

            // Actualizar estadísticas
            if (empleadosFiltrados > 0) {
                double sueldoPromedio = sumaSueldos / empleadosFiltrados;
                lbSueldoMedio.setText("Sueldo medio: " + String.format("%.2f", sueldoPromedio) + "€");

                if (sueldoMasAlto != null) {
                    lbSueldoMaximo.setText("Sueldo máximo: " + sueldoMasAlto.getNombre() + " (" + sueldoMasAlto.getSueldo() + "€)");
                }
            } else {
                lbSueldoMedio.setText("Sueldo medio: -€");
                lbSueldoMaximo.setText("Sueldo máximo: -");
            }
        }
    }

    private void calcularEstadisticas() {
        if (numEmpleados > 0) {
            double sumaSueldos = 0.0;
            Empleado sueldoMasAlto = null; // empleado con el sueldo más alto

            for (int i = 0; i < numEmpleados; i++) {
                Empleado empleado = empleados[i];
                if (empleado != null) { // Verificar que el empleado no sea null
                    sumaSueldos += empleado.getSueldo();
                    if (sueldoMasAlto == null || empleado.getSueldo() > sueldoMasAlto.getSueldo()) {
                        sueldoMasAlto = empleado;
                    }
                }
            }

            double sueldoPromedio = sumaSueldos / numEmpleados;
            lbSueldoMedio.setText("Sueldo medio: " + String.format("%.2f", sueldoPromedio) + "€");

            if (sueldoMasAlto != null) {
                lbSueldoMaximo.setText("Sueldo máximo: " + sueldoMasAlto.getNombre() + " (" + sueldoMasAlto.getSueldo() + "€)");
            }
        } else {
            lbSueldoMedio.setText("Sueldo medio: -€");
            lbSueldoMaximo.setText("Sueldo máximo: -");
        }
    }


}
