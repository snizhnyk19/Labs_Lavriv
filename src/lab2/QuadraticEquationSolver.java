package lab2;// QuadraticEquationSolver.java/вирішувач квадратних рівнянь
import java.util.Scanner;
public class QuadraticEquationSolver {
    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть коефіцієнти a, b, c для рівняння ax^2 + bx + c = 0:");
        // Зчитування коефіцієнтів квадратного рівняння
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        // Обчислення дискримінанта
        double d = b * b - 4 * a * c;

        // Визначення коренів рівняння
        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Корені рівняння: " + x1 + " і " + x2);
        } else if (d == 0) {
            double x = -b / (2 * a);
            System.out.println("Один корінь: " + x);
        } else {
            System.out.println("Корені відсутні.");
        }
    }
}