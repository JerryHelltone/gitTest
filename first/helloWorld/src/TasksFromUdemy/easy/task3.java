package TasksFromUdemy.easy;
//Напишите класс, который принимает с клавиатуры два целых числа и, если первое больше второго,
// выводит на экран их сумму, если же наоборот - выводит на экран их произведение.
// В случае же, если числа одинаковы, программа выводит на экран сообщение Числа равны.

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int firstValue = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int secondValue = scanner.nextInt();


        if (firstValue > secondValue) {
            System.out.println(firstValue + secondValue);
        } else if (secondValue > firstValue){
            System.out.println(firstValue * secondValue);
        }else if (firstValue == secondValue){
            System.out.println("Числа равны!");
        }
    }
}
