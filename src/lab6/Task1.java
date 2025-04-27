package lab6;

public class Task1 {
    private final Person predefinedPerson;

    public Task1() {
        this.predefinedPerson = new Person("Василь Петрович", 30);
    }

    public Person getPredefinedPerson() {
        return predefinedPerson;
    }
}
// Task 1
class Person {
    private String fullName;
    private int age;

    public Person() {
        this.fullName = "Невідомий";
        this.age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " рухається.");
    }

    public void talk() {
        System.out.println(fullName + " говорить.");
    }

    public void setFullName(String s) {
        this.fullName = s;
    }

    public void setAge(int i) {
        this.age = i;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }
}

