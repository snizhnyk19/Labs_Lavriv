package lab4;

// Task4.java - Зміна знака всіх непарних елементів масиву
class Task4 {
    public static void run() {
        // Ініціалізація масиву
        int[] arr = {1, -5, 3, 6, -7, 9, 12, -15};

        // Перебір масиву і зміна знака всіх непарних чисел
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) { // Перевіряємо, чи число непарне
                arr[i] = -arr[i];  // Міняємо знак числа
            }
        }

        // Виведення масиву після змін
        System.out.println("Масив після зміни знаку непарних елементів:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}