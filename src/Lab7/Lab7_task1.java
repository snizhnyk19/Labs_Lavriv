package Lab7;

import java.util.ArrayList;

public class Lab7_task1 {
    public static void main(String[] args) {
        ArrayList<Car> carPark = new ArrayList<>();
        carPark.add(new Car("Toyota", 150, new Driver("Ivan", 30, 8), 20000, 2019));
        carPark.add(new Car("Honda", 140, new Driver("Alex", 40, 12), 18000, 2018));
        carPark.add(new Car("Ford", 160, new Driver("Serhiy", 35, 10), 21000, 2020));
        carPark.add(new Car("Chevrolet", 145, new Driver("Maria", 28, 5), 19500, 2017));
        carPark.add(new Car("BMW", 200, new Driver("Oleg", 33, 8), 30000, 2019));
        carPark.add(new Car("Audi", 190, new Driver("Anastasia", 26, 4), 28000, 2018));
        carPark.add(new Car("Mercedes", 220, new Driver("Dmytro", 38, 15), 35000, 2021));
        carPark.add(new Car("Volkswagen", 140, new Driver("Olga", 29, 6), 19000, 2016));
        carPark.add(new Car("Hyundai", 130, new Driver("Andriy", 31, 7), 18000, 2017));
        carPark.add(new Car("Kia", 135, new Driver("Kateryna", 27, 5), 18500, 2018));
        carPark.add(new Car("Nissan", 150, new Driver("Volodymyr", 32, 9), 20000, 2019));
        carPark.add(new Car("Mazda", 155, new Driver("Inna", 30, 8), 21000, 2020));

        // Додати ще автомобілі (мінімум 10, максимум 20)

        // Робимо ремонт мотору для половини автопарку
        for (int i = 0; i < carPark.size() / 2; i++) {
            carPark.get(i).repairEngine();
            carPark.get(i).driver = new Driver("NewDriver" + i, 25 + i, 3 + i); // наймаємо нових водіїв
        }

        // Підвищення потужності та ціни кожній другій машині
        for (int i = 1; i < carPark.size(); i += 2) {
            carPark.get(i).increasePowerAndPrice();
        }

        // Перевірка досвіду водіїв
        for (Car car : carPark) {
            if (car.driver.experience < 5 && car.driver.age > 25) {
                car.driver.improveSkills();
            }
        }
        // Вибір випадкової машини та виклик методів виводу в консоль
        Helper.chooseRandomCar(carPark);
    }
}