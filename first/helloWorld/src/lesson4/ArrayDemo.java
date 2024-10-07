package lesson4;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] array = {5, 2, 1, 4, 8, 6};
        sort(array);
//        for (int value : array) {
//            System.out.print(value + " ");
//        }
        System.out.println(Arrays.toString(array));
    }

    private static void sort (int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}
