package Programacion.Examenes.ExamenMarco;

import javax.swing.*;
import java.io.*;

public class LectorDeProductos extends JFrame {
    private JPanel panel1;
    private JButton btnCargar;
    private JTextPane tpArchivo;
    private JComboBox<String> comboBox1;
    private JLabel precioMedio;
    private JLabel productoMasCaro;

    private Producto[] productos = new Producto[100];
    private int contadorProductos = 0;

    public LectorDeProductos() {
        setTitle("Lector de Productos - CSV");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setContentPane(panel1);
        setLocationRelativeTo(null);

        btnCargar.addActionListener(e -> cargarArchivoCSV());

        comboBox1.addActionListener(e -> filtrarPorCategoria());
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
                    contadorProductos = 0;
                    comboBox1.removeAllItems();
                    comboBox1.addItem("Todas");

                    StringBuilder resultado = new StringBuilder();
                    while (linea != null) {
                        String[] datos = linea.split(",");
                        if (datos.length == 3) {
                            if (contadorProductos < productos.length) {
                                Producto producto = new Producto(datos[0], Double.parseDouble(datos[1]), datos[2]);
                                productos[contadorProductos++] = producto;

                                if (((DefaultComboBoxModel<String>) comboBox1.getModel()).getIndexOf(datos[2]) == -1) {
                                    comboBox1.addItem(datos[2]);
                                }
                                resultado.append(producto).append("\n");
                            } else {
                                JOptionPane.showMessageDialog(panel1, "Se alcanzó el límite de productos.");
                                break;
                            }
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

    private void filtrarPorCategoria() {
        String categoriaSeleccionada = (String) comboBox1.getSelectedItem();
        if (categoriaSeleccionada != null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < contadorProductos; i++) {
                Producto producto = productos[i];
                if (categoriaSeleccionada.equals("Todas") || producto.getCategoria().equals(categoriaSeleccionada)) {
                    sb.append(producto).append("\n");
                }
            }
            tpArchivo.setText(sb.toString());
        }
    }

    private void calcularEstadisticas() {
        if (contadorProductos > 0) {
            double sumaPrecios = 0.0;
            Producto productoMasCaroObj = null;

            for (int i = 0; i < contadorProductos; i++) {
                Producto producto = productos[i];
                sumaPrecios += producto.getPrecio();
                if (productoMasCaroObj == null || producto.getPrecio() > productoMasCaroObj.getPrecio()) {
                    productoMasCaroObj = producto;
                }
            }

            double precioPromedio = sumaPrecios / contadorProductos;
            precioMedio.setText("Precio medio: " + String.format("%.2f", precioPromedio) + "€");

            if (productoMasCaroObj != null) {
                productoMasCaro.setText("Producto más caro: " + productoMasCaroObj.getNombre() + " (" + productoMasCaroObj.getPrecio() + "€)");
            }
        } else {
            precioMedio.setText("Precio medio: -€");
            productoMasCaro.setText("Producto más caro: -");
        }
    }
}