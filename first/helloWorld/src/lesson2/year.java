package lesson2;

import java.util.Scanner;


public class year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = scanner.nextInt();
        if (isTemporal(year)){
            System.out.println(year + " Високосный");
        }else {
            System.out.println(year + " Не високосный");
        }
    }
    public static boolean isTemporal(int year){
        if (year%4 == 0 && year%100 != 0 || year%400 == 0){
            return true;
        }else {
            return false;
        }
    }
}



