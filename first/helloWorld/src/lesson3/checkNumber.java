package lesson3;

import java.util.Scanner;

public class checkNumber {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Введите чмсло: ");
       int number = scanner.nextInt();
        System.out.println(checkNatureNumber(number));

    }

    static boolean checkNatureNumber(int number) {
        boolean result = true;
        for (int i = 2; i < number; i++) {
            if(number % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
