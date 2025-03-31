package lab5; // Оголошуємо пакет lab5, в якому знаходяться всі файли

// Task3.java - Виведення масиву
import java.util.Scanner; // Імпортуємо Scanner
class Task3 {
    public static void run(Scanner scanner) {
        System.out.print("Введіть розмір масиву: "); // Запитуємо у користувача розмір масиву
        int size = scanner.nextInt(); // Зчитуємо розмір масиву
        int[] numbers = new int[size]; // Створюємо масив заданого розміру

        System.out.println("Введіть елементи масиву: "); // Запитуємо користувача ввести елементи масиву
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt(); // Зчитуємо кожен елемент масиву
        }

        printArray(numbers); // Викликаємо метод для виводу масиву
    }

    public static void printArray(int[] array) {
        System.out.print("Масив: "); // Виводимо текст перед масивом
        for (int num : array) {
            System.out.print(num + " "); // Виводимо кожен елемент масиву через пробіл
        }
        System.out.println(); // Перехід на новий рядок після виводу всіх елементів
    }
}