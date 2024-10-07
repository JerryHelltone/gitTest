package lesson3;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class taskFive {
    public static void main(String[] args) {
        Random random = new Random();
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < 10; i++) {
            int randomValue = random.nextInt(100);
            System.out.println(randomValue);
            if (maxValue < randomValue) {
                maxValue = randomValue;
            }
        }
        System.out.println("Максимальное число: " + maxValue);
        System.out.printf("Максимальное число: %d\n", maxValue); //альтернативный вид вывода из С++
    }
}
