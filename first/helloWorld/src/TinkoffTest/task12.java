package TinkoffTest;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предельную сумму и номиналды трёх монет через пробел: ");
        String line = scanner.nextLine();
        String[] user = line.split(" ");

        int sum = Integer.parseInt(user[0]);
        int firstDenomination = Integer.parseInt(user[1]);
        int secondDenomination = Integer.parseInt(user[2]);
        int thirdDenomination = Integer.parseInt(user[3]);

        int value1 = sum/firstDenomination;
        int value2 = sum/secondDenomination;
        int value3 = sum/thirdDenomination;

        int result = value1 + value2 + value3 + 4;

//        int result = sum%firstDenomination + sum%secondDenomination + sum%thirdDenomination + 4;

        System.out.println(result);

    }
}
