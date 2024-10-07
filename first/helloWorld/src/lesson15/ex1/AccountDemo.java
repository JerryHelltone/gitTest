package lesson15.ex1;

public class AccountDemo {
    public static void main(String[] args) {
        Account firstAccount = new Account(1000, 0);
        Account secondAccount = new Account(1000, 1);

        Thread firstThread = new AccountThread(firstAccount, secondAccount);
        Thread secondThread = new AccountThread(secondAccount, firstAccount);

        firstThread.start();
        secondThread.start();

        try{
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("First account: " + firstAccount);
        System.out.println("Second account: " + secondAccount);
    }
}
