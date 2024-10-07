package lesson3;

public class taskWithStar {
    public static void main(String[] args) {
        int inputValue = 200023143;
        int count = 3;
        String result = "";
        while (inputValue != 0) {
            int ostatok = inputValue % 10;
            count--;
            result = ostatok + result;
            if (count == 0) {
                result = " " + result;
                count = 3;
            }
            inputValue /= 10;
        }
        System.out.println(result);
    }
}
