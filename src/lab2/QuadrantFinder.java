package lab2;// QuadrantFinder.java/Пошук квадрантів
import java.util.Scanner;
public class QuadrantFinder {
    public static void findQuadrant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедіть координати x та y:");
        // Зчитування координат точки
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // Визначення квадранта на площині
        if (x > 0 && y > 0) System.out.println("Квадрат 1");
        else if (x < 0 && y > 0) System.out.println("Квадрат 2");
        else if (x < 0 && y < 0) System.out.println("Квадрат 3");
        else if (x > 0 && y < 0) System.out.println("Квадрат 4");
        else System.out.println("Точка знаходиться на осі");
    }
}