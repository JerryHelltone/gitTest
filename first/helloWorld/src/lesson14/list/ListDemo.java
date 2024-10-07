package lesson14.list;

import lesson14.ListRunnable;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Thread firstThread = new Thread(new ListRunnable(list));
        Thread secondThread = new Thread(new ListRunnable(list));

        firstThread.start();
        secondThread.start();


        try {
            firstThread.join();
            secondThread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Размер списка: " + list.size());
    }
}
