//изучить SQL и создать базу данных счетов и паролей
package atm;

import java.util.Scanner;

public class atmTest {
    public static void main(String[] args) throws InterruptedException {
        char answer;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму которую вы хотите снять: ");
        int cashFromUser = scanner.nextInt();

        Atm atm = new Atm();
        atm.loadCash();
        atm.countCurrency();
        atm.checkForIssuance();

        System.out.print("Выдать средства? (y/n): ");

        answer = scanner.next().charAt(0);
        atm.issuanceOfFounds(answer);
    }
}
