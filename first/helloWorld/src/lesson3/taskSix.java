package lesson3;

public class taskSix {
    public static void main(String[] args) {
        int result = 0;
        for (int inputValue = 999; inputValue != 0; inputValue /= 10) {
            int ostatok = inputValue%10;
            result += ostatok;
        }
        System.out.println(result);
    }

    private static int test3(int inputValue) { //через while писать этот алгоритм удобнее
        int result = 0;
        while (inputValue != 0) {
            int ostatok = inputValue %10;
            result += ostatok;
            inputValue = inputValue /10;
        }
        return result;
    }
}
