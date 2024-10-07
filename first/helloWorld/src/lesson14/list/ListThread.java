package lesson14.list;

import java.util.List;

public class ListThread implements Runnable{

    private List<Integer> list;

    public ListThread(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            list.add(1);
        }
    }
}
