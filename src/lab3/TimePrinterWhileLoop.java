package lab3;

// Клас для друку часу у форматі годин і хвилин (while loop)
class TimePrinterWhileLoop {
    public static void printTime() {
        int h = 0, m;
        while (h <= 2) {
            m = 0;
            while (m < 60) {
                System.out.println(h + " h " + m + " min");
                m++;
            }
            h++;
        }
    }
}
