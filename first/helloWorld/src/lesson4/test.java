package lesson4;

import java.util.Arrays;
import java.util.Random;

public class test {
    public static void main(String[] args) {

        char[][] values = {
                {'1','1','1','1','1'},
                {'0','1','1','1','0'},
                {'0','0','1','0','0'},
                {'0','1','1','1','0'},
                {'1','1','1','1','1'},

        };
        printArray(values);
        replaceValues(values);
        System.out.println();
        printArray(values);
//        int[][] values = new int[3][3];
//        Random random = new Random();
//        for (int i = 0; i < values.length; i++) {
//            for (int j = 0; j < values.length; j++) {
//                values[i][j] = random.nextInt(10);
//                System.out.println(Arrays.deepToString(values));
//            }
//        }
    }
    
    public static void printArray(char[][] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.println(Arrays.toString(values[i]));
        }
    }

    public static void replaceValues(char[][] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if (values[i][j] == '1') {
                    values[i][j] = '*';
                }else {
                    values[i][j] = ' ';
                }
            }
        }
    }
}
