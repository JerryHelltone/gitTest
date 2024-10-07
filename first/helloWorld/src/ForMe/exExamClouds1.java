package ForMe;//чётное-нечётное

import java.util.Scanner;

public class exExamClouds1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        if (number%2 == 1) {
            System.out.println("Число " + number + " нечётное!");
        }
        else{
            System.out.println("Число " + number + " чётное!");
        }
    }
}
