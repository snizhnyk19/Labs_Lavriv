package lab8;

import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Використання: java Main <ім'я_файлу> <нижня_межа> <верхня_межа>");
            return;
        }

        String fileName = args[0];
        int b1 = Integer.parseInt(args[1]);
        int b2 = Integer.parseInt(args[2]);

        File file = new File(fileName);

        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Файл не існував — створено новий: " + fileName);
            }

            FileWriter writer = new FileWriter(file);
            Random rand = new Random();
            for (int i = 0; i < 20; i++) {
                int num = rand.nextInt(b2 - b1 + 1) + b1;
                writer.write(num + " ");
            }
            writer.close();
            System.out.println("Числа успішно записані у файл.");

            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            String line;
            System.out.println("Вміст файлу:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("Сталася помилка при роботі з файлом: " + e.getMessage());
        }
    }
}