package lesson15.ex4;

import lesson15.ex3.RandomUtil;
import lombok.AllArgsConstructor;

import java.util.concurrent.BlockingDeque;

@AllArgsConstructor
public class Consumer implements Runnable{

    private final BlockingDeque<Integer> deque;

    @Override
    public void run() {
        while(true){
            try {
                System.out.println(Thread.currentThread().getName() + " пытается забрать...");
                Integer value = deque.take();
                System.out.println(Thread.currentThread().getName() + " забрал " + value);
                System.out.println("Количество элементов: " + deque.size());
                Thread.sleep(RandomUtil.generate(10+1));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
