package Lab7;

import java.util.ArrayList;
import java.util.Random;

public class Car {
    String brand;
    double enginePower;
    Driver driver;
    double price;
    int year;

    public Car(String brand, double enginePower, Driver driver, double price, int year) {
        this.brand = brand;
        this.enginePower = enginePower;
        this.driver = driver;
        this.price = price;
        this.year = year;
    }

    public void repairEngine() {
        this.enginePower *= 1.1;
    }

    public void increasePowerAndPrice() {
        this.enginePower *= 1.1;
        this.price *= 1.05;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", enginePower=" + enginePower +
                ", driver=" + driver +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}

class Driver {
    String name;
    int age;
    int experience;

    public Driver(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public void improveSkills() {
        this.experience += 1;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                '}';
    }
}

class Helper {
    public static void chooseRandomCar(ArrayList<Car> cars) {
        Random random = new Random();
        Car chosenCar = cars.get(random.nextInt(cars.size()));
        System.out.println("Автомобіль марки " + chosenCar.brand + " з водієм " + chosenCar.driver.name + " виїхав за вами");
        arrivedAtLocation(chosenCar.driver.name);
    }

    public static void arrivedAtLocation(String driverName) {
        System.out.println("Водій " + driverName + " прибув на місце");
    }
}