package lesson11;

public class task2 {

    public static void main(String[] args) {

        int[] values = {1, 2, 3 ,4};
        try {
            System.out.println(values[5]);
        } catch (ArrayIndexOutOfBoundsException exc){
            exc.printStackTrace();
        }

    }
}
