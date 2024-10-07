package lesson14;

import java.util.List;

public class ListRunnable implements Runnable{
    private final List<Integer> list;

    public ListRunnable(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "пытается захватить монитор");
            synchronized (list){
                System.out.println(Thread.currentThread().getName() + "захватил монитор и ждет");
                try{
                    Thread.sleep(2L);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                list.add(1);
                System.out.println(Thread.currentThread().getName() + "освободил монитор");
            }
        }
    }
}
