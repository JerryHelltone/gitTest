package lesson11;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class task6 {

    private static  final Map<Integer, RuntimeException> EXCEPTION = new HashMap<>();
        static {
            EXCEPTION.put(0, new CustomException());
            EXCEPTION.put(1, new IllegalArgumentException());
            EXCEPTION.put(2, new ArrayIndexOutOfBoundsException());
        }

    public static void main(String[] args) {
        try {
            randomException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void randomException() throws Exception {
        Random random = new Random();
        int randomValue = random.nextInt(3);

        throw EXCEPTION.get(randomValue);
    }
}
