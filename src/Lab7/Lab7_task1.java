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

        // Налаштування коефіцієнтів для ремонту та підвищення
        double engineRepairFactor = 1.1;
        double powerIncreaseFactor = 1.1;
        double priceIncreaseFactor = 1.05;

        // Ремонт мотору для половини автопарку
        for (int i = 0; i < carPark.size() / 2; i++) {
            Car car = carPark.get(i);
            car.setFactor(engineRepairFactor);   // Встановлюємо коефіцієнт для ремонту
            car.repairEngine();                  // Ремонтуємо мотор
            car.driver = new Driver("NewDriver" + i, 25 + i, 3 + i);  // Наймаємо нових водіїв
        }

        // Підвищення потужності та ціни кожній другій машині
        for (int i = 1; i < carPark.size(); i += 2) {
            Car car = carPark.get(i);
            car.setPowerFactor(powerIncreaseFactor);  // Встановлюємо коефіцієнт для потужності
            car.setPriceFactor(priceIncreaseFactor);  // Встановлюємо коефіцієнт для ціни
            car.increasePowerAndPrice();              // Підвищуємо потужність і ціну
        }

        // Покращення навичок водіїв
        for (Car car : carPark) {
            if (car.driver.experience < 5 && car.driver.age > 25) {
                car.driver.improveSkills();  // Покращуємо навички водіїв з досвідом менше 5 років
            }
        }

        // Вибір випадкової машини
        Helper.chooseRandomCar(carPark);
    }
}
