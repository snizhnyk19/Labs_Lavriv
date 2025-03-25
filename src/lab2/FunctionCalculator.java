package lab2;

import java.util.Scanner;
public class FunctionCalculator {
    public static void calculateFunction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть x:");
        // Зчитування значення x
        double x = scanner.nextDouble();
        double result;

        // Обчислення значення функції за умовами
        if (x < -2) {
            result = 3 * Math.abs(x);
        } else if (x >= -2 && x <= 2) {
            result = 9 * x;
        } else {
            result = Math.sin(x);
        }
        System.out.println("f(x) = " + result);
    }
}