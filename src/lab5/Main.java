package lab5; // Оголошуємо пакет lab5, в якому знаходяться всі файли

import java.util.Scanner; // Імпортуємо клас Scanner для введення даних з клавіатури

// Головний клас Main.java
public class Main {
    public static void main(String[] args) {
        // Створюємо сканер для зчитування даних з клавіатури
        Scanner scanner = new Scanner(System.in);

        // Завдання 1: Площа прямокутника
        System.out.print("Введіть ширину прямокутника: ");
        int width = scanner.nextInt();
        System.out.print("Введіть висоту прямокутника: ");
        int height = scanner.nextInt();
        Task1 task1 = new Task1(width, height);
        task1.run();

        // Завдання 2: Найменше з трьох чисел
        System.out.print("Введіть перше число: ");
        int a = scanner.nextInt();
        System.out.print("Введіть друге число: ");
        int b = scanner.nextInt();
        System.out.print("Введіть третє число: ");
        int c = scanner.nextInt();
        Task2 task2 = new Task2(a, b, c);
        task2.run();

        // Завдання 3: Виведення масиву
        System.out.print("Введіть розмір масиву: ");
        int size3 = scanner.nextInt();
        int[] array3 = new int[size3];
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < size3; i++) {
            array3[i] = scanner.nextInt();
        }
        Task3 task3 = new Task3(array3);
        task3.run();

        // Завдання 4: Найбільше з масиву
        System.out.print("Введіть розмір масиву: ");
        int size4 = scanner.nextInt();
        int[] array4 = new int[size4];
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < size4; i++) {
            array4[i] = scanner.nextInt();
        }
        Task4 task4 = new Task4(array4);
        task4.run();
    }
}
