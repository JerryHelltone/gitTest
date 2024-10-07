package lesson15.ex3;

import lombok.AllArgsConstructor;

import java.util.Deque;

import static lesson15.ex3.RandomUtil.generateDefault;

@AllArgsConstructor
public class Producer implements Runnable{

    private static final int MAX_COUNT = 10;
    private final Deque<Integer> deque;

    @Override
    public void run() {
            synchronized (deque){
                while (true){
                    System.out.println(Thread.currentThread().getName() + " пытается положить в очередь...");
                    if(deque.size() < MAX_COUNT){
                        int generatedValue = generateDefault();
                        System.out.println((Thread.currentThread().getName() + " произвёл число " + generatedValue));
                        System.out.println("Количество элементов в очереди: " + deque.size());
                        deque.add(generateDefault());}
                    try {
                        System.out.println(Thread.currentThread().getName() + " заснул");
                        deque.wait(10L);
                        System.out.println((Thread.currentThread().getName() + " проснулся"));
                    } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
