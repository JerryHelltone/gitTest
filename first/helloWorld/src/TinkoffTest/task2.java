package TinkoffTest;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int NumberOfColleagues = scanner.nextInt();

        int cuts = 0;
        int half = 1;
        while (half < NumberOfColleagues){
            cuts += 1;
            half *= 2;
        }
        System.out.println(cuts);
    }
}