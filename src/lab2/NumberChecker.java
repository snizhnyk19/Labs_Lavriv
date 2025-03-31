package lab2; // Оголошення пакета
import java.util.Scanner;

public class NumberChecker {
    public static void checkNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число:");

        int number = scanner.nextInt();

        if (number >= 10 && number <= 99) {
            if (number % 2 == 0) {
                System.out.println("Число двозначне і парне.");
            } else {
                System.out.println("Число двозначне, але не парне.");
            }
        } else {
            if (number % 2 == 0) {
                System.out.println("Число не двозначне, але парне.");
            } else {
                System.out.println("Число не двозначне і не парне.");
            }
        }
    }
}
