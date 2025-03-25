package lab2;// NumberChecker.java/переввірка номерів
import java.util.Scanner;
public class NumberChecker {
    public static void checkNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число");
        // Зчитування числа
        int number = scanner.nextInt();

        // Перевірка, чи є число двозначним і парним
        if (number >= 10 && number <= 99 && number % 2 == 0) {
            System.out.println("Число двозначне і парне.");
        } else {
            System.out.println("Число не двозначне, а парне.");
        }
    }
}
