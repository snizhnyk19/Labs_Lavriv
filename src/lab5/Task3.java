package lab5; // Оголошуємо пакет lab5, в якому знаходяться всі файли

// Task3.java - Виведення масиву
class Task3 {
    private final int[] array;

    public Task3(int[] array) {
        this.array = array;
    }

    public void run() {
        printArray();
    }

    public void printArray() {
        System.out.print("Масив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
