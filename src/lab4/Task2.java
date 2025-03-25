package lab4;

// Task2.java - Операції з масивом
class Task2 {
    public static void run() {
        // Ініціалізація масиву із заданими значеннями
        int[] arr = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};

        // Перебір масиву за допомогою циклу while
        System.out.println("Перебір while:");
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }

        // Перебір масиву за допомогою циклу for
        System.out.println("\nПеребір for:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Виведення чисел з непарним індексом
        System.out.println("\nЧисла з непарним індексом:");
        i = 1;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i += 2;
        }

        // Виведення чисел з парним індексом
        System.out.println("\nЧисла з парним індексом:");
        for (i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }

        // Виведення масиву у зворотному порядку
        System.out.println("\nМасив у зворотному порядку:");
        for (i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}