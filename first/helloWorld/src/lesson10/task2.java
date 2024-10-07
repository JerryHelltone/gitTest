package lesson10;

import lesson10.util.UniqueUtil;

import java.util.HashMap;
import java.util.Map;

public class task2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("one", "one");
        map.put("two", "two");
        map.put("three", "three");
        boolean unique = UniqueUtil.isUnique(map);
        System.out.println(unique);
    }
}
