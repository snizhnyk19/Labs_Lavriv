package lab6;

import lab1.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Task1
        Task1 task1 = new Task1();

        // Введення для person1
        Person person1 = new Person();
        System.out.print("Введіть повне ім'я для першого об'єкта: ");
        person1.setFullName(scanner.nextLine());
        System.out.print("Введіть вік для першого об'єкта: ");
        person1.setAge(scanner.nextInt());
        scanner.nextLine(); // Очистка буфера

        // person2 з Task1
        Person person2 = task1.getPredefinedPerson();

        // Дії
        person1.move();
        person1.talk();
        person2.move();
        person2.talk();


        // Завдання 2: Клас Phone
        Task2 task2 = new Task2();




        // Створення першого телефону
        Phone phone1 = new Phone();
        System.out.print("Введіть номер для першого телефону: ");
        phone1.setNumber(scanner.nextLine());
        System.out.print("Введіть модель для першого телефону: ");
        phone1.setModel(scanner.nextLine());
        System.out.print("Введіть вагу для першого телефону: ");
        phone1.setWeight(scanner.nextDouble());
        scanner.nextLine(); // очистка буфера

        // Створення другого телефону
        Phone phone2 = new Phone();
        System.out.print("Введіть номер для другого телефону: ");
        phone2.setNumber(scanner.nextLine());
        System.out.print("Введіть модель для другого телефону: ");
        phone2.setModel(scanner.nextLine());
        phone2.setWeight(0); // Для другого об'єкта вага буде 0 за умовою

        // Створення третього телефону
        Phone phone3 = new Phone(); // Без параметрів

        // Виведення інформації
        phone1.printInfo();
        phone2.printInfo();
        phone3.printInfo();

        // Виклик методів
        System.out.print("Хто дзвонить на перший телефон? ");
        phone1.receiveCall(scanner.nextLine());
        System.out.println("Номер телефону: " + phone1.getNumber());

        System.out.print("Хто дзвонить на другий телефон? ");
        String name2 = scanner.nextLine();
        System.out.print("Який номер телефону абонента? ");
        String number2 = scanner.nextLine();
        phone2.receiveCall(name2, number2);

        System.out.println("Введіть номери для надсилання повідомлення (через кому): ");
        String numbersInput = scanner.nextLine();
        String[] numbers = numbersInput.split(",");
        phone3.sendMessage(numbers);




        // Завдання 3: Ієрархія Animal
        Task3 task3 = new Task3();
        task3.run();

        // Завдання 4: Абстрактний клас Car
        Task4 task4 = new Task4();
        task4.run();

        // Завдання 5: Клас Student
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
        scanner.nextLine(); // Очистити буфер

        // Створення об'єкта Task5 і передача даних
        Task5 task5 = new Task5();
        task5.run(lastName, firstName, mark1, mark2, mark3);
    }
}


