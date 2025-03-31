package lab5; // Оголошуємо пакет lab5, в якому знаходяться всі файли

// Task1.java - Обчислення площі прямокутника
import java.util.Scanner; // Імпортуємо Scanner
class Task1 {
    public static void run(Scanner scanner) {
        System.out.print("Введіть ширину прямокутника: "); // Виводимо запит на введення ширини
        int width = scanner.nextInt(); // Зчитуємо ширину з клавіатури
        System.out.print("Введіть висоту прямокутника: "); // Виводимо запит на введення висоти
        int height = scanner.nextInt(); // Зчитуємо висоту з клавіатури
        System.out.println("Площа прямокутника: " + calculateArea(width, height)); // Виводимо обчислену площу
    }

    public static int calculateArea(int width, int height) {
        return width * height; // Обчислюємо площу прямокутника (ширина * висота)
    }
}