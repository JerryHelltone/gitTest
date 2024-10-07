package lesson11;

import java.util.Random;

public class task7 {
    public static void main(String[] args) {
        try {
            randomException();
        }catch (CustomException e){
            e.printStackTrace();
        }finally {
            System.out.println("FINALLY!!!");
        }
    }

    private static void randomException(){
        Random random = new Random();
        int randomValue = random.nextInt(10);
        if (randomValue < 5){
            throw new CustomException("asdsdf ");

        }
    }
}
