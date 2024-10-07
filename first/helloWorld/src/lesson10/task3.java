package lesson10;

import lesson10.util.PolinomialMapUtil;

import java.util.HashMap;
import java.util.Map;

public class task3 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = getDefaultPolinolmailMap();
        String result = PolinomialMapUtil.calculateStringValues(map);
        System.out.println(result);
    }

    private static HashMap<Integer, Integer> getDefaultPolinolmailMap() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(6, 2);
        map.put(5, 0);
        map.put(4, 1);
        map.put(3, 3);
        map.put(2, 0);
        map.put(1, 9);
        map.put(0, 8);

        return (HashMap<Integer, Integer>) map;
    }
}
