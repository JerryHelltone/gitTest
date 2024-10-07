package ForMe;//Распечатать 10 строк циклом while

import java.util.Scanner;

public class exExamClouds5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество заданий: ");
        int quantityTasks = scanner.nextInt();
        while (quantityTasks > 0) {
            System.out.println("Task"+ quantityTasks--);
        }
    }
}
