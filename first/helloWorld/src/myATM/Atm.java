package myATM;

import java.util.Random;

public class Atm {

    private int count20;
    private int count50;
    private int count100;
    private int checkCount20;
    private int checkCount50;
    private int checkCount100;
    private int cashFromUser;

    public Atm(){
    }

    public Atm(int count20, int count50, int count100, int cashFromUser) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
        this.cashFromUser = cashFromUser;
    }

    public void loadCash(){
        Random random = new Random();
        count20 = random.nextInt(100);
        count50 = random.nextInt(100);
        count100 = random.nextInt(100);
        System.out.println(count20 + " " + count50+ " " + count100); //для проверки
    }

    public void countCurrency() {
        checkCount100 = cashFromUser/100;
        checkCount50 = (cashFromUser - (checkCount100*100))/50;
        checkCount20 = (cashFromUser - (checkCount100*100) - (checkCount50*50))/20;
    }

    public void checkForIssuance() {
        if(cashFromUser >= (count50 + count20 + count100) && count20 >= checkCount20 && count50 >= checkCount50 && count100 >= checkCount100) {
            System.out.println("Количество сотен: " + checkCount100 + " пятидесяток: " + checkCount50
                    + " двадцаток: " + checkCount20);
        }else {
            System.out.println("Извините, в банкомате недостаточно средств");
        }
    }

    public void issuanceOfFunds(char answer) throws InterruptedException {
        if(answer == 'y'){
            System.out.println("Обработка данных...");
            Thread.sleep(2000);
            System.out.println("Заберите ваши средства!");
        }else {
            System.out.println("Операция Завершена!");
        }

    }

}
