package lesson4;

public class task1 {
    public static void main(String[] args) {
        char[] values = {'a', 'f', 'r', '1', ']'};
        for (char value : values){
            System.out.print(value + " ");
        }
        System.out.println();
        for (int i = values.length - 1; i >= 0; i--) {
            System.out.print(values[i] + " ");
        }
    }
}
