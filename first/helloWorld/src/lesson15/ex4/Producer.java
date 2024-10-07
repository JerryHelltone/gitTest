package lesson15.ex4;

import lesson15.ex3.RandomUtil;
import lombok.AllArgsConstructor;

import java.util.concurrent.BlockingDeque;

public class Producer implements Runnable{

    private final BlockingDeque<Integer> deque;

    public Producer(BlockingDeque<Integer> deque) {
        this.deque = deque;
    }

    @Override
    public void run() {
        while (true){
            int generatedValue = RandomUtil.generateDefault();
            System.out.println((Thread.currentThread().getName() + " произвёл число " + generatedValue));
            try {
                deque.put(generatedValue);
                System.out.println(Thread.currentThread().getName() + " положил " + generatedValue);
                System.out.println("Количество элементов: " + deque.size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
