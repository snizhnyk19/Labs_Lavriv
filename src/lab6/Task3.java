package lab6;

// Завдання 3: Реалізація ієрархії Shape
public class Task3 {
    public void run() {
        Ball ball = new Ball(5);
        Cylinder cylinder = new Cylinder(3, 7);
        Pyramid pyramid = new Pyramid(9, 10);

        System.out.println("Об'єм кулі: " + ball.getVolume());
        System.out.println("Об'єм циліндра: " + cylinder.getVolume());
        System.out.println("Об'єм піраміди: " + pyramid.getVolume());
    }
}

// Батьківський клас Shape
abstract class Shape {
    protected double volume;

    public double getVolume() {
        return volume;
    }
}

// Клас SolidOfRevolution (похідний від Shape)
abstract class SolidOfRevolution extends Shape {
    protected double radius;

    public SolidOfRevolution(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

// Клас Ball (кулі)
class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        super(radius);
        this.volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }
}

// Клас Cylinder (циліндр)
class Cylinder extends SolidOfRevolution {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
        this.volume = Math.PI * Math.pow(radius, 2) * height;
    }
}

// Клас Pyramid (піраміда)
class Pyramid extends Shape {
    private double s;
    private double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
        this.volume = (s * h) / 3;
    }
}
