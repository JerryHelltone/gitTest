package lesson3;

import java.util.Scanner;

public class factorialWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputValue;
        System.out.println("Ввежите целое число: ");
        inputValue = scanner.nextInt();
        System.out.println(factorialCycle(inputValue));
    }

    private static int factorialCycle(int inputValue) {
        int result = 1;
        while (inputValue > 0) {
            result *= inputValue;
            inputValue--;
        }
        return result;
    }
}
