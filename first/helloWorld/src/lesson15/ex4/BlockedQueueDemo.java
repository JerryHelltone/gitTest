package lesson15.ex4;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockedQueueDemo {
    public static void main(String[] args) {
        BlockingDeque<Integer> integers = new LinkedBlockingDeque<>(10);

        Thread consumer = new Thread(new Consumer(integers));
        Thread producer = new Thread(new Producer(integers));

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
