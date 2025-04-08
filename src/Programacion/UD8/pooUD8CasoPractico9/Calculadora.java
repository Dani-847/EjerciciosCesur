package Programacion.UD8.pooUD8CasoPractico9;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame{
    private JPanel panel1;
    private JTextField tfResult;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnDividir;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btnMultiplicar;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btnRestar;
    private JButton btnReset;
    private JButton btn0;
    private JButton btnIgual;
    private JButton btnSumar;
    private double num1;
    private char operador;

    public Calculadora(){
        setTitle("Calculadora simple");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);
        setSize(350,420);
        setResizable(false);
        btn0.addActionListener(this::acciones);
        btn1.addActionListener(this::acciones);
        btn2.addActionListener(this::acciones);
        btn3.addActionListener(this::acciones);
        btn4.addActionListener(this::acciones);
        btn5.addActionListener(this::acciones);
        btn6.addActionListener(this::acciones);
        btn7.addActionListener(this::acciones);
        btn8.addActionListener(this::acciones);
        btn9.addActionListener(this::acciones);
        btnReset.addActionListener(this::acciones);
        btnSumar.addActionListener(this::acciones);
        btnRestar.addActionListener(this::acciones);
        btnMultiplicar.addActionListener(this::acciones);
        btnDividir.addActionListener(this::acciones);
        btnIgual.addActionListener(this::acciones);
    }

    private void acciones(ActionEvent e) {
        double num2;
        switch (e.getActionCommand()) {
            case "0" -> tfResult.setText(tfResult.getText()+"0");
            case "1" -> tfResult.setText(tfResult.getText()+"1");
            case "2" -> tfResult.setText(tfResult.getText()+"2");
            case "3" -> tfResult.setText(tfResult.getText()+"3");
            case "4" -> tfResult.setText(tfResult.getText()+"4");
            case "5" -> tfResult.setText(tfResult.getText()+"5");
            case "6" -> tfResult.setText(tfResult.getText()+"6");
            case "7" -> tfResult.setText(tfResult.getText()+"7");
            case "8" -> tfResult.setText(tfResult.getText()+"8");
            case "9" -> tfResult.setText(tfResult.getText()+"9");
            case "+" -> {
                    num1 = Double.parseDouble(tfResult.getText());
                    operador = '+';
                    tfResult.setText("");
            }
            case "-" -> {
                num1 = Double.parseDouble(tfResult.getText());
                operador = '-';
                tfResult.setText("");
            }
            case "*" -> {
                num1 = Double.parseDouble(tfResult.getText());
                operador = '*';
                tfResult.setText("");
            }
            case "/" -> {
                num1 = Double.parseDouble(tfResult.getText());
                operador = '/';
                tfResult.setText("");
            }
            case "C" -> {
                tfResult.setText("");
                operador = 'C';
                num1 = 0;
            }
            case "=" -> {
                double resultado=0;
                num2 = Double.parseDouble(tfResult.getText());
                switch (operador) {
                    case '+' -> resultado = num1 + num2;
                    case '-' -> resultado = num1 - num2;
                    case '*' -> resultado = num1 * num2;
                    case '/' -> resultado = num1 / num2;
                }
                tfResult.setText(String.valueOf(resultado));
            }
        }
    }
}
