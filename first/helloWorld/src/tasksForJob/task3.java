package tasksForJob;//swap numbers without temp parameter

public class task3 {
    public static void main(String[] args) {
        int firstValue = 3;
        int secondValue = 9;
        System.out.println("Первое значение " + firstValue + " Второе Значение " +  secondValue);
        firstValue = firstValue + secondValue;
        secondValue = firstValue - secondValue;
        firstValue = firstValue - secondValue;
        System.out.println("Первое значение " + firstValue + " Второе Значение " +  secondValue);
    }
}
