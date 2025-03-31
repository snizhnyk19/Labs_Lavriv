package lab5; // Оголошуємо пакет lab5, в якому знаходяться всі файли

import java.util.Scanner; // Імпортуємо клас Scanner для введення даних з клавіатури

// Головний клас Main.java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Створюємо об'єкт Scanner для зчитування введених даних

        // Викликаємо методи з інших класів для виконання завдань
        Task1.run(scanner); // Виконуємо завдання 1 (обчислення площі прямокутника)
        Task2.run(scanner); // Виконуємо завдання 2 (пошук найменшого з трьох чисел)
        Task3.run(scanner); // Виконуємо завдання 3 (введення і вивід масиву)
        Task4.run(scanner); // Виконуємо завдання 4 (знаходження найбільшого числа в масиві)

        scanner.close(); // Закриваємо Scanner після використання
    }
}