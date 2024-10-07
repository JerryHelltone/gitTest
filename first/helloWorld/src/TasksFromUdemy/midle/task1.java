package TasksFromUdemy.midle;

import lesson7.hero.Archer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        int minTemp = Integer.MAX_VALUE;
        int maxTemp = Integer.MIN_VALUE;;
        int maxCount = 0;
        int minCount = 0;
        
        int[][] values = new int[10][10];
        Random random = new Random();

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                values[i][j] = random.nextInt(100);
                System.out.print(" " + values[i][j] + " ");

                if(maxTemp <= values[i][j]){
                    maxTemp = values[i][j];
                }
                if ( minTemp >= values[i][j]){
                    minTemp = values[i][j];
                }
            }
            System.out.println();
        }

        ArrayList<String> listMin = new ArrayList<>();
        ArrayList<String> listMax = new ArrayList<>();

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if (values[i][j] == minTemp){
                    minCount++;
                    listMin.add(String.valueOf("строка " + i + " " + "индекс " + j));
                }
                if (values[i][j] == maxTemp){
                    maxCount++;
                    listMax.add(String.valueOf("строка " + i + " " + "индекс " + j));
                }
            }
        }

        System.out.println("Минимальное значение" + listMin);
        System.out.println("Максимальное значение" + listMax);
        System.out.println();
        System.out.println(maxTemp + " " + minTemp);
        System.out.println((maxCount) + " " + (minCount));

    }
}
