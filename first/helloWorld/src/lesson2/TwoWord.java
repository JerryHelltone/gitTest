package lesson2;

import java.util.Scanner;

public class TwoWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слово: ");
        String firstWord = scanner.next();
        System.out.println("Введите второе слово: ");
        String secondWord = scanner.next();

        checkWords(firstWord, secondWord);
    }

    private static void checkWords(String firstWord, String secondWord) {
        if (firstWord.equals(secondWord)) {
            System.out.println("Отлично! Слова одинаковы");
        }else if (firstWord.equalsIgnoreCase(secondWord)) {
            System.out.println("Хорошо. Почти одинаковы");
        }else if (firstWord.length() == secondWord.length()) {
            System.out.println("Ну, хотябы они одной длинны");
        }else {
            System.out.println("Увы!");
        }
    }
}
