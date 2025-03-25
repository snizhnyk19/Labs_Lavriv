package lab2;// SeasonFinder.java/пошук сезонів
import java.util.Scanner;
public class SeasonFinder {
    public static void findSeason() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть номер місяця (1-12):");
        // Зчитування номера місяця
        int month = scanner.nextInt();

        // Визначення пори року за номером місяця
        switch (month) {
            case 12, 1, 2 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("ЛІто");
            case 9, 10, 11 -> System.out.println("Осінь");
            default -> System.out.println("Некоректний номер місяця");
        }
    }
}