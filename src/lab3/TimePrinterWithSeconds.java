package lab3;

// Клас для друку часу у форматі годин, хвилин і секунд (for loop)
class TimePrinterWithSeconds {
    public static void printTime() {
        // Цикл для годин
        for (int h = 0; h <= 2; h++) {
            // Цикл для хвилин
            for (int m = 0; m < 60; m++) {
                // Цикл для секунд
                for (int s = 0; s < 60; s++) {
                    System.out.println(h + " h " + m + " min " + s + " sec");
                }
            }
        }
    }
}
