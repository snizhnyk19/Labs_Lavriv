package Lab7;

public class lab7_task2 {
    public static void main(String[] args) {
        Lab7.PhoneBook phoneBook = new Lab7.PhoneBook();

        // Додавання елементів у карту
        phoneBook.addEntry("Ivanov", "+380501234567");
        phoneBook.addEntry("Petrov", "+380501234568");
        phoneBook.addEntry("Sidorov", "+380501234569");
        phoneBook.addEntry("Kovalenko", "+380501234570");
        phoneBook.addEntry("Shevchenko", "+380501234571");
        phoneBook.addEntry("Tkachenko", "+380501234572");
        phoneBook.addEntry("Bondarenko", "+380501234573");
        phoneBook.addEntry("Kravchenko", "+380501234574");
        phoneBook.addEntry("Omelchenko", "+380501234575");
        phoneBook.addEntry("Lysenko", "+380501234576");

        // Виведення інформації з книги
        phoneBook.printPhoneBook();

        // Пошук номера за прізвищем
        String searchSurname = "Ivanov";
        if (phoneBook.containsSurname(searchSurname)) {
            System.out.println("Номер телефону для " + searchSurname + ": " + phoneBook.getPhoneNumber(searchSurname));
        } else {
            System.out.println("У книзі відсутній такий абонент");
        }

        // Видалення довільного запису (видаляємо запис з прізвищем "Sidorov")
        phoneBook.removeEntry("Sidorov");

        // Виведення кількості записів у книзі
        System.out.println("Кількість записів у книзі: " + phoneBook.size());
    }
}