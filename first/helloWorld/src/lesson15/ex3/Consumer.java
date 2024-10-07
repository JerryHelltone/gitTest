package lesson15.ex3;

import lombok.AllArgsConstructor;

import java.util.Deque;
@AllArgsConstructor
public class Consumer implements Runnable{

    private final Deque<Integer> deque;

    @Override
    public void run() {
        synchronized (deque){
            while(true){
                System.out.println(Thread.currentThread().getName() + " пытается забрать из очереди...");

                if(!deque.isEmpty()){
                Integer item = deque.removeFirst();
                    System.out.println(Thread.currentThread().getName() + " получил элемент " + item);
                    System.out.println("Количество элементов в очереди: " + deque.size());
                }
                try {
                    System.out.println(Thread.currentThread().getName() + " заснул");
                    deque.wait(RandomUtil.generate(10 + 1));
                    System.out.println((Thread.currentThread().getName() + " проснулся"));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
