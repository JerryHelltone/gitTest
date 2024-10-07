package ForMe;//Дни недели

import java.util.Scanner;

public class exExamClouds3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7:");
        int value = scanner.nextInt();
        if(value == 1) {
            System.out.println("Понедельник");
        }else if(value == 2) {
            System.out.println("Вторник");
        }else if(value == 3) {
            System.out.println("Среда");
        }else if(value == 4) {
            System.out.println("Четверг");
        }else if(value == 5) {
            System.out.println("Пятница");
        }else if(value == 6) {
            System.out.println("Суббота");
        }else if(value == 7) {
            System.out.println("Воскресенье");
        }else System.out.println("Введено неккоректное число");

    }
}
