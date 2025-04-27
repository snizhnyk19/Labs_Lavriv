package lab6;

// Завдання 5: Опис успішності студента
public class Task5 {
    public void run(java.util.Scanner scanner) {
        System.out.print("Введіть прізвище: ");
        String lastName = scanner.nextLine();
        System.out.print("Введіть ім'я: ");
        String firstName = scanner.nextLine();
        System.out.print("Введіть оцінку 1: ");
        int mark1 = scanner.nextInt();
        System.out.print("Введіть оцінку 2: ");
        int mark2 = scanner.nextInt();
        System.out.print("Введіть оцінку 3: ");
        int mark3 = scanner.nextInt();
        scanner.nextLine(); // Прочитати Enter

        Student student = new Student(lastName, firstName, mark1, mark2, mark3);
        student.printInfo();
        System.out.println("Середній бал: " + student.getAverageMark());
    }
}

// Клас Student
class Student {
    private String lastName;
    private String firstName;
    private int mark1, mark2, mark3;

    public Student(String lastName, String firstName, int mark1, int mark2, int mark3) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public void printInfo() {
        System.out.println("Студент: " + lastName + " " + firstName);
        System.out.println("Оцінки: " + mark1 + ", " + mark2 + ", " + mark3);
    }

    public double getAverageMark() {
        return (mark1 + mark2 + mark3) / 3.0;
    }
}
