package Programacion.UD8.pooUD8CasoPractico9;

import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {
    private JTextField textField1;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton buttonDiv;
    private JButton buttonX;
    private JButton buttonMinus;
    private JButton buttonPlus;
    private JButton button6;
    private JButton button3;
    private JButton buttonEqual;
    private JButton button5;
    private JButton button2;
    private JButton button0;
    private JButton button4;
    private JButton button1;
    private JButton buttonC;
    private JPanel panel1;

    private double num1 = 0;
    private String operator = "";

    public Calculadora() {
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 550);
        setLocationRelativeTo(null);
        setContentPane(panel1);
        textField1.setEditable(true);

        button0.setPreferredSize(new Dimension(100, 100));
        button1.setPreferredSize(new Dimension(100, 100));
        button2.setPreferredSize(new Dimension(100, 100));
        button3.setPreferredSize(new Dimension(100, 100));
        button4.setPreferredSize(new Dimension(100, 100));
        button5.setPreferredSize(new Dimension(100, 100));
        button6.setPreferredSize(new Dimension(100, 100));
        button7.setPreferredSize(new Dimension(100, 100));
        button8.setPreferredSize(new Dimension(100, 100));
        button9.setPreferredSize(new Dimension(100, 100));
        buttonEqual.setPreferredSize(new Dimension(100, 100));
        buttonPlus.setPreferredSize(new Dimension(100, 100));
        buttonMinus.setPreferredSize(new Dimension(100, 100));
        buttonDiv.setPreferredSize(new Dimension(100, 100));
        buttonX.setPreferredSize(new Dimension(100, 100));
        buttonC.setPreferredSize(new Dimension(100, 100));




        addNumberActionListeners();
        addOperatorActionListeners();
        addEqualActionListener();
        addClearActionListener();
        addTextFieldKeyListener();
    }

    private void addNumberActionListeners() {
        ActionListener numberListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton source = (JButton) e.getSource();
                textField1.setText(textField1.getText() + source.getText());
            }
        };

        button0.addActionListener(numberListener);
        button1.addActionListener(numberListener);
        button2.addActionListener(numberListener);
        button3.addActionListener(numberListener);
        button4.addActionListener(numberListener);
        button5.addActionListener(numberListener);
        button6.addActionListener(numberListener);
        button7.addActionListener(numberListener);
        button8.addActionListener(numberListener);
        button9.addActionListener(numberListener);
    }

    private void addOperatorActionListeners() {
        ActionListener operatorListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton source = (JButton) e.getSource();
                num1 = Double.parseDouble(textField1.getText());
                operator = source.getText();
                textField1.setText("");
            }
        };

        buttonPlus.addActionListener(operatorListener);
        buttonMinus.addActionListener(operatorListener);
        buttonX.addActionListener(operatorListener);
        buttonDiv.addActionListener(operatorListener);
    }

    private void addEqualActionListener() {
        buttonEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num2 = Double.parseDouble(textField1.getText());
                double result = 0;

                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        result = num1 / num2;
                        break;
                }

                textField1.setText(String.valueOf(result));
            }
        });
    }

    private void addClearActionListener() {
        buttonC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                num1 = 0;
                operator = "";
            }
        });
    }

    private void addTextFieldKeyListener() {
        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String expression = textField1.getText();
                    double result = eval(expression);
                    textField1.setText(String.valueOf(result));
                } catch (Exception ex) {
                    textField1.setText("Error");
                }
            }
        });
    }

    private double eval(String expression) throws ScriptException {
        // Avaliar a expressão matemática
        // Esta é uma implementação simples e pode ser melhorada
        return (double) new ScriptEngineManager().getEngineByName("JavaScript").eval(expression);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
}