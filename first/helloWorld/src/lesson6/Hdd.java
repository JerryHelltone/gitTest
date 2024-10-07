package lesson6;

public class Hdd {

    private int capacity;

    public Hdd(int capacity) {
        this.capacity = capacity > 0 ? capacity : 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {this.capacity = capacity;}
}
