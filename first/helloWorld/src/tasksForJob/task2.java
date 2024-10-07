package tasksForJob; //swap numbers with temp parameter

import org.w3c.dom.ls.LSOutput;

public class task2 {
    public static void main(String[] args) {
        int firstValue = 2;
        int secondValue = 7;
        int temp = 0;
        System.out.println("Первое значение " + firstValue + " Второе Значение " +  secondValue);
        temp = firstValue;
        firstValue = secondValue;
        secondValue = temp;
        System.out.println("Первое значение " + firstValue + " Второе Значение " +  secondValue);
    }
}
