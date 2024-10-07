package lesson9;

import java.util.Comparator;

public class FeeComparator implements Comparator <Actor>{

    @Override
    public int compare(Actor o1, Actor o2) {
        return Integer.compare(o1.getFee(),o2.getFee());
    }
}
