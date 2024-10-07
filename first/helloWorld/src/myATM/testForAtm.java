package myATM;

import java.util.Scanner;

public class testForAtm {
    public static void main(String[] args) throws InterruptedException {

        char answer;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму которую вы хотите снять: ");
        int cashFromUser = scanner.nextInt();

        Atm atm = new Atm(0, 0, 0, cashFromUser);
        atm.loadCash();
        atm.countCurrency();
        atm.checkForIssuance();

        System.out.print("Выдать средства? (y/n): ");

        answer = scanner.next().charAt(0);
        atm.issuanceOfFunds(answer);
    }
}
