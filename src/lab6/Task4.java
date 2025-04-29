package lab6;

// Завдання 4: Створення абстрактного класу Car
public class Task4 {
    public void run() {
        Sedan sedan = new Sedan("Toyota Camry", "Синій", 220);
        Truck truck = new Truck("MAN", "Білий", 160);

        sedan.gas();
        sedan.brake();

        truck.gas();
        truck.brake();
    }
}

// Абстрактний клас Car
abstract class Car {
    protected String model;
    protected String color;
    protected int maxSpeed;

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void gas() {
        System.out.println(model + " газує!");
    }

    public abstract void brake();
}

// Клас Sedan
class Sedan extends Car {
    public Sedan(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }


    public void brake() {
        System.out.println(model + " гальмує як легковий автомобіль.");
    }
}

// Клас Truck
class Truck extends Car {
    public Truck(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }


    public void brake() {
        System.out.println(model + " гальмує як вантажівка.");
    }
}
