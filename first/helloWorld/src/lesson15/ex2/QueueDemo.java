package lesson15.ex2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Object> cashDesk = new LinkedList<>();
        cashDesk.add(new Object());
        cashDesk.add(new Object());

        List<BuyerThread> buyerThread = Arrays.asList(
                new BuyerThread(cashDesk),
                new BuyerThread(cashDesk),
                new BuyerThread(cashDesk),
                new BuyerThread(cashDesk),
                new BuyerThread(cashDesk),
                new BuyerThread(cashDesk),
                new BuyerThread(cashDesk),
                new BuyerThread(cashDesk),
                new BuyerThread(cashDesk),
                new BuyerThread(cashDesk)
        );

        buyerThread.forEach(Thread::start);

        for (BuyerThread buyerThread1 : buyerThread){
            try{
                buyerThread1.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
