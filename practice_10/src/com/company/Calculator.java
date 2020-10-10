package com.company;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    JLabel labelA = new JLabel("Значение A");
    JLabel labelB = new JLabel("Значение B");
    JLabel labelResult = new JLabel("Результат: ");
    JTextField fieldA = new JTextField();
    JTextField fieldB = new JTextField();
    JButton addition = new JButton("+");
    JButton subtraction = new JButton("-");
    JButton division = new JButton("/");
    JButton multiplication = new JButton("*");
    JPanel panel = new JPanel();
    JPanel panelDop = new JPanel();

    public Calculator() {
        setTitle("Calculator");
        setSize(350, 350);

        labelA.setHorizontalAlignment(JLabel.CENTER);
        labelB.setHorizontalAlignment(JLabel.CENTER);
        labelA.setFont(new Font("Calibri", Font.ITALIC, 20));
        labelB.setFont(new Font("Calibri", Font.ITALIC, 20));
        labelResult.setFont(new Font("Calibri", Font.BOLD, 18));

        fieldA.setFont(new Font("Calibri", Font.ITALIC, 20));
        fieldA.addCaretListener(action -> {
            try {
                double value = Double.parseDouble(fieldA.getText());
                labelA.setText("Значение А");
            } catch (Exception ex) {
                labelA.setText(ex.getMessage());
            }
        });

        fieldB.setFont(new Font("Calibri", Font.ITALIC, 20));
        fieldB.addCaretListener(action -> {
            try {
                double value = Double.parseDouble(fieldB.getText());
                labelB.setText("Значение B");
            } catch (Exception ex) {
                labelB.setText(ex.getMessage());
            }
        });

        addition.setFont(new Font("", Font.BOLD, 22));
        addition.setPreferredSize(new Dimension(60,40));
        addition.addActionListener(action -> {
            try {
                labelResult.setText("Результат: " +
                        String.format("%.4f", Double.parseDouble(fieldA.getText()) +
                                Double.parseDouble(fieldB.getText())));
            }
            catch (Exception ex) {
                labelResult.setText("Результат: ошибка ввода!");
            }
        });

        subtraction.setFont(new Font("", Font.BOLD, 22));
        subtraction.setPreferredSize(new Dimension(60,40));
        subtraction.addActionListener(action -> {
            try {
                labelResult.setText("Результат: " +
                        String.format("%.4f", Double.parseDouble(fieldA.getText()) -
                                Double.parseDouble(fieldB.getText())));
            }
            catch (Exception ex) {
                labelResult.setText("Результат: ошибка ввода!");
            }
        });

        division.setFont(new Font("", Font.BOLD, 22));
        division.setPreferredSize(new Dimension(60,40));
        division.addActionListener(action -> {
            try {
                labelResult.setText("Результат: " +
                        String.format("%.4f", Double.parseDouble(fieldA.getText()) /
                                Double.parseDouble(fieldB.getText())));
            }
            catch (Exception ex) {
                labelResult.setText("Результат: ошибка ввода!");
            }
        });

        multiplication.setFont(new Font("", Font.BOLD, 22));
        multiplication.setPreferredSize(new Dimension(60,40));
        multiplication.addActionListener(action -> {
            try {
                labelResult.setText("Результат: " +
                        String.format("%.4f", Double.parseDouble(fieldA.getText()) *
                                Double.parseDouble(fieldB.getText())));
            }
            catch (Exception ex) {
                labelResult.setText("Результат: ошибка ввода!");
            }
        });

        panelDop.add(addition);
        panelDop.add(subtraction);
        panelDop.add(division);
        panelDop.add(multiplication);

        panel.setLayout(new GridLayout(6, 1));
        panel.add(labelA);
        panel.add(fieldA);
        panel.add(panelDop);
        panel.add(labelB);
        panel.add(fieldB);
        panel.add(labelResult);
        add(panel);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}