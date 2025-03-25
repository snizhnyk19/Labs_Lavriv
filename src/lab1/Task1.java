package lab1;
import java.util.Scanner; // Імпортуємо клас Scanner для введення даних

public class Task1 {
    public void task1() {
        Scanner scanner = new Scanner(System.in); // Створюємо об'єкт Scanner для введення чисел
        int[] numbers = new int[10]; // Масив для зберігання 10 чисел

        int sum = 0;    // Змінна для суми
        int min = 0;    // Змінна для різниці
        int mult = 1;   // Змінна для множення
        float div = 1;  // Змінна для ділення

        System.out.println("Введіть 10 чисел:");

        // Цикл для введення 10 чисел
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Виконуємо математичні операції
        for (int num : numbers) {
            sum += num;    // Додаємо всі числа
            min -= num;    // Віднімаємо числа
            mult *= num;   // Перемножуємо числа
            div /= num;    // Ділимо числа
        }

        // Виводимо результати
        System.out.printf("Сума: %d\nРізниця: %d\nДобуток: %d\nДілення: %.2f\n", sum, min, mult, div);
    }
}
