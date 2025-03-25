package lab4;

// Task1.java - Заповнення масиву парними та непарними числами
class Task1 {
    public static void run() {
        // Створення двох масивів для зберігання парних і непарних чисел
        int[] evenNumbers = new int[50];
        int[] oddNumbers = new int[50];
        int even = 0, odd = 1; // Початкові значення для парних і непарних чисел

        // Заповнення масивів
        for (int i = 0; i < 50; i++) {
            evenNumbers[i] = even; // Додаємо парне число
            oddNumbers[i] = odd;   // Додаємо непарне число
            even += 2; // Наступне парне число
            odd += 2;  // Наступне непарне число
        }

        // Виведення парних чисел
        System.out.println("Парні числа:");
        for (int num : evenNumbers) System.out.print(num + " ");

        // Виведення непарних чисел
        System.out.println("\nНепарні числа:");
        for (int num : oddNumbers) System.out.print(num + " ");
        System.out.println();
    }
}
