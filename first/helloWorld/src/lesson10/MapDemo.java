package lesson10;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("first", 29);
        map.put("second", 151);
        map.put("third", 457);

        System.out.println(map.get("first"));
        System.out.println(map.getOrDefault("thirdl", 999));
        System.out.println(map.keySet());
        Collection<Integer> values = map.values();
        System.out.println(values);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println(entries);
    }
}
