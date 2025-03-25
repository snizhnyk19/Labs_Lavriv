package lab3;

// Клас для друку часу у форматі годин і хвилин (for loop)
class TimePrinterForLoop {
    public static void printTime() {
        for (int h = 0; h <= 2; h++) {
            for (int m = 0; m < 60; m++) {
                System.out.println(h + " h " + m + " min");
            }
        }
    }
}