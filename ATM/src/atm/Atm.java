package atm;

import java.util.Random;
import java.util.Scanner;

public class Atm {

    int cashFromUser;

    private int banknoteFive;
    private int banknoteTen;
    private int banknoteTwenty;
    private int banknoteFifty;
    private int banknoteHundred;

    private int checkBanknoteFive;
    private int checkBanknoteTen;
    private int checkBanknoteTwenty;
    private int checkBanknoteFifty;
    private int checkBanknoteHundred;

    public Atm(){

    }

    public Atm(int cashFromUser, int banknoteFive, int banknoteTen, int banknoteTwenty, int banknoteFifty, int banknoteHundred, int checkBanknoteFive, int checkBanknoteTen, int checkBanknoteTwenty, int checkBanknoteFifty, int checkBanknoteHundred) {
        this.cashFromUser = cashFromUser;
        this.banknoteFive = banknoteFive;
        this.banknoteTen = banknoteTen;
        this.banknoteTwenty = banknoteTwenty;
        this.banknoteFifty = banknoteFifty;
        this.banknoteHundred = banknoteHundred;
        this.checkBanknoteFive = checkBanknoteFive;
        this.checkBanknoteTen = checkBanknoteTen;
        this.checkBanknoteTwenty = checkBanknoteTwenty;
        this.checkBanknoteFifty = checkBanknoteFifty;
        this.checkBanknoteHundred = checkBanknoteHundred;
    }

    public void loadCash(){
        Random random = new Random();
        banknoteFive = random.nextInt(100);
        banknoteTen = random.nextInt(100);
        banknoteTwenty= random.nextInt(100);
        banknoteFifty = random.nextInt(100);
        banknoteHundred = random.nextInt(100);
        System.out.println(banknoteFive + " " + banknoteTen + " " + banknoteTwenty + " " + banknoteFifty + " " + banknoteHundred);
    }

    public void countCurrency(){
        checkBanknoteHundred = cashFromUser/100;
        checkBanknoteFifty = (cashFromUser - (checkBanknoteHundred*100))/50;
        checkBanknoteTwenty = (cashFromUser - (checkBanknoteHundred*100) - (checkBanknoteFifty*50))/20;
        checkBanknoteTen = (cashFromUser - (checkBanknoteHundred*100) - (checkBanknoteFifty*50) - (checkBanknoteTwenty*20))/10;
        checkBanknoteFive = (cashFromUser - (checkBanknoteHundred*100) - (checkBanknoteFifty*50) - (checkBanknoteTwenty*20) - (checkBanknoteTen*10))/5;
    }

    public void checkForIssuance(){
        if(cashFromUser <= (banknoteFive + banknoteTen + banknoteTwenty + banknoteFifty + banknoteHundred) && banknoteFive >= checkBanknoteFive && banknoteTen >= checkBanknoteTen && banknoteTwenty >= checkBanknoteTwenty && banknoteFifty >= checkBanknoteFifty && banknoteHundred >= checkBanknoteHundred){
            System.out.println("Количество сотен: " + banknoteHundred + "\nПятидесяток: " + banknoteFifty +  "\nДвадцаток: " + banknoteTwenty + "\nДесяток: " + banknoteTen + "\nПятёрок: " + banknoteFive);
        }else{
            System.out.println("Извините, в банкомате недостаточно средств!");
        }
    }

    public void issuanceOfFounds(char answer) throws InterruptedException{
        if(answer == 'y'){
            System.out.println("Обработка данных...");
            Thread.sleep(2000);
            System.out.println("Заберите ваши средства!");
        }else {
            System.out.println("Операция завершена!");
        }
    }

    public int getCashFromUser() {
        return cashFromUser;
    }

    public void setCashFromUser(int cashFromUser) {
        this.cashFromUser = cashFromUser;
    }
}
