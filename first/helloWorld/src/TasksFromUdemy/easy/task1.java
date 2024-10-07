package TasksFromUdemy.easy;
//Напишите класс, который принимает с клавиатуры целое число и, если оно положительное, увеличивает его вдвое.
// Класс должен выводить на экран новое значение.
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int value = scanner.nextInt();

        if (value > 0){
            System.out.println(value*2);
        }
    }
}
