package lesson4; // не работает

public class task3 {
    public static void main(String[] args) {
        int[] values = {5, 2, 1, 6, 8, 4};
        int minValueIndex = findMinValueIndex(values);
        int maxValueIndex = findMaxValueIndex(values);
        int sum = sumValuesBetweenIndexes(minValueIndex, maxValueIndex, values);
        System.out.println(sum);
    }

    private static int sumValuesBetweenIndexes(int minValueIndex, int maxValueIndex, int[] values) {
        int startIndex = minValueIndex < maxValueIndex ? minValueIndex : maxValueIndex;
        int endIndex = minValueIndex > maxValueIndex ? minValueIndex : maxValueIndex;
        int result = 0;
        for (int i = startIndex + 1; i < endIndex; i++) {
            result += values[i];
        }
        return result;
    }

    private static int findMinValueIndex(int[] values) {
        int minValueIndex = 0;
        for (int i = 1; i < values.length; i++) {
            if(values[minValueIndex] > values[i]){
                minValueIndex = i;
            }
        }
        return minValueIndex;
    }
    private static int findMaxValueIndex(int[] values) {
        int maxValueIndex = 0;
        for (int i = 1; i < values.length; i++) {
            if(values[maxValueIndex] < values[i]){
                maxValueIndex = i;
            }
        }
        return maxValueIndex;
    }
}
