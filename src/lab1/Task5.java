package lab1;

public class Task5 {
    public void task5() {
        int num = 412;
        int reversed = (num % 10) * 100 + ((num / 10) % 10) * 10 + (num / 100);
        System.out.println("Реверс числа: " + reversed);
    }
}

