package lesson15.ex2;

import java.util.Queue;

public class BuyerThread extends Thread{

    private final Queue<Object> cashDesk;

    public BuyerThread(Queue<Object> cashDesk) {
        this.cashDesk = cashDesk;
    }

    @Override
    public void run(){
        Object currentCashDesk = null;
            synchronized (cashDesk) {
                while (cashDesk.isEmpty()) {
                    try {
                        System.out.println(getName() + " ждёт...");
                        cashDesk.wait();
                        System.out.println(getName() + " проснулся");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(getName() + " подошёл к кассе...");
                currentCashDesk = cashDesk.poll();
            }
        System.out.println(getName() + " обслуживается в кассе...");
        try {
            Thread.sleep(1500L);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        synchronized (cashDesk){
            cashDesk.add(currentCashDesk);
            cashDesk.notify();
            System.out.println(getName() + " покидает магазин");
        }
    }
}
