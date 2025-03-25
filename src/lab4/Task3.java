package lab4;

// Task3.java - Обчислення суми елементів масиву
class Task3 {
    public static void run() {
        // Ініціалізація масиву дійсних чисел
        double[] arr = {1.5, 2.3, -3.4, 4.6, 5.0};
        double sum = 0; // Змінна для збереження суми елементів

        // Обчислення суми всіх елементів масиву
        for (double num : arr) {
            sum += num;
        }

        // Виведення суми елементів масиву
        System.out.println("Сума елементів масиву: " + sum);
    }
}