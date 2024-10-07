package lesson15.ex3;

import java.util.Deque;
import java.util.LinkedList;

public class ConsumeProduceDemo {
    public static void main(String[] args) {

        Deque<Integer> integers = new LinkedList<>();
        Thread producer = new Thread(new Producer(integers));
        Thread consumer = new Thread(new Consumer(integers));

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
