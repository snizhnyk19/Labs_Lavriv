package lab5; // Оголошуємо пакет lab5, в якому знаходяться всі файли

// Task2.java - Пошук найменшого з трьох чисел
import java.util.Scanner; // Імпортуємо Scanner
class Task2 {
    public static void run(Scanner scanner) {
        System.out.print("Введіть три числа: "); // Запитуємо три числа у користувача
        int a = scanner.nextInt(); // Зчитуємо перше число
        int b = scanner.nextInt(); // Зчитуємо друге число
        int c = scanner.nextInt(); // Зчитуємо третє число
        System.out.println("Найменше число: " + findMin(a, b, c)); // Виводимо найменше число
    }

    public static int findMin(int a, int b, int c) {
        return Math.min(a, Math.min(b, c)); // Використовуємо Math.min() для знаходження мінімального значення
    }
}