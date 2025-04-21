package lab5; // Оголошуємо пакет lab5, в якому знаходяться всі файли

// Task4.java - Пошук найбільшого числа у масиві
class Task4 {
    private final int[] array;

    public Task4(int[] array) {
        this.array = array;
    }

    public void run() {
        System.out.println("Найбільше число в масиві: " + findMax());
    }

    public int findMax() {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}

