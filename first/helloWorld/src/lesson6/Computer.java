package lesson6;

public class Computer {
    private final String CURRENT_VALUE = "COMMON";
    private String name;
    public Hdd hdd;
    private int ram;

    public Computer(){

    }

    public Computer(String name, int hdd, int ram) {
    }

    public Computer(Hdd hdd, int ram, String name){
        this(name,hdd,ram);
    }

    public Computer(String name, Hdd hdd, int ram){
        this.name = name;
        this.hdd = hdd;
        this.ram = ram;
    }

    public void on(){
        System.out.println("Я включился: " + name + " hdd: " + hdd + " ram: " + ram);
    }

    public void load(){
        System.out.println("Я загрузился");
    }

    public void off(){
        System.out.println("Я выключился");
    }

    public void setName(String name){
        this.name = name;
    }

//    public void setHdd(int hdd){
//        this.hdd = hdd;
//    }

    public void setRam(int ram){
        this.ram = ram;
    }
}
