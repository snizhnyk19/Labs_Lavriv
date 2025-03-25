package lab3;

import java.util.Scanner;

public class FunctionTabulatorWhile {
    public static void calculateFunctionWithWhile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть нижню межу: ");
        double lowerBound = scanner.nextDouble(); // Вводимо значення з дробовою частиною
        System.out.print("Введіть верхню межу: ");
        double upperBound = scanner.nextDouble(); // Вводимо значення з дробовою частиною
        System.out.print("Введіть крок: ");
        double step = scanner.nextDouble(); // Вводимо значення з дробовою частиною
        System.out.print("Введіть нижню границю діапазону значень функції: ");
        double rangeLower = scanner.nextDouble(); // Вводимо значення з дробовою частиною
        System.out.print("Введіть верхню границю діапазону значень функції: ");
        double rangeUpper = scanner.nextDouble(); // Вводимо значення з дробовою частиною

        int count = 0;
        System.out.println("Результати табулювання функції (while loop):");
        double x = lowerBound;
        while (x <= upperBound) {
            double f = 0.25 * Math.pow(x, 3) + x - 1.2502;
            System.out.printf("f(%.2f) = %.4f%n", x, f);
            if (f >= rangeLower && f <= rangeUpper) count++;
            x += step;
        }

        if (count == 0) {
            System.out.println("Жодне значення функції не входить у заданий діапазон.");
        }

        scanner.close(); // Закриваємо Scanner
    }
}
