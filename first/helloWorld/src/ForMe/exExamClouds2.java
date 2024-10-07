package ForMe;//число от 0 до 10

import java.util.Scanner;

public class exExamClouds2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int values = scanner.nextInt();
        if (values <= 10 && values >= 0){
            System.out.println("Положительное число меньше 10 или ноль");
        }else{
            System.out.println("Положительное число больше 10 или отрицательное");
        }
    }
}
