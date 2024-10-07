package lesson4;

import java.util.Arrays;
import java.util.Random;

public class task4 {
    public static void main(String[] args) {
        int[] values = new int[4];
        Random random = new Random();
        int previous = Integer.MIN_VALUE;
        boolean result = true;

        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(90) + 10;
            if(previous > values[i]) {
                result = false;
            }
            previous = values[i];
        }

        System.out.println(Arrays.toString(values));
        System.out.println(result);
    }
}
