package TinkoffTest;

import java.util.Scanner;

public class task1value2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите интернет трафик в месяц, абонентскую плату, переплату " +
                "и планируемые затраты трафика через пробел");
        String line = scanner.nextLine();

        String[] user = line.split(" ");
        int subscriptionFee = Integer.parseInt(user[0]);
        int internetTraffic = Integer.parseInt(user[1]);
        int overpayment = Integer.parseInt(user[2]);
        int costPlan = Integer.parseInt(user[3]);

        if (costPlan > internetTraffic){
            System.out.println(subscriptionFee + ((costPlan - internetTraffic) * overpayment));
        }else {
            System.out.println(subscriptionFee);
        };
    }
}
