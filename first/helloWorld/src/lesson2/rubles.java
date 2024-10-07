package lesson2;

import java.util.Scanner;

public class rubles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество денег: ");
        int inputValue = scanner.nextInt();
        if (inputValue % 10 == 0 || inputValue % 10 == 5 || inputValue % 10 == 6 || inputValue % 10 == 7 || inputValue % 10 == 8 || inputValue % 10 == 9 || inputValue % 100 == 11) {
            System.out.println(inputValue + " Рублей");
        } else if (inputValue % 10 == 1 && inputValue != 11) {
            System.out.println(inputValue + " Рубль");
        } else if (inputValue >= 11 && inputValue <= 20) {
            System.out.println(inputValue + " Рублей");
        } else System.out.println(" Рубля");
    }
}