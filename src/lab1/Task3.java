package lab1;

public class Task3 {
    // Клас User з усіма необхідними полями
    static class User {
        int id;
        int age;
        String name;
        String surname;
        double weight;
        double height;

        // Конструктор класу
        User(int id, int age, String name, String surname, double weight, double height) {
            this.id = id;
            this.age = age;
            this.name = name;
            this.surname = surname;
            this.weight = weight;
            this.height = height;
        }
    }

    public void task3() {
        // Масив з 10 користувачів
        User[] users = {
                new User(1, 25, "Андрій", "Петров", 75.5, 1.78),
                new User(2, 30, "Марія", "Іванова", 60.2, 1.65),
                new User(3, 22, "Олег", "Сидоров", 80.0, 1.85),
                new User(4, 28, "Олексій", "Коваленко", 70.0, 1.75),
                new User(5, 35, "Ірина", "Шевченко", 55.8, 1.60),
                new User(6, 40, "Дмитро", "Гнатюк", 90.3, 1.90),
                new User(7, 19, "Анна", "Мельник", 50.0, 1.58),
                new User(8, 33, "Сергій", "Ткаченко", 85.5, 1.80),
                new User(9, 27, "Юлія", "Лисенко", 65.0, 1.68),
                new User(10, 31, "Василь", "Кравчук", 78.2, 1.82),
        };

        int totalAge = 0;
        double totalWeight = 0, totalHeight = 0;

        // Підраховуємо загальні значення
        for (User user : users) {
            totalAge += user.age;
            totalWeight += user.weight;
            totalHeight += user.height;
        }

        System.out.printf("Сумарний вік: %d\nСумарна вага: %.2f\nСумарний зріст: %.2f\n", totalAge, totalWeight, totalHeight);
    }
}

