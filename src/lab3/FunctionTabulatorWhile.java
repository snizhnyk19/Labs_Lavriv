package lab3;

import java.util.Scanner; // Імпортуємо клас Scanner для зчитування даних з клавіатури

public class FunctionTabulatorWhile {
    // Змінні для зберігання початку, кінця, кроку табуляції та меж діапазону
    private final double start;
    private final double end;
    private final double step;
    private final double lowerBound;
    private final double upperBound;

    // Конструктор класу, який приймає об'єкт Scanner
    public FunctionTabulatorWhile(double start, double end, double step, double lowerBound, double upperBound) {


        this.start = start;

        this.end = end;

        this.step = step;

        this.lowerBound = lowerBound;

        this.upperBound = upperBound;
    }

    // Метод, який виконує табуляцію функції
    public void tabulate() {
        double x = start; // Початкове значення x
        int count = 0;    // Лічильник значень, які потрапляють у заданий діапазон

        // Виведення заголовка таблиці
        System.out.println(" x\t|\tf(x)");
        System.out.println("---------------------");

        // Цикл while для обчислення значень функції від start до end з заданим кроком
        while (x <= end + 0.00001) { // Додаємо невелике значення для уникнення похибки округлення
            // Обчислення значення функції
            double fx = 0.25 * Math.pow(x, 3) + x - 1.2502;

            // Виведення поточного x і відповідного значення функції
            System.out.printf("%.2f\t|\t%.4f\n", x, fx);

            // Перевірка, чи входить значення функції у заданий діапазон
            if (fx >= lowerBound && fx <= upperBound) {
                count++; // Збільшуємо лічильник, якщо умова виконується
            }

            x += step; // Збільшуємо x на заданий крок
        }

        // Виводимо кількість значень, що потрапили у діапазон
        if (count > 0) {
            System.out.println("Кількість значень, що потрапили у діапазон: " + count);
        } else {
            System.out.println("Жодне значення функції не входить у заданий діапазон.");
        }
    }
}

