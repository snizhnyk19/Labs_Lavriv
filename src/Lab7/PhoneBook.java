package Lab7;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private HashMap<String, String> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    // Додавання елементів у карту
    public void addEntry(String surname, String phoneNumber) {
        phoneBook.put(surname, phoneNumber);
    }

    // Пошук номера за прізвищем
    public String getPhoneNumber(String surname) {
        return phoneBook.get(surname);
    }

    // Видалення запису за прізвищем
    public void removeEntry(String surname) {
        phoneBook.remove(surname);
    }

    // Перевірка наявності прізвища у книзі
    public boolean containsSurname(String surname) {
        return phoneBook.containsKey(surname);
    }

    // Перевірка наявності номера у книзі
    public boolean containsPhoneNumber(String phoneNumber) {
        return phoneBook.containsValue(phoneNumber);
    }

    // Розмір книги
    public int size() {
        return phoneBook.size();
    }

    // Виведення інформації з книги
    public void printPhoneBook() {
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println("Прізвище: " + entry.getKey() + ", Номер телефону: " + entry.getValue());
        }
    }
}