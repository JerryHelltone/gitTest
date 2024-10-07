package lesson15.ex1;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString

public class Account implements Comparable<Account>{

    private static long idGenerator = 0L;
    private final long id;
    private int amount;

    public Account(int amount, long id ){
        this.amount = amount;
        this.id = idGenerator++;
    }

    public void add(int amount){
        this.amount += amount;
    }

    public boolean takeOff(int amount){
        boolean result = this.amount >= amount;
        if(result){
            this.amount -= amount;
        }
        return result;
    }

    @Override
    public int compareTo(Account o) {
        return Long.compare(this.id, o.id);
    }
}
