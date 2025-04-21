package lab5; // Оголошуємо пакет lab5, в якому знаходяться всі файли


// Task2.java - Пошук найменшого з трьох чисел
class Task2 {
    private int a, b, c;

    public Task2(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void run() {
        System.out.println("Найменше число: " + findMin());
    }

    public int findMin() {
        return Math.min(a, Math.min(b, c));
    }
}