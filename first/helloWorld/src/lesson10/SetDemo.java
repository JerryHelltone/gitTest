package lesson10;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 7);
        System.out.println(list);

        Set<String> set =  new TreeSet<>(Comparator.comparing(String::length));
        set.add("First");
        set.add("Second");
        set.add("Fifth");
        set.add("To");
        set.add("Fifth");
        System.out.println(set);
    }
}
