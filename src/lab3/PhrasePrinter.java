package lab3;

class PhrasePrinter {
    public static void printPhrase() {
        String phrase = "Привіт, світ!"; // Фраза, яку потрібно вивести

        // Цикл for: друкуємо фразу 50 разів
        for (int i = 0; i < 50; i++) {
            System.out.println(phrase);
        }

        // Цикл while: друкуємо фразу 50 разів
        int i = 0;
        while (i < 50) {
            System.out.println(phrase);
            i++; // Збільшуємо лічильник
        }
    }
}
