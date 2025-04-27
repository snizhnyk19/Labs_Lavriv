package lab6;

class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number, model, 0);
    }

    public Phone() {
        this("", "", 0);
    }

    // Гетери
    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    // Сетери
    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Дзвонить " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Дзвонить " + name + " з номеру " + number);
    }

    public void sendMessage(String... numbers) {
        System.out.println("Надсилання повідомлення на номери:");
        for (String num : numbers) {
            System.out.println(num.trim());
        }
    }

    public void printInfo() {
        System.out.println("Модель: " + model + ", Номер: " + number + ", Вага: " + weight);
    }
}
