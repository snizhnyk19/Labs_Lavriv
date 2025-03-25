package lab3;

// Головний клас для виклику методів з інших класів
public class Main {
    public static void main(String[] args) {
        // Викликаємо методи з інших класів для виконання завдань
        PhrasePrinter.printPhrase(); // Друк фрази 50 разів
        TimePrinterWithSeconds.printTime();// Вивід годин, хвилин і секунд for
        TimePrinterForLoop.printTime(); // Вивід годин і хвилин за допомогою for
        TimePrinterWhileLoop.printTime(); // Вивід годин і хвилин за допомогою while
        FunctionTabulatorFor.calculateFunctionWithFor(); // Табулювання функції за допомогою циклу for
        FunctionTabulatorWhile.calculateFunctionWithWhile(); // Табулювання функції за допомогою циклу while
    }
}