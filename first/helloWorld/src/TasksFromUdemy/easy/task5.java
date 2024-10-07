package TasksFromUdemy.easy;
//Напишите класс, который принимает с
// клавиатуры целое положительное число и,
// если оно как минимум трехзначное и положительное,
// уменьшает его на 1.

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int value = scanner.nextInt();

        if(value > 0 && value >= 100){
            System.out.println(value - 1);
        }
    }

}
