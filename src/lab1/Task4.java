package lab1;

public class Task4 {
    static class Car {
        int power;
        double engineSize;
        String brand;
        String model;
        int year;
        String color;
        int maxSpeed;

        Car(int power, double engineSize, String brand, String model, int year, String color, int maxSpeed) {
            this.power = power;
            this.engineSize = engineSize;
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.color = color;
            this.maxSpeed = maxSpeed;
        }
    }

    public void task4() {
        Car[] cars = {
                new Car(150, 2.0, "Toyota", "Camry", 2021, "Black", 220),
                new Car(120, 1.6, "Honda", "Civic", 2019, "White", 210),
                // Додати ще 8 авто...
        };

        int totalPower = 0;
        double totalEngineSize = 0;

        for (Car car : cars) {
            totalPower += car.power;
            totalEngineSize += car.engineSize;
        }

        System.out.printf("Загальна потужність: %d к.с.\nЗагальний об'єм двигуна: %.2f л\n", totalPower, totalEngineSize);
    }
}

