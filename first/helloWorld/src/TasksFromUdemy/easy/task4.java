package TasksFromUdemy.easy;
//Напишите класс, который принимает с клавиатуры целое число и выводит на экран одно из следующих сообщений:
// Положительное, или Отрицательное, или Ноль - в зависимости от значения числа.

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите  число: ");
        int value = scanner.nextInt();

        if (value > 0){
            System.out.println("Положительное");
        } else if (value < 0){
            System.out.println("Отрицательное");
        }else {
            System.out.println("Ноль");
        }
    }
}
