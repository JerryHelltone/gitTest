package ForMe;

import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение: ");
        int inputValue = sc.nextInt();
        int factorial = 1;
        int check = inputValue;
        while (check != 0) {
            factorial *= check--;
        }
        System.out.println("Факториал числа " + inputValue + " Равен " + factorial);
    }
}
