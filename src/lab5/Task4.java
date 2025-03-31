package lab5; // Оголошуємо пакет lab5, в якому знаходяться всі файли

// Task4.java - Пошук найбільшого числа у масиві
import java.util.Scanner; // Імпортуємо Scanner
class Task4 {
    public static void run(Scanner scanner) {
        System.out.print("Введіть розмір масиву: "); // Запитуємо у користувача розмір масиву
        int size = scanner.nextInt(); // Зчитуємо розмір масиву
        int[] numbers = new int[size]; // Створюємо масив заданого розміру

        System.out.println("Введіть елементи масиву: "); // Запитуємо користувача ввести елементи масиву
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt(); // Зчитуємо кожен елемент масиву
        }

        System.out.println("Найбільше число в масиві: " + findMax(numbers)); // Виводимо найбільше число
    }

    public static int findMax(int[] array) {
        int max = array[0]; // Припускаємо, що перший елемент є найбільшим
        for (int num : array) {
            if (num > max) { // Якщо знайдено більше значення
                max = num; // Оновлюємо найбільше число
            }
        }
        return max; // Повертаємо найбільше число
    }
}
