package lesson16;

import lesson8.Outer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorDemo {

    public static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new Increment());
        executorService.execute(new Decrement());

//        try {
//            executorService.shutdown();
//            executorService.awaitTermination(1L, TimeUnit.HOURS);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        executorService.shutdown();
        executorService.awaitTermination(1L, TimeUnit.HOURS);
    }

    public static class Increment implements Runnable{

        @Override
        public void run(){
            for (int i = 0; i < 10; i++) {
                System.out.println(++counter);
            }
        }
    }

    public static class Decrement implements Runnable{

        @Override
        public void run(){
            for (int i = 0; i < 10; i++) {
                System.out.println(--counter);;
            }
        }
    }
}

