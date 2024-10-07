package lesson1;

import java.util.Scanner;

public class season {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите порядковый номер месяца: ");
        int inputValue = scanner.nextInt();

        if (inputValue == 1 || inputValue == 2 || inputValue == 12) {
            System.out.println("Зима");
        } else if (inputValue >=3 && inputValue <=5) {
            System.out.println("Весна");
        } else if ( inputValue >=6 && inputValue <=8) {
            System.out.println("Лето");
        } else if (inputValue >= 9 && inputValue <=11) {
            System.out.println("Осень");
        } else {
            System.out.println("Введено неккоректное число!");
        }
        System.out.println(inputValue);
    }
}
