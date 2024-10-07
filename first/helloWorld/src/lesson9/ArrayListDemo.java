package lesson9;

import lesson7.hero.Gender;
import lesson7.hero.Mage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(3);
        integers.add(1);
        integers.add(0);
        integers.add(2);

        print(integers);
        deleteMax(integers);
        System.out.println(" ");
        print(integers);


        List<String> strings = new ArrayList<>();
        System.out.println();
        strings.add("5");
        strings.add("3");
        strings.add("1");
        strings.add("0");
        strings.add("2");

        print(strings);
    }

    private static void deleteMax(List<Integer> list){
        Integer max = findMax(list);
        list.remove(max);
    }

    private static Integer findMax(List<Integer> list) {
        Integer max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(1)){
                max = list.get(i);
            }
        }
        return max;
    }

    private static <T> void print(Iterable<T> objects){
//        for (T integer : value) {
//            System.out.println(integer);
//        }
        Iterator<T> iterator = objects.iterator();
        while(iterator.hasNext()){
            T next = iterator.next();
            System.out.println(next);
        }
    }
}
