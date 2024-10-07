package lesson14.queue;

import java.util.Queue;

public class BuyerThread extends Thread{

    private final Queue<Object> cashDesk;

    public BuyerThread(Queue<Object> cashDesk) {
        this.cashDesk = cashDesk;
    }

    @Override
    public void run(){
        if (cashDesk.size() > 0){
            System.out.println(getName() + " обслуживается в кассе");
            Object currentCashDesk = cashDesk.poll();
            try{
                Thread.sleep(1500L);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(getName() + " готов");
            cashDesk.add(currentCashDesk);

        }
    }
}
