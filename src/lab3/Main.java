package lab3;

import java.util.Scanner;

// Головний клас для виклику методів з інших класів
public class Main {



    public static void main(String[] args) {
        // Викликаємо методи з інших класів для виконання завдань
        // Зчитування початкового значення табуляції
        System.out.print("Введіть початкове значення (start): ");
        Scanner scanner = new Scanner(System.in);
        double start = scanner.nextDouble();

        // Зчитування кінцевого значення табуляції
        System.out.print("Введіть кінцеве значення (end): ");
        double end = scanner.nextDouble();

        // Зчитування кроку табуляції
        System.out.print("Введіть крок (step): ");
        double step = scanner.nextDouble();

        // Зчитування нижньої межі діапазону перевірки
        System.out.print("Введіть нижню межу діапазону для перевірки: ");
        double lowerBound = scanner.nextDouble();

        // Зчитування верхньої межі діапазону перевірки
        System.out.print("Введіть верхню межу діапазону для перевірки: ");
        double upperBound = scanner.nextDouble();

        // Створення об'єкта табулятора з введеними параметрами
        FunctionTabulatorWhile tabulator = new FunctionTabulatorWhile(start, end, step, lowerBound, upperBound);
        tabulator.tabulate(); // Виконання табуляції

//        PhrasePrinter.printPhrase(); // Друк фрази 50 разів
//        TimePrinterWithSeconds.printTime();// Вивід годин, хвилин і секунд for
//        TimePrinterForLoop.printTime(); // Вивід годин і хвилин за допомогою for
//        TimePrinterWhileLoop.printTime(); // Вивід годин і хвилин за допомогою while
//        FunctionTabulatorFor.calculateFunctionWithFor(); // Табулювання функції за допомогою циклу for


    }
}