package lesson14;

public class CustomThread extends Thread{

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
