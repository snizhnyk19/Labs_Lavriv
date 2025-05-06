package Lab9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioactiveDecayCalculator  {
    public static void main(String[] args) {
        // Створення вікна
        JFrame frame = new JFrame("Розпад радіоактивних ядер");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Поля для вводу
        JLabel lambdaLabel = new JLabel("Стала розпаду λ:");
        lambdaLabel.setBounds(20, 20, 150, 30);
        frame.add(lambdaLabel);

        JTextField lambdaField = new JTextField();
        lambdaField.setBounds(180, 20, 180, 30);
        frame.add(lambdaField);

        JLabel timeLabel = new JLabel("Час t (с):");
        timeLabel.setBounds(20, 70, 150, 30);
        frame.add(timeLabel);

        JTextField timeField = new JTextField();
        timeField.setBounds(180, 70, 180, 30);
        frame.add(timeField);

        JLabel initialLabel = new JLabel("Початкова к-сть ядер N₀:");
        initialLabel.setBounds(20, 120, 160, 30);
        frame.add(initialLabel);

        JTextField initialField = new JTextField();
        initialField.setBounds(180, 120, 180, 30);
        frame.add(initialField);

        JButton calculateButton = new JButton("Розрахувати");
        calculateButton.setBounds(120, 170, 150, 30);
        frame.add(calculateButton);

        JLabel resultLabel = new JLabel("К-сть розп. ядер Nₚ:");
        resultLabel.setBounds(20, 220, 350, 30);
        frame.add(resultLabel);

        // Обробка кнопки
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double lambda = Double.parseDouble(lambdaField.getText());
                    double time = Double.parseDouble(timeField.getText());
                    double N0 = Double.parseDouble(initialField.getText());

                    double decayed = N0 * (1 - Math.exp(-lambda * time));

                    resultLabel.setText("К-сть розп. ядер Nₚ: " + decayed);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Помилка: перевірте введені дані!");
                }
            }
        });

        frame.setVisible(true);
    }
}