package lesson3;

import java.math.BigDecimal;

public class fivePercent {
    public static void main(String[] args) {
        int currentYear = 2019;
        BigDecimal sum = BigDecimal.valueOf(24L);
        BigDecimal percent = BigDecimal.valueOf(0.05);
        for (int startYear = 1626; startYear < currentYear; startYear++) {
            BigDecimal percentSum = sum.multiply(percent);
            sum = sum.add(percentSum);
            System.out.println("Год " + startYear + " Доход " + percentSum + " Сумма " + sum);
        }
    }

    private static void test2() {
        int currentYear = 2019;
        double sum =24;
        double percent = 0.05;
        for (int startYear = 1626; startYear < currentYear; startYear++) {
            double percentSum = sum * percent;
            sum += percentSum;
            System.out.println("Год " + startYear + " Доход " + percentSum + " Сумма " + sum);
        }
    }
}
