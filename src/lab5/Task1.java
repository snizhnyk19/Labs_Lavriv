package lab5; // Оголошуємо пакет lab5, в якому знаходяться всі файли



// Task1.java - Обчислення площі прямокутника
class Task1 {
    private int width;
    private int height;

    public Task1(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void run() {
        System.out.println("Площа прямокутника: " + calculateArea());
    }

    public int calculateArea() {
        return width * height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}