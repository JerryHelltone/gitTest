package TasksFromUdemy.easy;

import java.util.Scanner;

//Напишите класс, который принимает с клавиатуры целое число
// и, если оно равно нулю, выводит на экран сообщение Ноль.
public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int value = scanner.nextInt();

        if (value == 0){
            System.out.println("Ноль");
        }
    }
}
