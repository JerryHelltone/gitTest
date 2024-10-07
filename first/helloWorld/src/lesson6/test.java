package lesson6;

public class test {
    public static void main(String[] args) {
       Computer computer = new Computer("Windows" , 500 , 1024);

       computer.hdd = new Hdd(500);

       computer.on();
       computer.load();
       computer.off();

        Computer computer2 = new Computer();
        computer2. setName("Mac") ;
//        computer2.setHdd(400);
        computer2.setRam(512);

        computer2.on();
        computer2.load();
        computer2.off();
    }
}
