package lesson3;

import java.util.Scanner;

public class factorialTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputValue;
        System.out.println("Ввежите целое число: ");
        inputValue = scanner.nextInt();
        System.out.println(factorial(inputValue));
//        System.out.println(factorialRecursive(inputValue));
    }
    // тоже самое но через рекурсию
    private static int factorialRecursive(int value){
        if(value == 1){
            return value;
        }else{
            return value = value * factorialRecursive(--value);
        }
    }

    private static int factorial(int inputValue) {
        int result = 1;
        for (int i = 1; i <= inputValue; i++) {
            result *= i;
        }
        return result;
    }
}
