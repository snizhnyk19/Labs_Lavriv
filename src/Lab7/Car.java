package Lab7;
import java.util.ArrayList;
import java.util.Random;


public class Car {
    String brand;
    double enginePower;
    Driver driver;
    double price;
    int year;

    private double factor;
    private double powerFactor;
    private double priceFactor;

    public Car(String brand, double enginePower, Driver driver, double price, int year) {
        this.brand = brand;
        this.enginePower = enginePower;
        this.driver = driver;
        this.price = price;
        this.year = year;
    }

    // Гетери
    public double getFactor() {
        return factor;
    }

    public double getPowerFactor() {
        return powerFactor;
    }

    public double getPriceFactor() {
        return priceFactor;
    }

    // Сетери
    public void setFactor(double factor) {
        this.factor = factor;
    }

    public void setPowerFactor(double powerFactor) {
        this.powerFactor = powerFactor;
    }

    public void setPriceFactor(double priceFactor) {
        this.priceFactor = priceFactor;
    }

    public void repairEngine() {
        if (getFactor() > 0) {
            this.enginePower *= getFactor();
        }
    }

    public void increasePowerAndPrice() {
        if (getPowerFactor() > 0) {
            this.enginePower *= getPowerFactor();
        }
        if (getPriceFactor() > 0) {
            this.price *= getPriceFactor();
        }
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
